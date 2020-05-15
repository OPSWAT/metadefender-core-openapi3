/*
 * deep_cdr_details.h
 *
 * Deep CDR module returns forensic info to describe what happened during the process in the case file was successfully sanitized.
 */

#ifndef _deep_cdr_details_H_
#define _deep_cdr_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "deep_cdr_details_details.h"



typedef struct deep_cdr_details_t {
    char *description; // string
    list_t *details; //nonprimitive container

} deep_cdr_details_t;

deep_cdr_details_t *deep_cdr_details_create(
    char *description,
    list_t *details
);

void deep_cdr_details_free(deep_cdr_details_t *deep_cdr_details);

deep_cdr_details_t *deep_cdr_details_parseFromJSON(cJSON *deep_cdr_detailsJSON);

cJSON *deep_cdr_details_convertToJSON(deep_cdr_details_t *deep_cdr_details);

#endif /* _deep_cdr_details_H_ */

