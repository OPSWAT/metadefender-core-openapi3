#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_response_batch_files_files_in_batch.h"



batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch_create(
    char *data_id,
    int detected_by,
    char *display_name,
    int file_size,
    char *file_type,
    char *file_type_description,
    batch_response_batch_files_process_info_t *process_info,
    int progress_percentage,
    processing_results_string_enum_t *scan_all_result_a,
    processing_results_index_enum_t *scan_all_result_i,
    int scanned_with
    ) {
    batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch_local_var = malloc(sizeof(batch_response_batch_files_files_in_batch_t));
    if (!batch_response_batch_files_files_in_batch_local_var) {
        return NULL;
    }
    batch_response_batch_files_files_in_batch_local_var->data_id = data_id;
    batch_response_batch_files_files_in_batch_local_var->detected_by = detected_by;
    batch_response_batch_files_files_in_batch_local_var->display_name = display_name;
    batch_response_batch_files_files_in_batch_local_var->file_size = file_size;
    batch_response_batch_files_files_in_batch_local_var->file_type = file_type;
    batch_response_batch_files_files_in_batch_local_var->file_type_description = file_type_description;
    batch_response_batch_files_files_in_batch_local_var->process_info = process_info;
    batch_response_batch_files_files_in_batch_local_var->progress_percentage = progress_percentage;
    batch_response_batch_files_files_in_batch_local_var->scan_all_result_a = scan_all_result_a;
    batch_response_batch_files_files_in_batch_local_var->scan_all_result_i = scan_all_result_i;
    batch_response_batch_files_files_in_batch_local_var->scanned_with = scanned_with;

    return batch_response_batch_files_files_in_batch_local_var;
}


void batch_response_batch_files_files_in_batch_free(batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch) {
    if(NULL == batch_response_batch_files_files_in_batch){
        return ;
    }
    listEntry_t *listEntry;
    free(batch_response_batch_files_files_in_batch->data_id);
    free(batch_response_batch_files_files_in_batch->display_name);
    free(batch_response_batch_files_files_in_batch->file_type);
    free(batch_response_batch_files_files_in_batch->file_type_description);
    batch_response_batch_files_process_info_free(batch_response_batch_files_files_in_batch->process_info);
    processing_results_string_enum_free(batch_response_batch_files_files_in_batch->scan_all_result_a);
    processing_results_index_enum_free(batch_response_batch_files_files_in_batch->scan_all_result_i);
    free(batch_response_batch_files_files_in_batch);
}

cJSON *batch_response_batch_files_files_in_batch_convertToJSON(batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch) {
    cJSON *item = cJSON_CreateObject();

    // batch_response_batch_files_files_in_batch->data_id
    if(batch_response_batch_files_files_in_batch->data_id) { 
    if(cJSON_AddStringToObject(item, "data_id", batch_response_batch_files_files_in_batch->data_id) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_batch_files_files_in_batch->detected_by
    if(batch_response_batch_files_files_in_batch->detected_by) { 
    if(cJSON_AddNumberToObject(item, "detected_by", batch_response_batch_files_files_in_batch->detected_by) == NULL) {
    goto fail; //Numeric
    }
     } 


    // batch_response_batch_files_files_in_batch->display_name
    if(batch_response_batch_files_files_in_batch->display_name) { 
    if(cJSON_AddStringToObject(item, "display_name", batch_response_batch_files_files_in_batch->display_name) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_batch_files_files_in_batch->file_size
    if(batch_response_batch_files_files_in_batch->file_size) { 
    if(cJSON_AddNumberToObject(item, "file_size", batch_response_batch_files_files_in_batch->file_size) == NULL) {
    goto fail; //Numeric
    }
     } 


    // batch_response_batch_files_files_in_batch->file_type
    if(batch_response_batch_files_files_in_batch->file_type) { 
    if(cJSON_AddStringToObject(item, "file_type", batch_response_batch_files_files_in_batch->file_type) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_batch_files_files_in_batch->file_type_description
    if(batch_response_batch_files_files_in_batch->file_type_description) { 
    if(cJSON_AddStringToObject(item, "file_type_description", batch_response_batch_files_files_in_batch->file_type_description) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_batch_files_files_in_batch->process_info
    if(batch_response_batch_files_files_in_batch->process_info) { 
    cJSON *process_info_local_JSON = batch_response_batch_files_process_info_convertToJSON(batch_response_batch_files_files_in_batch->process_info);
    if(process_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "process_info", process_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response_batch_files_files_in_batch->progress_percentage
    if(batch_response_batch_files_files_in_batch->progress_percentage) { 
    if(cJSON_AddNumberToObject(item, "progress_percentage", batch_response_batch_files_files_in_batch->progress_percentage) == NULL) {
    goto fail; //Numeric
    }
     } 


    // batch_response_batch_files_files_in_batch->scan_all_result_a
    if(batch_response_batch_files_files_in_batch->scan_all_result_a) { 
    cJSON *scan_all_result_a_local_JSON = processing_results_string_enum_convertToJSON(batch_response_batch_files_files_in_batch->scan_all_result_a);
    if(scan_all_result_a_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_all_result_a", scan_all_result_a_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response_batch_files_files_in_batch->scan_all_result_i
    if(batch_response_batch_files_files_in_batch->scan_all_result_i) { 
    cJSON *scan_all_result_i_local_JSON = processing_results_index_enum_convertToJSON(batch_response_batch_files_files_in_batch->scan_all_result_i);
    if(scan_all_result_i_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_all_result_i", scan_all_result_i_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response_batch_files_files_in_batch->scanned_with
    if(batch_response_batch_files_files_in_batch->scanned_with) { 
    if(cJSON_AddNumberToObject(item, "scanned_with", batch_response_batch_files_files_in_batch->scanned_with) == NULL) {
    goto fail; //Numeric
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch_parseFromJSON(cJSON *batch_response_batch_files_files_in_batchJSON){

    batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch_local_var = NULL;

    // batch_response_batch_files_files_in_batch->data_id
    cJSON *data_id = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "data_id");
    if (data_id) { 
    if(!cJSON_IsString(data_id))
    {
    goto end; //String
    }
    }

    // batch_response_batch_files_files_in_batch->detected_by
    cJSON *detected_by = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "detected_by");
    if (detected_by) { 
    if(!cJSON_IsNumber(detected_by))
    {
    goto end; //Numeric
    }
    }

    // batch_response_batch_files_files_in_batch->display_name
    cJSON *display_name = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "display_name");
    if (display_name) { 
    if(!cJSON_IsString(display_name))
    {
    goto end; //String
    }
    }

    // batch_response_batch_files_files_in_batch->file_size
    cJSON *file_size = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "file_size");
    if (file_size) { 
    if(!cJSON_IsNumber(file_size))
    {
    goto end; //Numeric
    }
    }

    // batch_response_batch_files_files_in_batch->file_type
    cJSON *file_type = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "file_type");
    if (file_type) { 
    if(!cJSON_IsString(file_type))
    {
    goto end; //String
    }
    }

    // batch_response_batch_files_files_in_batch->file_type_description
    cJSON *file_type_description = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "file_type_description");
    if (file_type_description) { 
    if(!cJSON_IsString(file_type_description))
    {
    goto end; //String
    }
    }

    // batch_response_batch_files_files_in_batch->process_info
    cJSON *process_info = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "process_info");
    batch_response_batch_files_process_info_t *process_info_local_nonprim = NULL;
    if (process_info) { 
    process_info_local_nonprim = batch_response_batch_files_process_info_parseFromJSON(process_info); //nonprimitive
    }

    // batch_response_batch_files_files_in_batch->progress_percentage
    cJSON *progress_percentage = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "progress_percentage");
    if (progress_percentage) { 
    if(!cJSON_IsNumber(progress_percentage))
    {
    goto end; //Numeric
    }
    }

    // batch_response_batch_files_files_in_batch->scan_all_result_a
    cJSON *scan_all_result_a = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "scan_all_result_a");
    processing_results_string_enum_t *scan_all_result_a_local_nonprim = NULL;
    if (scan_all_result_a) { 
    scan_all_result_a_local_nonprim = processing_results_string_enum_parseFromJSON(scan_all_result_a); //nonprimitive
    }

    // batch_response_batch_files_files_in_batch->scan_all_result_i
    cJSON *scan_all_result_i = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "scan_all_result_i");
    processing_results_index_enum_t *scan_all_result_i_local_nonprim = NULL;
    if (scan_all_result_i) { 
    scan_all_result_i_local_nonprim = processing_results_index_enum_parseFromJSON(scan_all_result_i); //nonprimitive
    }

    // batch_response_batch_files_files_in_batch->scanned_with
    cJSON *scanned_with = cJSON_GetObjectItemCaseSensitive(batch_response_batch_files_files_in_batchJSON, "scanned_with");
    if (scanned_with) { 
    if(!cJSON_IsNumber(scanned_with))
    {
    goto end; //Numeric
    }
    }


    batch_response_batch_files_files_in_batch_local_var = batch_response_batch_files_files_in_batch_create (
        data_id ? strdup(data_id->valuestring) : NULL,
        detected_by ? detected_by->valuedouble : 0,
        display_name ? strdup(display_name->valuestring) : NULL,
        file_size ? file_size->valuedouble : 0,
        file_type ? strdup(file_type->valuestring) : NULL,
        file_type_description ? strdup(file_type_description->valuestring) : NULL,
        process_info ? process_info_local_nonprim : NULL,
        progress_percentage ? progress_percentage->valuedouble : 0,
        scan_all_result_a ? scan_all_result_a_local_nonprim : NULL,
        scan_all_result_i ? scan_all_result_i_local_nonprim : NULL,
        scanned_with ? scanned_with->valuedouble : 0
        );

    return batch_response_batch_files_files_in_batch_local_var;
end:
    return NULL;

}
