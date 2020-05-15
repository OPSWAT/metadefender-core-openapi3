# Org.OpenAPITools.Api.StatsApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EnginesStatus**](StatsApi.md#enginesstatus) | **GET** /stat/engines | Engines Status
[**NodesStatus**](StatsApi.md#nodesstatus) | **GET** /stat/nodes | Nodes Status
[**ProductVersion**](StatsApi.md#productversion) | **GET** /version | Get Product Version



## EnginesStatus

> List&lt;InlineResponse20012&gt; EnginesStatus (string apikey = null)

Engines Status

The response is an array of engines with database information.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EnginesStatusExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new StatsApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Engines Status
                List<InlineResponse20012> result = apiInstance.EnginesStatus(apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling StatsApi.EnginesStatus: " + e.Message );
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
| **200** | An array with all the engines and their details. |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## NodesStatus

> List&lt;InlineResponse20013&gt; NodesStatus (string apikey = null)

Nodes Status

Get a list of all connected nodes and their status.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class NodesStatusExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new StatsApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Nodes Status
                List<InlineResponse20013> result = apiInstance.NodesStatus(apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling StatsApi.NodesStatus: " + e.Message );
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
| **200** | An array with all the engines and their details. |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **405** | The user has no rights for this operation. |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ProductVersion

> InlineResponse20011 ProductVersion (string apikey = null)

Get Product Version

Fetch details about the product version.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ProductVersionExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new StatsApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Get Product Version
                InlineResponse20011 result = apiInstance.ProductVersion(apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling StatsApi.ProductVersion: " + e.Message );
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
| **200** | Provides productId and version information. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

