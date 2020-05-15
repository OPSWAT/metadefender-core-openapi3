#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_13.h"



inline_response_200_13_t *inline_response_200_13_create(
    int external_nodes_allowed,
    int max_node_count,
    list_t *statuses
    ) {
    inline_response_200_13_t *inline_response_200_13_local_var = malloc(sizeof(inline_response_200_13_t));
    if (!inline_response_200_13_local_var) {
        return NULL;
    }
    inline_response_200_13_local_var->external_nodes_allowed = external_nodes_allowed;
    inline_response_200_13_local_var->max_node_count = max_node_count;
    inline_response_200_13_local_var->statuses = statuses;

    return inline_response_200_13_local_var;
}


void inline_response_200_13_free(inline_response_200_13_t *inline_response_200_13) {
    if(NULL == inline_response_200_13){
        return ;
    }
    listEntry_t *listEntry;
    list_ForEach(listEntry, inline_response_200_13->statuses) {
        _stat_nodes_statuses_free(listEntry->data);
    }
    list_free(inline_response_200_13->statuses);
    free(inline_response_200_13);
}

cJSON *inline_response_200_13_convertToJSON(inline_response_200_13_t *inline_response_200_13) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_13->external_nodes_allowed
    if(inline_response_200_13->external_nodes_allowed) { 
    if(cJSON_AddBoolToObject(item, "external_nodes_allowed", inline_response_200_13->external_nodes_allowed) == NULL) {
    goto fail; //Bool
    }
     } 


    // inline_response_200_13->max_node_count
    if(inline_response_200_13->max_node_count) { 
    if(cJSON_AddNumberToObject(item, "max_node_count", inline_response_200_13->max_node_count) == NULL) {
    goto fail; //Numeric
    }
     } 


    // inline_response_200_13->statuses
    if(inline_response_200_13->statuses) { 
    cJSON *statuses = cJSON_AddArrayToObject(item, "statuses");
    if(statuses == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *statusesListEntry;
    if (inline_response_200_13->statuses) {
    list_ForEach(statusesListEntry, inline_response_200_13->statuses) {
    cJSON *itemLocal = _stat_nodes_statuses_convertToJSON(statusesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(statuses, itemLocal);
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

inline_response_200_13_t *inline_response_200_13_parseFromJSON(cJSON *inline_response_200_13JSON){

    inline_response_200_13_t *inline_response_200_13_local_var = NULL;

    // inline_response_200_13->external_nodes_allowed
    cJSON *external_nodes_allowed = cJSON_GetObjectItemCaseSensitive(inline_response_200_13JSON, "external_nodes_allowed");
    if (external_nodes_allowed) { 
    if(!cJSON_IsBool(external_nodes_allowed))
    {
    goto end; //Bool
    }
    }

    // inline_response_200_13->max_node_count
    cJSON *max_node_count = cJSON_GetObjectItemCaseSensitive(inline_response_200_13JSON, "max_node_count");
    if (max_node_count) { 
    if(!cJSON_IsNumber(max_node_count))
    {
    goto end; //Numeric
    }
    }

    // inline_response_200_13->statuses
    cJSON *statuses = cJSON_GetObjectItemCaseSensitive(inline_response_200_13JSON, "statuses");
    list_t *statusesList;
    if (statuses) { 
    cJSON *statuses_local_nonprimitive;
    if(!cJSON_IsArray(statuses)){
        goto end; //nonprimitive container
    }

    statusesList = list_create();

    cJSON_ArrayForEach(statuses_local_nonprimitive,statuses )
    {
        if(!cJSON_IsObject(statuses_local_nonprimitive)){
            goto end;
        }
        _stat_nodes_statuses_t *statusesItem = _stat_nodes_statuses_parseFromJSON(statuses_local_nonprimitive);

        list_addElement(statusesList, statusesItem);
    }
    }


    inline_response_200_13_local_var = inline_response_200_13_create (
        external_nodes_allowed ? external_nodes_allowed->valueint : 0,
        max_node_count ? max_node_count->valuedouble : 0,
        statuses ? statusesList : NULL
        );

    return inline_response_200_13_local_var;
end:
    return NULL;

}
