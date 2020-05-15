# Org.OpenAPITools.Api.YaraApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**YaraPackageGenerate**](YaraApi.md#yarapackagegenerate) | **PUT** /yara/generate | Generate Yara package
[**YaraPackageStatus**](YaraApi.md#yarapackagestatus) | **GET** /yara/package | Yara Generation Status
[**YaraSourcesGet**](YaraApi.md#yarasourcesget) | **GET** /admin/config/yara/sources | Get Yara sources
[**YaraSourcesPut**](YaraApi.md#yarasourcesput) | **PUT** /admin/config/yara/sources | Modify Yara sources



## YaraPackageGenerate

> InlineResponse2007 YaraPackageGenerate (string apikey = null)

Generate Yara package

Generate a new package based on the new added sources.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class YaraPackageGenerateExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new YaraApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Generate Yara package
                InlineResponse2007 result = apiInstance.YaraPackageGenerate(apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling YaraApi.YaraPackageGenerate: " + e.Message );
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

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request processed successfully. |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## YaraPackageStatus

> InlineResponse2007 YaraPackageStatus (string apikey = null)

Yara Generation Status

Get status of Yara package generation.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class YaraPackageStatusExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new YaraApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Yara Generation Status
                InlineResponse2007 result = apiInstance.YaraPackageStatus(apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling YaraApi.YaraPackageStatus: " + e.Message );
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

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request processed successfully. |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## YaraSourcesGet

> YaraSourcesObject YaraSourcesGet (string apikey = null)

Get Yara sources

Retrieve a list of all sources for the Yara Engine.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class YaraSourcesGetExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new YaraApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Get Yara sources
                YaraSourcesObject result = apiInstance.YaraSourcesGet(apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling YaraApi.YaraSourcesGet: " + e.Message );
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

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of Yara Engine sources. |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## YaraSourcesPut

> YaraSourcesObject YaraSourcesPut (string apikey = null, YaraSourcesObject yaraSourcesObject = null)

Modify Yara sources

Modify one (or more) of the sources for the Yara Engine.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class YaraSourcesPutExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new YaraApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var yaraSourcesObject = new YaraSourcesObject(); // YaraSourcesObject | A list of Yara Engine sources. (optional) 

            try
            {
                // Modify Yara sources
                YaraSourcesObject result = apiInstance.YaraSourcesPut(apikey, yaraSourcesObject);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling YaraApi.YaraSourcesPut: " + e.Message );
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
| **200** | A list of Yara Engine sources. |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

