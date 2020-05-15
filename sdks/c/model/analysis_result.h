/*
 * analysis_result.h
 *
 * 
 */

#ifndef _analysis_result_H_
#define _analysis_result_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "analysis_result_process_info.h"
#include "dlp_response.h"
#include "file_information.h"
#include "metascan_report.h"
#include "vulnerability_response.h"
#include "yara_report.h"



typedef struct analysis_result_t {
    char *data_id; // string
    struct dlp_response_t *dlp_info; //model
    struct file_information_t *file_info; //model
    struct analysis_result_process_info_t *process_info; //model
    struct metascan_report_t *scan_results; //model
    struct vulnerability_response_t *vulnerability_info; //model
    struct yara_report_t *yara; //model

} analysis_result_t;

analysis_result_t *analysis_result_create(
    char *data_id,
    dlp_response_t *dlp_info,
    file_information_t *file_info,
    analysis_result_process_info_t *process_info,
    metascan_report_t *scan_results,
    vulnerability_response_t *vulnerability_info,
    yara_report_t *yara
);

void analysis_result_free(analysis_result_t *analysis_result);

analysis_result_t *analysis_result_parseFromJSON(cJSON *analysis_resultJSON);

cJSON *analysis_result_convertToJSON(analysis_result_t *analysis_result);

#endif /* _analysis_result_H_ */

