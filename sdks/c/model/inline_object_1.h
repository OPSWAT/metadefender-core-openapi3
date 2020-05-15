/*
 * inline_object_1.h
 *
 * 
 */

#ifndef _inline_object_1_H_
#define _inline_object_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_object_1_t {
    int maxage; //numeric

} inline_object_1_t;

inline_object_1_t *inline_object_1_create(
    int maxage
);

void inline_object_1_free(inline_object_1_t *inline_object_1);

inline_object_1_t *inline_object_1_parseFromJSON(cJSON *inline_object_1JSON);

cJSON *inline_object_1_convertToJSON(inline_object_1_t *inline_object_1);

#endif /* _inline_object_1_H_ */

