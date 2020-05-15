# OpenapiClient::StatsApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engines_status**](StatsApi.md#engines_status) | **GET** /stat/engines | Engines Status
[**nodes_status**](StatsApi.md#nodes_status) | **GET** /stat/nodes | Nodes Status
[**product_version**](StatsApi.md#product_version) | **GET** /version | Get Product Version



## engines_status

> Array&lt;InlineResponse20012&gt; engines_status(opts)

Engines Status

The response is an array of engines with database information.

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::StatsApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Engines Status
  result = api_instance.engines_status(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling StatsApi->engines_status: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**Array&lt;InlineResponse20012&gt;**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## nodes_status

> Array&lt;InlineResponse20013&gt; nodes_status(opts)

Nodes Status

Get a list of all connected nodes and their status.

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::StatsApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Nodes Status
  result = api_instance.nodes_status(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling StatsApi->nodes_status: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**Array&lt;InlineResponse20013&gt;**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## product_version

> InlineResponse20011 product_version(opts)

Get Product Version

Fetch details about the product version.

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::StatsApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Get Product Version
  result = api_instance.product_version(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling StatsApi->product_version: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

