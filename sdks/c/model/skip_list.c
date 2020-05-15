#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "skip_list.h"



skip_list_t *skip_list_create(
    object_t *blacklist,
    object_t *skip,
    object_t *whitelist
    ) {
    skip_list_t *skip_list_local_var = malloc(sizeof(skip_list_t));
    if (!skip_list_local_var) {
        return NULL;
    }
    skip_list_local_var->blacklist = blacklist;
    skip_list_local_var->skip = skip;
    skip_list_local_var->whitelist = whitelist;

    return skip_list_local_var;
}


void skip_list_free(skip_list_t *skip_list) {
    if(NULL == skip_list){
        return ;
    }
    listEntry_t *listEntry;
    object_free(skip_list->blacklist);
    object_free(skip_list->skip);
    object_free(skip_list->whitelist);
    free(skip_list);
}

cJSON *skip_list_convertToJSON(skip_list_t *skip_list) {
    cJSON *item = cJSON_CreateObject();

    // skip_list->blacklist
    if(skip_list->blacklist) { 
    cJSON *blacklist_object = object_convertToJSON(skip_list->blacklist);
    if(blacklist_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "blacklist", blacklist_object);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // skip_list->skip
    if(skip_list->skip) { 
    cJSON *skip_object = object_convertToJSON(skip_list->skip);
    if(skip_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "skip", skip_object);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // skip_list->whitelist
    if(skip_list->whitelist) { 
    cJSON *whitelist_object = object_convertToJSON(skip_list->whitelist);
    if(whitelist_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "whitelist", whitelist_object);
    if(item->child == NULL) {
    goto fail;
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

skip_list_t *skip_list_parseFromJSON(cJSON *skip_listJSON){

    skip_list_t *skip_list_local_var = NULL;

    // skip_list->blacklist
    cJSON *blacklist = cJSON_GetObjectItemCaseSensitive(skip_listJSON, "blacklist");
    object_t *blacklist_local_object = NULL;
    if (blacklist) { 
    blacklist_local_object = object_parseFromJSON(blacklist); //object
    }

    // skip_list->skip
    cJSON *skip = cJSON_GetObjectItemCaseSensitive(skip_listJSON, "skip");
    object_t *skip_local_object = NULL;
    if (skip) { 
    skip_local_object = object_parseFromJSON(skip); //object
    }

    // skip_list->whitelist
    cJSON *whitelist = cJSON_GetObjectItemCaseSensitive(skip_listJSON, "whitelist");
    object_t *whitelist_local_object = NULL;
    if (whitelist) { 
    whitelist_local_object = object_parseFromJSON(whitelist); //object
    }


    skip_list_local_var = skip_list_create (
        blacklist ? blacklist_local_object : NULL,
        skip ? skip_local_object : NULL,
        whitelist ? whitelist_local_object : NULL
        );

    return skip_list_local_var;
end:
    return NULL;

}
