/*
 * analysis_result_process_info.h
 *
 * Processing information
 */

#ifndef _analysis_result_process_info_H_
#define _analysis_result_process_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "analysis_result_process_info_post_processing.h"

// Enum OUTDATEDDATA for analysis_result_process_info

typedef enum  { metadefender_core_analysis_result_process_info_OUTDATEDDATA_NULL = 0, metadefender_core_analysis_result_process_info_OUTDATEDDATA_enginedefinition, metadefender_core_analysis_result_process_info_OUTDATEDDATA_configuration, metadefender_core_analysis_result_process_info_OUTDATEDDATA_sanitization } metadefender_core_analysis_result_process_info_OUTDATEDDATA_e;

char* analysis_result_process_info_outdated_data_ToString(metadefender_core_analysis_result_process_info_OUTDATEDDATA_e outdated_data);

metadefender_core_analysis_result_process_info_OUTDATEDDATA_e analysis_result_process_info_outdated_data_FromString(char* outdated_data);



typedef struct analysis_result_process_info_t {
    char *blocked_reason; // string
    int file_type_skipped_scan; //boolean
    list_t *outdated_data; //primitive container
    int processing_time; //numeric
    char *profile; // string
    int progress_percentage; //numeric
    int queue_time; //numeric
    char *result; // string
    char *user_agent; // string
    char *username; // string
    list_t *verdicts; //primitive container
    struct analysis_result_process_info_post_processing_t *post_processing; //model

} analysis_result_process_info_t;

analysis_result_process_info_t *analysis_result_process_info_create(
    char *blocked_reason,
    int file_type_skipped_scan,
    list_t *outdated_data,
    int processing_time,
    char *profile,
    int progress_percentage,
    int queue_time,
    char *result,
    char *user_agent,
    char *username,
    list_t *verdicts,
    analysis_result_process_info_post_processing_t *post_processing
);

void analysis_result_process_info_free(analysis_result_process_info_t *analysis_result_process_info);

analysis_result_process_info_t *analysis_result_process_info_parseFromJSON(cJSON *analysis_result_process_infoJSON);

cJSON *analysis_result_process_info_convertToJSON(analysis_result_process_info_t *analysis_result_process_info);

#endif /* _analysis_result_process_info_H_ */

