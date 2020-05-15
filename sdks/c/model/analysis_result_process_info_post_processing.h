/*
 * analysis_result_process_info_post_processing.h
 *
 * Contains information about result of sanitization process and any action done after finalizing the process using Post Actions.
 */

#ifndef _analysis_result_process_info_post_processing_H_
#define _analysis_result_process_info_post_processing_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "deep_cdr_details.h"



typedef struct analysis_result_process_info_post_processing_t {
    char *actions_failed; // string
    char *actions_ran; // string
    char *converted_destination; // string
    char *converted_to; // string
    char *copy_move_destination; // string
    struct deep_cdr_details_t *sanitization_details; //model

} analysis_result_process_info_post_processing_t;

analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing_create(
    char *actions_failed,
    char *actions_ran,
    char *converted_destination,
    char *converted_to,
    char *copy_move_destination,
    deep_cdr_details_t *sanitization_details
);

void analysis_result_process_info_post_processing_free(analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing);

analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing_parseFromJSON(cJSON *analysis_result_process_info_post_processingJSON);

cJSON *analysis_result_process_info_post_processing_convertToJSON(analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing);

#endif /* _analysis_result_process_info_post_processing_H_ */

