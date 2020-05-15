/*
 * inline_response_200_10.h
 *
 * 
 */

#ifndef _inline_response_200_10_H_
#define _inline_response_200_10_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_response_200_10_t {
    int max_file_size; //numeric
    char *name; // string

} inline_response_200_10_t;

inline_response_200_10_t *inline_response_200_10_create(
    int max_file_size,
    char *name
);

void inline_response_200_10_free(inline_response_200_10_t *inline_response_200_10);

inline_response_200_10_t *inline_response_200_10_parseFromJSON(cJSON *inline_response_200_10JSON);

cJSON *inline_response_200_10_convertToJSON(inline_response_200_10_t *inline_response_200_10);

#endif /* _inline_response_200_10_H_ */

