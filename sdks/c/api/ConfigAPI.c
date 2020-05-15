#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "ConfigAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Audit clean up
//
// Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
//
inline_response_200_t*
ConfigAPI_configAuditLog(apiClient_t *apiClient, char * apikey , UNKNOWN_BASE_TYPE_t * UNKNOWN_BASE_TYPE )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/auditlog")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/auditlog");




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
    cJSON *localVarSingleItemJSON_UNKNOWN_BASE_TYPE;
    if (UNKNOWN_BASE_TYPE != NULL)
    {
        //string
        localVarSingleItemJSON_UNKNOWN_BASE_TYPE = UNKNOWN_BASE_TYPE_convertToJSON(UNKNOWN_BASE_TYPE);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_UNKNOWN_BASE_TYPE);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_t *elementToReturn = inline_response_200_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_UNKNOWN_BASE_TYPE);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Get 'skip by hash' list
//
// Get the list of hashes whitelisted or blacklisted.
//
skip_list_t*
ConfigAPI_configGetSkipHash(apiClient_t *apiClient, char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/skip")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/skip");




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
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","A list of all skip/white/black-listed hashes.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 404) {
        printf("%s\n","Requests resource was not found.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    skip_list_t *elementToReturn = skip_list_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    list_free(localVarHeaderParameters);
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Quarantine clean up
//
// Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
//
inline_response_200_t*
ConfigAPI_configQuarantine(apiClient_t *apiClient, char * apikey , UNKNOWN_BASE_TYPE_t * UNKNOWN_BASE_TYPE )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/quarantine")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/quarantine");




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
    cJSON *localVarSingleItemJSON_UNKNOWN_BASE_TYPE;
    if (UNKNOWN_BASE_TYPE != NULL)
    {
        //string
        localVarSingleItemJSON_UNKNOWN_BASE_TYPE = UNKNOWN_BASE_TYPE_convertToJSON(UNKNOWN_BASE_TYPE);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_UNKNOWN_BASE_TYPE);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_t *elementToReturn = inline_response_200_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_UNKNOWN_BASE_TYPE);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Sanitized files clean up
//
// Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  
//
inline_response_200_1_t*
ConfigAPI_configSanitizedRepo(apiClient_t *apiClient, char * apikey , inline_object_1_t * inline_object_1 )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/sanitize")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/sanitize");




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
    cJSON *localVarSingleItemJSON_inline_object_1;
    if (inline_object_1 != NULL)
    {
        //string
        localVarSingleItemJSON_inline_object_1 = inline_object_1_convertToJSON(inline_object_1);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_inline_object_1);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_1_t *elementToReturn = inline_response_200_1_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_inline_object_1);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Processing history clean up
//
// Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
//
inline_response_200_t*
ConfigAPI_configScanHistory(apiClient_t *apiClient, char * apikey , UNKNOWN_BASE_TYPE_t * UNKNOWN_BASE_TYPE )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/scanhistory")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/scanhistory");




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
    cJSON *localVarSingleItemJSON_UNKNOWN_BASE_TYPE;
    if (UNKNOWN_BASE_TYPE != NULL)
    {
        //string
        localVarSingleItemJSON_UNKNOWN_BASE_TYPE = UNKNOWN_BASE_TYPE_convertToJSON(UNKNOWN_BASE_TYPE);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_UNKNOWN_BASE_TYPE);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_t *elementToReturn = inline_response_200_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_UNKNOWN_BASE_TYPE);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Session settings
//
// Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 
//
admin_config_session_t*
ConfigAPI_configSession(apiClient_t *apiClient, char * apikey , admin_config_session_t * admin_config_session )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/session")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/session");




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
    cJSON *localVarSingleItemJSON_admin_config_session;
    if (admin_config_session != NULL)
    {
        //string
        localVarSingleItemJSON_admin_config_session = admin_config_session_convertToJSON(admin_config_session);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_admin_config_session);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    admin_config_session_t *elementToReturn = admin_config_session_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_admin_config_session);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Modules Update Source and Frequency
//
// Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  
//
admin_config_update_t*
ConfigAPI_configUpdate(apiClient_t *apiClient, char * apikey , admin_config_update_t * admin_config_update )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/update")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/update");




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
    cJSON *localVarSingleItemJSON_admin_config_update;
    if (admin_config_update != NULL)
    {
        //string
        localVarSingleItemJSON_admin_config_update = admin_config_update_convertToJSON(admin_config_update);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_admin_config_update);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    admin_config_update_t *elementToReturn = admin_config_update_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_admin_config_update);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Modify 'skip by hash' list
//
// Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash 
//
skip_list_t*
ConfigAPI_configUpdateSkipHash(apiClient_t *apiClient, char * apikey , skip_list_t * skip_list )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/skip")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/skip");




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
    cJSON *localVarSingleItemJSON_skip_list;
    if (skip_list != NULL)
    {
        //string
        localVarSingleItemJSON_skip_list = skip_list_convertToJSON(skip_list);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_skip_list);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","A list of all skip/white/black-listed hashes.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 404) {
        printf("%s\n","Requests resource was not found.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    skip_list_t *elementToReturn = skip_list_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_skip_list);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Webhook set configuration
//
// Modifying settings supported for webhook mode 
//
admin_config_webhook_t*
ConfigAPI_configUpdateWebhook(apiClient_t *apiClient, char * apikey , admin_config_webhook_t * admin_config_webhook )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/webhook")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/webhook");




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
    cJSON *localVarSingleItemJSON_admin_config_webhook;
    if (admin_config_webhook != NULL)
    {
        //string
        localVarSingleItemJSON_admin_config_webhook = admin_config_webhook_convertToJSON(admin_config_webhook);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_admin_config_webhook);
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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 404) {
        printf("%s\n","Requests resource was not found.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    admin_config_webhook_t *elementToReturn = admin_config_webhook_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
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
    cJSON_Delete(localVarSingleItemJSON_admin_config_webhook);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Webhook get configuration
//
// Getting settings supported for webhook mode 
//
admin_config_webhook_t*
ConfigAPI_configWebhook(apiClient_t *apiClient, char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/webhook")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/webhook");




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
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *ConfigAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    admin_config_webhook_t *elementToReturn = admin_config_webhook_parseFromJSON(ConfigAPIlocalVarJSON);
    cJSON_Delete(ConfigAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    list_free(localVarHeaderParameters);
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

