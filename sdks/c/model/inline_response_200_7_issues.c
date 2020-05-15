#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_7_issues.h"



inline_response_200_7_issues_t *inline_response_200_7_issues_create(
    list_t *general,
    list_t *source
    ) {
    inline_response_200_7_issues_t *inline_response_200_7_issues_local_var = malloc(sizeof(inline_response_200_7_issues_t));
    if (!inline_response_200_7_issues_local_var) {
        return NULL;
    }
    inline_response_200_7_issues_local_var->general = general;
    inline_response_200_7_issues_local_var->source = source;

    return inline_response_200_7_issues_local_var;
}


void inline_response_200_7_issues_free(inline_response_200_7_issues_t *inline_response_200_7_issues) {
    if(NULL == inline_response_200_7_issues){
        return ;
    }
    listEntry_t *listEntry;
    list_ForEach(listEntry, inline_response_200_7_issues->general) {
        inline_response_200_7_issues_general_free(listEntry->data);
    }
    list_free(inline_response_200_7_issues->general);
    list_ForEach(listEntry, inline_response_200_7_issues->source) {
        inline_response_200_7_issues_source_free(listEntry->data);
    }
    list_free(inline_response_200_7_issues->source);
    free(inline_response_200_7_issues);
}

cJSON *inline_response_200_7_issues_convertToJSON(inline_response_200_7_issues_t *inline_response_200_7_issues) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_7_issues->general
    if(inline_response_200_7_issues->general) { 
    cJSON *general = cJSON_AddArrayToObject(item, "general");
    if(general == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *generalListEntry;
    if (inline_response_200_7_issues->general) {
    list_ForEach(generalListEntry, inline_response_200_7_issues->general) {
    cJSON *itemLocal = inline_response_200_7_issues_general_convertToJSON(generalListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(general, itemLocal);
    }
    }
     } 


    // inline_response_200_7_issues->source
    if(inline_response_200_7_issues->source) { 
    cJSON *source = cJSON_AddArrayToObject(item, "source");
    if(source == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *sourceListEntry;
    if (inline_response_200_7_issues->source) {
    list_ForEach(sourceListEntry, inline_response_200_7_issues->source) {
    cJSON *itemLocal = inline_response_200_7_issues_source_convertToJSON(sourceListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(source, itemLocal);
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

inline_response_200_7_issues_t *inline_response_200_7_issues_parseFromJSON(cJSON *inline_response_200_7_issuesJSON){

    inline_response_200_7_issues_t *inline_response_200_7_issues_local_var = NULL;

    // inline_response_200_7_issues->general
    cJSON *general = cJSON_GetObjectItemCaseSensitive(inline_response_200_7_issuesJSON, "general");
    list_t *generalList;
    if (general) { 
    cJSON *general_local_nonprimitive;
    if(!cJSON_IsArray(general)){
        goto end; //nonprimitive container
    }

    generalList = list_create();

    cJSON_ArrayForEach(general_local_nonprimitive,general )
    {
        if(!cJSON_IsObject(general_local_nonprimitive)){
            goto end;
        }
        inline_response_200_7_issues_general_t *generalItem = inline_response_200_7_issues_general_parseFromJSON(general_local_nonprimitive);

        list_addElement(generalList, generalItem);
    }
    }

    // inline_response_200_7_issues->source
    cJSON *source = cJSON_GetObjectItemCaseSensitive(inline_response_200_7_issuesJSON, "source");
    list_t *sourceList;
    if (source) { 
    cJSON *source_local_nonprimitive;
    if(!cJSON_IsArray(source)){
        goto end; //nonprimitive container
    }

    sourceList = list_create();

    cJSON_ArrayForEach(source_local_nonprimitive,source )
    {
        if(!cJSON_IsObject(source_local_nonprimitive)){
            goto end;
        }
        inline_response_200_7_issues_source_t *sourceItem = inline_response_200_7_issues_source_parseFromJSON(source_local_nonprimitive);

        list_addElement(sourceList, sourceItem);
    }
    }


    inline_response_200_7_issues_local_var = inline_response_200_7_issues_create (
        general ? generalList : NULL,
        source ? sourceList : NULL
        );

    return inline_response_200_7_issues_local_var;
end:
    return NULL;

}
