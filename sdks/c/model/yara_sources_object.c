#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "yara_sources_object.h"



yara_sources_object_t *yara_sources_object_create(
    list_t *local_sources,
    list_t *http_sources
    ) {
    yara_sources_object_t *yara_sources_object_local_var = malloc(sizeof(yara_sources_object_t));
    if (!yara_sources_object_local_var) {
        return NULL;
    }
    yara_sources_object_local_var->local_sources = local_sources;
    yara_sources_object_local_var->http_sources = http_sources;

    return yara_sources_object_local_var;
}


void yara_sources_object_free(yara_sources_object_t *yara_sources_object) {
    if(NULL == yara_sources_object){
        return ;
    }
    listEntry_t *listEntry;
    list_ForEach(listEntry, yara_sources_object->local_sources) {
        yara_sources_object_local_sources_free(listEntry->data);
    }
    list_free(yara_sources_object->local_sources);
    list_ForEach(listEntry, yara_sources_object->http_sources) {
        yara_sources_object_http_sources_free(listEntry->data);
    }
    list_free(yara_sources_object->http_sources);
    free(yara_sources_object);
}

cJSON *yara_sources_object_convertToJSON(yara_sources_object_t *yara_sources_object) {
    cJSON *item = cJSON_CreateObject();

    // yara_sources_object->local_sources
    if(yara_sources_object->local_sources) { 
    cJSON *local_sources = cJSON_AddArrayToObject(item, "local_sources");
    if(local_sources == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *local_sourcesListEntry;
    if (yara_sources_object->local_sources) {
    list_ForEach(local_sourcesListEntry, yara_sources_object->local_sources) {
    cJSON *itemLocal = yara_sources_object_local_sources_convertToJSON(local_sourcesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(local_sources, itemLocal);
    }
    }
     } 


    // yara_sources_object->http_sources
    if(yara_sources_object->http_sources) { 
    cJSON *http_sources = cJSON_AddArrayToObject(item, "http_sources");
    if(http_sources == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *http_sourcesListEntry;
    if (yara_sources_object->http_sources) {
    list_ForEach(http_sourcesListEntry, yara_sources_object->http_sources) {
    cJSON *itemLocal = yara_sources_object_http_sources_convertToJSON(http_sourcesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(http_sources, itemLocal);
    }
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

yara_sources_object_t *yara_sources_object_parseFromJSON(cJSON *yara_sources_objectJSON){

    yara_sources_object_t *yara_sources_object_local_var = NULL;

    // yara_sources_object->local_sources
    cJSON *local_sources = cJSON_GetObjectItemCaseSensitive(yara_sources_objectJSON, "local_sources");
    list_t *local_sourcesList;
    if (local_sources) { 
    cJSON *local_sources_local_nonprimitive;
    if(!cJSON_IsArray(local_sources)){
        goto end; //nonprimitive container
    }

    local_sourcesList = list_create();

    cJSON_ArrayForEach(local_sources_local_nonprimitive,local_sources )
    {
        if(!cJSON_IsObject(local_sources_local_nonprimitive)){
            goto end;
        }
        yara_sources_object_local_sources_t *local_sourcesItem = yara_sources_object_local_sources_parseFromJSON(local_sources_local_nonprimitive);

        list_addElement(local_sourcesList, local_sourcesItem);
    }
    }

    // yara_sources_object->http_sources
    cJSON *http_sources = cJSON_GetObjectItemCaseSensitive(yara_sources_objectJSON, "http_sources");
    list_t *http_sourcesList;
    if (http_sources) { 
    cJSON *http_sources_local_nonprimitive;
    if(!cJSON_IsArray(http_sources)){
        goto end; //nonprimitive container
    }

    http_sourcesList = list_create();

    cJSON_ArrayForEach(http_sources_local_nonprimitive,http_sources )
    {
        if(!cJSON_IsObject(http_sources_local_nonprimitive)){
            goto end;
        }
        yara_sources_object_http_sources_t *http_sourcesItem = yara_sources_object_http_sources_parseFromJSON(http_sources_local_nonprimitive);

        list_addElement(http_sourcesList, http_sourcesItem);
    }
    }


    yara_sources_object_local_var = yara_sources_object_create (
        local_sources ? local_sourcesList : NULL,
        http_sources ? http_sourcesList : NULL
        );

    return yara_sources_object_local_var;
end:
    return NULL;

}
