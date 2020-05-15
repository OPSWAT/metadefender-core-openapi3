/*
 * _stat_nodes_issues.h
 *
 * 
 */

#ifndef __stat_nodes_issues_H_
#define __stat_nodes_issues_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"



typedef struct _stat_nodes_issues_t {
    char *description; // string
    char *severity; // string

} _stat_nodes_issues_t;

_stat_nodes_issues_t *_stat_nodes_issues_create(
    char *description,
    char *severity
);

void _stat_nodes_issues_free(_stat_nodes_issues_t *_stat_nodes_issues);

_stat_nodes_issues_t *_stat_nodes_issues_parseFromJSON(cJSON *_stat_nodes_issuesJSON);

cJSON *_stat_nodes_issues_convertToJSON(_stat_nodes_issues_t *_stat_nodes_issues);

#endif /* __stat_nodes_issues_H_ */

