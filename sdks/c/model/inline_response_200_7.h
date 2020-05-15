/*
 * inline_response_200_7.h
 *
 * 
 */

#ifndef _inline_response_200_7_H_
#define _inline_response_200_7_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "inline_response_200_7_issues.h"

// Enum STATUS for inline_response_200_7

typedef enum  { metadefender_core_inline_response_200_7_STATUS_NULL = 0, metadefender_core_inline_response_200_7_STATUS_idle, metadefender_core_inline_response_200_7_STATUS_error, metadefender_core_inline_response_200_7_STATUS_inprogress } metadefender_core_inline_response_200_7_STATUS_e;

char* inline_response_200_7_status_ToString(metadefender_core_inline_response_200_7_STATUS_e status);

metadefender_core_inline_response_200_7_STATUS_e inline_response_200_7_status_FromString(char* status);



typedef struct inline_response_200_7_t {
    metadefender_core_inline_response_200_7_STATUS_e status; //enum
    char *start_time; // string
    struct inline_response_200_7_issues_t *issues; //model

} inline_response_200_7_t;

inline_response_200_7_t *inline_response_200_7_create(
    metadefender_core_inline_response_200_7_STATUS_e status,
    char *start_time,
    inline_response_200_7_issues_t *issues
);

void inline_response_200_7_free(inline_response_200_7_t *inline_response_200_7);

inline_response_200_7_t *inline_response_200_7_parseFromJSON(cJSON *inline_response_200_7JSON);

cJSON *inline_response_200_7_convertToJSON(inline_response_200_7_t *inline_response_200_7);

#endif /* _inline_response_200_7_H_ */

