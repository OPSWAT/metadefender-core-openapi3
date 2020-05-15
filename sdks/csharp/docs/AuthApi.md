# Org.OpenAPITools.Api.AuthApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UserChangePass**](AuthApi.md#userchangepass) | **POST** /user/changepassword | Change Password
[**UserLogin**](AuthApi.md#userlogin) | **POST** /login | Login
[**UserLogout**](AuthApi.md#userlogout) | **POST** /logout | Logout



## UserChangePass

> void UserChangePass (string apikey = null, InlineObject2 inlineObject2 = null)

Change Password

Modify the current password for the user identified by apikey

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserChangePassExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new AuthApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var inlineObject2 = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Change Password
                apiInstance.UserChangePass(apikey, inlineObject2);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AuthApi.UserChangePass: " + e.Message );
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

void (empty response body)

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
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserLogin

> UserLogin UserLogin (InlineObject inlineObject = null)

Login

Initiate a new session. Required for using protected REST APIs.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserLoginExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new AuthApi(Configuration.Default);
            var inlineObject = new InlineObject(); // InlineObject |  (optional) 

            try
            {
                // Login
                UserLogin result = apiInstance.UserLogin(inlineObject);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AuthApi.UserLogin: " + e.Message );
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional] 

### Return type

[**UserLogin**](UserLogin.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Invalid credentials |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UserLogout

> void UserLogout (string apikey = null)

Logout

Destroy session for not using protected REST APIs.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class UserLogoutExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            // Configure API key authorization: apikey
            Configuration.Default.AddApiKey("apikey", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("apikey", "Bearer");

            var apiInstance = new AuthApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Logout
                apiInstance.UserLogout(apikey);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AuthApi.UserLogout: " + e.Message );
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

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | OK |  -  |
| **403** | Invalid user information. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

