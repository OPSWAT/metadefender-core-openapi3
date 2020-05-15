#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dlp_response_dlp_info_redact.h"


char* resultdlp_response_dlp_info_redact_ToString(metadefender_core_dlp_response_dlp_info_redact_RESULT_e result) {
    char* resultArray[] =  { "NULL", "redacted", "not redacted", "failed to redact" };
	return resultArray[result];
}

metadefender_core_dlp_response_dlp_info_redact_RESULT_e resultdlp_response_dlp_info_redact_FromString(char* result){
    int stringToReturn = 0;
    char *resultArray[] =  { "NULL", "redacted", "not redacted", "failed to redact" };
    size_t sizeofArray = sizeof(resultArray) / sizeof(resultArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(result, resultArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact_create(
    metadefender_core_dlp_response_dlp_info_redact_RESULT_e result
    ) {
    dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact_local_var = malloc(sizeof(dlp_response_dlp_info_redact_t));
    if (!dlp_response_dlp_info_redact_local_var) {
        return NULL;
    }
    dlp_response_dlp_info_redact_local_var->result = result;

    return dlp_response_dlp_info_redact_local_var;
}


void dlp_response_dlp_info_redact_free(dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact) {
    if(NULL == dlp_response_dlp_info_redact){
        return ;
    }
    listEntry_t *listEntry;
    free(dlp_response_dlp_info_redact);
}

cJSON *dlp_response_dlp_info_redact_convertToJSON(dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact) {
    cJSON *item = cJSON_CreateObject();

    // dlp_response_dlp_info_redact->result
    
    if(cJSON_AddStringToObject(item, "result", resultdlp_response_dlp_info_redact_ToString(dlp_response_dlp_info_redact->result)) == NULL)
    {
    goto fail; //Enum
    }
    

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact_parseFromJSON(cJSON *dlp_response_dlp_info_redactJSON){

    dlp_response_dlp_info_redact_t *dlp_response_dlp_info_redact_local_var = NULL;

    // dlp_response_dlp_info_redact->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_info_redactJSON, "result");
    metadefender_core_dlp_response_dlp_info_redact_RESULT_e resultVariable;
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //Enum
    }
    resultVariable = resultdlp_response_dlp_info_redact_FromString(result->valuestring);
    }


    dlp_response_dlp_info_redact_local_var = dlp_response_dlp_info_redact_create (
        result ? resultVariable : -1
        );

    return dlp_response_dlp_info_redact_local_var;
end:
    return NULL;

}
