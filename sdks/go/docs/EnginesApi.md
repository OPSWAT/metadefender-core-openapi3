# \EnginesApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EngineDisable**](EnginesApi.md#EngineDisable) | **Post** /admin/engine/{engineId}/disable | Disable engines
[**EngineEnable**](EnginesApi.md#EngineEnable) | **Post** /admin/engine/{engineId}/enable | Enable engines
[**EnginePin**](EnginesApi.md#EnginePin) | **Post** /admin/engine/{engineId}/pin | Pin engine to prevent auto-updates
[**EngineUnpin**](EnginesApi.md#EngineUnpin) | **Post** /admin/engine/{engineId}/unpin | Unpin engine to prevent auto-updates



## EngineDisable

> InlineResponse2005 EngineDisable(ctx, engineId, optional)

Disable engines

Disable to use the selected engines on the nodes.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**engineId** | **string**| The unique engine identifier | 
 **optional** | ***EngineDisableOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a EngineDisableOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**InlineResponse2005**](inline_response_200_5.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EngineEnable

> InlineResponse2004 EngineEnable(ctx, engineId, optional)

Enable engines

Enable to use the selected engine on the nodes.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**engineId** | **string**| The unique engine identifier | 
 **optional** | ***EngineEnableOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a EngineEnableOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**InlineResponse2004**](inline_response_200_4.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EnginePin

> InlineResponse2002 EnginePin(ctx, engineId, optional)

Pin engine to prevent auto-updates

Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**engineId** | **string**| The unique engine identifier | 
 **optional** | ***EnginePinOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a EnginePinOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **type_** | **optional.String**| Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) | 

### Return type

[**InlineResponse2002**](inline_response_200_2.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## EngineUnpin

> InlineResponse2003 EngineUnpin(ctx, engineId, optional)

Unpin engine to prevent auto-updates

Unpin engines so automatic updates will be applied on them.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**engineId** | **string**| The unique engine identifier | 
 **optional** | ***EngineUnpinOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a EngineUnpinOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **type_** | **optional.String**| Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) | 

### Return type

[**InlineResponse2003**](inline_response_200_3.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

