/*
 * scan_result_enum.h
 *
 * The overall result for the analyzed file. Value will be one of the following:   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  |      
 */

#ifndef _scan_result_enum_H_
#define _scan_result_enum_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum  for scan_result_enum

typedef enum { metadefender_core_scan_result_enum__NULL = 0, metadefender_core_scan_result_enum___0, metadefender_core_scan_result_enum___1, metadefender_core_scan_result_enum___2, metadefender_core_scan_result_enum___3, metadefender_core_scan_result_enum___4 } metadefender_core_scan_result_enum__e;

char* scan_result_enum_scan_result_enum_ToString(metadefender_core_scan_result_enum__e scan_result_enum);

metadefender_core_scan_result_enum__e scan_result_enum_scan_result_enum_FromString(char* scan_result_enum);

//cJSON *scan_result_enum_scan_result_enum_convertToJSON(metadefender_core_scan_result_enum__e scan_result_enum);

//metadefender_core_scan_result_enum__e scan_result_enum_scan_result_enum_parseFromJSON(cJSON *scan_result_enumJSON);

#endif /* _scan_result_enum_H_ */

