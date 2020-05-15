#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dlp_rule_match_result.h"


char* certaintydlp_rule_match_result_ToString(metadefender_core_dlp_rule_match_result_CERTAINTY_e certainty) {
    char* certaintyArray[] =  { "NULL", "Very Low", "Low", "Medium", "High", "Very High" };
	return certaintyArray[certainty];
}

metadefender_core_dlp_rule_match_result_CERTAINTY_e certaintydlp_rule_match_result_FromString(char* certainty){
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
char* severitydlp_rule_match_result_ToString(metadefender_core_dlp_rule_match_result_SEVERITY_e severity) {
    char* severityArray[] =  { "NULL", "_0", "_1" };
	return severityArray[severity];
}

metadefender_core_dlp_rule_match_result_SEVERITY_e severitydlp_rule_match_result_FromString(char* severity){
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

dlp_rule_match_result_t *dlp_rule_match_result_create(
    char *after,
    char *before,
    metadefender_core_dlp_rule_match_result_CERTAINTY_e certainty,
    int certainty_score,
    char *hit,
    int is_redacted,
    int severity
    ) {
    dlp_rule_match_result_t *dlp_rule_match_result_local_var = malloc(sizeof(dlp_rule_match_result_t));
    if (!dlp_rule_match_result_local_var) {
        return NULL;
    }
    dlp_rule_match_result_local_var->after = after;
    dlp_rule_match_result_local_var->before = before;
    dlp_rule_match_result_local_var->certainty = certainty;
    dlp_rule_match_result_local_var->certainty_score = certainty_score;
    dlp_rule_match_result_local_var->hit = hit;
    dlp_rule_match_result_local_var->is_redacted = is_redacted;
    dlp_rule_match_result_local_var->severity = severity;

    return dlp_rule_match_result_local_var;
}


void dlp_rule_match_result_free(dlp_rule_match_result_t *dlp_rule_match_result) {
    if(NULL == dlp_rule_match_result){
        return ;
    }
    listEntry_t *listEntry;
    free(dlp_rule_match_result->after);
    free(dlp_rule_match_result->before);
    free(dlp_rule_match_result->hit);
    free(dlp_rule_match_result);
}

cJSON *dlp_rule_match_result_convertToJSON(dlp_rule_match_result_t *dlp_rule_match_result) {
    cJSON *item = cJSON_CreateObject();

    // dlp_rule_match_result->after
    if(dlp_rule_match_result->after) { 
    if(cJSON_AddStringToObject(item, "after", dlp_rule_match_result->after) == NULL) {
    goto fail; //String
    }
     } 


    // dlp_rule_match_result->before
    if(dlp_rule_match_result->before) { 
    if(cJSON_AddStringToObject(item, "before", dlp_rule_match_result->before) == NULL) {
    goto fail; //String
    }
     } 


    // dlp_rule_match_result->certainty
    
    if(cJSON_AddStringToObject(item, "certainty", certaintydlp_rule_match_result_ToString(dlp_rule_match_result->certainty)) == NULL)
    {
    goto fail; //Enum
    }
    


    // dlp_rule_match_result->certainty_score
    if(dlp_rule_match_result->certainty_score) { 
    if(cJSON_AddNumberToObject(item, "certainty_score", dlp_rule_match_result->certainty_score) == NULL) {
    goto fail; //Numeric
    }
     } 


    // dlp_rule_match_result->hit
    if(dlp_rule_match_result->hit) { 
    if(cJSON_AddStringToObject(item, "hit", dlp_rule_match_result->hit) == NULL) {
    goto fail; //String
    }
     } 


    // dlp_rule_match_result->is_redacted
    if(dlp_rule_match_result->is_redacted) { 
    if(cJSON_AddBoolToObject(item, "isRedacted", dlp_rule_match_result->is_redacted) == NULL) {
    goto fail; //Bool
    }
     } 


    // dlp_rule_match_result->severity
    
    if(cJSON_AddNumberToObject(item, "severity", dlp_rule_match_result->severity) == NULL) {
    goto fail; //Numeric
    }
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dlp_rule_match_result_t *dlp_rule_match_result_parseFromJSON(cJSON *dlp_rule_match_resultJSON){

    dlp_rule_match_result_t *dlp_rule_match_result_local_var = NULL;

    // dlp_rule_match_result->after
    cJSON *after = cJSON_GetObjectItemCaseSensitive(dlp_rule_match_resultJSON, "after");
    if (after) { 
    if(!cJSON_IsString(after))
    {
    goto end; //String
    }
    }

    // dlp_rule_match_result->before
    cJSON *before = cJSON_GetObjectItemCaseSensitive(dlp_rule_match_resultJSON, "before");
    if (before) { 
    if(!cJSON_IsString(before))
    {
    goto end; //String
    }
    }

    // dlp_rule_match_result->certainty
    cJSON *certainty = cJSON_GetObjectItemCaseSensitive(dlp_rule_match_resultJSON, "certainty");
    metadefender_core_dlp_rule_match_result_CERTAINTY_e certaintyVariable;
    if (certainty) { 
    if(!cJSON_IsString(certainty))
    {
    goto end; //Enum
    }
    certaintyVariable = certaintydlp_rule_match_result_FromString(certainty->valuestring);
    }

    // dlp_rule_match_result->certainty_score
    cJSON *certainty_score = cJSON_GetObjectItemCaseSensitive(dlp_rule_match_resultJSON, "certainty_score");
    if (certainty_score) { 
    if(!cJSON_IsNumber(certainty_score))
    {
    goto end; //Numeric
    }
    }

    // dlp_rule_match_result->hit
    cJSON *hit = cJSON_GetObjectItemCaseSensitive(dlp_rule_match_resultJSON, "hit");
    if (hit) { 
    if(!cJSON_IsString(hit))
    {
    goto end; //String
    }
    }

    // dlp_rule_match_result->is_redacted
    cJSON *is_redacted = cJSON_GetObjectItemCaseSensitive(dlp_rule_match_resultJSON, "isRedacted");
    if (is_redacted) { 
    if(!cJSON_IsBool(is_redacted))
    {
    goto end; //Bool
    }
    }

    // dlp_rule_match_result->severity
    cJSON *severity = cJSON_GetObjectItemCaseSensitive(dlp_rule_match_resultJSON, "severity");
    if (severity) { 
    if(!cJSON_IsNumber(severity))
    {
    goto end; //Numeric
    }
    }


    dlp_rule_match_result_local_var = dlp_rule_match_result_create (
        after ? strdup(after->valuestring) : NULL,
        before ? strdup(before->valuestring) : NULL,
        certainty ? certaintyVariable : -1,
        certainty_score ? certainty_score->valuedouble : 0,
        hit ? strdup(hit->valuestring) : NULL,
        is_redacted ? is_redacted->valueint : 0,
        severity ? severity->valuedouble : 0
        );

    return dlp_rule_match_result_local_var;
end:
    return NULL;

}
