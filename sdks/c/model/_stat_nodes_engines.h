/*
 * _stat_nodes_engines.h
 *
 * Engine summary
 */

#ifndef __stat_nodes_engines_H_
#define __stat_nodes_engines_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum ENGINETYPE for _stat_nodes_engines

typedef enum  { metadefender_core__stat_nodes_engines_ENGINETYPE_NULL = 0, metadefender_core__stat_nodes_engines_ENGINETYPE_av, metadefender_core__stat_nodes_engines_ENGINETYPE_archive, metadefender_core__stat_nodes_engines_ENGINETYPE_filetype } metadefender_core__stat_nodes_engines_ENGINETYPE_e;

char* _stat_nodes_engines_engine_type_ToString(metadefender_core__stat_nodes_engines_ENGINETYPE_e engine_type);

metadefender_core__stat_nodes_engines_ENGINETYPE_e _stat_nodes_engines_engine_type_FromString(char* engine_type);



typedef struct _stat_nodes_engines_t {
    int active; //boolean
    char *db_ver; // string
    char *def_time; // string
    char *eng_name; // string
    char *eng_ver; // string
    metadefender_core__stat_nodes_engines_ENGINETYPE_e engine_type; //enum
    char *id; // string

} _stat_nodes_engines_t;

_stat_nodes_engines_t *_stat_nodes_engines_create(
    int active,
    char *db_ver,
    char *def_time,
    char *eng_name,
    char *eng_ver,
    metadefender_core__stat_nodes_engines_ENGINETYPE_e engine_type,
    char *id
);

void _stat_nodes_engines_free(_stat_nodes_engines_t *_stat_nodes_engines);

_stat_nodes_engines_t *_stat_nodes_engines_parseFromJSON(cJSON *_stat_nodes_enginesJSON);

cJSON *_stat_nodes_engines_convertToJSON(_stat_nodes_engines_t *_stat_nodes_engines);

#endif /* __stat_nodes_engines_H_ */

