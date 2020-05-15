# StatsApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enginesStatus**](StatsApi.md#enginesStatus) | **GET** /stat/engines | Engines Status
[**nodesStatus**](StatsApi.md#nodesStatus) | **GET** /stat/nodes | Nodes Status
[**productVersion**](StatsApi.md#productVersion) | **GET** /version | Get Product Version


<a name="enginesStatus"></a>
# **enginesStatus**
> List&lt;InlineResponse20012&gt; enginesStatus(apikey)

Engines Status

The response is an array of engines with database information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      List<InlineResponse20012> result = apiInstance.enginesStatus(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#enginesStatus");
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

[**List&lt;InlineResponse20012&gt;**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array with all the engines and their details. |  -  |

<a name="nodesStatus"></a>
# **nodesStatus**
> List&lt;InlineResponse20013&gt; nodesStatus(apikey)

Nodes Status

Get a list of all connected nodes and their status.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      List<InlineResponse20013> result = apiInstance.nodesStatus(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#nodesStatus");
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

[**List&lt;InlineResponse20013&gt;**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array with all the engines and their details. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |

<a name="productVersion"></a>
# **productVersion**
> InlineResponse20011 productVersion(apikey)

Get Product Version

Fetch details about the product version.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    StatsApi apiInstance = new StatsApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      InlineResponse20011 result = apiInstance.productVersion(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatsApi#productVersion");
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

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Provides productId and version information. |  -  |
**500** | Unexpected event on server |  -  |

