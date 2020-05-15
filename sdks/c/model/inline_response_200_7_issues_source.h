/*
 * inline_response_200_7_issues_source.h
 *
 * 
 */

#ifndef _inline_response_200_7_issues_source_H_
#define _inline_response_200_7_issues_source_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct inline_response_200_7_issues_source_t {
    char *severity; // string
    char *message; // string

} inline_response_200_7_issues_source_t;

inline_response_200_7_issues_source_t *inline_response_200_7_issues_source_create(
    char *severity,
    char *message
);

void inline_response_200_7_issues_source_free(inline_response_200_7_issues_source_t *inline_response_200_7_issues_source);

inline_response_200_7_issues_source_t *inline_response_200_7_issues_source_parseFromJSON(cJSON *inline_response_200_7_issues_sourceJSON);

cJSON *inline_response_200_7_issues_source_convertToJSON(inline_response_200_7_issues_source_t *inline_response_200_7_issues_source);

#endif /* _inline_response_200_7_issues_source_H_ */

