# ConfigApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configAuditLog**](ConfigApi.md#configAuditLog) | **PUT** /admin/config/auditlog | Audit clean up
[**configGetSkipHash**](ConfigApi.md#configGetSkipHash) | **GET** /admin/config/skip | Get &#39;skip by hash&#39; list
[**configQuarantine**](ConfigApi.md#configQuarantine) | **PUT** /admin/config/quarantine | Quarantine clean up
[**configSanitizedRepo**](ConfigApi.md#configSanitizedRepo) | **PUT** /admin/config/sanitize | Sanitized files clean up
[**configScanHistory**](ConfigApi.md#configScanHistory) | **PUT** /admin/config/scanhistory | Processing history clean up
[**configSession**](ConfigApi.md#configSession) | **PUT** /admin/config/session | Session settings
[**configUpdate**](ConfigApi.md#configUpdate) | **PUT** /admin/config/update | Modules Update Source and Frequency
[**configUpdateSkipHash**](ConfigApi.md#configUpdateSkipHash) | **PUT** /admin/config/skip | Modify &#39;skip by hash&#39; list
[**configUpdateWebhook**](ConfigApi.md#configUpdateWebhook) | **PUT** /admin/config/webhook | Webhook set configuration
[**configWebhook**](ConfigApi.md#configWebhook) | **GET** /admin/config/webhook | Webhook get configuration


<a name="configAuditLog"></a>
# **configAuditLog**
> InlineResponse200 configAuditLog(apikey, UNKNOWN_BASE_TYPE)

Audit clean up

Setting audit records (update history) clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | 
    try {
      InlineResponse200 result = apiInstance.configAuditLog(apikey, UNKNOWN_BASE_TYPE);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configAuditLog");
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
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configGetSkipHash"></a>
# **configGetSkipHash**
> SkipList configGetSkipHash(apikey)

Get &#39;skip by hash&#39; list

Get the list of hashes whitelisted or blacklisted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      SkipList result = apiInstance.configGetSkipHash(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configGetSkipHash");
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

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of all skip/white/black-listed hashes. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configQuarantine"></a>
# **configQuarantine**
> InlineResponse200 configQuarantine(apikey, UNKNOWN_BASE_TYPE)

Quarantine clean up

Setting quarantine clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | 
    try {
      InlineResponse200 result = apiInstance.configQuarantine(apikey, UNKNOWN_BASE_TYPE);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configQuarantine");
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
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configSanitizedRepo"></a>
# **configSanitizedRepo**
> InlineResponse2001 configSanitizedRepo(apikey, inlineObject1)

Sanitized files clean up

Setting sanitized files clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      InlineResponse2001 result = apiInstance.configSanitizedRepo(apikey, inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configSanitizedRepo");
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configScanHistory"></a>
# **configScanHistory**
> InlineResponse200 configScanHistory(apikey, UNKNOWN_BASE_TYPE)

Processing history clean up

Setting processing history clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE = new UNKNOWN_BASE_TYPE(); // UNKNOWN_BASE_TYPE | 
    try {
      InlineResponse200 result = apiInstance.configScanHistory(apikey, UNKNOWN_BASE_TYPE);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configScanHistory");
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
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configSession"></a>
# **configSession**
> AdminConfigSession configSession(apikey, adminConfigSession)

Session settings

Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    AdminConfigSession adminConfigSession = new AdminConfigSession(); // AdminConfigSession | 
    try {
      AdminConfigSession result = apiInstance.configSession(apikey, adminConfigSession);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configSession");
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
 **adminConfigSession** | [**AdminConfigSession**](AdminConfigSession.md)|  | [optional]

### Return type

[**AdminConfigSession**](AdminConfigSession.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configUpdate"></a>
# **configUpdate**
> AdminConfigUpdate configUpdate(apikey, adminConfigUpdate)

Modules Update Source and Frequency

Setting update frequency for all modules and engines.  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    AdminConfigUpdate adminConfigUpdate = new AdminConfigUpdate(); // AdminConfigUpdate | 
    try {
      AdminConfigUpdate result = apiInstance.configUpdate(apikey, adminConfigUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configUpdate");
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
 **adminConfigUpdate** | [**AdminConfigUpdate**](AdminConfigUpdate.md)|  | [optional]

### Return type

[**AdminConfigUpdate**](AdminConfigUpdate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configUpdateSkipHash"></a>
# **configUpdateSkipHash**
> SkipList configUpdateSkipHash(apikey, skipList)

Modify &#39;skip by hash&#39; list

Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist&#39;s rules in array under \&quot;whitelist\&quot; key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id&#39;s strings in array hash: md5, sha1 or sha256 hash 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    SkipList skipList = new SkipList(); // SkipList | A list of all skip/white/black-listed hashes.
    try {
      SkipList result = apiInstance.configUpdateSkipHash(apikey, skipList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configUpdateSkipHash");
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
 **skipList** | [**SkipList**](SkipList.md)| A list of all skip/white/black-listed hashes. | [optional]

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of all skip/white/black-listed hashes. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configUpdateWebhook"></a>
# **configUpdateWebhook**
> AdminConfigWebhook configUpdateWebhook(apikey, adminConfigWebhook)

Webhook set configuration

Modifying settings supported for webhook mode 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    AdminConfigWebhook adminConfigWebhook = new AdminConfigWebhook(); // AdminConfigWebhook | 
    try {
      AdminConfigWebhook result = apiInstance.configUpdateWebhook(apikey, adminConfigWebhook);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configUpdateWebhook");
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
 **adminConfigWebhook** | [**AdminConfigWebhook**](AdminConfigWebhook.md)|  | [optional]

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

<a name="configWebhook"></a>
# **configWebhook**
> AdminConfigWebhook configWebhook(apikey)

Webhook get configuration

Getting settings supported for webhook mode 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ConfigApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    ConfigApi apiInstance = new ConfigApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      AdminConfigWebhook result = apiInstance.configWebhook(apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfigApi#configWebhook");
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

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

