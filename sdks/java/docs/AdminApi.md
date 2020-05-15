# AdminApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminImport**](AdminApi.md#adminImport) | **POST** /admin/import | Import configuration
[**roleCreate**](AdminApi.md#roleCreate) | **POST** /admin/role | Create new role
[**userCreate**](AdminApi.md#userCreate) | **POST** /admin/user | Create user


<a name="adminImport"></a>
# **adminImport**
> InlineResponse2006 adminImport(apikey, body)

Import configuration

Import configuration from file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    File body = new File("/path/to/file"); // File | 
    try {
      InlineResponse2006 result = apiInstance.adminImport(apikey, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#adminImport");
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
 **body** | **File**|  | [optional]

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
**200** | Request processed successfully |  -  |
**304** | The configuration has not changed |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="roleCreate"></a>
# **roleCreate**
> NewUserRoleResponse roleCreate(apikey, newUserRoleRequest)

Create new role

Add a new user role to the system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    NewUserRoleRequest newUserRoleRequest = new NewUserRoleRequest(); // NewUserRoleRequest | 
    try {
      NewUserRoleResponse result = apiInstance.roleCreate(apikey, newUserRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#roleCreate");
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
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="userCreate"></a>
# **userCreate**
> UserResponse userCreate(apikey, userRequest)

Create user



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");
    
    // Configure API key authorization: apikey
    ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("apikey");
    apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apikey.setApiKeyPrefix("Token");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    UserRequest userRequest = new UserRequest(); // UserRequest | 
    try {
      UserResponse result = apiInstance.userCreate(apikey, userRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#userCreate");
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
**200** | Request processed successfully. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

