#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AuthAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Change Password
//
// Modify the current password for the user identified by apikey
//
void
AuthAPI_userChangePass(apiClient_t *apiClient, char * apikey , inline_object_2_t * inline_object_2 )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/changepassword")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/changepassword");




    // header parameters
    char *keyHeader_apikey;
    char * valueHeader_apikey;
    keyValuePair_t *keyPairHeader_apikey = 0;
    if (apikey) {
        keyHeader_apikey = strdup("apikey");
        valueHeader_apikey = strdup((apikey));
        keyPairHeader_apikey = keyValuePair_create(keyHeader_apikey, valueHeader_apikey);
        list_addElement(localVarHeaderParameters,keyPairHeader_apikey);
    }


    // Body Param
    cJSON *localVarSingleItemJSON_inline_object_2;
    if (inline_object_2 != NULL)
    {
        //string
        localVarSingleItemJSON_inline_object_2 = inline_object_2_convertToJSON(inline_object_2);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_inline_object_2);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    list_free(localVarHeaderParameters);
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    cJSON_Delete(localVarSingleItemJSON_inline_object_2);
    free(localVarBodyParameters);

}

// Login
//
// Initiate a new session. Required for using protected REST APIs.
//
user_login_t*
AuthAPI_userLogin(apiClient_t *apiClient, inline_object_t * inline_object )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/login")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/login");




    // Body Param
    cJSON *localVarSingleItemJSON_inline_object;
    if (inline_object != NULL)
    {
        //string
        localVarSingleItemJSON_inline_object = inline_object_convertToJSON(inline_object);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_inline_object);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","OK");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid credentials");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *AuthAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    user_login_t *elementToReturn = user_login_parseFromJSON(AuthAPIlocalVarJSON);
    cJSON_Delete(AuthAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_inline_object);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Logout
//
// Destroy session for not using protected REST APIs.
//
void
AuthAPI_userLogout(apiClient_t *apiClient, char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/logout")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/logout");




    // header parameters
    char *keyHeader_apikey;
    char * valueHeader_apikey;
    keyValuePair_t *keyPairHeader_apikey = 0;
    if (apikey) {
        keyHeader_apikey = strdup("apikey");
        valueHeader_apikey = strdup((apikey));
        keyPairHeader_apikey = keyValuePair_create(keyHeader_apikey, valueHeader_apikey);
        list_addElement(localVarHeaderParameters,keyPairHeader_apikey);
    }

    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","OK");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","OK");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    list_free(localVarHeaderParameters);
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);

}

