#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/inline_response_200_2.h"
#include "../model/inline_response_200_3.h"
#include "../model/inline_response_200_4.h"
#include "../model/inline_response_200_5.h"
#include "../model/inline_response_500.h"

// Enum TYPE for EnginesAPI_enginePin
typedef enum  { metadefender_core_enginePin_TYPE_NULL = 0, metadefender_core_enginePin_TYPE_engine, metadefender_core_enginePin_TYPE_database } metadefender_core_enginePin_type_e;

// Enum TYPE for EnginesAPI_engineUnpin
typedef enum  { metadefender_core_engineUnpin_TYPE_NULL = 0, metadefender_core_engineUnpin_TYPE_engine, metadefender_core_engineUnpin_TYPE_database } metadefender_core_engineUnpin_type_e;


// Disable engines
//
// Disable to use the selected engines on the nodes.
//
inline_response_200_5_t*
EnginesAPI_engineDisable(apiClient_t *apiClient, char * engineId , char * apikey );


// Enable engines
//
// Enable to use the selected engine on the nodes.
//
inline_response_200_4_t*
EnginesAPI_engineEnable(apiClient_t *apiClient, char * engineId , char * apikey );


// Pin engine to prevent auto-updates
//
// Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.
//
inline_response_200_2_t*
EnginesAPI_enginePin(apiClient_t *apiClient, char * engineId , char * apikey , metadefender_core_enginePin_type_e type );


// Unpin engine to prevent auto-updates
//
// Unpin engines so automatic updates will be applied on them.
//
inline_response_200_3_t*
EnginesAPI_engineUnpin(apiClient_t *apiClient, char * engineId , char * apikey , metadefender_core_engineUnpin_type_e type );


