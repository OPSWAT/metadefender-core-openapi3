#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/inline_response_200_6.h"
#include "../model/inline_response_500.h"
#include "../model/new_user_role_request.h"
#include "../model/new_user_role_response.h"
#include "../model/object.h"
#include "../model/user_request.h"
#include "../model/user_response.h"


// Import configuration
//
// Import configuration from file.
//
inline_response_200_6_t*
AdminAPI_adminImport(apiClient_t *apiClient, char * apikey , binary_t* * body );


// Create new role
//
// Add a new user role to the system.
//
new_user_role_response_t*
AdminAPI_roleCreate(apiClient_t *apiClient, char * apikey , new_user_role_request_t * new_user_role_request );


// Create user
//
// 
//
user_response_t*
AdminAPI_userCreate(apiClient_t *apiClient, char * apikey , user_request_t * user_request );


