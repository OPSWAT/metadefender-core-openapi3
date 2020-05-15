#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "processing_results_string_enum.h"


char* processing_results_string_enum_processing_results_string_enum_ToString(metadefender_core_processing_results_string_enum__e processing_results_string_enum) {
    char *processing_results_string_enumArray[] =  { "NULL", "Threat Detected", "Infected", "Suspicious", "Failed", "Cleaned / Deleted", "Scan Skipped _ Whitelisted", "Scan Skipped _ Blacklisted", "Exceeded Archive Depth", "Not Scanned", "Encrypted Archive", "Exceeded Archive Size", "Exceeded Archive File Number", "Password Protected Document", "Exceeded Archive Timeout", "File type Mismatch", "Potentially Vulnerable File", "Canceled", "Sensitive data found", "Yara Rule Matched", "Potentially Unwanted Program", "Unsupported file type", "In Progress" };
    return processing_results_string_enumArray[processing_results_string_enum];
}

metadefender_core_processing_results_string_enum__e processing_results_string_enum_processing_results_string_enum_FromString(char* processing_results_string_enum) {
    int stringToReturn = 0;
    char *processing_results_string_enumArray[] =  { "NULL", "Threat Detected", "Infected", "Suspicious", "Failed", "Cleaned / Deleted", "Scan Skipped _ Whitelisted", "Scan Skipped _ Blacklisted", "Exceeded Archive Depth", "Not Scanned", "Encrypted Archive", "Exceeded Archive Size", "Exceeded Archive File Number", "Password Protected Document", "Exceeded Archive Timeout", "File type Mismatch", "Potentially Vulnerable File", "Canceled", "Sensitive data found", "Yara Rule Matched", "Potentially Unwanted Program", "Unsupported file type", "In Progress" };
    size_t sizeofArray = sizeof(processing_results_string_enumArray) / sizeof(processing_results_string_enumArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(processing_results_string_enum, processing_results_string_enumArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *processing_results_string_enum_processing_results_string_enum_convertToJSON(metadefender_core_processing_results_string_enum__e processing_results_string_enum) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "processing_results_string_enum", processing_results_string_enum_processing_results_string_enum_ToString(processing_results_string_enum)) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

processing_results_string_enum_processing_results_string_enum_e processing_results_string_enum_processing_results_string_enum_parseFromJSON(cJSON *processing_results_string_enumJSON) {
    processing_results_string_enum_processing_results_string_enum_e *processing_results_string_enum = NULL;
    processing_results_string_enum_processing_results_string_enum_e processing_results_string_enumVariable;
    cJSON *processing_results_string_enumVar = cJSON_GetObjectItemCaseSensitive(processing_results_string_enumJSON, "processing_results_string_enum");
    if(!cJSON_IsString(processing_results_string_enumVar) || (processing_results_string_enumVar->valuestring == NULL)){
        goto end;
    }
    processing_results_string_enumVariable = processing_results_string_enum_processing_results_string_enum_FromString(processing_results_string_enumVar->valuestring);
    return processing_results_string_enumVariable;
end:
    return 0;
}
