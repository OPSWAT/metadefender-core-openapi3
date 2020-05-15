#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_7_issues_source.h"



inline_response_200_7_issues_source_t *inline_response_200_7_issues_source_create(
    char *severity,
    char *message
    ) {
    inline_response_200_7_issues_source_t *inline_response_200_7_issues_source_local_var = malloc(sizeof(inline_response_200_7_issues_source_t));
    if (!inline_response_200_7_issues_source_local_var) {
        return NULL;
    }
    inline_response_200_7_issues_source_local_var->severity = severity;
    inline_response_200_7_issues_source_local_var->message = message;

    return inline_response_200_7_issues_source_local_var;
}


void inline_response_200_7_issues_source_free(inline_response_200_7_issues_source_t *inline_response_200_7_issues_source) {
    if(NULL == inline_response_200_7_issues_source){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_7_issues_source->severity);
    free(inline_response_200_7_issues_source->message);
    free(inline_response_200_7_issues_source);
}

cJSON *inline_response_200_7_issues_source_convertToJSON(inline_response_200_7_issues_source_t *inline_response_200_7_issues_source) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_7_issues_source->severity
    if(inline_response_200_7_issues_source->severity) { 
    if(cJSON_AddStringToObject(item, "severity", inline_response_200_7_issues_source->severity) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_7_issues_source->message
    if(inline_response_200_7_issues_source->message) { 
    if(cJSON_AddStringToObject(item, "message", inline_response_200_7_issues_source->message) == NULL) {
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

inline_response_200_7_issues_source_t *inline_response_200_7_issues_source_parseFromJSON(cJSON *inline_response_200_7_issues_sourceJSON){

    inline_response_200_7_issues_source_t *inline_response_200_7_issues_source_local_var = NULL;

    // inline_response_200_7_issues_source->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(inline_response_200_7_issues_sourceJSON, "severity");
    if (severity) { 
    if(!cJSON_IsString(severity))
    {
    goto end; //String
    }
    }

    // inline_response_200_7_issues_source->message
    cJSON *message = cJSON_GetObjectItemCaseSensitive(inline_response_200_7_issues_sourceJSON, "message");
    if (message) { 
    if(!cJSON_IsString(message))
    {
    goto end; //String
    }
    }


    inline_response_200_7_issues_source_local_var = inline_response_200_7_issues_source_create (
        severity ? strdup(severity->valuestring) : NULL,
        message ? strdup(message->valuestring) : NULL
        );

    return inline_response_200_7_issues_source_local_var;
end:
    return NULL;

}
