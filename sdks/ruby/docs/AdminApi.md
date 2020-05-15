# OpenapiClient::AdminApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**admin_import**](AdminApi.md#admin_import) | **POST** /admin/import | Import configuration
[**role_create**](AdminApi.md#role_create) | **POST** /admin/role | Create new role
[**user_create**](AdminApi.md#user_create) | **POST** /admin/user | Create user



## admin_import

> InlineResponse2006 admin_import(opts)

Import configuration

Import configuration from file.

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

api_instance = OpenapiClient::AdminApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  body: File.new('/path/to/file') # File | 
}

begin
  #Import configuration
  result = api_instance.admin_import(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AdminApi->admin_import: #{e}"
end
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


## role_create

> NewUserRoleResponse role_create(opts)

Create new role

Add a new user role to the system.

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

api_instance = OpenapiClient::AdminApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  new_user_role_request: OpenapiClient::NewUserRoleRequest.new # NewUserRoleRequest | 
}

begin
  #Create new role
  result = api_instance.role_create(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AdminApi->role_create: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **new_user_role_request** | [**NewUserRoleRequest**](NewUserRoleRequest.md)|  | [optional] 

### Return type

[**NewUserRoleResponse**](NewUserRoleResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## user_create

> UserResponse user_create(opts)

Create user



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

api_instance = OpenapiClient::AdminApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  user_request: OpenapiClient::UserRequest.new # UserRequest | 
}

begin
  #Create user
  result = api_instance.user_create(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AdminApi->user_create: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **user_request** | [**UserRequest**](UserRequest.md)|  | [optional] 

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

