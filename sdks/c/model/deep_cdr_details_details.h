/*
 * deep_cdr_details_details.h
 *
 * 
 */

#ifndef _deep_cdr_details_details_H_
#define _deep_cdr_details_details_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum ACTION for deep_cdr_details_details

typedef enum  { metadefender_core_deep_cdr_details_details_ACTION_NULL = 0, metadefender_core_deep_cdr_details_details_ACTION_sanitized, metadefender_core_deep_cdr_details_details_ACTION_removed } metadefender_core_deep_cdr_details_details_ACTION_e;

char* deep_cdr_details_details_action_ToString(metadefender_core_deep_cdr_details_details_ACTION_e action);

metadefender_core_deep_cdr_details_details_ACTION_e deep_cdr_details_details_action_FromString(char* action);



typedef struct deep_cdr_details_details_t {
    metadefender_core_deep_cdr_details_details_ACTION_e action; //enum
    char *object_name; // string
    int count; //numeric
    char *object_details; // string
    char *file_name; // string

} deep_cdr_details_details_t;

deep_cdr_details_details_t *deep_cdr_details_details_create(
    metadefender_core_deep_cdr_details_details_ACTION_e action,
    char *object_name,
    int count,
    char *object_details,
    char *file_name
);

void deep_cdr_details_details_free(deep_cdr_details_details_t *deep_cdr_details_details);

deep_cdr_details_details_t *deep_cdr_details_details_parseFromJSON(cJSON *deep_cdr_details_detailsJSON);

cJSON *deep_cdr_details_details_convertToJSON(deep_cdr_details_details_t *deep_cdr_details_details);

#endif /* _deep_cdr_details_details_H_ */

