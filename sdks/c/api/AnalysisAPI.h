#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/analysis_result.h"
#include "../model/inline_response_200_10.h"
#include "../model/inline_response_200_8.h"
#include "../model/inline_response_200_9.h"
#include "../model/inline_response_400.h"
#include "../model/inline_response_500.h"
#include "../model/object.h"


// Fetching Available Analysis Rules
//
// Retrieve all available rules with their custom configurations. Fetching available processing rules. 
//
list_t*
AnalysisAPI_analysisRules(apiClient_t *apiClient, char * user_agent );


// Cancel File Analysis
//
// When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 
//
object_t*
AnalysisAPI_fileAnalysisCancel(apiClient_t *apiClient, char * data_id , char * apikey );


// Fetch Analysis Result
//
// Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. 
//
analysis_result_t*
AnalysisAPI_fileAnalysisGet(apiClient_t *apiClient, char * data_id , char * apikey );


// Analyze File
//
// ## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.
//
inline_response_200_8_t*
AnalysisAPI_fileAnalysisPost(apiClient_t *apiClient, char * apikey , char * filename , char * filepath , char * user_agent , char * rule , char * workflow , char * batch , char * archivepwd , char * metadata , char * callbackurl , binary_t* body );


// Download Sanitized Files
//
// Retrieve sanitized file based on the `data_id` 
//
binary_t**
AnalysisAPI_sanitizedFile(apiClient_t *apiClient, char * data_id , char * apikey );


// Query webhook status
//
// Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 
//
inline_response_200_9_t*
AnalysisAPI_webhookStatus(apiClient_t *apiClient, char * data_id , char * apikey );


