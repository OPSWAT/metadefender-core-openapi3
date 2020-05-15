#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "deep_cdr_details.h"



deep_cdr_details_t *deep_cdr_details_create(
    char *description,
    list_t *details
    ) {
    deep_cdr_details_t *deep_cdr_details_local_var = malloc(sizeof(deep_cdr_details_t));
    if (!deep_cdr_details_local_var) {
        return NULL;
    }
    deep_cdr_details_local_var->description = description;
    deep_cdr_details_local_var->details = details;

    return deep_cdr_details_local_var;
}


void deep_cdr_details_free(deep_cdr_details_t *deep_cdr_details) {
    if(NULL == deep_cdr_details){
        return ;
    }
    listEntry_t *listEntry;
    free(deep_cdr_details->description);
    list_ForEach(listEntry, deep_cdr_details->details) {
        deep_cdr_details_details_free(listEntry->data);
    }
    list_free(deep_cdr_details->details);
    free(deep_cdr_details);
}

cJSON *deep_cdr_details_convertToJSON(deep_cdr_details_t *deep_cdr_details) {
    cJSON *item = cJSON_CreateObject();

    // deep_cdr_details->description
    if(deep_cdr_details->description) { 
    if(cJSON_AddStringToObject(item, "description", deep_cdr_details->description) == NULL) {
    goto fail; //String
    }
     } 


    // deep_cdr_details->details
    if(deep_cdr_details->details) { 
    cJSON *details = cJSON_AddArrayToObject(item, "details");
    if(details == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *detailsListEntry;
    if (deep_cdr_details->details) {
    list_ForEach(detailsListEntry, deep_cdr_details->details) {
    cJSON *itemLocal = deep_cdr_details_details_convertToJSON(detailsListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(details, itemLocal);
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

deep_cdr_details_t *deep_cdr_details_parseFromJSON(cJSON *deep_cdr_detailsJSON){

    deep_cdr_details_t *deep_cdr_details_local_var = NULL;

    // deep_cdr_details->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(deep_cdr_detailsJSON, "description");
    if (description) { 
    if(!cJSON_IsString(description))
    {
    goto end; //String
    }
    }

    // deep_cdr_details->details
    cJSON *details = cJSON_GetObjectItemCaseSensitive(deep_cdr_detailsJSON, "details");
    list_t *detailsList;
    if (details) { 
    cJSON *details_local_nonprimitive;
    if(!cJSON_IsArray(details)){
        goto end; //nonprimitive container
    }

    detailsList = list_create();

    cJSON_ArrayForEach(details_local_nonprimitive,details )
    {
        if(!cJSON_IsObject(details_local_nonprimitive)){
            goto end;
        }
        deep_cdr_details_details_t *detailsItem = deep_cdr_details_details_parseFromJSON(details_local_nonprimitive);

        list_addElement(detailsList, detailsItem);
    }
    }


    deep_cdr_details_local_var = deep_cdr_details_create (
        description ? strdup(description->valuestring) : NULL,
        details ? detailsList : NULL
        );

    return deep_cdr_details_local_var;
end:
    return NULL;

}
