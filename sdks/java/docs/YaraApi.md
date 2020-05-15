# YaraApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**yaraPackageGenerate**](YaraApi.md#yaraPackageGenerate) | **PUT** /yara/generate | Generate Yara package
[**yaraPackageStatus**](YaraApi.md#yaraPackageStatus) | **GET** /yara/package | Yara Generation Status
[**yaraSourcesGet**](YaraApi.md#yaraSourcesGet) | **GET** /admin/config/yara/sources | Get Yara sources
[**yaraSourcesPut**](YaraApi.md#yaraSourcesPut) | **PUT** /admin/config/yara/sources | Modify Yara sources


<a name="yaraPackageGenerate"></a>
# **yaraPackageGenerate**
> InlineResponse2007 yaraPackageGenerate(apikey)

Generate Yara package

Generate a new package based on the new added sources.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YaraApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    YaraApi apiInstance = new YaraApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      InlineResponse2007 result = apiInstance.yaraPackageGenerate(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#yaraPackageGenerate");
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

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

<a name="yaraPackageStatus"></a>
# **yaraPackageStatus**
> InlineResponse2007 yaraPackageStatus(apikey)

Yara Generation Status

Get status of Yara package generation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YaraApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    YaraApi apiInstance = new YaraApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      InlineResponse2007 result = apiInstance.yaraPackageStatus(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#yaraPackageStatus");
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

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

<a name="yaraSourcesGet"></a>
# **yaraSourcesGet**
> YaraSourcesObject yaraSourcesGet(apikey)

Get Yara sources

Retrieve a list of all sources for the Yara Engine.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YaraApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    YaraApi apiInstance = new YaraApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      YaraSourcesObject result = apiInstance.yaraSourcesGet(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#yaraSourcesGet");
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

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Yara Engine sources. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

<a name="yaraSourcesPut"></a>
# **yaraSourcesPut**
> YaraSourcesObject yaraSourcesPut(apikey, yaraSourcesObject)

Modify Yara sources

Modify one (or more) of the sources for the Yara Engine.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.YaraApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    YaraApi apiInstance = new YaraApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    YaraSourcesObject yaraSourcesObject = new YaraSourcesObject(); // YaraSourcesObject | A list of Yara Engine sources.
    try {
      YaraSourcesObject result = apiInstance.yaraSourcesPut(apikey, yaraSourcesObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#yaraSourcesPut");
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
 **yaraSourcesObject** | [**YaraSourcesObject**](YaraSourcesObject.md)| A list of Yara Engine sources. | [optional]

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Yara Engine sources. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

