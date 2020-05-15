/*
 * dlp_response_dlp_info_watermark.h
 *
 * Result of watermarking process.
 */

#ifndef _dlp_response_dlp_info_watermark_H_
#define _dlp_response_dlp_info_watermark_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum RESULT for dlp_response_dlp_info_watermark

typedef enum  { metadefender_core_dlp_response_dlp_info_watermark_RESULT_NULL = 0, metadefender_core_dlp_response_dlp_info_watermark_RESULT_added, metadefender_core_dlp_response_dlp_info_watermark_RESULT_not added, metadefender_core_dlp_response_dlp_info_watermark_RESULT_failed to add } metadefender_core_dlp_response_dlp_info_watermark_RESULT_e;

char* dlp_response_dlp_info_watermark_result_ToString(metadefender_core_dlp_response_dlp_info_watermark_RESULT_e result);

metadefender_core_dlp_response_dlp_info_watermark_RESULT_e dlp_response_dlp_info_watermark_result_FromString(char* result);



typedef struct dlp_response_dlp_info_watermark_t {
    metadefender_core_dlp_response_dlp_info_watermark_RESULT_e result; //enum

} dlp_response_dlp_info_watermark_t;

dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark_create(
    metadefender_core_dlp_response_dlp_info_watermark_RESULT_e result
);

void dlp_response_dlp_info_watermark_free(dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark);

dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark_parseFromJSON(cJSON *dlp_response_dlp_info_watermarkJSON);

cJSON *dlp_response_dlp_info_watermark_convertToJSON(dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark);

#endif /* _dlp_response_dlp_info_watermark_H_ */

