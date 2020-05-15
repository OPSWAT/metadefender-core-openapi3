# WWW::OpenAPIClient::AdminApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AdminApi;
```

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_import**](AdminApi.md#admin_import) | **POST** /admin/import | Import configuration
[**role_create**](AdminApi.md#role_create) | **POST** /admin/role | Create new role
[**user_create**](AdminApi.md#user_create) | **POST** /admin/user | Create user


# **admin_import**
> InlineResponse2006 admin_import(apikey => $apikey, body => $body)

Import configuration

Import configuration from file.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdminApi;
my $api_instance = WWW::OpenAPIClient::AdminApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $body = WWW::OpenAPIClient::Object::string->new(); # string | 

eval { 
    my $result = $api_instance->admin_import(apikey => $apikey, body => $body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdminApi->admin_import: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **body** | **string**|  | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **role_create**
> NewUserRoleResponse role_create(apikey => $apikey, new_user_role_request => $new_user_role_request)

Create new role

Add a new user role to the system.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdminApi;
my $api_instance = WWW::OpenAPIClient::AdminApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $new_user_role_request = WWW::OpenAPIClient::Object::NewUserRoleRequest->new(); # NewUserRoleRequest | 

eval { 
    my $result = $api_instance->role_create(apikey => $apikey, new_user_role_request => $new_user_role_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdminApi->role_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **new_user_role_request** | [**NewUserRoleRequest**](NewUserRoleRequest.md)|  | [optional] 

### Return type

[**NewUserRoleResponse**](NewUserRoleResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_create**
> UserResponse user_create(apikey => $apikey, user_request => $user_request)

Create user



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AdminApi;
my $api_instance = WWW::OpenAPIClient::AdminApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $user_request = WWW::OpenAPIClient::Object::UserRequest->new(); # UserRequest | 

eval { 
    my $result = $api_instance->user_create(apikey => $apikey, user_request => $user_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AdminApi->user_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **user_request** | [**UserRequest**](UserRequest.md)|  | [optional] 

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

