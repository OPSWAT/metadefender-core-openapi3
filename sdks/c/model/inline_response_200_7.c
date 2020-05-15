#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_7.h"


char* statusinline_response_200_7_ToString(metadefender_core_inline_response_200_7_STATUS_e status) {
    char* statusArray[] =  { "NULL", "idle", "error", "inprogress" };
	return statusArray[status];
}

metadefender_core_inline_response_200_7_STATUS_e statusinline_response_200_7_FromString(char* status){
    int stringToReturn = 0;
    char *statusArray[] =  { "NULL", "idle", "error", "inprogress" };
    size_t sizeofArray = sizeof(statusArray) / sizeof(statusArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(status, statusArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

inline_response_200_7_t *inline_response_200_7_create(
    metadefender_core_inline_response_200_7_STATUS_e status,
    char *start_time,
    inline_response_200_7_issues_t *issues
    ) {
    inline_response_200_7_t *inline_response_200_7_local_var = malloc(sizeof(inline_response_200_7_t));
    if (!inline_response_200_7_local_var) {
        return NULL;
    }
    inline_response_200_7_local_var->status = status;
    inline_response_200_7_local_var->start_time = start_time;
    inline_response_200_7_local_var->issues = issues;

    return inline_response_200_7_local_var;
}


void inline_response_200_7_free(inline_response_200_7_t *inline_response_200_7) {
    if(NULL == inline_response_200_7){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_7->start_time);
    inline_response_200_7_issues_free(inline_response_200_7->issues);
    free(inline_response_200_7);
}

cJSON *inline_response_200_7_convertToJSON(inline_response_200_7_t *inline_response_200_7) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_7->status
    
    if(cJSON_AddStringToObject(item, "status", statusinline_response_200_7_ToString(inline_response_200_7->status)) == NULL)
    {
    goto fail; //Enum
    }
    


    // inline_response_200_7->start_time
    if(inline_response_200_7->start_time) { 
    if(cJSON_AddStringToObject(item, "start_time", inline_response_200_7->start_time) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_7->issues
    if(inline_response_200_7->issues) { 
    cJSON *issues_local_JSON = inline_response_200_7_issues_convertToJSON(inline_response_200_7->issues);
    if(issues_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "issues", issues_local_JSON);
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

inline_response_200_7_t *inline_response_200_7_parseFromJSON(cJSON *inline_response_200_7JSON){

    inline_response_200_7_t *inline_response_200_7_local_var = NULL;

    // inline_response_200_7->status
    cJSON *status = cJSON_GetObjectItemCaseSensitive(inline_response_200_7JSON, "status");
    metadefender_core_inline_response_200_7_STATUS_e statusVariable;
    if (status) { 
    if(!cJSON_IsString(status))
    {
    goto end; //Enum
    }
    statusVariable = statusinline_response_200_7_FromString(status->valuestring);
    }

    // inline_response_200_7->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(inline_response_200_7JSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsString(start_time))
    {
    goto end; //String
    }
    }

    // inline_response_200_7->issues
    cJSON *issues = cJSON_GetObjectItemCaseSensitive(inline_response_200_7JSON, "issues");
    inline_response_200_7_issues_t *issues_local_nonprim = NULL;
    if (issues) { 
    issues_local_nonprim = inline_response_200_7_issues_parseFromJSON(issues); //nonprimitive
    }


    inline_response_200_7_local_var = inline_response_200_7_create (
        status ? statusVariable : -1,
        start_time ? strdup(start_time->valuestring) : NULL,
        issues ? issues_local_nonprim : NULL
        );

    return inline_response_200_7_local_var;
end:
    return NULL;

}
