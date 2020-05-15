# \ConfigApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConfigAuditLog**](ConfigApi.md#ConfigAuditLog) | **Put** /admin/config/auditlog | Audit clean up
[**ConfigGetSkipHash**](ConfigApi.md#ConfigGetSkipHash) | **Get** /admin/config/skip | Get &#39;skip by hash&#39; list
[**ConfigQuarantine**](ConfigApi.md#ConfigQuarantine) | **Put** /admin/config/quarantine | Quarantine clean up
[**ConfigSanitizedRepo**](ConfigApi.md#ConfigSanitizedRepo) | **Put** /admin/config/sanitize | Sanitized files clean up
[**ConfigScanHistory**](ConfigApi.md#ConfigScanHistory) | **Put** /admin/config/scanhistory | Processing history clean up
[**ConfigSession**](ConfigApi.md#ConfigSession) | **Put** /admin/config/session | Session settings
[**ConfigUpdate**](ConfigApi.md#ConfigUpdate) | **Put** /admin/config/update | Modules Update Source and Frequency
[**ConfigUpdateSkipHash**](ConfigApi.md#ConfigUpdateSkipHash) | **Put** /admin/config/skip | Modify &#39;skip by hash&#39; list
[**ConfigUpdateWebhook**](ConfigApi.md#ConfigUpdateWebhook) | **Put** /admin/config/webhook | Webhook set configuration
[**ConfigWebhook**](ConfigApi.md#ConfigWebhook) | **Get** /admin/config/webhook | Webhook get configuration



## ConfigAuditLog

> InlineResponse200 ConfigAuditLog(ctx, optional)

Audit clean up

Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigAuditLogOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigAuditLogOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **uNKNOWNBASETYPE** | [**optional.Interface of UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigGetSkipHash

> SkipList ConfigGetSkipHash(ctx, optional)

Get 'skip by hash' list

Get the list of hashes whitelisted or blacklisted.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigGetSkipHashOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigGetSkipHashOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigQuarantine

> InlineResponse200 ConfigQuarantine(ctx, optional)

Quarantine clean up

Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigQuarantineOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigQuarantineOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **uNKNOWNBASETYPE** | [**optional.Interface of UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigSanitizedRepo

> InlineResponse2001 ConfigSanitizedRepo(ctx, optional)

Sanitized files clean up

Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigSanitizedRepoOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigSanitizedRepoOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **inlineObject1** | [**optional.Interface of InlineObject1**](InlineObject1.md)|  | 

### Return type

[**InlineResponse2001**](inline_response_200_1.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigScanHistory

> InlineResponse200 ConfigScanHistory(ctx, optional)

Processing history clean up

Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigScanHistoryOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigScanHistoryOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **uNKNOWNBASETYPE** | [**optional.Interface of UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigSession

> AdminConfigSession ConfigSession(ctx, optional)

Session settings

Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigSessionOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigSessionOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **adminConfigSession** | [**optional.Interface of AdminConfigSession**](AdminConfigSession.md)|  | 

### Return type

[**AdminConfigSession**](AdminConfigSession.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigUpdate

> AdminConfigUpdate ConfigUpdate(ctx, optional)

Modules Update Source and Frequency

Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigUpdateOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigUpdateOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **adminConfigUpdate** | [**optional.Interface of AdminConfigUpdate**](AdminConfigUpdate.md)|  | 

### Return type

[**AdminConfigUpdate**](AdminConfigUpdate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigUpdateSkipHash

> SkipList ConfigUpdateSkipHash(ctx, optional)

Modify 'skip by hash' list

Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigUpdateSkipHashOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigUpdateSkipHashOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **skipList** | [**optional.Interface of SkipList**](SkipList.md)| A list of all skip/white/black-listed hashes. | 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigUpdateWebhook

> AdminConfigWebhook ConfigUpdateWebhook(ctx, optional)

Webhook set configuration

Modifying settings supported for webhook mode 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigUpdateWebhookOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigUpdateWebhookOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **adminConfigWebhook** | [**optional.Interface of AdminConfigWebhook**](AdminConfigWebhook.md)|  | 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ConfigWebhook

> AdminConfigWebhook ConfigWebhook(ctx, optional)

Webhook get configuration

Getting settings supported for webhook mode 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***ConfigWebhookOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a ConfigWebhookOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

