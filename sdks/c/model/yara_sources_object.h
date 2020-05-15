/*
 * yara_sources_object.h
 *
 * Object describing the yara sources.
 */

#ifndef _yara_sources_object_H_
#define _yara_sources_object_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "yara_sources_object_http_sources.h"
#include "yara_sources_object_local_sources.h"



typedef struct yara_sources_object_t {
    list_t *local_sources; //nonprimitive container
    list_t *http_sources; //nonprimitive container

} yara_sources_object_t;

yara_sources_object_t *yara_sources_object_create(
    list_t *local_sources,
    list_t *http_sources
);

void yara_sources_object_free(yara_sources_object_t *yara_sources_object);

yara_sources_object_t *yara_sources_object_parseFromJSON(cJSON *yara_sources_objectJSON);

cJSON *yara_sources_object_convertToJSON(yara_sources_object_t *yara_sources_object);

#endif /* _yara_sources_object_H_ */

