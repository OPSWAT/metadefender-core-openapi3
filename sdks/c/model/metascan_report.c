#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "metascan_report.h"



metascan_report_t *metascan_report_create(
    char *data_id,
    int progress_percentage,
    processing_results_string_enum_t *scan_all_result_a,
    processing_results_index_enum_t *scan_all_result_i,
    char *start_time,
    int total_avs,
    int total_time,
    metascan_report_scan_details_t *scan_details
    ) {
    metascan_report_t *metascan_report_local_var = malloc(sizeof(metascan_report_t));
    if (!metascan_report_local_var) {
        return NULL;
    }
    metascan_report_local_var->data_id = data_id;
    metascan_report_local_var->progress_percentage = progress_percentage;
    metascan_report_local_var->scan_all_result_a = scan_all_result_a;
    metascan_report_local_var->scan_all_result_i = scan_all_result_i;
    metascan_report_local_var->start_time = start_time;
    metascan_report_local_var->total_avs = total_avs;
    metascan_report_local_var->total_time = total_time;
    metascan_report_local_var->scan_details = scan_details;

    return metascan_report_local_var;
}


void metascan_report_free(metascan_report_t *metascan_report) {
    if(NULL == metascan_report){
        return ;
    }
    listEntry_t *listEntry;
    free(metascan_report->data_id);
    processing_results_string_enum_free(metascan_report->scan_all_result_a);
    processing_results_index_enum_free(metascan_report->scan_all_result_i);
    free(metascan_report->start_time);
    metascan_report_scan_details_free(metascan_report->scan_details);
    free(metascan_report);
}

cJSON *metascan_report_convertToJSON(metascan_report_t *metascan_report) {
    cJSON *item = cJSON_CreateObject();

    // metascan_report->data_id
    if(metascan_report->data_id) { 
    if(cJSON_AddStringToObject(item, "data_id", metascan_report->data_id) == NULL) {
    goto fail; //String
    }
     } 


    // metascan_report->progress_percentage
    if(metascan_report->progress_percentage) { 
    if(cJSON_AddNumberToObject(item, "progress_percentage", metascan_report->progress_percentage) == NULL) {
    goto fail; //Numeric
    }
     } 


    // metascan_report->scan_all_result_a
    if(metascan_report->scan_all_result_a) { 
    cJSON *scan_all_result_a_local_JSON = processing_results_string_enum_convertToJSON(metascan_report->scan_all_result_a);
    if(scan_all_result_a_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_all_result_a", scan_all_result_a_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // metascan_report->scan_all_result_i
    if(metascan_report->scan_all_result_i) { 
    cJSON *scan_all_result_i_local_JSON = processing_results_index_enum_convertToJSON(metascan_report->scan_all_result_i);
    if(scan_all_result_i_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_all_result_i", scan_all_result_i_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // metascan_report->start_time
    if(metascan_report->start_time) { 
    if(cJSON_AddStringToObject(item, "start_time", metascan_report->start_time) == NULL) {
    goto fail; //String
    }
     } 


    // metascan_report->total_avs
    if(metascan_report->total_avs) { 
    if(cJSON_AddNumberToObject(item, "total_avs", metascan_report->total_avs) == NULL) {
    goto fail; //Numeric
    }
     } 


    // metascan_report->total_time
    if(metascan_report->total_time) { 
    if(cJSON_AddNumberToObject(item, "total_time", metascan_report->total_time) == NULL) {
    goto fail; //Numeric
    }
     } 


    // metascan_report->scan_details
    if(metascan_report->scan_details) { 
    cJSON *scan_details_local_JSON = metascan_report_scan_details_convertToJSON(metascan_report->scan_details);
    if(scan_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_details", scan_details_local_JSON);
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

metascan_report_t *metascan_report_parseFromJSON(cJSON *metascan_reportJSON){

    metascan_report_t *metascan_report_local_var = NULL;

    // metascan_report->data_id
    cJSON *data_id = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "data_id");
    if (data_id) { 
    if(!cJSON_IsString(data_id))
    {
    goto end; //String
    }
    }

    // metascan_report->progress_percentage
    cJSON *progress_percentage = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "progress_percentage");
    if (progress_percentage) { 
    if(!cJSON_IsNumber(progress_percentage))
    {
    goto end; //Numeric
    }
    }

    // metascan_report->scan_all_result_a
    cJSON *scan_all_result_a = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "scan_all_result_a");
    processing_results_string_enum_t *scan_all_result_a_local_nonprim = NULL;
    if (scan_all_result_a) { 
    scan_all_result_a_local_nonprim = processing_results_string_enum_parseFromJSON(scan_all_result_a); //nonprimitive
    }

    // metascan_report->scan_all_result_i
    cJSON *scan_all_result_i = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "scan_all_result_i");
    processing_results_index_enum_t *scan_all_result_i_local_nonprim = NULL;
    if (scan_all_result_i) { 
    scan_all_result_i_local_nonprim = processing_results_index_enum_parseFromJSON(scan_all_result_i); //nonprimitive
    }

    // metascan_report->start_time
    cJSON *start_time = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "start_time");
    if (start_time) { 
    if(!cJSON_IsString(start_time))
    {
    goto end; //String
    }
    }

    // metascan_report->total_avs
    cJSON *total_avs = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "total_avs");
    if (total_avs) { 
    if(!cJSON_IsNumber(total_avs))
    {
    goto end; //Numeric
    }
    }

    // metascan_report->total_time
    cJSON *total_time = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "total_time");
    if (total_time) { 
    if(!cJSON_IsNumber(total_time))
    {
    goto end; //Numeric
    }
    }

    // metascan_report->scan_details
    cJSON *scan_details = cJSON_GetObjectItemCaseSensitive(metascan_reportJSON, "scan_details");
    metascan_report_scan_details_t *scan_details_local_nonprim = NULL;
    if (scan_details) { 
    scan_details_local_nonprim = metascan_report_scan_details_parseFromJSON(scan_details); //nonprimitive
    }


    metascan_report_local_var = metascan_report_create (
        data_id ? strdup(data_id->valuestring) : NULL,
        progress_percentage ? progress_percentage->valuedouble : 0,
        scan_all_result_a ? scan_all_result_a_local_nonprim : NULL,
        scan_all_result_i ? scan_all_result_i_local_nonprim : NULL,
        start_time ? strdup(start_time->valuestring) : NULL,
        total_avs ? total_avs->valuedouble : 0,
        total_time ? total_time->valuedouble : 0,
        scan_details ? scan_details_local_nonprim : NULL
        );

    return metascan_report_local_var;
end:
    return NULL;

}
