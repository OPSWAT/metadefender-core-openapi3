#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_7_issues_general.h"



inline_response_200_7_issues_general_t *inline_response_200_7_issues_general_create(
    char *severity,
    char *message
    ) {
    inline_response_200_7_issues_general_t *inline_response_200_7_issues_general_local_var = malloc(sizeof(inline_response_200_7_issues_general_t));
    if (!inline_response_200_7_issues_general_local_var) {
        return NULL;
    }
    inline_response_200_7_issues_general_local_var->severity = severity;
    inline_response_200_7_issues_general_local_var->message = message;

    return inline_response_200_7_issues_general_local_var;
}


void inline_response_200_7_issues_general_free(inline_response_200_7_issues_general_t *inline_response_200_7_issues_general) {
    if(NULL == inline_response_200_7_issues_general){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_7_issues_general->severity);
    free(inline_response_200_7_issues_general->message);
    free(inline_response_200_7_issues_general);
}

cJSON *inline_response_200_7_issues_general_convertToJSON(inline_response_200_7_issues_general_t *inline_response_200_7_issues_general) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_7_issues_general->severity
    if(inline_response_200_7_issues_general->severity) { 
    if(cJSON_AddStringToObject(item, "severity", inline_response_200_7_issues_general->severity) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_7_issues_general->message
    if(inline_response_200_7_issues_general->message) { 
    if(cJSON_AddStringToObject(item, "message", inline_response_200_7_issues_general->message) == NULL) {
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

inline_response_200_7_issues_general_t *inline_response_200_7_issues_general_parseFromJSON(cJSON *inline_response_200_7_issues_generalJSON){

    inline_response_200_7_issues_general_t *inline_response_200_7_issues_general_local_var = NULL;

    // inline_response_200_7_issues_general->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(inline_response_200_7_issues_generalJSON, "severity");
    if (severity) { 
    if(!cJSON_IsString(severity))
    {
    goto end; //String
    }
    }

    // inline_response_200_7_issues_general->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(inline_response_200_7_issues_generalJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }
    }


    inline_response_200_7_issues_general_local_var = inline_response_200_7_issues_general_create (
        severity ? strdup(severity->valuestring) : NULL,
        message ? strdup(message->valuestring) : NULL
        );

    return inline_response_200_7_issues_general_local_var;
end:
    return NULL;

}
