# Org.OpenAPITools.Api.BatchApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BatchCancel**](BatchApi.md#batchcancel) | **POST** /file/{batchId}/cancel | Cancel Batch
[**BatchClose**](BatchApi.md#batchclose) | **POST** /file/batch/{batchId}/close | Close Batch
[**BatchCreate**](BatchApi.md#batchcreate) | **POST** /file/batch | Initiate Batch
[**BatchSignedResult**](BatchApi.md#batchsignedresult) | **GET** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**BatchStatus**](BatchApi.md#batchstatus) | **GET** /file/batch/{batchId} | Status of Batch Analysis



## BatchCancel

> Object BatchCancel (string batchId, string apikey = null)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BatchCancelExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new BatchApi(Configuration.Default);
            var batchId = batchId_example;  // string | The batch identifier used to submit files in the batch and to close the batch.
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Cancel Batch
                Object result = apiInstance.BatchCancel(batchId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BatchApi.BatchCancel: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch cancelled. |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **404** | Batch not found (invalid id) |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchClose

> BatchResponse BatchClose (string batchId, string apikey = null)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.      

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BatchCloseExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new BatchApi(Configuration.Default);
            var batchId = batchId_example;  // string | The batch identifier used to submit files in the batch and to close the batch.
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Close Batch
                BatchResponse result = apiInstance.BatchClose(batchId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BatchApi.BatchClose: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch successfully closed. |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **404** | Requests resource was not found. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchCreate

> BatchId BatchCreate (string apikey = null, string rule = null, string userAgent = null, string userData = null)

Initiate Batch

Create a new batch and retrieve the batch_id

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BatchCreateExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new BatchApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var rule = rule_example;  // string | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        (optional) 
            var userAgent = userAgent_example;  // string | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.  (optional) 
            var userData = userData_example;  // string | Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        (optional) 

            try
            {
                // Initiate Batch
                BatchId result = apiInstance.BatchCreate(apikey, rule, userAgent, userData);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BatchApi.BatchCreate: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **rule** | **string**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **userAgent** | **string**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **userData** | **string**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        | [optional] 

### Return type

[**BatchId**](BatchId.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch created successfully. |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchSignedResult

> void BatchSignedResult (string batchId, string apikey = null)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BatchSignedResultExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new BatchApi(Configuration.Default);
            var batchId = batchId_example;  // string | The batch identifier used to submit files in the batch and to close the batch.
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Download Signed Batch Result
                apiInstance.BatchSignedResult(batchId, apikey);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BatchApi.BatchSignedResult: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Signed batch result and certificate are sent back in response body (YAML format). |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **404** | Requests resource was not found. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchStatus

> BatchResponse BatchStatus (string batchId, string apikey = null)

Status of Batch Analysis

Retrieve status report for the entire batch

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class BatchStatusExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new BatchApi(Configuration.Default);
            var batchId = batchId_example;  // string | The batch identifier used to submit files in the batch and to close the batch.
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Status of Batch Analysis
                BatchResponse result = apiInstance.BatchStatus(batchId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling BatchApi.BatchStatus: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Batch progress paginated report (50 entries/page). |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **404** | Requests resource was not found. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

