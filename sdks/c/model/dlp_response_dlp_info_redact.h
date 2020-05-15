/*
 * dlp_response_dlp_info_redact.h
 *
 * Result of redaction process.
 */

#ifndef _dlp_response_dlp_info_redact_H_
#define _dlp_response_dlp_info_redact_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum RESULT for dlp_response_dlp_info_redact

typedef enum  { metadefender_core_dlp_response_dlp_info_redact_RESULT_NULL = 0, metadefender_core_dlp_response_dlp_info_redact_RESULT_redacted, metadefender_core_dlp_response_dlp_info_redact_RESULT_not redacted, metadefender_core_dlp_response_dlp_info_redact_RESULT_failed to redact } metadefender_core_dlp_response_dlp_info_redact_RESULT_e;

char* dlp_response_dlp_info_redact_result_ToString(metadefender_core_dlp_response_dlp_info_redact_RESULT_e result);

metadefender_core_dlp_response_dlp_info_redact_RESULT_e dlp_response_dlp_info_redact_result_FromString(char* result);



typedef struct dlp_response_dlp_info_redact_t {
    metadefender_core_dlp_response_dlp_info_redact_RESULT_e result; //enum

} dlp_response_dlp_info_redact_t;

dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact_create(
    metadefender_core_dlp_response_dlp_info_redact_RESULT_e result
);

void dlp_response_dlp_info_redact_free(dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact);

dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact_parseFromJSON(cJSON *dlp_response_dlp_info_redactJSON);

cJSON *dlp_response_dlp_info_redact_convertToJSON(dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact);

#endif /* _dlp_response_dlp_info_redact_H_ */

