#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "deep_cdr_details_details.h"


char* actiondeep_cdr_details_details_ToString(metadefender_core_deep_cdr_details_details_ACTION_e action) {
    char* actionArray[] =  { "NULL", "sanitized", "removed" };
	return actionArray[action];
}

metadefender_core_deep_cdr_details_details_ACTION_e actiondeep_cdr_details_details_FromString(char* action){
    int stringToReturn = 0;
    char *actionArray[] =  { "NULL", "sanitized", "removed" };
    size_t sizeofArray = sizeof(actionArray) / sizeof(actionArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(action, actionArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

deep_cdr_details_details_t *deep_cdr_details_details_create(
    metadefender_core_deep_cdr_details_details_ACTION_e action,
    char *object_name,
    int count,
    char *object_details,
    char *file_name
    ) {
    deep_cdr_details_details_t *deep_cdr_details_details_local_var = malloc(sizeof(deep_cdr_details_details_t));
    if (!deep_cdr_details_details_local_var) {
        return NULL;
    }
    deep_cdr_details_details_local_var->action = action;
    deep_cdr_details_details_local_var->object_name = object_name;
    deep_cdr_details_details_local_var->count = count;
    deep_cdr_details_details_local_var->object_details = object_details;
    deep_cdr_details_details_local_var->file_name = file_name;

    return deep_cdr_details_details_local_var;
}


void deep_cdr_details_details_free(deep_cdr_details_details_t *deep_cdr_details_details) {
    if(NULL == deep_cdr_details_details){
        return ;
    }
    listEntry_t *listEntry;
    free(deep_cdr_details_details->object_name);
    free(deep_cdr_details_details->object_details);
    free(deep_cdr_details_details->file_name);
    free(deep_cdr_details_details);
}

cJSON *deep_cdr_details_details_convertToJSON(deep_cdr_details_details_t *deep_cdr_details_details) {
    cJSON *item = cJSON_CreateObject();

    // deep_cdr_details_details->action
    
    if(cJSON_AddStringToObject(item, "action", actiondeep_cdr_details_details_ToString(deep_cdr_details_details->action)) == NULL)
    {
    goto fail; //Enum
    }


    // deep_cdr_details_details->object_name
    if (!deep_cdr_details_details->object_name) {
        goto fail;
    }
    
    if(cJSON_AddStringToObject(item, "object_name", deep_cdr_details_details->object_name) == NULL) {
    goto fail; //String
    }


    // deep_cdr_details_details->count
    if(deep_cdr_details_details->count) { 
    if(cJSON_AddNumberToObject(item, "count", deep_cdr_details_details->count) == NULL) {
    goto fail; //Numeric
    }
     } 


    // deep_cdr_details_details->object_details
    if(deep_cdr_details_details->object_details) { 
    if(cJSON_AddStringToObject(item, "object_details", deep_cdr_details_details->object_details) == NULL) {
    goto fail; //String
    }
     } 


    // deep_cdr_details_details->file_name
    if(deep_cdr_details_details->file_name) { 
    if(cJSON_AddStringToObject(item, "file_name", deep_cdr_details_details->file_name) == NULL) {
    goto fail; //String
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

deep_cdr_details_details_t *deep_cdr_details_details_parseFromJSON(cJSON *deep_cdr_details_detailsJSON){

    deep_cdr_details_details_t *deep_cdr_details_details_local_var = NULL;

    // deep_cdr_details_details->action
    cJSON *action = cJSON_GetObjectItemCaseSensitive(deep_cdr_details_detailsJSON, "action");
    if (!action) {
        goto end;
    }

    metadefender_core_deep_cdr_details_details_ACTION_e actionVariable;
    
    if(!cJSON_IsString(action))
    {
    goto end; //Enum
    }
    actionVariable = actiondeep_cdr_details_details_FromString(action->valuestring);

    // deep_cdr_details_details->object_name
    cJSON *object_name = cJSON_GetObjectItemCaseSensitive(deep_cdr_details_detailsJSON, "object_name");
    if (!object_name) {
        goto end;
    }

    
    if(!cJSON_IsString(object_name))
    {
    goto end; //String
    }

    // deep_cdr_details_details->count
    cJSON *count = cJSON_GetObjectItemCaseSensitive(deep_cdr_details_detailsJSON, "count");
    if (count) { 
    if(!cJSON_IsNumber(count))
    {
    goto end; //Numeric
    }
    }

    // deep_cdr_details_details->object_details
    cJSON *object_details = cJSON_GetObjectItemCaseSensitive(deep_cdr_details_detailsJSON, "object_details");
    if (object_details) { 
    if(!cJSON_IsString(object_details))
    {
    goto end; //String
    }
    }

    // deep_cdr_details_details->file_name
    cJSON *file_name = cJSON_GetObjectItemCaseSensitive(deep_cdr_details_detailsJSON, "file_name");
    if (file_name) { 
    if(!cJSON_IsString(file_name))
    {
    goto end; //String
    }
    }


    deep_cdr_details_details_local_var = deep_cdr_details_details_create (
        actionVariable,
        strdup(object_name->valuestring),
        count ? count->valuedouble : 0,
        object_details ? strdup(object_details->valuestring) : NULL,
        file_name ? strdup(file_name->valuestring) : NULL
        );

    return deep_cdr_details_details_local_var;
end:
    return NULL;

}
