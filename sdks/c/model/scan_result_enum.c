#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "scan_result_enum.h"


char* scan_result_enum_scan_result_enum_ToString(metadefender_core_scan_result_enum__e scan_result_enum) {
    char *scan_result_enumArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4" };
    return scan_result_enumArray[scan_result_enum];
}

metadefender_core_scan_result_enum__e scan_result_enum_scan_result_enum_FromString(char* scan_result_enum) {
    int stringToReturn = 0;
    char *scan_result_enumArray[] =  { "NULL", "_0", "_1", "_2", "_3", "_4" };
    size_t sizeofArray = sizeof(scan_result_enumArray) / sizeof(scan_result_enumArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(scan_result_enum, scan_result_enumArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

cJSON *scan_result_enum_scan_result_enum_convertToJSON(metadefender_core_scan_result_enum__e scan_result_enum) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddNumberToObject(item, "scan_result_enum", scan_result_enum) == NULL) {
        goto fail;
    }
    return item;
fail:
    cJSON_Delete(item);
    return NULL;
}

scan_result_enum_scan_result_enum_e scan_result_enum_scan_result_enum_parseFromJSON(cJSON *scan_result_enumJSON) {
    scan_result_enum_scan_result_enum_e *scan_result_enum = NULL;
    cJSON *scan_result_enumVar = cJSON_GetObjectItemCaseSensitive(scan_result_enumJSON, "scan_result_enum");
    if(!cJSON_IsNumber(scan_result_enumVar))
    {
        goto end;
    }
    return scan_result_enumVariable;
end:
    return 0;
}
