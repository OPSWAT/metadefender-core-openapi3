# OpenapiClient::AuthApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_change_pass**](AuthApi.md#user_change_pass) | **POST** /user/changepassword | Change Password
[**user_login**](AuthApi.md#user_login) | **POST** /login | Login
[**user_logout**](AuthApi.md#user_logout) | **POST** /logout | Logout



## user_change_pass

> user_change_pass(opts)

Change Password

Modify the current password for the user identified by apikey

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::AuthApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  inline_object2: OpenapiClient::InlineObject2.new # InlineObject2 | 
}

begin
  #Change Password
  api_instance.user_change_pass(opts)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AuthApi->user_change_pass: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **inline_object2** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## user_login

> UserLogin user_login(opts)

Login

Initiate a new session. Required for using protected REST APIs.

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::AuthApi.new
opts = {
  inline_object: OpenapiClient::InlineObject.new # InlineObject | 
}

begin
  #Login
  result = api_instance.user_login(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AuthApi->user_login: #{e}"
end
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


## user_logout

> user_logout(opts)

Logout

Destroy session for not using protected REST APIs.

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::AuthApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Logout
  api_instance.user_logout(opts)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AuthApi->user_logout: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

nil (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

