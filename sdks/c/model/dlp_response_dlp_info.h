/*
 * dlp_response_dlp_info.h
 *
 * Information on matched sensitive data
 */

#ifndef _dlp_response_dlp_info_H_
#define _dlp_response_dlp_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "dlp_response_dlp_info_hits.h"
#include "dlp_response_dlp_info_metadata_removal.h"
#include "dlp_response_dlp_info_redact.h"
#include "dlp_response_dlp_info_watermark.h"
#include "object.h"

// Enum CERTAINTY for dlp_response_dlp_info

typedef enum  { metadefender_core_dlp_response_dlp_info_CERTAINTY_NULL = 0, metadefender_core_dlp_response_dlp_info_CERTAINTY_Very Low, metadefender_core_dlp_response_dlp_info_CERTAINTY_Low, metadefender_core_dlp_response_dlp_info_CERTAINTY_Medium, metadefender_core_dlp_response_dlp_info_CERTAINTY_High, metadefender_core_dlp_response_dlp_info_CERTAINTY_Very High } metadefender_core_dlp_response_dlp_info_CERTAINTY_e;

char* dlp_response_dlp_info_certainty_ToString(metadefender_core_dlp_response_dlp_info_CERTAINTY_e certainty);

metadefender_core_dlp_response_dlp_info_CERTAINTY_e dlp_response_dlp_info_certainty_FromString(char* certainty);

// Enum SEVERITY for dlp_response_dlp_info

typedef enum  { metadefender_core_dlp_response_dlp_info_SEVERITY_NULL = 0, metadefender_core_dlp_response_dlp_info_SEVERITY__0, metadefender_core_dlp_response_dlp_info_SEVERITY__1 } metadefender_core_dlp_response_dlp_info_SEVERITY_e;

char* dlp_response_dlp_info_severity_ToString(metadefender_core_dlp_response_dlp_info_SEVERITY_e severity);

metadefender_core_dlp_response_dlp_info_SEVERITY_e dlp_response_dlp_info_severity_FromString(char* severity);

// Enum VERDICT for dlp_response_dlp_info

typedef enum  { metadefender_core_dlp_response_dlp_info_VERDICT_NULL = 0, metadefender_core_dlp_response_dlp_info_VERDICT__0, metadefender_core_dlp_response_dlp_info_VERDICT__1, metadefender_core_dlp_response_dlp_info_VERDICT__2, metadefender_core_dlp_response_dlp_info_VERDICT__3, metadefender_core_dlp_response_dlp_info_VERDICT__4 } metadefender_core_dlp_response_dlp_info_VERDICT_e;

char* dlp_response_dlp_info_verdict_ToString(metadefender_core_dlp_response_dlp_info_VERDICT_e verdict);

metadefender_core_dlp_response_dlp_info_VERDICT_e dlp_response_dlp_info_verdict_FromString(char* verdict);



typedef struct dlp_response_dlp_info_t {
    metadefender_core_dlp_response_dlp_info_CERTAINTY_e certainty; //enum
    object_t *errors; //object
    char *filename; // string
    struct dlp_response_dlp_info_hits_t *hits; //model
    struct dlp_response_dlp_info_metadata_removal_t *metadata_removal; //model
    struct dlp_response_dlp_info_redact_t *redact; //model
    int severity; //numeric
    int verdict; //numeric
    struct dlp_response_dlp_info_watermark_t *watermark; //model

} dlp_response_dlp_info_t;

dlp_response_dlp_info_t *dlp_response_dlp_info_create(
    metadefender_core_dlp_response_dlp_info_CERTAINTY_e certainty,
    object_t *errors,
    char *filename,
    dlp_response_dlp_info_hits_t *hits,
    dlp_response_dlp_info_metadata_removal_t *metadata_removal,
    dlp_response_dlp_info_redact_t *redact,
    int severity,
    int verdict,
    dlp_response_dlp_info_watermark_t *watermark
);

void dlp_response_dlp_info_free(dlp_response_dlp_info_t *dlp_response_dlp_info);

dlp_response_dlp_info_t *dlp_response_dlp_info_parseFromJSON(cJSON *dlp_response_dlp_infoJSON);

cJSON *dlp_response_dlp_info_convertToJSON(dlp_response_dlp_info_t *dlp_response_dlp_info);

#endif /* _dlp_response_dlp_info_H_ */

