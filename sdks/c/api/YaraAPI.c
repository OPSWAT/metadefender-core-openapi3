#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "YaraAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Generate Yara package
//
// Generate a new package based on the new added sources.
//
inline_response_200_7_t*
YaraAPI_yaraPackageGenerate(apiClient_t *apiClient, char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/yara/generate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/yara/generate");




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
                    "PUT");

    if (apiClient->response_code == 200) {
        printf("%s\n","Request processed successfully.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *YaraAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_7_t *elementToReturn = inline_response_200_7_parseFromJSON(YaraAPIlocalVarJSON);
    cJSON_Delete(YaraAPIlocalVarJSON);
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

// Yara Generation Status
//
// Get status of Yara package generation.
//
inline_response_200_7_t*
YaraAPI_yaraPackageStatus(apiClient_t *apiClient, char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/yara/package")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/yara/package");




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
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *YaraAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_7_t *elementToReturn = inline_response_200_7_parseFromJSON(YaraAPIlocalVarJSON);
    cJSON_Delete(YaraAPIlocalVarJSON);
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

// Get Yara sources
//
// Retrieve a list of all sources for the Yara Engine.
//
yara_sources_object_t*
YaraAPI_yaraSourcesGet(apiClient_t *apiClient, char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/yara/sources")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/yara/sources");




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
        printf("%s\n","A list of Yara Engine sources.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *YaraAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    yara_sources_object_t *elementToReturn = yara_sources_object_parseFromJSON(YaraAPIlocalVarJSON);
    cJSON_Delete(YaraAPIlocalVarJSON);
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

// Modify Yara sources
//
// Modify one (or more) of the sources for the Yara Engine.
//
yara_sources_object_t*
YaraAPI_yaraSourcesPut(apiClient_t *apiClient, char * apikey , yara_sources_object_t * yara_sources_object )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/config/yara/sources")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/config/yara/sources");




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
    cJSON *localVarSingleItemJSON_yara_sources_object;
    if (yara_sources_object != NULL)
    {
        //string
        localVarSingleItemJSON_yara_sources_object = yara_sources_object_convertToJSON(yara_sources_object);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_yara_sources_object);
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
        printf("%s\n","A list of Yara Engine sources.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *YaraAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    yara_sources_object_t *elementToReturn = yara_sources_object_parseFromJSON(YaraAPIlocalVarJSON);
    cJSON_Delete(YaraAPIlocalVarJSON);
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
    cJSON_Delete(localVarSingleItemJSON_yara_sources_object);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

