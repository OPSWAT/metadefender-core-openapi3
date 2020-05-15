#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "inline_response_200_9.h"



inline_response_200_9_t *inline_response_200_9_create(
    char *data_id,
    char *request_time,
    int status_code,
    char *url
    ) {
    inline_response_200_9_t *inline_response_200_9_local_var = malloc(sizeof(inline_response_200_9_t));
    if (!inline_response_200_9_local_var) {
        return NULL;
    }
    inline_response_200_9_local_var->data_id = data_id;
    inline_response_200_9_local_var->request_time = request_time;
    inline_response_200_9_local_var->status_code = status_code;
    inline_response_200_9_local_var->url = url;

    return inline_response_200_9_local_var;
}


void inline_response_200_9_free(inline_response_200_9_t *inline_response_200_9) {
    if(NULL == inline_response_200_9){
        return ;
    }
    listEntry_t *listEntry;
    free(inline_response_200_9->data_id);
    free(inline_response_200_9->request_time);
    free(inline_response_200_9->url);
    free(inline_response_200_9);
}

cJSON *inline_response_200_9_convertToJSON(inline_response_200_9_t *inline_response_200_9) {
    cJSON *item = cJSON_CreateObject();

    // inline_response_200_9->data_id
    if(inline_response_200_9->data_id) { 
    if(cJSON_AddStringToObject(item, "data_id", inline_response_200_9->data_id) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_9->request_time
    if(inline_response_200_9->request_time) { 
    if(cJSON_AddStringToObject(item, "request_time", inline_response_200_9->request_time) == NULL) {
    goto fail; //String
    }
     } 


    // inline_response_200_9->status_code
    if(inline_response_200_9->status_code) { 
    if(cJSON_AddNumberToObject(item, "status_code", inline_response_200_9->status_code) == NULL) {
    goto fail; //Numeric
    }
     } 


    // inline_response_200_9->url
    if(inline_response_200_9->url) { 
    if(cJSON_AddStringToObject(item, "url", inline_response_200_9->url) == NULL) {
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

inline_response_200_9_t *inline_response_200_9_parseFromJSON(cJSON *inline_response_200_9JSON){

    inline_response_200_9_t *inline_response_200_9_local_var = NULL;

    // inline_response_200_9->data_id
    cJSON *data_id = cJSON_GetObjectItemCaseSensitive(inline_response_200_9JSON, "data_id");
    if (data_id) { 
    if(!cJSON_IsString(data_id))
    {
    goto end; //String
    }
    }

    // inline_response_200_9->request_time
    cJSON *request_time = cJSON_GetObjectItemCaseSensitive(inline_response_200_9JSON, "request_time");
    if (request_time) { 
    if(!cJSON_IsString(request_time))
    {
    goto end; //String
    }
    }

    // inline_response_200_9->status_code
    cJSON *status_code = cJSON_GetObjectItemCaseSensitive(inline_response_200_9JSON, "status_code");
    if (status_code) { 
    if(!cJSON_IsNumber(status_code))
    {
    goto end; //Numeric
    }
    }

    // inline_response_200_9->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(inline_response_200_9JSON, "url");
    if (url) { 
    if(!cJSON_IsString(url))
    {
    goto end; //String
    }
    }


    inline_response_200_9_local_var = inline_response_200_9_create (
        data_id ? strdup(data_id->valuestring) : NULL,
        request_time ? strdup(request_time->valuestring) : NULL,
        status_code ? status_code->valuedouble : 0,
        url ? strdup(url->valuestring) : NULL
        );

    return inline_response_200_9_local_var;
end:
    return NULL;

}
