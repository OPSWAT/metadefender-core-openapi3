#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BatchAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Cancel Batch
//
// When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      
//
object_t*
BatchAPI_batchCancel(apiClient_t *apiClient, char * batchId , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/{batchId}/cancel")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/{batchId}/cancel");


    // Path Params
    long sizeOfPathParams_batchId = strlen(batchId)+3 + strlen("{ batchId }");
    if(batchId == NULL) {
        goto end;
    }
    char* localVarToReplace_batchId = malloc(sizeOfPathParams_batchId);
    sprintf(localVarToReplace_batchId, "{%s}", "batchId");

    localVarPath = strReplace(localVarPath, localVarToReplace_batchId, batchId);



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
        printf("%s\n","Batch cancelled.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 404) {
        printf("%s\n","Batch not found (invalid id)");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    object_t *elementToReturn = object_parseFromJSON(BatchAPIlocalVarJSON);
    cJSON_Delete(BatchAPIlocalVarJSON);
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
    free(localVarToReplace_batchId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Close Batch
//
// The batch will be closed and files can no longer can be added to the current batch.      
//
batch_response_t*
BatchAPI_batchClose(apiClient_t *apiClient, char * batchId , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/batch/{batchId}/close")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/batch/{batchId}/close");


    // Path Params
    long sizeOfPathParams_batchId = strlen(batchId)+3 + strlen("{ batchId }");
    if(batchId == NULL) {
        goto end;
    }
    char* localVarToReplace_batchId = malloc(sizeOfPathParams_batchId);
    sprintf(localVarToReplace_batchId, "{%s}", "batchId");

    localVarPath = strReplace(localVarPath, localVarToReplace_batchId, batchId);



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
        printf("%s\n","Batch successfully closed.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
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
    cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    batch_response_t *elementToReturn = batch_response_parseFromJSON(BatchAPIlocalVarJSON);
    cJSON_Delete(BatchAPIlocalVarJSON);
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
    free(localVarToReplace_batchId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Initiate Batch
//
// Create a new batch and retrieve the batch_id
//
batch_id_t*
BatchAPI_batchCreate(apiClient_t *apiClient, char * apikey , char * rule , char * user_agent , char * user_data )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/batch")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/batch");




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
    char *keyHeader_rule;
    char * valueHeader_rule;
    keyValuePair_t *keyPairHeader_rule = 0;
    if (rule) {
        keyHeader_rule = strdup("rule");
        valueHeader_rule = strdup((rule));
        keyPairHeader_rule = keyValuePair_create(keyHeader_rule, valueHeader_rule);
        list_addElement(localVarHeaderParameters,keyPairHeader_rule);
    }


    // header parameters
    char *keyHeader_user_agent;
    char * valueHeader_user_agent;
    keyValuePair_t *keyPairHeader_user_agent = 0;
    if (user_agent) {
        keyHeader_user_agent = strdup("user_agent");
        valueHeader_user_agent = strdup((user_agent));
        keyPairHeader_user_agent = keyValuePair_create(keyHeader_user_agent, valueHeader_user_agent);
        list_addElement(localVarHeaderParameters,keyPairHeader_user_agent);
    }


    // header parameters
    char *keyHeader_user_data;
    char * valueHeader_user_data;
    keyValuePair_t *keyPairHeader_user_data = 0;
    if (user_data) {
        keyHeader_user_data = strdup("user-data");
        valueHeader_user_data = strdup((user_data));
        keyPairHeader_user_data = keyValuePair_create(keyHeader_user_data, valueHeader_user_data);
        list_addElement(localVarHeaderParameters,keyPairHeader_user_data);
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
        printf("%s\n","Batch created successfully.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    batch_id_t *elementToReturn = batch_id_parseFromJSON(BatchAPIlocalVarJSON);
    cJSON_Delete(BatchAPIlocalVarJSON);
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
    free(keyHeader_rule);
    free(valueHeader_rule);
    free(keyPairHeader_rule);
    free(keyHeader_user_agent);
    free(valueHeader_user_agent);
    free(keyPairHeader_user_agent);
    free(keyHeader_user_data);
    free(valueHeader_user_data);
    free(keyPairHeader_user_data);
    return elementToReturn;
end:
    return NULL;

}

// Download Signed Batch Result
//
// Download digitally signed status report for the entire batch
//
void
BatchAPI_batchSignedResult(apiClient_t *apiClient, char * batchId , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/batch/{batchId}/certificate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/batch/{batchId}/certificate");


    // Path Params
    long sizeOfPathParams_batchId = strlen(batchId)+3 + strlen("{ batchId }");
    if(batchId == NULL) {
        goto end;
    }
    char* localVarToReplace_batchId = malloc(sizeOfPathParams_batchId);
    sprintf(localVarToReplace_batchId, "{%s}", "batchId");

    localVarPath = strReplace(localVarPath, localVarToReplace_batchId, batchId);



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

    list_addElement(localVarHeaderType,"text/plain"); //produces
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
        printf("%s\n","Signed batch result and certificate are sent back in response body (YAML format).");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
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
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    list_free(localVarHeaderParameters);
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_batchId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);

}

// Status of Batch Analysis
//
// Retrieve status report for the entire batch
//
batch_response_t*
BatchAPI_batchStatus(apiClient_t *apiClient, char * batchId , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/batch/{batchId}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/batch/{batchId}");


    // Path Params
    long sizeOfPathParams_batchId = strlen(batchId)+3 + strlen("{ batchId }");
    if(batchId == NULL) {
        goto end;
    }
    char* localVarToReplace_batchId = malloc(sizeOfPathParams_batchId);
    sprintf(localVarToReplace_batchId, "{%s}", "batchId");

    localVarPath = strReplace(localVarPath, localVarToReplace_batchId, batchId);



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
        printf("%s\n","Batch progress paginated report (50 entries/page).");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Bad Request (e.g. invalid header, apikey is missing or invalid).");
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
    cJSON *BatchAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    batch_response_t *elementToReturn = batch_response_parseFromJSON(BatchAPIlocalVarJSON);
    cJSON_Delete(BatchAPIlocalVarJSON);
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
    free(localVarToReplace_batchId);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

