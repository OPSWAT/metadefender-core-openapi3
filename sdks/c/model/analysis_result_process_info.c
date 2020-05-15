#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "analysis_result_process_info.h"


char* outdated_dataanalysis_result_process_info_ToString(metadefender_core_analysis_result_process_info_OUTDATEDDATA_e outdated_data) {
	char *outdated_dataArray[] =  { "NULL", "enginedefinition", "configuration", "sanitization" };
	return outdated_dataArray[outdated_data - 1];
}

metadefender_core_analysis_result_process_info_OUTDATEDDATA_e outdated_dataanalysis_result_process_info_FromString(char* outdated_data) {
    int stringToReturn = 0;
    char *outdated_dataArray[] =  { "NULL", "enginedefinition", "configuration", "sanitization" };
    size_t sizeofArray = sizeof(outdated_dataArray) / sizeof(outdated_dataArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(outdated_data, outdated_dataArray[stringToReturn]) == 0) {
            return stringToReturn + 1;
        }
        stringToReturn++;
    }
    return 0;
}

analysis_result_process_info_t *analysis_result_process_info_create(
    char *blocked_reason,
    int file_type_skipped_scan,
    list_t *outdated_data,
    int processing_time,
    char *profile,
    int progress_percentage,
    int queue_time,
    char *result,
    char *user_agent,
    char *username,
    list_t *verdicts,
    analysis_result_process_info_post_processing_t *post_processing
    ) {
    analysis_result_process_info_t *analysis_result_process_info_local_var = malloc(sizeof(analysis_result_process_info_t));
    if (!analysis_result_process_info_local_var) {
        return NULL;
    }
    analysis_result_process_info_local_var->blocked_reason = blocked_reason;
    analysis_result_process_info_local_var->file_type_skipped_scan = file_type_skipped_scan;
    analysis_result_process_info_local_var->outdated_data = outdated_data;
    analysis_result_process_info_local_var->processing_time = processing_time;
    analysis_result_process_info_local_var->profile = profile;
    analysis_result_process_info_local_var->progress_percentage = progress_percentage;
    analysis_result_process_info_local_var->queue_time = queue_time;
    analysis_result_process_info_local_var->result = result;
    analysis_result_process_info_local_var->user_agent = user_agent;
    analysis_result_process_info_local_var->username = username;
    analysis_result_process_info_local_var->verdicts = verdicts;
    analysis_result_process_info_local_var->post_processing = post_processing;

    return analysis_result_process_info_local_var;
}


void analysis_result_process_info_free(analysis_result_process_info_t *analysis_result_process_info) {
    if(NULL == analysis_result_process_info){
        return ;
    }
    listEntry_t *listEntry;
    free(analysis_result_process_info->blocked_reason);
    list_ForEach(listEntry, analysis_result_process_info->outdated_data) {
        free(listEntry->data);
    }
    list_free(analysis_result_process_info->outdated_data);
    free(analysis_result_process_info->profile);
    free(analysis_result_process_info->result);
    free(analysis_result_process_info->user_agent);
    free(analysis_result_process_info->username);
    list_ForEach(listEntry, analysis_result_process_info->verdicts) {
        free(listEntry->data);
    }
    list_free(analysis_result_process_info->verdicts);
    analysis_result_process_info_post_processing_free(analysis_result_process_info->post_processing);
    free(analysis_result_process_info);
}

cJSON *analysis_result_process_info_convertToJSON(analysis_result_process_info_t *analysis_result_process_info) {
    cJSON *item = cJSON_CreateObject();

    // analysis_result_process_info->blocked_reason
    if(analysis_result_process_info->blocked_reason) { 
    if(cJSON_AddStringToObject(item, "blocked_reason", analysis_result_process_info->blocked_reason) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info->file_type_skipped_scan
    if(analysis_result_process_info->file_type_skipped_scan) { 
    if(cJSON_AddBoolToObject(item, "file_type_skipped_scan", analysis_result_process_info->file_type_skipped_scan) == NULL) {
    goto fail; //Bool
    }
     } 


    // analysis_result_process_info->outdated_data
    
    cJSON *outdated_data = cJSON_AddArrayToObject(item, "outdated_data");
    if(outdated_data == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *outdated_dataListEntry;
    list_ForEach(outdated_dataListEntry, analysis_result_process_info->outdated_data) {
    if(cJSON_AddStringToObject(outdated_data, "", (char*)outdated_dataListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    


    // analysis_result_process_info->processing_time
    if(analysis_result_process_info->processing_time) { 
    if(cJSON_AddNumberToObject(item, "processing_time", analysis_result_process_info->processing_time) == NULL) {
    goto fail; //Numeric
    }
     } 


    // analysis_result_process_info->profile
    if(analysis_result_process_info->profile) { 
    if(cJSON_AddStringToObject(item, "profile", analysis_result_process_info->profile) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info->progress_percentage
    if(analysis_result_process_info->progress_percentage) { 
    if(cJSON_AddNumberToObject(item, "progress_percentage", analysis_result_process_info->progress_percentage) == NULL) {
    goto fail; //Numeric
    }
     } 


    // analysis_result_process_info->queue_time
    if(analysis_result_process_info->queue_time) { 
    if(cJSON_AddNumberToObject(item, "queue_time", analysis_result_process_info->queue_time) == NULL) {
    goto fail; //Numeric
    }
     } 


    // analysis_result_process_info->result
    if(analysis_result_process_info->result) { 
    if(cJSON_AddStringToObject(item, "result", analysis_result_process_info->result) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info->user_agent
    if(analysis_result_process_info->user_agent) { 
    if(cJSON_AddStringToObject(item, "user_agent", analysis_result_process_info->user_agent) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info->username
    if(analysis_result_process_info->username) { 
    if(cJSON_AddStringToObject(item, "username", analysis_result_process_info->username) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info->verdicts
    if(analysis_result_process_info->verdicts) { 
    cJSON *verdicts = cJSON_AddArrayToObject(item, "verdicts");
    if(verdicts == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *verdictsListEntry;
    list_ForEach(verdictsListEntry, analysis_result_process_info->verdicts) {
    if(cJSON_AddStringToObject(verdicts, "", (char*)verdictsListEntry->data) == NULL)
    {
        goto fail;
    }
    }
     } 


    // analysis_result_process_info->post_processing
    if(analysis_result_process_info->post_processing) { 
    cJSON *post_processing_local_JSON = analysis_result_process_info_post_processing_convertToJSON(analysis_result_process_info->post_processing);
    if(post_processing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "post_processing", post_processing_local_JSON);
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

analysis_result_process_info_t *analysis_result_process_info_parseFromJSON(cJSON *analysis_result_process_infoJSON){

    analysis_result_process_info_t *analysis_result_process_info_local_var = NULL;

    // analysis_result_process_info->blocked_reason
    cJSON *blocked_reason = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "blocked_reason");
    if (blocked_reason) { 
    if(!cJSON_IsString(blocked_reason))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info->file_type_skipped_scan
    cJSON *file_type_skipped_scan = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "file_type_skipped_scan");
    if (file_type_skipped_scan) { 
    if(!cJSON_IsBool(file_type_skipped_scan))
    {
    goto end; //Bool
    }
    }

    // analysis_result_process_info->outdated_data
    cJSON *outdated_data = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "outdated_data");
    list_t *outdated_dataList;
    if (outdated_data) { 
    cJSON *outdated_data_local;
    if(!cJSON_IsArray(outdated_data)) {
        goto end;//primitive container
    }
    outdated_dataList = list_create();

    cJSON_ArrayForEach(outdated_data_local, outdated_data)
    {
        if(!cJSON_IsString(outdated_data_local))
        {
            goto end;
        }
        list_addElement(outdated_dataList , strdup(outdated_data_local->valuestring));
    }
    }

    // analysis_result_process_info->processing_time
    cJSON *processing_time = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "processing_time");
    if (processing_time) { 
    if(!cJSON_IsNumber(processing_time))
    {
    goto end; //Numeric
    }
    }

    // analysis_result_process_info->profile
    cJSON *profile = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "profile");
    if (profile) { 
    if(!cJSON_IsString(profile))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info->progress_percentage
    cJSON *progress_percentage = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "progress_percentage");
    if (progress_percentage) { 
    if(!cJSON_IsNumber(progress_percentage))
    {
    goto end; //Numeric
    }
    }

    // analysis_result_process_info->queue_time
    cJSON *queue_time = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "queue_time");
    if (queue_time) { 
    if(!cJSON_IsNumber(queue_time))
    {
    goto end; //Numeric
    }
    }

    // analysis_result_process_info->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "result");
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info->user_agent
    cJSON *user_agent = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "user_agent");
    if (user_agent) { 
    if(!cJSON_IsString(user_agent))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "username");
    if (username) { 
    if(!cJSON_IsString(username))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info->verdicts
    cJSON *verdicts = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "verdicts");
    list_t *verdictsList;
    if (verdicts) { 
    cJSON *verdicts_local;
    if(!cJSON_IsArray(verdicts)) {
        goto end;//primitive container
    }
    verdictsList = list_create();

    cJSON_ArrayForEach(verdicts_local, verdicts)
    {
        if(!cJSON_IsString(verdicts_local))
        {
            goto end;
        }
        list_addElement(verdictsList , strdup(verdicts_local->valuestring));
    }
    }

    // analysis_result_process_info->post_processing
    cJSON *post_processing = cJSON_GetObjectItemCaseSensitive(analysis_result_process_infoJSON, "post_processing");
    analysis_result_process_info_post_processing_t *post_processing_local_nonprim = NULL;
    if (post_processing) { 
    post_processing_local_nonprim = analysis_result_process_info_post_processing_parseFromJSON(post_processing); //nonprimitive
    }


    analysis_result_process_info_local_var = analysis_result_process_info_create (
        blocked_reason ? strdup(blocked_reason->valuestring) : NULL,
        file_type_skipped_scan ? file_type_skipped_scan->valueint : 0,
        outdated_data ? outdated_dataList : NULL,
        processing_time ? processing_time->valuedouble : 0,
        profile ? strdup(profile->valuestring) : NULL,
        progress_percentage ? progress_percentage->valuedouble : 0,
        queue_time ? queue_time->valuedouble : 0,
        result ? strdup(result->valuestring) : NULL,
        user_agent ? strdup(user_agent->valuestring) : NULL,
        username ? strdup(username->valuestring) : NULL,
        verdicts ? verdictsList : NULL,
        post_processing ? post_processing_local_nonprim : NULL
        );

    return analysis_result_process_info_local_var;
end:
    return NULL;

}
