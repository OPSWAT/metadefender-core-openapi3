# OpenapiClient::YaraApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**yara_package_generate**](YaraApi.md#yara_package_generate) | **PUT** /yara/generate | Generate Yara package
[**yara_package_status**](YaraApi.md#yara_package_status) | **GET** /yara/package | Yara Generation Status
[**yara_sources_get**](YaraApi.md#yara_sources_get) | **GET** /admin/config/yara/sources | Get Yara sources
[**yara_sources_put**](YaraApi.md#yara_sources_put) | **PUT** /admin/config/yara/sources | Modify Yara sources



## yara_package_generate

> InlineResponse2007 yara_package_generate(opts)

Generate Yara package

Generate a new package based on the new added sources.

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

api_instance = OpenapiClient::YaraApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Generate Yara package
  result = api_instance.yara_package_generate(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling YaraApi->yara_package_generate: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## yara_package_status

> InlineResponse2007 yara_package_status(opts)

Yara Generation Status

Get status of Yara package generation.

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

api_instance = OpenapiClient::YaraApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Yara Generation Status
  result = api_instance.yara_package_status(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling YaraApi->yara_package_status: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## yara_sources_get

> YaraSourcesObject yara_sources_get(opts)

Get Yara sources

Retrieve a list of all sources for the Yara Engine.

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

api_instance = OpenapiClient::YaraApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Get Yara sources
  result = api_instance.yara_sources_get(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling YaraApi->yara_sources_get: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## yara_sources_put

> YaraSourcesObject yara_sources_put(opts)

Modify Yara sources

Modify one (or more) of the sources for the Yara Engine.

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

api_instance = OpenapiClient::YaraApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  yara_sources_object: OpenapiClient::YaraSourcesObject.new # YaraSourcesObject | A list of Yara Engine sources.
}

begin
  #Modify Yara sources
  result = api_instance.yara_sources_put(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling YaraApi->yara_sources_put: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **yara_sources_object** | [**YaraSourcesObject**](YaraSourcesObject.md)| A list of Yara Engine sources. | [optional] 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

