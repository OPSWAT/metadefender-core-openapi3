/*
 * dlp_response_dlp_info_metadata_removal.h
 *
 * Result of metadata removal.
 */

#ifndef _dlp_response_dlp_info_metadata_removal_H_
#define _dlp_response_dlp_info_metadata_removal_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum RESULT for dlp_response_dlp_info_metadata_removal

typedef enum  { metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_NULL = 0, metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_removed, metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_not removed, metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_failed to remove } metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_e;

char* dlp_response_dlp_info_metadata_removal_result_ToString(metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_e result);

metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_e dlp_response_dlp_info_metadata_removal_result_FromString(char* result);



typedef struct dlp_response_dlp_info_metadata_removal_t {
    metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_e result; //enum

} dlp_response_dlp_info_metadata_removal_t;

dlp_response_dlp_info_metadata_removal_t *dlp_response_dlp_info_metadata_removal_create(
    metadefender_core_dlp_response_dlp_info_metadata_removal_RESULT_e result
);

void dlp_response_dlp_info_metadata_removal_free(dlp_response_dlp_info_metadata_removal_t *dlp_response_dlp_info_metadata_removal);

dlp_response_dlp_info_metadata_removal_t *dlp_response_dlp_info_metadata_removal_parseFromJSON(cJSON *dlp_response_dlp_info_metadata_removalJSON);

cJSON *dlp_response_dlp_info_metadata_removal_convertToJSON(dlp_response_dlp_info_metadata_removal_t *dlp_response_dlp_info_metadata_removal);

#endif /* _dlp_response_dlp_info_metadata_removal_H_ */

