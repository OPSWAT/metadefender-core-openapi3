#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/UNKNOWN_BASE_TYPE.h"
#include "../model/admin_config_session.h"
#include "../model/admin_config_update.h"
#include "../model/admin_config_webhook.h"
#include "../model/inline_object_1.h"
#include "../model/inline_response_200.h"
#include "../model/inline_response_200_1.h"
#include "../model/inline_response_500.h"
#include "../model/object.h"
#include "../model/skip_list.h"


// Audit clean up
//
// Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
//
inline_response_200_t*
ConfigAPI_configAuditLog(apiClient_t *apiClient, char * apikey , UNKNOWN_BASE_TYPE_t * UNKNOWN_BASE_TYPE );


// Get 'skip by hash' list
//
// Get the list of hashes whitelisted or blacklisted.
//
skip_list_t*
ConfigAPI_configGetSkipHash(apiClient_t *apiClient, char * apikey );


// Quarantine clean up
//
// Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
//
inline_response_200_t*
ConfigAPI_configQuarantine(apiClient_t *apiClient, char * apikey , UNKNOWN_BASE_TYPE_t * UNKNOWN_BASE_TYPE );


// Sanitized files clean up
//
// Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  
//
inline_response_200_1_t*
ConfigAPI_configSanitizedRepo(apiClient_t *apiClient, char * apikey , inline_object_1_t * inline_object_1 );


// Processing history clean up
//
// Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
//
inline_response_200_t*
ConfigAPI_configScanHistory(apiClient_t *apiClient, char * apikey , UNKNOWN_BASE_TYPE_t * UNKNOWN_BASE_TYPE );


// Session settings
//
// Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 
//
admin_config_session_t*
ConfigAPI_configSession(apiClient_t *apiClient, char * apikey , admin_config_session_t * admin_config_session );


// Modules Update Source and Frequency
//
// Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  
//
admin_config_update_t*
ConfigAPI_configUpdate(apiClient_t *apiClient, char * apikey , admin_config_update_t * admin_config_update );


// Modify 'skip by hash' list
//
// Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash 
//
skip_list_t*
ConfigAPI_configUpdateSkipHash(apiClient_t *apiClient, char * apikey , skip_list_t * skip_list );


// Webhook set configuration
//
// Modifying settings supported for webhook mode 
//
admin_config_webhook_t*
ConfigAPI_configUpdateWebhook(apiClient_t *apiClient, char * apikey , admin_config_webhook_t * admin_config_webhook );


// Webhook get configuration
//
// Getting settings supported for webhook mode 
//
admin_config_webhook_t*
ConfigAPI_configWebhook(apiClient_t *apiClient, char * apikey );


