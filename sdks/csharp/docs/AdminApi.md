# Org.OpenAPITools.Api.AdminApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AdminImport**](AdminApi.md#adminimport) | **POST** /admin/import | Import configuration
[**RoleCreate**](AdminApi.md#rolecreate) | **POST** /admin/role | Create new role
[**UserCreate**](AdminApi.md#usercreate) | **POST** /admin/user | Create user



## AdminImport

> InlineResponse2006 AdminImport (string apikey = null, System.IO.Stream body = null)

Import configuration

Import configuration from file.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AdminImportExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new AdminApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var body = body_example;  // System.IO.Stream |  (optional) 

            try
            {
                // Import configuration
                InlineResponse2006 result = apiInstance.AdminImport(apikey, body);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdminApi.AdminImport: " + e.Message );
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
 **body** | **System.IO.Stream**|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request processed successfully |  -  |
| **304** | The configuration has not changed |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## RoleCreate

> NewUserRoleResponse RoleCreate (string apikey = null, NewUserRoleRequest newUserRoleRequest = null)

Create new role

Add a new user role to the system.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RoleCreateExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new AdminApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var newUserRoleRequest = new NewUserRoleRequest(); // NewUserRoleRequest |  (optional) 

            try
            {
                // Create new role
                NewUserRoleResponse result = apiInstance.RoleCreate(apikey, newUserRoleRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdminApi.RoleCreate: " + e.Message );
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
 **newUserRoleRequest** | [**NewUserRoleRequest**](NewUserRoleRequest.md)|  | [optional] 

### Return type

[**NewUserRoleResponse**](NewUserRoleResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
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


## UserCreate

> UserResponse UserCreate (string apikey = null, UserRequest userRequest = null)

Create user

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserCreateExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new AdminApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var userRequest = new UserRequest(); // UserRequest |  (optional) 

            try
            {
                // Create user
                UserResponse result = apiInstance.UserCreate(apikey, userRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AdminApi.UserCreate: " + e.Message );
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
 **userRequest** | [**UserRequest**](UserRequest.md)|  | [optional] 

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request processed successfully. |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

