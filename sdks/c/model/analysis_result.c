#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "analysis_result.h"



analysis_result_t *analysis_result_create(
    char *data_id,
    dlp_response_t *dlp_info,
    file_information_t *file_info,
    analysis_result_process_info_t *process_info,
    metascan_report_t *scan_results,
    vulnerability_response_t *vulnerability_info,
    yara_report_t *yara
    ) {
    analysis_result_t *analysis_result_local_var = malloc(sizeof(analysis_result_t));
    if (!analysis_result_local_var) {
        return NULL;
    }
    analysis_result_local_var->data_id = data_id;
    analysis_result_local_var->dlp_info = dlp_info;
    analysis_result_local_var->file_info = file_info;
    analysis_result_local_var->process_info = process_info;
    analysis_result_local_var->scan_results = scan_results;
    analysis_result_local_var->vulnerability_info = vulnerability_info;
    analysis_result_local_var->yara = yara;

    return analysis_result_local_var;
}


void analysis_result_free(analysis_result_t *analysis_result) {
    if(NULL == analysis_result){
        return ;
    }
    listEntry_t *listEntry;
    free(analysis_result->data_id);
    dlp_response_free(analysis_result->dlp_info);
    file_information_free(analysis_result->file_info);
    analysis_result_process_info_free(analysis_result->process_info);
    metascan_report_free(analysis_result->scan_results);
    vulnerability_response_free(analysis_result->vulnerability_info);
    yara_report_free(analysis_result->yara);
    free(analysis_result);
}

cJSON *analysis_result_convertToJSON(analysis_result_t *analysis_result) {
    cJSON *item = cJSON_CreateObject();

    // analysis_result->data_id
    if(analysis_result->data_id) { 
    if(cJSON_AddStringToObject(item, "data_id", analysis_result->data_id) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result->dlp_info
    if(analysis_result->dlp_info) { 
    cJSON *dlp_info_local_JSON = dlp_response_convertToJSON(analysis_result->dlp_info);
    if(dlp_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "dlp_info", dlp_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // analysis_result->file_info
    if(analysis_result->file_info) { 
    cJSON *file_info_local_JSON = file_information_convertToJSON(analysis_result->file_info);
    if(file_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "file_info", file_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // analysis_result->process_info
    if(analysis_result->process_info) { 
    cJSON *process_info_local_JSON = analysis_result_process_info_convertToJSON(analysis_result->process_info);
    if(process_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "process_info", process_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // analysis_result->scan_results
    if(analysis_result->scan_results) { 
    cJSON *scan_results_local_JSON = metascan_report_convertToJSON(analysis_result->scan_results);
    if(scan_results_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "scan_results", scan_results_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // analysis_result->vulnerability_info
    if(analysis_result->vulnerability_info) { 
    cJSON *vulnerability_info_local_JSON = vulnerability_response_convertToJSON(analysis_result->vulnerability_info);
    if(vulnerability_info_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "vulnerability_info", vulnerability_info_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // analysis_result->yara
    if(analysis_result->yara) { 
    cJSON *yara_local_JSON = yara_report_convertToJSON(analysis_result->yara);
    if(yara_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "yara", yara_local_JSON);
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

analysis_result_t *analysis_result_parseFromJSON(cJSON *analysis_resultJSON){

    analysis_result_t *analysis_result_local_var = NULL;

    // analysis_result->data_id
    cJSON *data_id = cJSON_GetObjectItemCaseSensitive(analysis_resultJSON, "data_id");
    if (data_id) { 
    if(!cJSON_IsString(data_id))
    {
    goto end; //String
    }
    }

    // analysis_result->dlp_info
    cJSON *dlp_info = cJSON_GetObjectItemCaseSensitive(analysis_resultJSON, "dlp_info");
    dlp_response_t *dlp_info_local_nonprim = NULL;
    if (dlp_info) { 
    dlp_info_local_nonprim = dlp_response_parseFromJSON(dlp_info); //nonprimitive
    }

    // analysis_result->file_info
    cJSON *file_info = cJSON_GetObjectItemCaseSensitive(analysis_resultJSON, "file_info");
    file_information_t *file_info_local_nonprim = NULL;
    if (file_info) { 
    file_info_local_nonprim = file_information_parseFromJSON(file_info); //nonprimitive
    }

    // analysis_result->process_info
    cJSON *process_info = cJSON_GetObjectItemCaseSensitive(analysis_resultJSON, "process_info");
    analysis_result_process_info_t *process_info_local_nonprim = NULL;
    if (process_info) { 
    process_info_local_nonprim = analysis_result_process_info_parseFromJSON(process_info); //nonprimitive
    }

    // analysis_result->scan_results
    cJSON *scan_results = cJSON_GetObjectItemCaseSensitive(analysis_resultJSON, "scan_results");
    metascan_report_t *scan_results_local_nonprim = NULL;
    if (scan_results) { 
    scan_results_local_nonprim = metascan_report_parseFromJSON(scan_results); //nonprimitive
    }

    // analysis_result->vulnerability_info
    cJSON *vulnerability_info = cJSON_GetObjectItemCaseSensitive(analysis_resultJSON, "vulnerability_info");
    vulnerability_response_t *vulnerability_info_local_nonprim = NULL;
    if (vulnerability_info) { 
    vulnerability_info_local_nonprim = vulnerability_response_parseFromJSON(vulnerability_info); //nonprimitive
    }

    // analysis_result->yara
    cJSON *yara = cJSON_GetObjectItemCaseSensitive(analysis_resultJSON, "yara");
    yara_report_t *yara_local_nonprim = NULL;
    if (yara) { 
    yara_local_nonprim = yara_report_parseFromJSON(yara); //nonprimitive
    }


    analysis_result_local_var = analysis_result_create (
        data_id ? strdup(data_id->valuestring) : NULL,
        dlp_info ? dlp_info_local_nonprim : NULL,
        file_info ? file_info_local_nonprim : NULL,
        process_info ? process_info_local_nonprim : NULL,
        scan_results ? scan_results_local_nonprim : NULL,
        vulnerability_info ? vulnerability_info_local_nonprim : NULL,
        yara ? yara_local_nonprim : NULL
        );

    return analysis_result_local_var;
end:
    return NULL;

}
