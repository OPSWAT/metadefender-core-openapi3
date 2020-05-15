/*
 * batch_response_batch_files_files_in_batch.h
 *
 * 
 */

#ifndef _batch_response_batch_files_files_in_batch_H_
#define _batch_response_batch_files_files_in_batch_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "batch_response_batch_files_process_info.h"
#include "processing_results_index_enum.h"
#include "processing_results_string_enum.h"



typedef struct batch_response_batch_files_files_in_batch_t {
    char *data_id; // string
    int detected_by; //numeric
    char *display_name; // string
    int file_size; //numeric
    char *file_type; // string
    char *file_type_description; // string
    struct batch_response_batch_files_process_info_t *process_info; //model
    int progress_percentage; //numeric
    struct processing_results_string_enum_t *scan_all_result_a; //model
    struct processing_results_index_enum_t *scan_all_result_i; //model
    int scanned_with; //numeric

} batch_response_batch_files_files_in_batch_t;

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
);

void batch_response_batch_files_files_in_batch_free(batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch);

batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch_parseFromJSON(cJSON *batch_response_batch_files_files_in_batchJSON);

cJSON *batch_response_batch_files_files_in_batch_convertToJSON(batch_response_batch_files_files_in_batch_t *batch_response_batch_files_files_in_batch);

#endif /* _batch_response_batch_files_files_in_batch_H_ */

