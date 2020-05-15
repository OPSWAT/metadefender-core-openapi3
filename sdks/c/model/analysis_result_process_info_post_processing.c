#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "analysis_result_process_info_post_processing.h"



analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing_create(
    char *actions_failed,
    char *actions_ran,
    char *converted_destination,
    char *converted_to,
    char *copy_move_destination,
    deep_cdr_details_t *sanitization_details
    ) {
    analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing_local_var = malloc(sizeof(analysis_result_process_info_post_processing_t));
    if (!analysis_result_process_info_post_processing_local_var) {
        return NULL;
    }
    analysis_result_process_info_post_processing_local_var->actions_failed = actions_failed;
    analysis_result_process_info_post_processing_local_var->actions_ran = actions_ran;
    analysis_result_process_info_post_processing_local_var->converted_destination = converted_destination;
    analysis_result_process_info_post_processing_local_var->converted_to = converted_to;
    analysis_result_process_info_post_processing_local_var->copy_move_destination = copy_move_destination;
    analysis_result_process_info_post_processing_local_var->sanitization_details = sanitization_details;

    return analysis_result_process_info_post_processing_local_var;
}


void analysis_result_process_info_post_processing_free(analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing) {
    if(NULL == analysis_result_process_info_post_processing){
        return ;
    }
    listEntry_t *listEntry;
    free(analysis_result_process_info_post_processing->actions_failed);
    free(analysis_result_process_info_post_processing->actions_ran);
    free(analysis_result_process_info_post_processing->converted_destination);
    free(analysis_result_process_info_post_processing->converted_to);
    free(analysis_result_process_info_post_processing->copy_move_destination);
    deep_cdr_details_free(analysis_result_process_info_post_processing->sanitization_details);
    free(analysis_result_process_info_post_processing);
}

cJSON *analysis_result_process_info_post_processing_convertToJSON(analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing) {
    cJSON *item = cJSON_CreateObject();

    // analysis_result_process_info_post_processing->actions_failed
    if(analysis_result_process_info_post_processing->actions_failed) { 
    if(cJSON_AddStringToObject(item, "actions_failed", analysis_result_process_info_post_processing->actions_failed) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info_post_processing->actions_ran
    if(analysis_result_process_info_post_processing->actions_ran) { 
    if(cJSON_AddStringToObject(item, "actions_ran", analysis_result_process_info_post_processing->actions_ran) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info_post_processing->converted_destination
    if(analysis_result_process_info_post_processing->converted_destination) { 
    if(cJSON_AddStringToObject(item, "converted_destination", analysis_result_process_info_post_processing->converted_destination) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info_post_processing->converted_to
    if(analysis_result_process_info_post_processing->converted_to) { 
    if(cJSON_AddStringToObject(item, "converted_to", analysis_result_process_info_post_processing->converted_to) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info_post_processing->copy_move_destination
    if(analysis_result_process_info_post_processing->copy_move_destination) { 
    if(cJSON_AddStringToObject(item, "copy_move_destination", analysis_result_process_info_post_processing->copy_move_destination) == NULL) {
    goto fail; //String
    }
     } 


    // analysis_result_process_info_post_processing->sanitization_details
    if(analysis_result_process_info_post_processing->sanitization_details) { 
    cJSON *sanitization_details_local_JSON = deep_cdr_details_convertToJSON(analysis_result_process_info_post_processing->sanitization_details);
    if(sanitization_details_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "sanitization_details", sanitization_details_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing_parseFromJSON(cJSON *analysis_result_process_info_post_processingJSON){

    analysis_result_process_info_post_processing_t *analysis_result_process_info_post_processing_local_var = NULL;

    // analysis_result_process_info_post_processing->actions_failed
    cJSON *actions_failed = cJSON_GetObjectItemCaseSensitive(analysis_result_process_info_post_processingJSON, "actions_failed");
    if (actions_failed) { 
    if(!cJSON_IsString(actions_failed))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info_post_processing->actions_ran
    cJSON *actions_ran = cJSON_GetObjectItemCaseSensitive(analysis_result_process_info_post_processingJSON, "actions_ran");
    if (actions_ran) { 
    if(!cJSON_IsString(actions_ran))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info_post_processing->converted_destination
    cJSON *converted_destination = cJSON_GetObjectItemCaseSensitive(analysis_result_process_info_post_processingJSON, "converted_destination");
    if (converted_destination) { 
    if(!cJSON_IsString(converted_destination))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info_post_processing->converted_to
    cJSON *converted_to = cJSON_GetObjectItemCaseSensitive(analysis_result_process_info_post_processingJSON, "converted_to");
    if (converted_to) { 
    if(!cJSON_IsString(converted_to))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info_post_processing->copy_move_destination
    cJSON *copy_move_destination = cJSON_GetObjectItemCaseSensitive(analysis_result_process_info_post_processingJSON, "copy_move_destination");
    if (copy_move_destination) { 
    if(!cJSON_IsString(copy_move_destination))
    {
    goto end; //String
    }
    }

    // analysis_result_process_info_post_processing->sanitization_details
    cJSON *sanitization_details = cJSON_GetObjectItemCaseSensitive(analysis_result_process_info_post_processingJSON, "sanitization_details");
    deep_cdr_details_t *sanitization_details_local_nonprim = NULL;
    if (sanitization_details) { 
    sanitization_details_local_nonprim = deep_cdr_details_parseFromJSON(sanitization_details); //nonprimitive
    }


    analysis_result_process_info_post_processing_local_var = analysis_result_process_info_post_processing_create (
        actions_failed ? strdup(actions_failed->valuestring) : NULL,
        actions_ran ? strdup(actions_ran->valuestring) : NULL,
        converted_destination ? strdup(converted_destination->valuestring) : NULL,
        converted_to ? strdup(converted_to->valuestring) : NULL,
        copy_move_destination ? strdup(copy_move_destination->valuestring) : NULL,
        sanitization_details ? sanitization_details_local_nonprim : NULL
        );

    return analysis_result_process_info_post_processing_local_var;
end:
    return NULL;

}
