# \BatchApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BatchCancel**](BatchApi.md#BatchCancel) | **Post** /file/{batchId}/cancel | Cancel Batch
[**BatchClose**](BatchApi.md#BatchClose) | **Post** /file/batch/{batchId}/close | Close Batch
[**BatchCreate**](BatchApi.md#BatchCreate) | **Post** /file/batch | Initiate Batch
[**BatchSignedResult**](BatchApi.md#BatchSignedResult) | **Get** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**BatchStatus**](BatchApi.md#BatchStatus) | **Get** /file/batch/{batchId} | Status of Batch Analysis



## BatchCancel

> map[string]interface{} BatchCancel(ctx, batchId, optional)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **optional** | ***BatchCancelOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BatchCancelOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

**map[string]interface{}**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchClose

> BatchResponse BatchClose(ctx, batchId, optional)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.      

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **optional** | ***BatchCloseOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BatchCloseOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchCreate

> BatchId BatchCreate(ctx, optional)

Initiate Batch

Create a new batch and retrieve the batch_id

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***BatchCreateOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BatchCreateOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **rule** | **optional.String**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | 
 **userAgent** | **optional.String**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | 
 **userData** | **optional.String**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        | 

### Return type

[**BatchId**](BatchId.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchSignedResult

> BatchSignedResult(ctx, batchId, optional)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **optional** | ***BatchSignedResultOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BatchSignedResultOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## BatchStatus

> BatchResponse BatchStatus(ctx, batchId, optional)

Status of Batch Analysis

Retrieve status report for the entire batch

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**batchId** | **string**| The batch identifier used to submit files in the batch and to close the batch. | 
 **optional** | ***BatchStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a BatchStatusOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

