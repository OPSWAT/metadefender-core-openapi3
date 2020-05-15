/*
 * inline_response_200_2.h
 *
 * 
 */

#ifndef _inline_response_200_2_H_
#define _inline_response_200_2_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum RESULT for inline_response_200_2

typedef enum  { metadefender_core_inline_response_200_2_RESULT_NULL = 0, metadefender_core_inline_response_200_2_RESULT_Engine is pinned, metadefender_core_inline_response_200_2_RESULT_Database is pinned, metadefender_core_inline_response_200_2_RESULT_Both engine and database are pinned } metadefender_core_inline_response_200_2_RESULT_e;

char* inline_response_200_2_result_ToString(metadefender_core_inline_response_200_2_RESULT_e result);

metadefender_core_inline_response_200_2_RESULT_e inline_response_200_2_result_FromString(char* result);



typedef struct inline_response_200_2_t {
    metadefender_core_inline_response_200_2_RESULT_e result; //enum

} inline_response_200_2_t;

inline_response_200_2_t *inline_response_200_2_create(
    metadefender_core_inline_response_200_2_RESULT_e result
);

void inline_response_200_2_free(inline_response_200_2_t *inline_response_200_2);

inline_response_200_2_t *inline_response_200_2_parseFromJSON(cJSON *inline_response_200_2JSON);

cJSON *inline_response_200_2_convertToJSON(inline_response_200_2_t *inline_response_200_2);

#endif /* _inline_response_200_2_H_ */

