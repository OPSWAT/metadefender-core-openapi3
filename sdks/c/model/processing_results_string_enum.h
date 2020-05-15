/*
 * processing_results_string_enum.h
 *
 * | scan_result_a                | scan_result_i | |------------------------------|---------------| | No Threat Detected           | 0             | | Infected                     | 1             | | Suspicious                   | 2             | | Failed                       | 3             | | Cleaned / Deleted            | 4             | | Scan Skipped - Whitelisted   | 7             | | Scan Skipped - Blacklisted   | 8             | | Exceeded Archive Depth       | 9             | | Not Scanned                  | 10            | | Encrypted Archive            | 12            | | Exceeded Archive Size        | 13            | | Exceeded Archive File Number | 14            | | Password Protected Document  | 15            | | Exceeded Archive Timeout     | 16            | | File type Mismatch           | 17            | | Potentially Vulnerable File  | 18            | | Canceled                     | 19            | | Sensitive data found         | 20            | | Yara Rule Matched            | 21            | | Potentially Unwanted Program | 22            | | Unsupported file type        | 23            | | In Progress                  | 255           | 
 */

#ifndef _processing_results_string_enum_H_
#define _processing_results_string_enum_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"

// Enum  for processing_results_string_enum

typedef enum { metadefender_core_processing_results_string_enum__NULL = 0, metadefender_core_processing_results_string_enum__Threat Detected, metadefender_core_processing_results_string_enum__Infected, metadefender_core_processing_results_string_enum__Suspicious, metadefender_core_processing_results_string_enum__Failed, metadefender_core_processing_results_string_enum__Cleaned / Deleted, metadefender_core_processing_results_string_enum__Scan Skipped _ Whitelisted, metadefender_core_processing_results_string_enum__Scan Skipped _ Blacklisted, metadefender_core_processing_results_string_enum__Exceeded Archive Depth, metadefender_core_processing_results_string_enum__Not Scanned, metadefender_core_processing_results_string_enum__Encrypted Archive, metadefender_core_processing_results_string_enum__Exceeded Archive Size, metadefender_core_processing_results_string_enum__Exceeded Archive File Number, metadefender_core_processing_results_string_enum__Password Protected Document, metadefender_core_processing_results_string_enum__Exceeded Archive Timeout, metadefender_core_processing_results_string_enum__File type Mismatch, metadefender_core_processing_results_string_enum__Potentially Vulnerable File, metadefender_core_processing_results_string_enum__Canceled, metadefender_core_processing_results_string_enum__Sensitive data found, metadefender_core_processing_results_string_enum__Yara Rule Matched, metadefender_core_processing_results_string_enum__Potentially Unwanted Program, metadefender_core_processing_results_string_enum__Unsupported file type, metadefender_core_processing_results_string_enum__In Progress } metadefender_core_processing_results_string_enum__e;

char* processing_results_string_enum_processing_results_string_enum_ToString(metadefender_core_processing_results_string_enum__e processing_results_string_enum);

metadefender_core_processing_results_string_enum__e processing_results_string_enum_processing_results_string_enum_FromString(char* processing_results_string_enum);

//cJSON *processing_results_string_enum_processing_results_string_enum_convertToJSON(metadefender_core_processing_results_string_enum__e processing_results_string_enum);

//metadefender_core_processing_results_string_enum__e processing_results_string_enum_processing_results_string_enum_parseFromJSON(cJSON *processing_results_string_enumJSON);

#endif /* _processing_results_string_enum_H_ */

