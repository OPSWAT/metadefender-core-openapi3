/*
 * inline_response_200_7_issues_general.h
 *
 * 
 */

#ifndef _inline_response_200_7_issues_general_H_
#define _inline_response_200_7_issues_general_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_response_200_7_issues_general_t {
    char *severity; // string
    char *message; // string

} inline_response_200_7_issues_general_t;

inline_response_200_7_issues_general_t *inline_response_200_7_issues_general_create(
    char *severity,
    char *message
);

void inline_response_200_7_issues_general_free(inline_response_200_7_issues_general_t *inline_response_200_7_issues_general);

inline_response_200_7_issues_general_t *inline_response_200_7_issues_general_parseFromJSON(cJSON *inline_response_200_7_issues_generalJSON);

cJSON *inline_response_200_7_issues_general_convertToJSON(inline_response_200_7_issues_general_t *inline_response_200_7_issues_general);

#endif /* _inline_response_200_7_issues_general_H_ */

