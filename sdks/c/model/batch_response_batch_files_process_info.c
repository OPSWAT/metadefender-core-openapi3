#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_response_batch_files_process_info.h"



batch_response_batch_files_process_info_t *batch_response_batch_files_process_info_create(
    char *blocked_reason,
    int progress_percentage,
    char *result,
    list_t *verdicts
    ) {
    batch_response_batch_files_process_info_t *batch_response_batch_files_process_info_local_var = malloc(sizeof(batch_response_batch_files_process_info_t));
    if (!batch_response_batch_files_process_info_local_var) {
        return NULL;
    }
    batch_response_batch_files_process_info_local_var->blocked_reason = blocked_reason;
    batch_response_batch_files_process_info_local_var->progress_percentage = progress_percentage;
    batch_response_batch_files_process_info_local_var->result = result;
    batch_response_batch_files_process_info_local_var->verdicts = verdicts;

    return batch_response_batch_files_process_info_local_var;
}


void batch_response_batch_files_process_info_free(batch_response_batch_files_process_info_t *batch_response_batch_files_process_info) {
    if(NULL == batch_response_batch_files_process_info){
        return ;
    }
    listEntry_t *listEntry;
    free(batch_response_batch_files_process_info->blocked_reason);
    free(batch_response_batch_files_process_info->result);
    list_ForEach(listEntry, batch_response_batch_files_process_info->verdicts) {
        free(listEntry->data);
    }
    list_free(batch_response_batch_files_process_info->verdicts);
    free(batch_response_batch_files_process_info);
}

cJSON *batch_response_batch_files_process_info_convertToJSON(batch_response_batch_files_process_info_t *batch_response_batch_files_process_info) {
    cJSON *item = cJSON_CreateObject();

    // batch_response_batch_files_process_info->blocked_reason
    if(batch_response_batch_files_process_info->blocked_reason) { 
    if(cJSON_AddStringToObject(item, "blocked_reason", batch_response_batch_files_process_info->blocked_reason) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_batch_files_process_info->progress_percentage
    if(batch_response_batch_files_process_info->progress_percentage) { 
    if(cJSON_AddNumberToObject(item, "progress_percentage", batch_response_batch_files_process_info->progress_percentage) == NULL) {
    goto fail; //Numeric
    }
     } 


    // batch_response_batch_files_process_info->result
    if(batch_response_batch_files_process_info->result) { 
    if(cJSON_AddStringToObject(item, "result", batch_response_batch_files_process_info->result) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_batch_files_process_info->verdicts
    if(batch_response_batch_files_process_info->verdicts) { 
    cJSON *verdicts = cJSON_AddArrayToObject(item, "verdicts");
    if(verdicts == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *verdictsListEntry;
    list_ForEach(verdictsListEntry, batch_response_batch_files_process_info->verdicts) {
    if(cJSON_AddStringToObject(verdicts, "", (char*)verdictsListEntry->data) == NULL)
    {
        goto fail;
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

batch_response_batch_files_process_info_t *batch_response_batch_files_process_info_parseFromJSON(cJSON *batch_response_batch_files_process_infoJSON){

    batch_response_batch_files_process_info_t *batch_response_batch_files_process_info_local_var = NULL;

    // batch_response_batch_files_process_info->blocked_reason
    cJSON *blocked_reason = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_process_infoJSON, "blocked_reason");
    if (blocked_reason) { 
    if(!cJSON_IsString(blocked_reason))
    {
    goto end; //String
    }
    }

    // batch_response_batch_files_process_info->progress_percentage
    cJSON *progress_percentage = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_process_infoJSON, "progress_percentage");
    if (progress_percentage) { 
    if(!cJSON_IsNumber(progress_percentage))
    {
    goto end; //Numeric
    }
    }

    // batch_response_batch_files_process_info->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_process_infoJSON, "result");
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //String
    }
    }

    // batch_response_batch_files_process_info->verdicts
    cJSON *verdicts = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_process_infoJSON, "verdicts");
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


    batch_response_batch_files_process_info_local_var = batch_response_batch_files_process_info_create (
        blocked_reason ? strdup(blocked_reason->valuestring) : NULL,
        progress_percentage ? progress_percentage->valuedouble : 0,
        result ? strdup(result->valuestring) : NULL,
        verdicts ? verdictsList : NULL
        );

    return batch_response_batch_files_process_info_local_var;
end:
    return NULL;

}
