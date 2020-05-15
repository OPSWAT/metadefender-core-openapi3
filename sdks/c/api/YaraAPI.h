#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/inline_response_200_7.h"
#include "../model/inline_response_500.h"
#include "../model/yara_sources_object.h"


// Generate Yara package
//
// Generate a new package based on the new added sources.
//
inline_response_200_7_t*
YaraAPI_yaraPackageGenerate(apiClient_t *apiClient, char * apikey );


// Yara Generation Status
//
// Get status of Yara package generation.
//
inline_response_200_7_t*
YaraAPI_yaraPackageStatus(apiClient_t *apiClient, char * apikey );


// Get Yara sources
//
// Retrieve a list of all sources for the Yara Engine.
//
yara_sources_object_t*
YaraAPI_yaraSourcesGet(apiClient_t *apiClient, char * apikey );


// Modify Yara sources
//
// Modify one (or more) of the sources for the Yara Engine.
//
yara_sources_object_t*
YaraAPI_yaraSourcesPut(apiClient_t *apiClient, char * apikey , yara_sources_object_t * yara_sources_object );


