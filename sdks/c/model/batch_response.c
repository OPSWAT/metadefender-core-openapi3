#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_response.h"



batch_response_t *batch_response_create(
    batch_response_batch_files_t *batch_files,
    char *batch_id,
    int is_closed,
    batch_response_process_info_t *process_info,
    batch_response_scan_results_t *scan_results,
    char *user_data
    ) {
    batch_response_t *batch_response_local_var = malloc(sizeof(batch_response_t));
    if (!batch_response_local_var) {
        return NULL;
    }
    batch_response_local_var->batch_files = batch_files;
    batch_response_local_var->batch_id = batch_id;
    batch_response_local_var->is_closed = is_closed;
    batch_response_local_var->process_info = process_info;
    batch_response_local_var->scan_results = scan_results;
    batch_response_local_var->user_data = user_data;

    return batch_response_local_var;
}


void batch_response_free(batch_response_t *batch_response) {
    if(NULL == batch_response){
        return ;
    }
    listEntry_t *listEntry;
    batch_response_batch_files_free(batch_response->batch_files);
    free(batch_response->batch_id);
    batch_response_process_info_free(batch_response->process_info);
    batch_response_scan_results_free(batch_response->scan_results);
    free(batch_response->user_data);
    free(batch_response);
}

cJSON *batch_response_convertToJSON(batch_response_t *batch_response) {
    cJSON *item = cJSON_CreateObject();

    // batch_response->batch_files
    if(batch_response->batch_files) { 
    cJSON *batch_files_local_JSON = batch_response_batch_files_convertToJSON(batch_response->batch_files);
    if(batch_files_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "batch_files", batch_files_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response->batch_id
    if(batch_response->batch_id) { 
    if(cJSON_AddStringToObject(item, "batch_id", batch_response->batch_id) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response->is_closed
    if(batch_response->is_closed) { 
    if(cJSON_AddBoolToObject(item, "is_closed", batch_response->is_closed) == NULL) {
    goto fail; //Bool
    }
     } 


    // batch_response->process_info
    if(batch_response->process_info) { 
    cJSON *process_info_local_JSON = batch_response_process_info_convertToJSON(batch_response->process_info);
    if(process_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "process_info", process_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response->scan_results
    if(batch_response->scan_results) { 
    cJSON *scan_results_local_JSON = batch_response_scan_results_convertToJSON(batch_response->scan_results);
    if(scan_results_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_results", scan_results_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response->user_data
    if(batch_response->user_data) { 
    if(cJSON_AddStringToObject(item, "user_data", batch_response->user_data) == NULL) {
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

batch_response_t *batch_response_parseFromJSON(cJSON *batch_responseJSON){

    batch_response_t *batch_response_local_var = NULL;

    // batch_response->batch_files
    cJSON *batch_files = cJSON_GetObjectItemCaseSensitive(batch_responseJSON, "batch_files");
    batch_response_batch_files_t *batch_files_local_nonprim = NULL;
    if (batch_files) { 
    batch_files_local_nonprim = batch_response_batch_files_parseFromJSON(batch_files); //nonprimitive
    }

    // batch_response->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(batch_responseJSON, "batch_id");
    if (batch_id) { 
    if(!cJSON_IsString(batch_id))
    {
    goto end; //String
    }
    }

    // batch_response->is_closed
    cJSON *is_closed = cJSON_GetObjectItemCaseSensitive(batch_responseJSON, "is_closed");
    if (is_closed) { 
    if(!cJSON_IsBool(is_closed))
    {
    goto end; //Bool
    }
    }

    // batch_response->process_info
    cJSON *process_info = cJSON_GetObjectItemCaseSensitive(batch_responseJSON, "process_info");
    batch_response_process_info_t *process_info_local_nonprim = NULL;
    if (process_info) { 
    process_info_local_nonprim = batch_response_process_info_parseFromJSON(process_info); //nonprimitive
    }

    // batch_response->scan_results
    cJSON *scan_results = cJSON_GetObjectItemCaseSensitive(batch_responseJSON, "scan_results");
    batch_response_scan_results_t *scan_results_local_nonprim = NULL;
    if (scan_results) { 
    scan_results_local_nonprim = batch_response_scan_results_parseFromJSON(scan_results); //nonprimitive
    }

    // batch_response->user_data
    cJSON *user_data = cJSON_GetObjectItemCaseSensitive(batch_responseJSON, "user_data");
    if (user_data) { 
    if(!cJSON_IsString(user_data))
    {
    goto end; //String
    }
    }


    batch_response_local_var = batch_response_create (
        batch_files ? batch_files_local_nonprim : NULL,
        batch_id ? strdup(batch_id->valuestring) : NULL,
        is_closed ? is_closed->valueint : 0,
        process_info ? process_info_local_nonprim : NULL,
        scan_results ? scan_results_local_nonprim : NULL,
        user_data ? strdup(user_data->valuestring) : NULL
        );

    return batch_response_local_var;
end:
    return NULL;

}
