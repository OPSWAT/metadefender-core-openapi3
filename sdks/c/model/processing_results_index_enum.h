/*
 * processing_results_index_enum.h
 *
 * Possible overall and per engine analysis results:   | scan_result_i | scan_result_a                |   |---------------|------------------------------|   | 0             | No Threat Detected           |   | 1             | Infected                     |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Cleaned / Deleted            |   | 7             | Scan Skipped - Whitelisted   |   | 8             | Scan Skipped - Blacklisted   |   | 9             | Exceeded Archive Depth       |   | 10            | Not Scanned                  |   | 12            | Encrypted Archive            |   | 13            | Exceeded Archive Size        |   | 14            | Exceeded Archive File Number |   | 15            | Password Protected Document  |   | 16            | Exceeded Archive Timeout     |   | 17            | File type Mismatch           |   | 18            | Potentially Vulnerable File  |   | 19            | Canceled                     |   | 20            | Sensitive data found         |   | 21            | Yara Rule Matched            |   | 22            | Potentially Unwanted Program |   | 23            | Unsupported file type        |   | 255           | In Progress                  | 
 */

#ifndef _processing_results_index_enum_H_
#define _processing_results_index_enum_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum  for processing_results_index_enum

typedef enum { metadefender_core_processing_results_index_enum__NULL = 0, metadefender_core_processing_results_index_enum___0, metadefender_core_processing_results_index_enum___1, metadefender_core_processing_results_index_enum___2, metadefender_core_processing_results_index_enum___3, metadefender_core_processing_results_index_enum___4, metadefender_core_processing_results_index_enum___7, metadefender_core_processing_results_index_enum___8, metadefender_core_processing_results_index_enum___9, metadefender_core_processing_results_index_enum___10, metadefender_core_processing_results_index_enum___12, metadefender_core_processing_results_index_enum___13, metadefender_core_processing_results_index_enum___14, metadefender_core_processing_results_index_enum___15, metadefender_core_processing_results_index_enum___16, metadefender_core_processing_results_index_enum___17, metadefender_core_processing_results_index_enum___18, metadefender_core_processing_results_index_enum___19, metadefender_core_processing_results_index_enum___20, metadefender_core_processing_results_index_enum___21, metadefender_core_processing_results_index_enum___22, metadefender_core_processing_results_index_enum___23, metadefender_core_processing_results_index_enum___255 } metadefender_core_processing_results_index_enum__e;

char* processing_results_index_enum_processing_results_index_enum_ToString(metadefender_core_processing_results_index_enum__e processing_results_index_enum);

metadefender_core_processing_results_index_enum__e processing_results_index_enum_processing_results_index_enum_FromString(char* processing_results_index_enum);

//cJSON *processing_results_index_enum_processing_results_index_enum_convertToJSON(metadefender_core_processing_results_index_enum__e processing_results_index_enum);

//metadefender_core_processing_results_index_enum__e processing_results_index_enum_processing_results_index_enum_parseFromJSON(cJSON *processing_results_index_enumJSON);

#endif /* _processing_results_index_enum_H_ */

