# \YaraApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**YaraPackageGenerate**](YaraApi.md#YaraPackageGenerate) | **Put** /yara/generate | Generate Yara package
[**YaraPackageStatus**](YaraApi.md#YaraPackageStatus) | **Get** /yara/package | Yara Generation Status
[**YaraSourcesGet**](YaraApi.md#YaraSourcesGet) | **Get** /admin/config/yara/sources | Get Yara sources
[**YaraSourcesPut**](YaraApi.md#YaraSourcesPut) | **Put** /admin/config/yara/sources | Modify Yara sources



## YaraPackageGenerate

> InlineResponse2007 YaraPackageGenerate(ctx, optional)

Generate Yara package

Generate a new package based on the new added sources.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***YaraPackageGenerateOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a YaraPackageGenerateOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**InlineResponse2007**](inline_response_200_7.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## YaraPackageStatus

> InlineResponse2007 YaraPackageStatus(ctx, optional)

Yara Generation Status

Get status of Yara package generation.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***YaraPackageStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a YaraPackageStatusOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**InlineResponse2007**](inline_response_200_7.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## YaraSourcesGet

> YaraSourcesObject YaraSourcesGet(ctx, optional)

Get Yara sources

Retrieve a list of all sources for the Yara Engine.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***YaraSourcesGetOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a YaraSourcesGetOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## YaraSourcesPut

> YaraSourcesObject YaraSourcesPut(ctx, optional)

Modify Yara sources

Modify one (or more) of the sources for the Yara Engine.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***YaraSourcesPutOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a YaraSourcesPutOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **yaraSourcesObject** | [**optional.Interface of YaraSourcesObject**](YaraSourcesObject.md)| A list of Yara Engine sources. | 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

