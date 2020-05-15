/*
 * inline_response_403.h
 *
 * 
 */

#ifndef _inline_response_403_H_
#define _inline_response_403_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_response_403_t {
    char *err; // string

} inline_response_403_t;

inline_response_403_t *inline_response_403_create(
    char *err
);

void inline_response_403_free(inline_response_403_t *inline_response_403);

inline_response_403_t *inline_response_403_parseFromJSON(cJSON *inline_response_403JSON);

cJSON *inline_response_403_convertToJSON(inline_response_403_t *inline_response_403);

#endif /* _inline_response_403_H_ */

