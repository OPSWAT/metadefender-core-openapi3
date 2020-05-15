/*
 * inline_response_200_9.h
 *
 * 
 */

#ifndef _inline_response_200_9_H_
#define _inline_response_200_9_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_response_200_9_t {
    char *data_id; // string
    char *request_time; // string
    int status_code; //numeric
    char *url; // string

} inline_response_200_9_t;

inline_response_200_9_t *inline_response_200_9_create(
    char *data_id,
    char *request_time,
    int status_code,
    char *url
);

void inline_response_200_9_free(inline_response_200_9_t *inline_response_200_9);

inline_response_200_9_t *inline_response_200_9_parseFromJSON(cJSON *inline_response_200_9JSON);

cJSON *inline_response_200_9_convertToJSON(inline_response_200_9_t *inline_response_200_9);

#endif /* _inline_response_200_9_H_ */

