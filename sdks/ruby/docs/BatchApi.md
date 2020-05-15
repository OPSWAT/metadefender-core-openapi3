# OpenapiClient::BatchApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_cancel**](BatchApi.md#batch_cancel) | **POST** /file/{batchId}/cancel | Cancel Batch
[**batch_close**](BatchApi.md#batch_close) | **POST** /file/batch/{batchId}/close | Close Batch
[**batch_create**](BatchApi.md#batch_create) | **POST** /file/batch | Initiate Batch
[**batch_signed_result**](BatchApi.md#batch_signed_result) | **GET** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**batch_status**](BatchApi.md#batch_status) | **GET** /file/batch/{batchId} | Status of Batch Analysis



## batch_cancel

> Object batch_cancel(batch_id, opts)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::BatchApi.new
batch_id = 'batch_id_example' # String | The batch identifier used to submit files in the batch and to close the batch.
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Cancel Batch
  result = api_instance.batch_cancel(batch_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling BatchApi->batch_cancel: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## batch_close

> BatchResponse batch_close(batch_id, opts)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.      

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::BatchApi.new
batch_id = 'batch_id_example' # String | The batch identifier used to submit files in the batch and to close the batch.
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Close Batch
  result = api_instance.batch_close(batch_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling BatchApi->batch_close: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## batch_create

> BatchId batch_create(opts)

Initiate Batch

Create a new batch and retrieve the batch_id

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::BatchApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  rule: 'rule_example', # String | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
  user_agent: 'user_agent_example', # String | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. 
  user_data: 'user_data_example' # String | Additional custom information (max 1024 bytes, URL encoded UTF-8 string)       
}

begin
  #Initiate Batch
  result = api_instance.batch_create(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling BatchApi->batch_create: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **rule** | **String**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **user_agent** | **String**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **user_data** | **String**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        | [optional] 

### Return type

[**BatchId**](BatchId.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## batch_signed_result

> batch_signed_result(batch_id, opts)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::BatchApi.new
batch_id = 'batch_id_example' # String | The batch identifier used to submit files in the batch and to close the batch.
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Download Signed Batch Result
  api_instance.batch_signed_result(batch_id, opts)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling BatchApi->batch_signed_result: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


## batch_status

> BatchResponse batch_status(batch_id, opts)

Status of Batch Analysis

Retrieve status report for the entire batch

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::BatchApi.new
batch_id = 'batch_id_example' # String | The batch identifier used to submit files in the batch and to close the batch.
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Status of Batch Analysis
  result = api_instance.batch_status(batch_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling BatchApi->batch_status: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

