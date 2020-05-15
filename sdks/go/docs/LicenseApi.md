# \LicenseApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LicenseActivation**](LicenseApi.md#LicenseActivation) | **Post** /admin/license/activation | Activate license
[**LicenseGet**](LicenseApi.md#LicenseGet) | **Get** /admin/license | Get Current License Information
[**LicenseUpload**](LicenseApi.md#LicenseUpload) | **Post** /admin/license | Upload license key



## LicenseActivation

> LicenseActivation(ctx, optional)

Activate license

This API initiates an online activation of the deployment.  In case of error, check the application logs for more details.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***LicenseActivationOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a LicenseActivationOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **uNKNOWNBASETYPE** | [**optional.Interface of UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LicenseGet

> LicenseInformation LicenseGet(ctx, optional)

Get Current License Information

Fetch all details about the licensing status of the product.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***LicenseGetOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a LicenseGetOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**LicenseInformation**](LicenseInformation.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## LicenseUpload

> LicenseUpload(ctx, optional)

Upload license key

Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key=%activation_key%&deployment=%deployment_unique_ID%&quantity=%quantity%  Deployment unique ID can be fetched via Get Current License Information API.      

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***LicenseUploadOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a LicenseUploadOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **body** | **optional.String**|  | 

### Return type

 (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

