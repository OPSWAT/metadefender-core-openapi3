#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "batch_response_scan_results.h"



batch_response_scan_results_t *batch_response_scan_results_create(
    char *batch_id,
    processing_results_string_enum_t *scan_all_result_a,
    processing_results_index_enum_t *scan_all_result_i,
    char *start_time,
    int total_avs,
    int total_time
    ) {
    batch_response_scan_results_t *batch_response_scan_results_local_var = malloc(sizeof(batch_response_scan_results_t));
    if (!batch_response_scan_results_local_var) {
        return NULL;
    }
    batch_response_scan_results_local_var->batch_id = batch_id;
    batch_response_scan_results_local_var->scan_all_result_a = scan_all_result_a;
    batch_response_scan_results_local_var->scan_all_result_i = scan_all_result_i;
    batch_response_scan_results_local_var->start_time = start_time;
    batch_response_scan_results_local_var->total_avs = total_avs;
    batch_response_scan_results_local_var->total_time = total_time;

    return batch_response_scan_results_local_var;
}


void batch_response_scan_results_free(batch_response_scan_results_t *batch_response_scan_results) {
    if(NULL == batch_response_scan_results){
        return ;
    }
    listEntry_t *listEntry;
    free(batch_response_scan_results->batch_id);
    processing_results_string_enum_free(batch_response_scan_results->scan_all_result_a);
    processing_results_index_enum_free(batch_response_scan_results->scan_all_result_i);
    free(batch_response_scan_results->start_time);
    free(batch_response_scan_results);
}

cJSON *batch_response_scan_results_convertToJSON(batch_response_scan_results_t *batch_response_scan_results) {
    cJSON *item = cJSON_CreateObject();

    // batch_response_scan_results->batch_id
    if(batch_response_scan_results->batch_id) { 
    if(cJSON_AddStringToObject(item, "batch_id", batch_response_scan_results->batch_id) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_scan_results->scan_all_result_a
    if(batch_response_scan_results->scan_all_result_a) { 
    cJSON *scan_all_result_a_local_JSON = processing_results_string_enum_convertToJSON(batch_response_scan_results->scan_all_result_a);
    if(scan_all_result_a_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_all_result_a", scan_all_result_a_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response_scan_results->scan_all_result_i
    if(batch_response_scan_results->scan_all_result_i) { 
    cJSON *scan_all_result_i_local_JSON = processing_results_index_enum_convertToJSON(batch_response_scan_results->scan_all_result_i);
    if(scan_all_result_i_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_all_result_i", scan_all_result_i_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // batch_response_scan_results->start_time
    if(batch_response_scan_results->start_time) { 
    if(cJSON_AddStringToObject(item, "start_time", batch_response_scan_results->start_time) == NULL) {
    goto fail; //String
    }
     } 


    // batch_response_scan_results->total_avs
    if(batch_response_scan_results->total_avs) { 
    if(cJSON_AddNumberToObject(item, "total_avs", batch_response_scan_results->total_avs) == NULL) {
    goto fail; //Numeric
    }
     } 


    // batch_response_scan_results->total_time
    if(batch_response_scan_results->total_time) { 
    if(cJSON_AddNumberToObject(item, "total_time", batch_response_scan_results->total_time) == NULL) {
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

batch_response_scan_results_t *batch_response_scan_results_parseFromJSON(cJSON *batch_response_scan_resultsJSON){

    batch_response_scan_results_t *batch_response_scan_results_local_var = NULL;

    // batch_response_scan_results->batch_id
    cJSON *batch_id = cJSON_GetObjectItemCaseSensitive(batch_response_scan_resultsJSON, "batch_id");
    if (batch_id) { 
    if(!cJSON_IsString(batch_id))
    {
    goto end; //String
    }
    }

    // batch_response_scan_results->scan_all_result_a
    cJSON *scan_all_result_a = cJSON_GetObjectItemCaseSensitive(batch_response_scan_resultsJSON, "scan_all_result_a");
    processing_results_string_enum_t *scan_all_result_a_local_nonprim = NULL;
    if (scan_all_result_a) { 
    scan_all_result_a_local_nonprim = processing_results_string_enum_parseFromJSON(scan_all_result_a); //nonprimitive
    }

    // batch_response_scan_results->scan_all_result_i
    cJSON *scan_all_result_i = cJSON_GetObjectItemCaseSensitive(batch_response_scan_resultsJSON, "scan_all_result_i");
    processing_results_index_enum_t *scan_all_result_i_local_nonprim = NULL;
    if (scan_all_result_i) { 
    scan_all_result_i_local_nonprim = processing_results_index_enum_parseFromJSON(scan_all_result_i); //nonprimitive
    }

    // batch_response_scan_results->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(batch_response_scan_resultsJSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsString(start_time))
    {
    goto end; //String
    }
    }

    // batch_response_scan_results->total_avs
    cJSON *total_avs = cJSON_GetObjectItemCaseSensitive(batch_response_scan_resultsJSON, "total_avs");
    if (total_avs) { 
    if(!cJSON_IsNumber(total_avs))
    {
    goto end; //Numeric
    }
    }

    // batch_response_scan_results->total_time
    cJSON *total_time = cJSON_GetObjectItemCaseSensitive(batch_response_scan_resultsJSON, "total_time");
    if (total_time) { 
    if(!cJSON_IsNumber(total_time))
    {
    goto end; //Numeric
    }
    }


    batch_response_scan_results_local_var = batch_response_scan_results_create (
        batch_id ? strdup(batch_id->valuestring) : NULL,
        scan_all_result_a ? scan_all_result_a_local_nonprim : NULL,
        scan_all_result_i ? scan_all_result_i_local_nonprim : NULL,
        start_time ? strdup(start_time->valuestring) : NULL,
        total_avs ? total_avs->valuedouble : 0,
        total_time ? total_time->valuedouble : 0
        );

    return batch_response_scan_results_local_var;
end:
    return NULL;

}
