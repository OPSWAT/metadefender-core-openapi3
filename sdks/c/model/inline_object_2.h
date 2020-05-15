/*
 * inline_object_2.h
 *
 * 
 */

#ifndef _inline_object_2_H_
#define _inline_object_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_object_2_t {
    char *old_password; // string
    char *new_password; // string

} inline_object_2_t;

inline_object_2_t *inline_object_2_create(
    char *old_password,
    char *new_password
);

void inline_object_2_free(inline_object_2_t *inline_object_2);

inline_object_2_t *inline_object_2_parseFromJSON(cJSON *inline_object_2JSON);

cJSON *inline_object_2_convertToJSON(inline_object_2_t *inline_object_2);

#endif /* _inline_object_2_H_ */

