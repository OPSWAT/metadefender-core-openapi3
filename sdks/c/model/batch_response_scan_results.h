/*
 * batch_response_scan_results.h
 *
 * Metascan analysis result.
 */

#ifndef _batch_response_scan_results_H_
#define _batch_response_scan_results_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "processing_results_index_enum.h"
#include "processing_results_string_enum.h"



typedef struct batch_response_scan_results_t {
    char *batch_id; // string
    struct processing_results_string_enum_t *scan_all_result_a; //model
    struct processing_results_index_enum_t *scan_all_result_i; //model
    char *start_time; // string
    int total_avs; //numeric
    int total_time; //numeric

} batch_response_scan_results_t;

batch_response_scan_results_t *batch_response_scan_results_create(
    char *batch_id,
    processing_results_string_enum_t *scan_all_result_a,
    processing_results_index_enum_t *scan_all_result_i,
    char *start_time,
    int total_avs,
    int total_time
);

void batch_response_scan_results_free(batch_response_scan_results_t *batch_response_scan_results);

batch_response_scan_results_t *batch_response_scan_results_parseFromJSON(cJSON *batch_response_scan_resultsJSON);

cJSON *batch_response_scan_results_convertToJSON(batch_response_scan_results_t *batch_response_scan_results);

#endif /* _batch_response_scan_results_H_ */

