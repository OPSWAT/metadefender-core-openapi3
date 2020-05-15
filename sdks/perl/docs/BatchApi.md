# WWW::OpenAPIClient::BatchApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::BatchApi;
```

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_cancel**](BatchApi.md#batch_cancel) | **POST** /file/{batchId}/cancel | Cancel Batch
[**batch_close**](BatchApi.md#batch_close) | **POST** /file/batch/{batchId}/close | Close Batch
[**batch_create**](BatchApi.md#batch_create) | **POST** /file/batch | Initiate Batch
[**batch_signed_result**](BatchApi.md#batch_signed_result) | **GET** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**batch_status**](BatchApi.md#batch_status) | **GET** /file/batch/{batchId} | Status of Batch Analysis


# **batch_cancel**
> object batch_cancel(batch_id => $batch_id, apikey => $apikey)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(
);

my $batch_id = "batch_id_example"; # string | The batch identifier used to submit files in the batch and to close the batch.
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->batch_cancel(batch_id => $batch_id, apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->batch_cancel: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_close**
> BatchResponse batch_close(batch_id => $batch_id, apikey => $apikey)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.      

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(
);

my $batch_id = "batch_id_example"; # string | The batch identifier used to submit files in the batch and to close the batch.
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->batch_close(batch_id => $batch_id, apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->batch_close: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_create**
> BatchId batch_create(apikey => $apikey, rule => $rule, user_agent => $user_agent, user_data => $user_data)

Initiate Batch

Create a new batch and retrieve the batch_id

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $rule = "rule_example"; # string | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
my $user_agent = "user_agent_example"; # string | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. 
my $user_data = "user_data_example"; # string | Additional custom information (max 1024 bytes, URL encoded UTF-8 string)       

eval { 
    my $result = $api_instance->batch_create(apikey => $apikey, rule => $rule, user_agent => $user_agent, user_data => $user_data);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->batch_create: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **rule** | **string**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **user_agent** | **string**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **user_data** | **string**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        | [optional] 

### Return type

[**BatchId**](BatchId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_signed_result**
> batch_signed_result(batch_id => $batch_id, apikey => $apikey)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(
);

my $batch_id = "batch_id_example"; # string | The batch identifier used to submit files in the batch and to close the batch.
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    $api_instance->batch_signed_result(batch_id => $batch_id, apikey => $apikey);
};
if ($@) {
    warn "Exception when calling BatchApi->batch_signed_result: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_status**
> BatchResponse batch_status(batch_id => $batch_id, apikey => $apikey)

Status of Batch Analysis

Retrieve status report for the entire batch

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::BatchApi;
my $api_instance = WWW::OpenAPIClient::BatchApi->new(
);

my $batch_id = "batch_id_example"; # string | The batch identifier used to submit files in the batch and to close the batch.
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->batch_status(batch_id => $batch_id, apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling BatchApi->batch_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

