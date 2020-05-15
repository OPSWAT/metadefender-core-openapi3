/*
 * inline_response_200_12.h
 *
 * 
 */

#ifndef _inline_response_200_12_H_
#define _inline_response_200_12_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum ENGINETYPE for inline_response_200_12

typedef enum  { metadefender_core_inline_response_200_12_ENGINETYPE_NULL = 0, metadefender_core_inline_response_200_12_ENGINETYPE_av, metadefender_core_inline_response_200_12_ENGINETYPE_archive, metadefender_core_inline_response_200_12_ENGINETYPE_filetype } metadefender_core_inline_response_200_12_ENGINETYPE_e;

char* inline_response_200_12_engine_type_ToString(metadefender_core_inline_response_200_12_ENGINETYPE_e engine_type);

metadefender_core_inline_response_200_12_ENGINETYPE_e inline_response_200_12_engine_type_FromString(char* engine_type);

// Enum STATE for inline_response_200_12

typedef enum  { metadefender_core_inline_response_200_12_STATE_NULL = 0, metadefender_core_inline_response_200_12_STATE_downloading, metadefender_core_inline_response_200_12_STATE_downloaded, metadefender_core_inline_response_200_12_STATE_staging, metadefender_core_inline_response_200_12_STATE_production, metadefender_core_inline_response_200_12_STATE_removed, metadefender_core_inline_response_200_12_STATE_temporary failed, metadefender_core_inline_response_200_12_STATE_permanently failed, metadefender_core_inline_response_200_12_STATE_content invalid, metadefender_core_inline_response_200_12_STATE_download failed } metadefender_core_inline_response_200_12_STATE_e;

char* inline_response_200_12_state_ToString(metadefender_core_inline_response_200_12_STATE_e state);

metadefender_core_inline_response_200_12_STATE_e inline_response_200_12_state_FromString(char* state);



typedef struct inline_response_200_12_t {
    int active; //boolean
    char *def_time; // string
    int download_progress; //numeric
    char *download_time; // string
    char *eng_id; // string
    char *eng_name; // string
    char *eng_type; // string
    char *eng_ver; // string
    metadefender_core_inline_response_200_12_ENGINETYPE_e engine_type; //enum
    metadefender_core_inline_response_200_12_STATE_e state; //enum

} inline_response_200_12_t;

inline_response_200_12_t *inline_response_200_12_create(
    int active,
    char *def_time,
    int download_progress,
    char *download_time,
    char *eng_id,
    char *eng_name,
    char *eng_type,
    char *eng_ver,
    metadefender_core_inline_response_200_12_ENGINETYPE_e engine_type,
    metadefender_core_inline_response_200_12_STATE_e state
);

void inline_response_200_12_free(inline_response_200_12_t *inline_response_200_12);

inline_response_200_12_t *inline_response_200_12_parseFromJSON(cJSON *inline_response_200_12JSON);

cJSON *inline_response_200_12_convertToJSON(inline_response_200_12_t *inline_response_200_12);

#endif /* _inline_response_200_12_H_ */

