# EnginesApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engineDisable**](EnginesApi.md#engineDisable) | **POST** /admin/engine/{engineId}/disable | Disable engines
[**engineEnable**](EnginesApi.md#engineEnable) | **POST** /admin/engine/{engineId}/enable | Enable engines
[**enginePin**](EnginesApi.md#enginePin) | **POST** /admin/engine/{engineId}/pin | Pin engine to prevent auto-updates
[**engineUnpin**](EnginesApi.md#engineUnpin) | **POST** /admin/engine/{engineId}/unpin | Unpin engine to prevent auto-updates


<a name="engineDisable"></a>
# **engineDisable**
> InlineResponse2005 engineDisable(engineId, apikey)

Disable engines

Disable to use the selected engines on the nodes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnginesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EnginesApi apiInstance = new EnginesApi(defaultClient);
    String engineId = clamav_7_linux; // String | The unique engine identifier
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      InlineResponse2005 result = apiInstance.engineDisable(engineId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnginesApi#engineDisable");
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
 **engineId** | **String**| The unique engine identifier |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="engineEnable"></a>
# **engineEnable**
> InlineResponse2004 engineEnable(engineId, apikey)

Enable engines

Enable to use the selected engine on the nodes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnginesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EnginesApi apiInstance = new EnginesApi(defaultClient);
    String engineId = clamav_7_linux; // String | The unique engine identifier
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      InlineResponse2004 result = apiInstance.engineEnable(engineId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnginesApi#engineEnable");
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
 **engineId** | **String**| The unique engine identifier |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="enginePin"></a>
# **enginePin**
> InlineResponse2002 enginePin(engineId, apikey, type)

Pin engine to prevent auto-updates

Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnginesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EnginesApi apiInstance = new EnginesApi(defaultClient);
    String engineId = clamav_7_linux; // String | The unique engine identifier
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    String type = engine; // String | Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.)
    try {
      InlineResponse2002 result = apiInstance.enginePin(engineId, apikey, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnginesApi#enginePin");
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
 **engineId** | **String**| The unique engine identifier |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]
 **type** | **String**| Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) | [optional] [enum: engine, database]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="engineUnpin"></a>
# **engineUnpin**
> InlineResponse2003 engineUnpin(engineId, apikey, type)

Unpin engine to prevent auto-updates

Unpin engines so automatic updates will be applied on them.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EnginesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    EnginesApi apiInstance = new EnginesApi(defaultClient);
    String engineId = clamav_7_linux; // String | The unique engine identifier
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    String type = engine; // String | Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.)
    try {
      InlineResponse2003 result = apiInstance.engineUnpin(engineId, apikey, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EnginesApi#engineUnpin");
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
 **engineId** | **String**| The unique engine identifier |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]
 **type** | **String**| Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) | [optional] [enum: engine, database]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

