/*
 * inline_response_200_7_issues.h
 *
 * Stores a map of issues. Each key represents the according source, except \&quot;general\&quot;, which contains general errors occurred during the generation process
 */

#ifndef _inline_response_200_7_issues_H_
#define _inline_response_200_7_issues_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "inline_response_200_7_issues_general.h"
#include "inline_response_200_7_issues_source.h"



typedef struct inline_response_200_7_issues_t {
    list_t *general; //nonprimitive container
    list_t *source; //nonprimitive container

} inline_response_200_7_issues_t;

inline_response_200_7_issues_t *inline_response_200_7_issues_create(
    list_t *general,
    list_t *source
);

void inline_response_200_7_issues_free(inline_response_200_7_issues_t *inline_response_200_7_issues);

inline_response_200_7_issues_t *inline_response_200_7_issues_parseFromJSON(cJSON *inline_response_200_7_issuesJSON);

cJSON *inline_response_200_7_issues_convertToJSON(inline_response_200_7_issues_t *inline_response_200_7_issues);

#endif /* _inline_response_200_7_issues_H_ */

