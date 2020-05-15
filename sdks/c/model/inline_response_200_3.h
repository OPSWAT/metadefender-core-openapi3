/*
 * inline_response_200_3.h
 *
 * 
 */

#ifndef _inline_response_200_3_H_
#define _inline_response_200_3_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum RESULT for inline_response_200_3

typedef enum  { metadefender_core_inline_response_200_3_RESULT_NULL = 0, metadefender_core_inline_response_200_3_RESULT_Engine is unpinned, metadefender_core_inline_response_200_3_RESULT_Database is unpinned, metadefender_core_inline_response_200_3_RESULT_Both engine and database are unpinned } metadefender_core_inline_response_200_3_RESULT_e;

char* inline_response_200_3_result_ToString(metadefender_core_inline_response_200_3_RESULT_e result);

metadefender_core_inline_response_200_3_RESULT_e inline_response_200_3_result_FromString(char* result);



typedef struct inline_response_200_3_t {
    metadefender_core_inline_response_200_3_RESULT_e result; //enum

} inline_response_200_3_t;

inline_response_200_3_t *inline_response_200_3_create(
    metadefender_core_inline_response_200_3_RESULT_e result
);

void inline_response_200_3_free(inline_response_200_3_t *inline_response_200_3);

inline_response_200_3_t *inline_response_200_3_parseFromJSON(cJSON *inline_response_200_3JSON);

cJSON *inline_response_200_3_convertToJSON(inline_response_200_3_t *inline_response_200_3);

#endif /* _inline_response_200_3_H_ */

