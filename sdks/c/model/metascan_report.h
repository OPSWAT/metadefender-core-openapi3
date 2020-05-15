/*
 * metascan_report.h
 *
 * Result of the scanning process.
 */

#ifndef _metascan_report_H_
#define _metascan_report_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "metascan_report_scan_details.h"
#include "processing_results_index_enum.h"
#include "processing_results_string_enum.h"



typedef struct metascan_report_t {
    char *data_id; // string
    int progress_percentage; //numeric
    struct processing_results_string_enum_t *scan_all_result_a; //model
    struct processing_results_index_enum_t *scan_all_result_i; //model
    char *start_time; // string
    int total_avs; //numeric
    int total_time; //numeric
    struct metascan_report_scan_details_t *scan_details; //model

} metascan_report_t;

metascan_report_t *metascan_report_create(
    char *data_id,
    int progress_percentage,
    processing_results_string_enum_t *scan_all_result_a,
    processing_results_index_enum_t *scan_all_result_i,
    char *start_time,
    int total_avs,
    int total_time,
    metascan_report_scan_details_t *scan_details
);

void metascan_report_free(metascan_report_t *metascan_report);

metascan_report_t *metascan_report_parseFromJSON(cJSON *metascan_reportJSON);

cJSON *metascan_report_convertToJSON(metascan_report_t *metascan_report);

#endif /* _metascan_report_H_ */

