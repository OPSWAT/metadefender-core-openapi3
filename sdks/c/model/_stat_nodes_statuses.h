/*
 * _stat_nodes_statuses.h
 *
 * Node status
 */

#ifndef __stat_nodes_statuses_H_
#define __stat_nodes_statuses_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "_stat_nodes_engines.h"
#include "_stat_nodes_issues.h"



typedef struct _stat_nodes_statuses_t {
    char *address; // string
    int cpu_cores; //numeric
    list_t *engines; //nonprimitive container
    int free_disk_space; //numeric
    char *id; // string
    list_t *issues; //nonprimitive container
    int load; //numeric
    char *os; // string
    int scan_queue; //numeric
    int total_memory; //numeric
    char *version; // string

} _stat_nodes_statuses_t;

_stat_nodes_statuses_t *_stat_nodes_statuses_create(
    char *address,
    int cpu_cores,
    list_t *engines,
    int free_disk_space,
    char *id,
    list_t *issues,
    int load,
    char *os,
    int scan_queue,
    int total_memory,
    char *version
);

void _stat_nodes_statuses_free(_stat_nodes_statuses_t *_stat_nodes_statuses);

_stat_nodes_statuses_t *_stat_nodes_statuses_parseFromJSON(cJSON *_stat_nodes_statusesJSON);

cJSON *_stat_nodes_statuses_convertToJSON(_stat_nodes_statuses_t *_stat_nodes_statuses);

#endif /* __stat_nodes_statuses_H_ */

