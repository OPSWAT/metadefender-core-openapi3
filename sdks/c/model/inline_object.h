/*
 * inline_object.h
 *
 * 
 */

#ifndef _inline_object_H_
#define _inline_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_object_t {
    char *user; // string
    char *password; // string

} inline_object_t;

inline_object_t *inline_object_create(
    char *user,
    char *password
);

void inline_object_free(inline_object_t *inline_object);

inline_object_t *inline_object_parseFromJSON(cJSON *inline_objectJSON);

cJSON *inline_object_convertToJSON(inline_object_t *inline_object);

#endif /* _inline_object_H_ */

