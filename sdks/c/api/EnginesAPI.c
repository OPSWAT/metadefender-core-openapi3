#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "EnginesAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum TYPE for EnginesAPI_enginePin

static char* enginePin_TYPE_ToString(metadefender_core_enginePin_type_e TYPE){
    char *TYPEArray[] =  { "NULL", "engine", "database" };
    return TYPEArray[TYPE];
}

static metadefender_core_enginePin_type_e enginePin_TYPE_FromString(char* TYPE){
    int stringToReturn = 0;
    char *TYPEArray[] =  { "NULL", "engine", "database" };
    size_t sizeofArray = sizeof(TYPEArray) / sizeof(TYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(TYPE, TYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function enginePin_TYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *enginePin_TYPE_convertToJSON(metadefender_core_enginePin_type_e TYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "type", enginePin_TYPE_ToString(TYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function enginePin_TYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static metadefender_core_enginePin_type_e enginePin_TYPE_parseFromJSON(cJSON* TYPEJSON) {
    metadefender_core_enginePin_type_e TYPEVariable = 0;
    cJSON *TYPEVar = cJSON_GetObjectItemCaseSensitive(TYPEJSON, "type");
    if(!cJSON_IsString(TYPEVar) || (TYPEVar->valuestring == NULL))
    {
        goto end;
    }
    TYPEVariable = enginePin_TYPE_FromString(TYPEVar->valuestring);
    return TYPEVariable;
end:
    return 0;
}
*/

// Functions for enum TYPE for EnginesAPI_engineUnpin

static char* engineUnpin_TYPE_ToString(metadefender_core_engineUnpin_type_e TYPE){
    char *TYPEArray[] =  { "NULL", "engine", "database" };
    return TYPEArray[TYPE];
}

static metadefender_core_engineUnpin_type_e engineUnpin_TYPE_FromString(char* TYPE){
    int stringToReturn = 0;
    char *TYPEArray[] =  { "NULL", "engine", "database" };
    size_t sizeofArray = sizeof(TYPEArray) / sizeof(TYPEArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(TYPE, TYPEArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function engineUnpin_TYPE_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *engineUnpin_TYPE_convertToJSON(metadefender_core_engineUnpin_type_e TYPE) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "type", engineUnpin_TYPE_ToString(TYPE)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function engineUnpin_TYPE_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static metadefender_core_engineUnpin_type_e engineUnpin_TYPE_parseFromJSON(cJSON* TYPEJSON) {
    metadefender_core_engineUnpin_type_e TYPEVariable = 0;
    cJSON *TYPEVar = cJSON_GetObjectItemCaseSensitive(TYPEJSON, "type");
    if(!cJSON_IsString(TYPEVar) || (TYPEVar->valuestring == NULL))
    {
        goto end;
    }
    TYPEVariable = engineUnpin_TYPE_FromString(TYPEVar->valuestring);
    return TYPEVariable;
end:
    return 0;
}
*/


// Disable engines
//
// Disable to use the selected engines on the nodes.
//
inline_response_200_5_t*
EnginesAPI_engineDisable(apiClient_t *apiClient, char * engineId , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/engine/{engineId}/disable")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/engine/{engineId}/disable");


    // Path Params
    long sizeOfPathParams_engineId = strlen(engineId)+3 + strlen("{ engineId }");
    if(engineId == NULL) {
        goto end;
    }
    char* localVarToReplace_engineId = malloc(sizeOfPathParams_engineId);
    sprintf(localVarToReplace_engineId, "{%s}", "engineId");

    localVarPath = strReplace(localVarPath, localVarToReplace_engineId, engineId);



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
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
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
    cJSON *EnginesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_5_t *elementToReturn = inline_response_200_5_parseFromJSON(EnginesAPIlocalVarJSON);
    cJSON_Delete(EnginesAPIlocalVarJSON);
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
    free(localVarToReplace_engineId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Enable engines
//
// Enable to use the selected engine on the nodes.
//
inline_response_200_4_t*
EnginesAPI_engineEnable(apiClient_t *apiClient, char * engineId , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/engine/{engineId}/enable")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/engine/{engineId}/enable");


    // Path Params
    long sizeOfPathParams_engineId = strlen(engineId)+3 + strlen("{ engineId }");
    if(engineId == NULL) {
        goto end;
    }
    char* localVarToReplace_engineId = malloc(sizeOfPathParams_engineId);
    sprintf(localVarToReplace_engineId, "{%s}", "engineId");

    localVarPath = strReplace(localVarPath, localVarToReplace_engineId, engineId);



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
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
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
    cJSON *EnginesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_4_t *elementToReturn = inline_response_200_4_parseFromJSON(EnginesAPIlocalVarJSON);
    cJSON_Delete(EnginesAPIlocalVarJSON);
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
    free(localVarToReplace_engineId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Pin engine to prevent auto-updates
//
// Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.
//
inline_response_200_2_t*
EnginesAPI_enginePin(apiClient_t *apiClient, char * engineId , char * apikey , metadefender_core_enginePin_type_e type )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/engine/{engineId}/pin")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/engine/{engineId}/pin");


    // Path Params
    long sizeOfPathParams_engineId = strlen(engineId)+3 + strlen("{ engineId }");
    if(engineId == NULL) {
        goto end;
    }
    char* localVarToReplace_engineId = malloc(sizeOfPathParams_engineId);
    sprintf(localVarToReplace_engineId, "{%s}", "engineId");

    localVarPath = strReplace(localVarPath, localVarToReplace_engineId, engineId);



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


    // header parameters
    char *keyHeader_type;
    metadefender_core_enginePin_type_e valueHeader_type;
    keyValuePair_t *keyPairHeader_type = 0;
    if (type) {
        keyHeader_type = strdup("type");
        valueHeader_type = (type);
        keyPairHeader_type = keyValuePair_create(keyHeader_type, (void *)valueHeader_type);
        list_addElement(localVarHeaderParameters,keyPairHeader_type);
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
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
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
    cJSON *EnginesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_2_t *elementToReturn = inline_response_200_2_parseFromJSON(EnginesAPIlocalVarJSON);
    cJSON_Delete(EnginesAPIlocalVarJSON);
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
    free(localVarToReplace_engineId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    free(keyHeader_type);
    free(valueHeader_type);
    free(keyPairHeader_type);
    return elementToReturn;
end:
    return NULL;

}

// Unpin engine to prevent auto-updates
//
// Unpin engines so automatic updates will be applied on them.
//
inline_response_200_3_t*
EnginesAPI_engineUnpin(apiClient_t *apiClient, char * engineId , char * apikey , metadefender_core_engineUnpin_type_e type )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/admin/engine/{engineId}/unpin")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/admin/engine/{engineId}/unpin");


    // Path Params
    long sizeOfPathParams_engineId = strlen(engineId)+3 + strlen("{ engineId }");
    if(engineId == NULL) {
        goto end;
    }
    char* localVarToReplace_engineId = malloc(sizeOfPathParams_engineId);
    sprintf(localVarToReplace_engineId, "{%s}", "engineId");

    localVarPath = strReplace(localVarPath, localVarToReplace_engineId, engineId);



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


    // header parameters
    char *keyHeader_type;
    metadefender_core_engineUnpin_type_e valueHeader_type;
    keyValuePair_t *keyPairHeader_type = 0;
    if (type) {
        keyHeader_type = strdup("type");
        valueHeader_type = (type);
        keyPairHeader_type = keyValuePair_create(keyHeader_type, (void *)valueHeader_type);
        list_addElement(localVarHeaderParameters,keyPairHeader_type);
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
        printf("%s\n","Request processed successfully");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
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
    cJSON *EnginesAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_3_t *elementToReturn = inline_response_200_3_parseFromJSON(EnginesAPIlocalVarJSON);
    cJSON_Delete(EnginesAPIlocalVarJSON);
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
    free(localVarToReplace_engineId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    free(keyHeader_type);
    free(valueHeader_type);
    free(keyPairHeader_type);
    return elementToReturn;
end:
    return NULL;

}

