/*
 * batch_response_batch_files_process_info.h
 *
 * The analysis summary
 */

#ifndef _batch_response_batch_files_process_info_H_
#define _batch_response_batch_files_process_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct batch_response_batch_files_process_info_t {
    char *blocked_reason; // string
    int progress_percentage; //numeric
    char *result; // string
    list_t *verdicts; //primitive container

} batch_response_batch_files_process_info_t;

batch_response_batch_files_process_info_t *batch_response_batch_files_process_info_create(
    char *blocked_reason,
    int progress_percentage,
    char *result,
    list_t *verdicts
);

void batch_response_batch_files_process_info_free(batch_response_batch_files_process_info_t *batch_response_batch_files_process_info);

batch_response_batch_files_process_info_t *batch_response_batch_files_process_info_parseFromJSON(cJSON *batch_response_batch_files_process_infoJSON);

cJSON *batch_response_batch_files_process_info_convertToJSON(batch_response_batch_files_process_info_t *batch_response_batch_files_process_info);

#endif /* _batch_response_batch_files_process_info_H_ */

