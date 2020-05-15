# AuthApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userChangePass**](AuthApi.md#userChangePass) | **POST** /user/changepassword | Change Password
[**userLogin**](AuthApi.md#userLogin) | **POST** /login | Login
[**userLogout**](AuthApi.md#userLogout) | **POST** /logout | Logout


<a name="userChangePass"></a>
# **userChangePass**
> userChangePass(apikey, inlineObject2)

Change Password

Modify the current password for the user identified by apikey

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      apiInstance.userChangePass(apikey, inlineObject2);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#userChangePass");
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="userLogin"></a>
# **userLogin**
> UserLogin userLogin(inlineObject)

Login

Initiate a new session. Required for using protected REST APIs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    AuthApi apiInstance = new AuthApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      UserLogin result = apiInstance.userLogin(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#userLogin");
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
**200** | OK |  -  |
**403** | Invalid credentials |  -  |
**500** | Unexpected event on server |  -  |

<a name="userLogout"></a>
# **userLogout**
> userLogout(apikey)

Logout

Destroy session for not using protected REST APIs.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      apiInstance.userLogout(apikey);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#userLogout");
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

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | OK |  -  |
**403** | Invalid user information. |  -  |
**500** | Unexpected event on server |  -  |

