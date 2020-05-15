/*
 * yara_sources_object_local_sources.h
 *
 * Object defining the location of the files and if this source is being used.
 */

#ifndef _yara_sources_object_local_sources_H_
#define _yara_sources_object_local_sources_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum STATE for yara_sources_object_local_sources

typedef enum  { metadefender_core_yara_sources_object_local_sources_STATE_NULL = 0, metadefender_core_yara_sources_object_local_sources_STATE_disabled, metadefender_core_yara_sources_object_local_sources_STATE_enabled } metadefender_core_yara_sources_object_local_sources_STATE_e;

char* yara_sources_object_local_sources_state_ToString(metadefender_core_yara_sources_object_local_sources_STATE_e state);

metadefender_core_yara_sources_object_local_sources_STATE_e yara_sources_object_local_sources_state_FromString(char* state);



typedef struct yara_sources_object_local_sources_t {
    char *source; // string
    metadefender_core_yara_sources_object_local_sources_STATE_e state; //enum

} yara_sources_object_local_sources_t;

yara_sources_object_local_sources_t *yara_sources_object_local_sources_create(
    char *source,
    metadefender_core_yara_sources_object_local_sources_STATE_e state
);

void yara_sources_object_local_sources_free(yara_sources_object_local_sources_t *yara_sources_object_local_sources);

yara_sources_object_local_sources_t *yara_sources_object_local_sources_parseFromJSON(cJSON *yara_sources_object_local_sourcesJSON);

cJSON *yara_sources_object_local_sources_convertToJSON(yara_sources_object_local_sources_t *yara_sources_object_local_sources);

#endif /* _yara_sources_object_local_sources_H_ */

