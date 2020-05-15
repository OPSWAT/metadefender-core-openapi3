#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "dlp_response_dlp_info_watermark.h"


char* resultdlp_response_dlp_info_watermark_ToString(metadefender_core_dlp_response_dlp_info_watermark_RESULT_e result) {
    char* resultArray[] =  { "NULL", "added", "not added", "failed to add" };
	return resultArray[result];
}

metadefender_core_dlp_response_dlp_info_watermark_RESULT_e resultdlp_response_dlp_info_watermark_FromString(char* result){
    int stringToReturn = 0;
    char *resultArray[] =  { "NULL", "added", "not added", "failed to add" };
    size_t sizeofArray = sizeof(resultArray) / sizeof(resultArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(result, resultArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark_create(
    metadefender_core_dlp_response_dlp_info_watermark_RESULT_e result
    ) {
    dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark_local_var = malloc(sizeof(dlp_response_dlp_info_watermark_t));
    if (!dlp_response_dlp_info_watermark_local_var) {
        return NULL;
    }
    dlp_response_dlp_info_watermark_local_var->result = result;

    return dlp_response_dlp_info_watermark_local_var;
}


void dlp_response_dlp_info_watermark_free(dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark) {
    if(NULL == dlp_response_dlp_info_watermark){
        return ;
    }
    listEntry_t *listEntry;
    free(dlp_response_dlp_info_watermark);
}

cJSON *dlp_response_dlp_info_watermark_convertToJSON(dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark) {
    cJSON *item = cJSON_CreateObject();

    // dlp_response_dlp_info_watermark->result
    
    if(cJSON_AddStringToObject(item, "result", resultdlp_response_dlp_info_watermark_ToString(dlp_response_dlp_info_watermark->result)) == NULL)
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

dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark_parseFromJSON(cJSON *dlp_response_dlp_info_watermarkJSON){

    dlp_response_dlp_info_watermark_t *dlp_response_dlp_info_watermark_local_var = NULL;

    // dlp_response_dlp_info_watermark->result
    cJSON *result = cJSON_GetObjectItemCaseSensitive(dlp_response_dlp_info_watermarkJSON, "result");
    metadefender_core_dlp_response_dlp_info_watermark_RESULT_e resultVariable;
    if (result) { 
    if(!cJSON_IsString(result))
    {
    goto end; //Enum
    }
    resultVariable = resultdlp_response_dlp_info_watermark_FromString(result->valuestring);
    }


    dlp_response_dlp_info_watermark_local_var = dlp_response_dlp_info_watermark_create (
        result ? resultVariable : -1
        );

    return dlp_response_dlp_info_watermark_local_var;
end:
    return NULL;

}
