#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_response_process_info.h"



batch_response_process_info_t *batch_response_process_info_create(
    char *blocked_reason,
    int file_type_skipped_scan,
    char *profile,
    char *result,
    char *user_agent,
    char *username
    ) {
    batch_response_process_info_t *batch_response_process_info_local_var = malloc(sizeof(batch_response_process_info_t));
    if (!batch_response_process_info_local_var) {
        return NULL;
    }
    batch_response_process_info_local_var->blocked_reason = blocked_reason;
    batch_response_process_info_local_var->file_type_skipped_scan = file_type_skipped_scan;
    batch_response_process_info_local_var->profile = profile;
    batch_response_process_info_local_var->result = result;
    batch_response_process_info_local_var->user_agent = user_agent;
    batch_response_process_info_local_var->username = username;

    return batch_response_process_info_local_var;
}


void batch_response_process_info_free(batch_response_process_info_t *batch_response_process_info) {
    if(NULL == batch_response_process_info){
        return ;
    }
    listEntry_t *listEntry;
    free(batch_response_process_info->blocked_reason);
    free(batch_response_process_info->profile);
    free(batch_response_process_info->result);
    free(batch_response_process_info->user_agent);
    free(batch_response_process_info->username);
    free(batch_response_process_info);
}

cJSON *batch_response_process_info_convertToJSON(batch_response_process_info_t *batch_response_process_info) {
    cJSON *item = cJSON_CreateObject();

    // batch_response_process_info->blocked_reason
    if(batch_response_process_info->blocked_reason) { 
    if(cJSON_AddStringToObject(item, "blocked_reason", batch_response_process_info->blocked_reason) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_process_info->file_type_skipped_scan
    if(batch_response_process_info->file_type_skipped_scan) { 
    if(cJSON_AddBoolToObject(item, "file_type_skipped_scan", batch_response_process_info->file_type_skipped_scan) == NULL) {
    goto fail; //Bool
    }
     } 


    // batch_response_process_info->profile
    if(batch_response_process_info->profile) { 
    if(cJSON_AddStringToObject(item, "profile", batch_response_process_info->profile) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_process_info->result
    if(batch_response_process_info->result) { 
    if(cJSON_AddStringToObject(item, "result", batch_response_process_info->result) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_process_info->user_agent
    if(batch_response_process_info->user_agent) { 
    if(cJSON_AddStringToObject(item, "user_agent", batch_response_process_info->user_agent) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_process_info->username
    if(batch_response_process_info->username) { 
    if(cJSON_AddStringToObject(item, "username", batch_response_process_info->username) == NULL) {
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

batch_response_process_info_t *batch_response_process_info_parseFromJSON(cJSON *batch_response_process_infoJSON){

    batch_response_process_info_t *batch_response_process_info_local_var = NULL;

    // batch_response_process_info->blocked_reason
    cJSON *blocked_reason = cJSON_GetObjectItemCaseSensitive(batch_response_process_infoJSON, "blocked_reason");
    if (blocked_reason) { 
    if(!cJSON_IsString(blocked_reason))
    {
    goto end; //String
    }
    }

    // batch_response_process_info->file_type_skipped_scan
    cJSON *file_type_skipped_scan = cJSON_GetObjectItemCaseSensitive(batch_response_process_infoJSON, "file_type_skipped_scan");
    if (file_type_skipped_scan) { 
    if(!cJSON_IsBool(file_type_skipped_scan))
    {
    goto end; //Bool
    }
    }

    // batch_response_process_info->profile
    cJSON *profile = cJSON_GetObjectItemCaseSensitive(batch_response_process_infoJSON, "profile");
    if (profile) { 
    if(!cJSON_IsString(profile))
    {
    goto end; //String
    }
    }

    // batch_response_process_info->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(batch_response_process_infoJSON, "result");
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //String
    }
    }

    // batch_response_process_info->user_agent
    cJSON *user_agent = cJSON_GetObjectItemCaseSensitive(batch_response_process_infoJSON, "user_agent");
    if (user_agent) { 
    if(!cJSON_IsString(user_agent))
    {
    goto end; //String
    }
    }

    // batch_response_process_info->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(batch_response_process_infoJSON, "username");
    if (username) { 
    if(!cJSON_IsString(username))
    {
    goto end; //String
    }
    }


    batch_response_process_info_local_var = batch_response_process_info_create (
        blocked_reason ? strdup(blocked_reason->valuestring) : NULL,
        file_type_skipped_scan ? file_type_skipped_scan->valueint : 0,
        profile ? strdup(profile->valuestring) : NULL,
        result ? strdup(result->valuestring) : NULL,
        user_agent ? strdup(user_agent->valuestring) : NULL,
        username ? strdup(username->valuestring) : NULL
        );

    return batch_response_process_info_local_var;
end:
    return NULL;

}
