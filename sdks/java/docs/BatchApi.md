# BatchApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCancel**](BatchApi.md#batchCancel) | **POST** /file/{batchId}/cancel | Cancel Batch
[**batchClose**](BatchApi.md#batchClose) | **POST** /file/batch/{batchId}/close | Close Batch
[**batchCreate**](BatchApi.md#batchCreate) | **POST** /file/batch | Initiate Batch
[**batchSignedResult**](BatchApi.md#batchSignedResult) | **GET** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**batchStatus**](BatchApi.md#batchStatus) | **GET** /file/batch/{batchId} | Status of Batch Analysis


<a name="batchCancel"></a>
# **batchCancel**
> Object batchCancel(batchId, apikey)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    BatchApi apiInstance = new BatchApi(defaultClient);
    String batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      Object result = apiInstance.batchCancel(batchId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#batchCancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

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
**200** | Batch cancelled. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Batch not found (invalid id) |  -  |
**500** | Unexpected event on server |  -  |

<a name="batchClose"></a>
# **batchClose**
> BatchResponse batchClose(batchId, apikey)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.      

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    BatchApi apiInstance = new BatchApi(defaultClient);
    String batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      BatchResponse result = apiInstance.batchClose(batchId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#batchClose");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

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
**200** | Batch successfully closed. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

<a name="batchCreate"></a>
# **batchCreate**
> BatchId batchCreate(apikey, rule, userAgent, userData)

Initiate Batch

Create a new batch and retrieve the batch_id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    BatchApi apiInstance = new BatchApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    String rule = "rule_example"; // String | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
    String userAgent = "userAgent_example"; // String | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. 
    String userData = "userData_example"; // String | Additional custom information (max 1024 bytes, URL encoded UTF-8 string)       
    try {
      BatchId result = apiInstance.batchCreate(apikey, rule, userAgent, userData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#batchCreate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]
 **rule** | **String**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional]
 **userAgent** | **String**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional]
 **userData** | **String**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        | [optional]

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
**200** | Batch created successfully. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

<a name="batchSignedResult"></a>
# **batchSignedResult**
> batchSignedResult(batchId, apikey)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    BatchApi apiInstance = new BatchApi(defaultClient);
    String batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      apiInstance.batchSignedResult(batchId, apikey);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#batchSignedResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Signed batch result and certificate are sent back in response body (YAML format). |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

<a name="batchStatus"></a>
# **batchStatus**
> BatchResponse batchStatus(batchId, apikey)

Status of Batch Analysis

Retrieve status report for the entire batch

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    BatchApi apiInstance = new BatchApi(defaultClient);
    String batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      BatchResponse result = apiInstance.batchStatus(batchId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#batchStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

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
**200** | Batch progress paginated report (50 entries/page). |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

