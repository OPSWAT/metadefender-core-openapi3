/*
 * skip_list.h
 *
 * Object that defines the skip hashes list.
 */

#ifndef _skip_list_H_
#define _skip_list_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "object.h"



typedef struct skip_list_t {
    object_t *blacklist; //object
    object_t *skip; //object
    object_t *whitelist; //object

} skip_list_t;

skip_list_t *skip_list_create(
    object_t *blacklist,
    object_t *skip,
    object_t *whitelist
);

void skip_list_free(skip_list_t *skip_list);

skip_list_t *skip_list_parseFromJSON(cJSON *skip_listJSON);

cJSON *skip_list_convertToJSON(skip_list_t *skip_list);

#endif /* _skip_list_H_ */

