#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "AnalysisAPI.h"


#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)


// Fetching Available Analysis Rules
//
// Retrieve all available rules with their custom configurations. Fetching available processing rules. 
//
list_t*
AnalysisAPI_analysisRules(apiClient_t *apiClient, char * user_agent )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/rules")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/rules");




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
        printf("%s\n","Returns the list of available rules.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    cJSON *AnalysisAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(AnalysisAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, AnalysisAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( AnalysisAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    list_free(localVarHeaderParameters);
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(keyHeader_user_agent);
    free(valueHeader_user_agent);
    free(keyPairHeader_user_agent);
    return elementToReturn;
end:
    return NULL;

}

// Cancel File Analysis
//
// When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 
//
object_t*
AnalysisAPI_fileAnalysisCancel(apiClient_t *apiClient, char * data_id , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/{data_id}/cancel")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/{data_id}/cancel");


    // Path Params
    long sizeOfPathParams_data_id = strlen(data_id)+3 + strlen("{ data_id }");
    if(data_id == NULL) {
        goto end;
    }
    char* localVarToReplace_data_id = malloc(sizeOfPathParams_data_id);
    sprintf(localVarToReplace_data_id, "{%s}", "data_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_data_id, data_id);



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
        printf("%s\n","Analysis was successfully cancelled.");
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
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *AnalysisAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    object_t *elementToReturn = object_parseFromJSON(AnalysisAPIlocalVarJSON);
    cJSON_Delete(AnalysisAPIlocalVarJSON);
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
    free(localVarToReplace_data_id);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Fetch Analysis Result
//
// Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. 
//
analysis_result_t*
AnalysisAPI_fileAnalysisGet(apiClient_t *apiClient, char * data_id , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/{data_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/{data_id}");


    // Path Params
    long sizeOfPathParams_data_id = strlen(data_id)+3 + strlen("{ data_id }");
    if(data_id == NULL) {
        goto end;
    }
    char* localVarToReplace_data_id = malloc(sizeOfPathParams_data_id);
    sprintf(localVarToReplace_data_id, "{%s}", "data_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_data_id, data_id);



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
        printf("%s\n","Entire analysis report generated by MetaDefender");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //nonprimitive not container
    cJSON *AnalysisAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    analysis_result_t *elementToReturn = analysis_result_parseFromJSON(AnalysisAPIlocalVarJSON);
    cJSON_Delete(AnalysisAPIlocalVarJSON);
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
    free(localVarToReplace_data_id);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Analyze File
//
// ## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.
//
inline_response_200_8_t*
AnalysisAPI_fileAnalysisPost(apiClient_t *apiClient, char * apikey , char * filename , char * filepath , char * user_agent , char * rule , char * workflow , char * batch , char * archivepwd , char * metadata , char * callbackurl , binary_t* body )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file");




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
    char *keyHeader_filename;
    char * valueHeader_filename;
    keyValuePair_t *keyPairHeader_filename = 0;
    if (filename) {
        keyHeader_filename = strdup("filename");
        valueHeader_filename = strdup((filename));
        keyPairHeader_filename = keyValuePair_create(keyHeader_filename, valueHeader_filename);
        list_addElement(localVarHeaderParameters,keyPairHeader_filename);
    }


    // header parameters
    char *keyHeader_filepath;
    char * valueHeader_filepath;
    keyValuePair_t *keyPairHeader_filepath = 0;
    if (filepath) {
        keyHeader_filepath = strdup("filepath");
        valueHeader_filepath = strdup((filepath));
        keyPairHeader_filepath = keyValuePair_create(keyHeader_filepath, valueHeader_filepath);
        list_addElement(localVarHeaderParameters,keyPairHeader_filepath);
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
    char *keyHeader_workflow;
    char * valueHeader_workflow;
    keyValuePair_t *keyPairHeader_workflow = 0;
    if (workflow) {
        keyHeader_workflow = strdup("workflow");
        valueHeader_workflow = strdup((workflow));
        keyPairHeader_workflow = keyValuePair_create(keyHeader_workflow, valueHeader_workflow);
        list_addElement(localVarHeaderParameters,keyPairHeader_workflow);
    }


    // header parameters
    char *keyHeader_batch;
    char * valueHeader_batch;
    keyValuePair_t *keyPairHeader_batch = 0;
    if (batch) {
        keyHeader_batch = strdup("batch");
        valueHeader_batch = strdup((batch));
        keyPairHeader_batch = keyValuePair_create(keyHeader_batch, valueHeader_batch);
        list_addElement(localVarHeaderParameters,keyPairHeader_batch);
    }


    // header parameters
    char *keyHeader_archivepwd;
    char * valueHeader_archivepwd;
    keyValuePair_t *keyPairHeader_archivepwd = 0;
    if (archivepwd) {
        keyHeader_archivepwd = strdup("archivepwd");
        valueHeader_archivepwd = strdup((archivepwd));
        keyPairHeader_archivepwd = keyValuePair_create(keyHeader_archivepwd, valueHeader_archivepwd);
        list_addElement(localVarHeaderParameters,keyPairHeader_archivepwd);
    }


    // header parameters
    char *keyHeader_metadata;
    char * valueHeader_metadata;
    keyValuePair_t *keyPairHeader_metadata = 0;
    if (metadata) {
        keyHeader_metadata = strdup("metadata");
        valueHeader_metadata = strdup((metadata));
        keyPairHeader_metadata = keyValuePair_create(keyHeader_metadata, valueHeader_metadata);
        list_addElement(localVarHeaderParameters,keyPairHeader_metadata);
    }


    // header parameters
    char *keyHeader_callbackurl;
    char * valueHeader_callbackurl;
    keyValuePair_t *keyPairHeader_callbackurl = 0;
    if (callbackurl) {
        keyHeader_callbackurl = strdup("callbackurl");
        valueHeader_callbackurl = strdup((callbackurl));
        keyPairHeader_callbackurl = keyValuePair_create(keyHeader_callbackurl, valueHeader_callbackurl);
        list_addElement(localVarHeaderParameters,keyPairHeader_callbackurl);
    }


    // Body Param
    cJSON *localVarSingleItemJSON_body;
    if (body != NULL)
    {
        //string
        localVarSingleItemJSON_body = binary_t*_convertToJSON(body);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_body);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/octet-stream"); //consumes
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
        printf("%s\n","Successful file submission");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Callbackurl and/or apikey is invalid.");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","Invalid user information or Not Allowed");
    }
    if (apiClient->response_code == 411) {
        printf("%s\n","Content-Length header is missing from the request.");
    }
    if (apiClient->response_code == 422) {
        printf("%s\n","Body input is empty.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    if (apiClient->response_code == 503) {
        printf("%s\n","Server is too busy, scan queue is full. Try again later.");
    }
    //nonprimitive not container
    cJSON *AnalysisAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_8_t *elementToReturn = inline_response_200_8_parseFromJSON(AnalysisAPIlocalVarJSON);
    cJSON_Delete(AnalysisAPIlocalVarJSON);
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
    free(keyHeader_filename);
    free(valueHeader_filename);
    free(keyPairHeader_filename);
    free(keyHeader_filepath);
    free(valueHeader_filepath);
    free(keyPairHeader_filepath);
    free(keyHeader_user_agent);
    free(valueHeader_user_agent);
    free(keyPairHeader_user_agent);
    free(keyHeader_rule);
    free(valueHeader_rule);
    free(keyPairHeader_rule);
    free(keyHeader_workflow);
    free(valueHeader_workflow);
    free(keyPairHeader_workflow);
    free(keyHeader_batch);
    free(valueHeader_batch);
    free(keyPairHeader_batch);
    free(keyHeader_archivepwd);
    free(valueHeader_archivepwd);
    free(keyPairHeader_archivepwd);
    free(keyHeader_metadata);
    free(valueHeader_metadata);
    free(keyPairHeader_metadata);
    free(keyHeader_callbackurl);
    free(valueHeader_callbackurl);
    free(keyPairHeader_callbackurl);
    cJSON_Delete(localVarSingleItemJSON_body);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Download Sanitized Files
//
// Retrieve sanitized file based on the `data_id` 
//
binary_t**
AnalysisAPI_sanitizedFile(apiClient_t *apiClient, char * data_id , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/converted/{data_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/converted/{data_id}");


    // Path Params
    long sizeOfPathParams_data_id = strlen(data_id)+3 + strlen("{ data_id }");
    if(data_id == NULL) {
        goto end;
    }
    char* localVarToReplace_data_id = malloc(sizeOfPathParams_data_id);
    sprintf(localVarToReplace_data_id, "{%s}", "data_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_data_id, data_id);



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

    list_addElement(localVarHeaderType,"application/octet-stream"); //produces
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
        printf("%s\n","Returns the sanitized content.");
    }
    if (apiClient->response_code == 404) {
        printf("%s\n","Requests resource was not found.");
    }
    if (apiClient->response_code == 405) {
        printf("%s\n","The user has no rights for this operation.");
    }
    if (apiClient->response_code == 500) {
        printf("%s\n","Unexpected event on server");
    }
    //primitive reutrn type simple
    binary_t** elementToReturn =  strdup((binary_t**)apiClient->dataReceived);

    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
    }
    
    list_free(localVarHeaderParameters);
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_data_id);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

// Query webhook status
//
// Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 
//
inline_response_200_9_t*
AnalysisAPI_webhookStatus(apiClient_t *apiClient, char * data_id , char * apikey )
{
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = list_create();
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/file/webhook/{data_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/file/webhook/{data_id}");


    // Path Params
    long sizeOfPathParams_data_id = strlen(data_id)+3 + strlen("{ data_id }");
    if(data_id == NULL) {
        goto end;
    }
    char* localVarToReplace_data_id = malloc(sizeOfPathParams_data_id);
    sprintf(localVarToReplace_data_id, "{%s}", "data_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_data_id, data_id);



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
        printf("%s\n","Webhooks status is fetched successfully.");
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
    cJSON *AnalysisAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    inline_response_200_9_t *elementToReturn = inline_response_200_9_parseFromJSON(AnalysisAPIlocalVarJSON);
    cJSON_Delete(AnalysisAPIlocalVarJSON);
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
    free(localVarToReplace_data_id);
    free(keyHeader_apikey);
    free(valueHeader_apikey);
    free(keyPairHeader_apikey);
    return elementToReturn;
end:
    return NULL;

}

