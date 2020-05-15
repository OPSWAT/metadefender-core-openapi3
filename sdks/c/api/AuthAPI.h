#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../model/inline_object.h"
#include "../model/inline_object_2.h"
#include "../model/inline_response_403.h"
#include "../model/inline_response_500.h"
#include "../model/user_login.h"


// Change Password
//
// Modify the current password for the user identified by apikey
//
void
AuthAPI_userChangePass(apiClient_t *apiClient, char * apikey , inline_object_2_t * inline_object_2 );


// Login
//
// Initiate a new session. Required for using protected REST APIs.
//
user_login_t*
AuthAPI_userLogin(apiClient_t *apiClient, inline_object_t * inline_object );


// Logout
//
// Destroy session for not using protected REST APIs.
//
void
AuthAPI_userLogout(apiClient_t *apiClient, char * apikey );


