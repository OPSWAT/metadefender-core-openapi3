/*
 * batch_response.h
 *
 * The response for a Batch status request.
 */

#ifndef _batch_response_H_
#define _batch_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "batch_response_batch_files.h"
#include "batch_response_process_info.h"
#include "batch_response_scan_results.h"



typedef struct batch_response_t {
    struct batch_response_batch_files_t *batch_files; //model
    char *batch_id; // string
    int is_closed; //boolean
    struct batch_response_process_info_t *process_info; //model
    struct batch_response_scan_results_t *scan_results; //model
    char *user_data; // string

} batch_response_t;

batch_response_t *batch_response_create(
    batch_response_batch_files_t *batch_files,
    char *batch_id,
    int is_closed,
    batch_response_process_info_t *process_info,
    batch_response_scan_results_t *scan_results,
    char *user_data
);

void batch_response_free(batch_response_t *batch_response);

batch_response_t *batch_response_parseFromJSON(cJSON *batch_responseJSON);

cJSON *batch_response_convertToJSON(batch_response_t *batch_response);

#endif /* _batch_response_H_ */

