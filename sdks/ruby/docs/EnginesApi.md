# OpenapiClient::EnginesApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engine_disable**](EnginesApi.md#engine_disable) | **POST** /admin/engine/{engineId}/disable | Disable engines
[**engine_enable**](EnginesApi.md#engine_enable) | **POST** /admin/engine/{engineId}/enable | Enable engines
[**engine_pin**](EnginesApi.md#engine_pin) | **POST** /admin/engine/{engineId}/pin | Pin engine to prevent auto-updates
[**engine_unpin**](EnginesApi.md#engine_unpin) | **POST** /admin/engine/{engineId}/unpin | Unpin engine to prevent auto-updates



## engine_disable

> InlineResponse2005 engine_disable(engine_id, opts)

Disable engines

Disable to use the selected engines on the nodes.

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

api_instance = OpenapiClient::EnginesApi.new
engine_id = 'clamav_7_linux' # String | The unique engine identifier
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Disable engines
  result = api_instance.engine_disable(engine_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling EnginesApi->engine_disable: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## engine_enable

> InlineResponse2004 engine_enable(engine_id, opts)

Enable engines

Enable to use the selected engine on the nodes.

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

api_instance = OpenapiClient::EnginesApi.new
engine_id = 'clamav_7_linux' # String | The unique engine identifier
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Enable engines
  result = api_instance.engine_enable(engine_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling EnginesApi->engine_enable: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## engine_pin

> InlineResponse2002 engine_pin(engine_id, opts)

Pin engine to prevent auto-updates

Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.

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

api_instance = OpenapiClient::EnginesApi.new
engine_id = 'clamav_7_linux' # String | The unique engine identifier
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  type: 'engine' # String | Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.)
}

begin
  #Pin engine to prevent auto-updates
  result = api_instance.engine_pin(engine_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling EnginesApi->engine_pin: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **String**| Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## engine_unpin

> InlineResponse2003 engine_unpin(engine_id, opts)

Unpin engine to prevent auto-updates

Unpin engines so automatic updates will be applied on them.

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

api_instance = OpenapiClient::EnginesApi.new
engine_id = 'clamav_7_linux' # String | The unique engine identifier
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  type: 'engine' # String | Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.)
}

begin
  #Unpin engine to prevent auto-updates
  result = api_instance.engine_unpin(engine_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling EnginesApi->engine_unpin: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **String**| Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

