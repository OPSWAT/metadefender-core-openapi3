# Org.OpenAPITools.Api.EnginesApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EngineDisable**](EnginesApi.md#enginedisable) | **POST** /admin/engine/{engineId}/disable | Disable engines
[**EngineEnable**](EnginesApi.md#engineenable) | **POST** /admin/engine/{engineId}/enable | Enable engines
[**EnginePin**](EnginesApi.md#enginepin) | **POST** /admin/engine/{engineId}/pin | Pin engine to prevent auto-updates
[**EngineUnpin**](EnginesApi.md#engineunpin) | **POST** /admin/engine/{engineId}/unpin | Unpin engine to prevent auto-updates



## EngineDisable

> InlineResponse2005 EngineDisable (string engineId, string apikey = null)

Disable engines

Disable to use the selected engines on the nodes.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EngineDisableExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new EnginesApi(Configuration.Default);
            var engineId = clamav_7_linux;  // string | The unique engine identifier
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Disable engines
                InlineResponse2005 result = apiInstance.EngineDisable(engineId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling EnginesApi.EngineDisable: " + e.Message );
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
 **engineId** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

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
| **200** | Request processed successfully |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EngineEnable

> InlineResponse2004 EngineEnable (string engineId, string apikey = null)

Enable engines

Enable to use the selected engine on the nodes.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EngineEnableExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new EnginesApi(Configuration.Default);
            var engineId = clamav_7_linux;  // string | The unique engine identifier
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Enable engines
                InlineResponse2004 result = apiInstance.EngineEnable(engineId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling EnginesApi.EngineEnable: " + e.Message );
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
 **engineId** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

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
| **200** | Request processed successfully |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EnginePin

> InlineResponse2002 EnginePin (string engineId, string apikey = null, string type = null)

Pin engine to prevent auto-updates

Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnginePinExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new EnginesApi(Configuration.Default);
            var engineId = clamav_7_linux;  // string | The unique engine identifier
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var type = engine;  // string | Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) (optional) 

            try
            {
                // Pin engine to prevent auto-updates
                InlineResponse2002 result = apiInstance.EnginePin(engineId, apikey, type);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling EnginesApi.EnginePin: " + e.Message );
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
 **engineId** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **string**| Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) | [optional] 

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
| **200** | Request processed successfully |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EngineUnpin

> InlineResponse2003 EngineUnpin (string engineId, string apikey = null, string type = null)

Unpin engine to prevent auto-updates

Unpin engines so automatic updates will be applied on them.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EngineUnpinExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new EnginesApi(Configuration.Default);
            var engineId = clamav_7_linux;  // string | The unique engine identifier
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var type = engine;  // string | Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) (optional) 

            try
            {
                // Unpin engine to prevent auto-updates
                InlineResponse2003 result = apiInstance.EngineUnpin(engineId, apikey, type);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling EnginesApi.EngineUnpin: " + e.Message );
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
 **engineId** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **string**| Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) | [optional] 

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
| **200** | Request processed successfully |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

