/*
 * batch_response_process_info.h
 *
 * Overall batch process result
 */

#ifndef _batch_response_process_info_H_
#define _batch_response_process_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct batch_response_process_info_t {
    char *blocked_reason; // string
    int file_type_skipped_scan; //boolean
    char *profile; // string
    char *result; // string
    char *user_agent; // string
    char *username; // string

} batch_response_process_info_t;

batch_response_process_info_t *batch_response_process_info_create(
    char *blocked_reason,
    int file_type_skipped_scan,
    char *profile,
    char *result,
    char *user_agent,
    char *username
);

void batch_response_process_info_free(batch_response_process_info_t *batch_response_process_info);

batch_response_process_info_t *batch_response_process_info_parseFromJSON(cJSON *batch_response_process_infoJSON);

cJSON *batch_response_process_info_convertToJSON(batch_response_process_info_t *batch_response_process_info);

#endif /* _batch_response_process_info_H_ */

