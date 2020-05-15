#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dlp_response_dlp_info.h"


char* certaintydlp_response_dlp_info_ToString(metadefender_core_dlp_response_dlp_info_CERTAINTY_e certainty) {
    char* certaintyArray[] =  { "NULL", "Very Low", "Low", "Medium", "High", "Very High" };
	return certaintyArray[certainty];
}

metadefender_core_dlp_response_dlp_info_CERTAINTY_e certaintydlp_response_dlp_info_FromString(char* certainty){
    int stringToReturn = 0;
    char *certaintyArray[] =  { "NULL", "Very Low", "Low", "Medium", "High", "Very High" };
    size_t sizeofArray = sizeof(certaintyArray) / sizeof(certaintyArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(certainty, certaintyArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* severitydlp_response_dlp_info_ToString(metadefender_core_dlp_response_dlp_info_SEVERITY_e severity) {
    char* severityArray[] =  { "NULL", "_0", "_1" };
	return severityArray[severity];
}

metadefender_core_dlp_response_dlp_info_SEVERITY_e severitydlp_response_dlp_info_FromString(char* severity){
    int stringToReturn = 0;
    char *severityArray[] =  { "NULL", "_0", "_1" };
    size_t sizeofArray = sizeof(severityArray) / sizeof(severityArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(severity, severityArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}
char* verdictdlp_response_dlp_info_ToString(metadefender_core_dlp_response_dlp_info_VERDICT_e verdict) {
    char* verdictArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4" };
	return verdictArray[verdict];
}

metadefender_core_dlp_response_dlp_info_VERDICT_e verdictdlp_response_dlp_info_FromString(char* verdict){
    int stringToReturn = 0;
    char *verdictArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4" };
    size_t sizeofArray = sizeof(verdictArray) / sizeof(verdictArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(verdict, verdictArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

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
    ) {
    dlp_response_dlp_info_t *dlp_response_dlp_info_local_var = malloc(sizeof(dlp_response_dlp_info_t));
    if (!dlp_response_dlp_info_local_var) {
        return NULL;
    }
    dlp_response_dlp_info_local_var->certainty = certainty;
    dlp_response_dlp_info_local_var->errors = errors;
    dlp_response_dlp_info_local_var->filename = filename;
    dlp_response_dlp_info_local_var->hits = hits;
    dlp_response_dlp_info_local_var->metadata_removal = metadata_removal;
    dlp_response_dlp_info_local_var->redact = redact;
    dlp_response_dlp_info_local_var->severity = severity;
    dlp_response_dlp_info_local_var->verdict = verdict;
    dlp_response_dlp_info_local_var->watermark = watermark;

    return dlp_response_dlp_info_local_var;
}


void dlp_response_dlp_info_free(dlp_response_dlp_info_t *dlp_response_dlp_info) {
    if(NULL == dlp_response_dlp_info){
        return ;
    }
    listEntry_t *listEntry;
    object_free(dlp_response_dlp_info->errors);
    free(dlp_response_dlp_info->filename);
    dlp_response_dlp_info_hits_free(dlp_response_dlp_info->hits);
    dlp_response_dlp_info_metadata_removal_free(dlp_response_dlp_info->metadata_removal);
    dlp_response_dlp_info_redact_free(dlp_response_dlp_info->redact);
    dlp_response_dlp_info_watermark_free(dlp_response_dlp_info->watermark);
    free(dlp_response_dlp_info);
}

cJSON *dlp_response_dlp_info_convertToJSON(dlp_response_dlp_info_t *dlp_response_dlp_info) {
    cJSON *item = cJSON_CreateObject();

    // dlp_response_dlp_info->certainty
    
    if(cJSON_AddStringToObject(item, "certainty", certaintydlp_response_dlp_info_ToString(dlp_response_dlp_info->certainty)) == NULL)
    {
    goto fail; //Enum
    }
    


    // dlp_response_dlp_info->errors
    if(dlp_response_dlp_info->errors) { 
    cJSON *errors_object = object_convertToJSON(dlp_response_dlp_info->errors);
    if(errors_object == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "errors", errors_object);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // dlp_response_dlp_info->filename
    if(dlp_response_dlp_info->filename) { 
    if(cJSON_AddStringToObject(item, "filename", dlp_response_dlp_info->filename) == NULL) {
    goto fail; //String
    }
     } 


    // dlp_response_dlp_info->hits
    if(dlp_response_dlp_info->hits) { 
    cJSON *hits_local_JSON = dlp_response_dlp_info_hits_convertToJSON(dlp_response_dlp_info->hits);
    if(hits_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "hits", hits_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // dlp_response_dlp_info->metadata_removal
    if(dlp_response_dlp_info->metadata_removal) { 
    cJSON *metadata_removal_local_JSON = dlp_response_dlp_info_metadata_removal_convertToJSON(dlp_response_dlp_info->metadata_removal);
    if(metadata_removal_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "metadata_removal", metadata_removal_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // dlp_response_dlp_info->redact
    if(dlp_response_dlp_info->redact) { 
    cJSON *redact_local_JSON = dlp_response_dlp_info_redact_convertToJSON(dlp_response_dlp_info->redact);
    if(redact_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "redact", redact_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
     } 


    // dlp_response_dlp_info->severity
    
    if(cJSON_AddNumberToObject(item, "severity", dlp_response_dlp_info->severity) == NULL) {
    goto fail; //Numeric
    }
    


    // dlp_response_dlp_info->verdict
    
    if(cJSON_AddNumberToObject(item, "verdict", dlp_response_dlp_info->verdict) == NULL) {
    goto fail; //Numeric
    }
    


    // dlp_response_dlp_info->watermark
    if(dlp_response_dlp_info->watermark) { 
    cJSON *watermark_local_JSON = dlp_response_dlp_info_watermark_convertToJSON(dlp_response_dlp_info->watermark);
    if(watermark_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "watermark", watermark_local_JSON);
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

dlp_response_dlp_info_t *dlp_response_dlp_info_parseFromJSON(cJSON *dlp_response_dlp_infoJSON){

    dlp_response_dlp_info_t *dlp_response_dlp_info_local_var = NULL;

    // dlp_response_dlp_info->certainty
    cJSON *certainty = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "certainty");
    metadefender_core_dlp_response_dlp_info_CERTAINTY_e certaintyVariable;
    if (certainty) { 
    if(!cJSON_IsString(certainty))
    {
    goto end; //Enum
    }
    certaintyVariable = certaintydlp_response_dlp_info_FromString(certainty->valuestring);
    }

    // dlp_response_dlp_info->errors
    cJSON *errors = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "errors");
    object_t *errors_local_object = NULL;
    if (errors) { 
    errors_local_object = object_parseFromJSON(errors); //object
    }

    // dlp_response_dlp_info->filename
    cJSON *filename = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "filename");
    if (filename) { 
    if(!cJSON_IsString(filename))
    {
    goto end; //String
    }
    }

    // dlp_response_dlp_info->hits
    cJSON *hits = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "hits");
    dlp_response_dlp_info_hits_t *hits_local_nonprim = NULL;
    if (hits) { 
    hits_local_nonprim = dlp_response_dlp_info_hits_parseFromJSON(hits); //nonprimitive
    }

    // dlp_response_dlp_info->metadata_removal
    cJSON *metadata_removal = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "metadata_removal");
    dlp_response_dlp_info_metadata_removal_t *metadata_removal_local_nonprim = NULL;
    if (metadata_removal) { 
    metadata_removal_local_nonprim = dlp_response_dlp_info_metadata_removal_parseFromJSON(metadata_removal); //nonprimitive
    }

    // dlp_response_dlp_info->redact
    cJSON *redact = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "redact");
    dlp_response_dlp_info_redact_t *redact_local_nonprim = NULL;
    if (redact) { 
    redact_local_nonprim = dlp_response_dlp_info_redact_parseFromJSON(redact); //nonprimitive
    }

    // dlp_response_dlp_info->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "severity");
    if (severity) { 
    if(!cJSON_IsNumber(severity))
    {
    goto end; //Numeric
    }
    }

    // dlp_response_dlp_info->verdict
    cJSON *verdict = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "verdict");
    if (verdict) { 
    if(!cJSON_IsNumber(verdict))
    {
    goto end; //Numeric
    }
    }

    // dlp_response_dlp_info->watermark
    cJSON *watermark = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_infoJSON, "watermark");
    dlp_response_dlp_info_watermark_t *watermark_local_nonprim = NULL;
    if (watermark) { 
    watermark_local_nonprim = dlp_response_dlp_info_watermark_parseFromJSON(watermark); //nonprimitive
    }


    dlp_response_dlp_info_local_var = dlp_response_dlp_info_create (
        certainty ? certaintyVariable : -1,
        errors ? errors_local_object : NULL,
        filename ? strdup(filename->valuestring) : NULL,
        hits ? hits_local_nonprim : NULL,
        metadata_removal ? metadata_removal_local_nonprim : NULL,
        redact ? redact_local_nonprim : NULL,
        severity ? severity->valuedouble : 0,
        verdict ? verdict->valuedouble : 0,
        watermark ? watermark_local_nonprim : NULL
        );

    return dlp_response_dlp_info_local_var;
end:
    return NULL;

}
