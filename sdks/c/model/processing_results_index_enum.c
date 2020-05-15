#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "processing_results_index_enum.h"


char* processing_results_index_enum_processing_results_index_enum_ToString(metadefender_core_processing_results_index_enum__e processing_results_index_enum) {
    char *processing_results_index_enumArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4", "_7", "_8", "_9", "_10", "_12", "_13", "_14", "_15", "_16", "_17", "_18", "_19", "_20", "_21", "_22", "_23", "_255" };
    return processing_results_index_enumArray[processing_results_index_enum];
}

metadefender_core_processing_results_index_enum__e processing_results_index_enum_processing_results_index_enum_FromString(char* processing_results_index_enum) {
    int stringToReturn = 0;
    char *processing_results_index_enumArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4", "_7", "_8", "_9", "_10", "_12", "_13", "_14", "_15", "_16", "_17", "_18", "_19", "_20", "_21", "_22", "_23", "_255" };
    size_t sizeofArray = sizeof(processing_results_index_enumArray) / sizeof(processing_results_index_enumArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(processing_results_index_enum, processing_results_index_enumArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *processing_results_index_enum_processing_results_index_enum_convertToJSON(metadefender_core_processing_results_index_enum__e processing_results_index_enum) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddNumberToObject(item, "processing_results_index_enum", processing_results_index_enum) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

processing_results_index_enum_processing_results_index_enum_e processing_results_index_enum_processing_results_index_enum_parseFromJSON(cJSON *processing_results_index_enumJSON) {
    processing_results_index_enum_processing_results_index_enum_e *processing_results_index_enum = NULL;
    cJSON *processing_results_index_enumVar = cJSON_GetObjectItemCaseSensitive(processing_results_index_enumJSON, "processing_results_index_enum");
    if(!cJSON_IsNumber(processing_results_index_enumVar))
    {
        goto end;
    }
    return processing_results_index_enumVariable;
end:
    return 0;
}
