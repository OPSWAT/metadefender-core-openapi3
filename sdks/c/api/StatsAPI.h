#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/inline_response_200_11.h"
#include "../model/inline_response_200_12.h"
#include "../model/inline_response_200_13.h"
#include "../model/inline_response_500.h"


// Engines Status
//
// The response is an array of engines with database information.
//
list_t*
StatsAPI_enginesStatus(apiClient_t *apiClient, char * apikey );


// Nodes Status
//
// Get a list of all connected nodes and their status.
//
list_t*
StatsAPI_nodesStatus(apiClient_t *apiClient, char * apikey );


// Get Product Version
//
// Fetch details about the product version.
//
inline_response_200_11_t*
StatsAPI_productVersion(apiClient_t *apiClient, char * apikey );


