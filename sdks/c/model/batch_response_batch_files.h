/*
 * batch_response_batch_files.h
 *
 * aaaaa
 */

#ifndef _batch_response_batch_files_H_
#define _batch_response_batch_files_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "batch_response_batch_files_files_in_batch.h"



typedef struct batch_response_batch_files_t {
    int batch_count; //numeric
    list_t *files_in_batch; //nonprimitive container
    int first_index; //numeric
    int page_size; //numeric

} batch_response_batch_files_t;

batch_response_batch_files_t *batch_response_batch_files_create(
    int batch_count,
    list_t *files_in_batch,
    int first_index,
    int page_size
);

void batch_response_batch_files_free(batch_response_batch_files_t *batch_response_batch_files);

batch_response_batch_files_t *batch_response_batch_files_parseFromJSON(cJSON *batch_response_batch_filesJSON);

cJSON *batch_response_batch_files_convertToJSON(batch_response_batch_files_t *batch_response_batch_files);

#endif /* _batch_response_batch_files_H_ */

