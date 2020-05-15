/*
 * batch_id.h
 *
 * 
 */

#ifndef _batch_id_H_
#define _batch_id_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct batch_id_t {
    char *batch_id; // string

} batch_id_t;

batch_id_t *batch_id_create(
    char *batch_id
);

void batch_id_free(batch_id_t *batch_id);

batch_id_t *batch_id_parseFromJSON(cJSON *batch_idJSON);

cJSON *batch_id_convertToJSON(batch_id_t *batch_id);

#endif /* _batch_id_H_ */

