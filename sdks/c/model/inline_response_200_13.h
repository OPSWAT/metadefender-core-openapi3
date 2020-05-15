/*
 * inline_response_200_13.h
 *
 * 
 */

#ifndef _inline_response_200_13_H_
#define _inline_response_200_13_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "_stat_nodes_statuses.h"



typedef struct inline_response_200_13_t {
    int external_nodes_allowed; //boolean
    int max_node_count; //numeric
    list_t *statuses; //nonprimitive container

} inline_response_200_13_t;

inline_response_200_13_t *inline_response_200_13_create(
    int external_nodes_allowed,
    int max_node_count,
    list_t *statuses
);

void inline_response_200_13_free(inline_response_200_13_t *inline_response_200_13);

inline_response_200_13_t *inline_response_200_13_parseFromJSON(cJSON *inline_response_200_13JSON);

cJSON *inline_response_200_13_convertToJSON(inline_response_200_13_t *inline_response_200_13);

#endif /* _inline_response_200_13_H_ */

