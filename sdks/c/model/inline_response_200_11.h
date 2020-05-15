/*
 * inline_response_200_11.h
 *
 * 
 */

#ifndef _inline_response_200_11_H_
#define _inline_response_200_11_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_response_200_11_t {
    char *product_id; // string
    char *version; // string

} inline_response_200_11_t;

inline_response_200_11_t *inline_response_200_11_create(
    char *product_id,
    char *version
);

void inline_response_200_11_free(inline_response_200_11_t *inline_response_200_11);

inline_response_200_11_t *inline_response_200_11_parseFromJSON(cJSON *inline_response_200_11JSON);

cJSON *inline_response_200_11_convertToJSON(inline_response_200_11_t *inline_response_200_11);

#endif /* _inline_response_200_11_H_ */

