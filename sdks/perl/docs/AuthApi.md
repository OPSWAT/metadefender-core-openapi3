# WWW::OpenAPIClient::AuthApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::AuthApi;
```

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_change_pass**](AuthApi.md#user_change_pass) | **POST** /user/changepassword | Change Password
[**user_login**](AuthApi.md#user_login) | **POST** /login | Login
[**user_logout**](AuthApi.md#user_logout) | **POST** /logout | Logout


# **user_change_pass**
> user_change_pass(apikey => $apikey, inline_object2 => $inline_object2)

Change Password

Modify the current password for the user identified by apikey

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AuthApi;
my $api_instance = WWW::OpenAPIClient::AuthApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $inline_object2 = WWW::OpenAPIClient::Object::InlineObject2->new(); # InlineObject2 | 

eval { 
    $api_instance->user_change_pass(apikey => $apikey, inline_object2 => $inline_object2);
};
if ($@) {
    warn "Exception when calling AuthApi->user_change_pass: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **inline_object2** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_login**
> UserLogin user_login(inline_object => $inline_object)

Login

Initiate a new session. Required for using protected REST APIs.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AuthApi;
my $api_instance = WWW::OpenAPIClient::AuthApi->new(
);

my $inline_object = WWW::OpenAPIClient::Object::InlineObject->new(); # InlineObject | 

eval { 
    my $result = $api_instance->user_login(inline_object => $inline_object);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling AuthApi->user_login: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object** | [**InlineObject**](InlineObject.md)|  | [optional] 

### Return type

[**UserLogin**](UserLogin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_logout**
> user_logout(apikey => $apikey)

Logout

Destroy session for not using protected REST APIs.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::AuthApi;
my $api_instance = WWW::OpenAPIClient::AuthApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    $api_instance->user_logout(apikey => $apikey);
};
if ($@) {
    warn "Exception when calling AuthApi->user_logout: $@\n";
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

