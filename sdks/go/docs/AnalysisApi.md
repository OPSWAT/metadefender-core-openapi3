# \AnalysisApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalysisRules**](AnalysisApi.md#AnalysisRules) | **Get** /file/rules | Fetching Available Analysis Rules
[**FileAnalysisCancel**](AnalysisApi.md#FileAnalysisCancel) | **Post** /file/{data_id}/cancel | Cancel File Analysis
[**FileAnalysisGet**](AnalysisApi.md#FileAnalysisGet) | **Get** /file/{data_id} | Fetch Analysis Result
[**FileAnalysisPost**](AnalysisApi.md#FileAnalysisPost) | **Post** /file | Analyze File
[**SanitizedFile**](AnalysisApi.md#SanitizedFile) | **Get** /file/converted/{data_id} | Download Sanitized Files
[**WebhookStatus**](AnalysisApi.md#WebhookStatus) | **Get** /file/webhook/{data_id} | Query webhook status



## AnalysisRules

> []InlineResponse20010 AnalysisRules(ctx, optional)

Fetching Available Analysis Rules

Retrieve all available rules with their custom configurations. Fetching available processing rules. 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***AnalysisRulesOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a AnalysisRulesOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **optional.String**| The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client&#39;s user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  | 

### Return type

[**[]InlineResponse20010**](inline_response_200_10.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FileAnalysisCancel

> map[string]interface{} FileAnalysisCancel(ctx, dataId, optional)

Cancel File Analysis

When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataId** | **string**|  | 
 **optional** | ***FileAnalysisCancelOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a FileAnalysisCancelOpts struct


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


## FileAnalysisGet

> AnalysisResult FileAnalysisGet(ctx, dataId, optional)

Fetch Analysis Result

Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataId** | **string**|  | 
 **optional** | ***FileAnalysisGetOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a FileAnalysisGetOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**AnalysisResult**](AnalysisResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FileAnalysisPost

> InlineResponse2008 FileAnalysisPost(ctx, optional)

Analyze File

## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
 **optional** | ***FileAnalysisPostOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a FileAnalysisPostOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 
 **filename** | **optional.String**| The name of the submitted file | 
 **filepath** | **optional.String**| if local file scan is enabled the path to the file (see Security rule configuration) | 
 **userAgent** | **optional.String**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | 
 **rule** | **optional.String**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | 
 **workflow** | **optional.String**| name of the selected workflow (deprecated, use \&quot;rule\&quot; header parameter instead) | 
 **batch** | **optional.String**| Batch id to scan with, coming from &#x60;Initiate Batch&#x60; (If it is not given, it will be a single file scan.) | 
 **archivepwd** | **optional.String**| password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd&lt;X&gt;     * X: Could be empty     * When having value, X must be a number &gt;&#x3D; 1   For example:     archivepwd1: \&quot;fox\&quot;     archivepwd2: \&quot;cow\&quot;     archivepwd3: \&quot;bear\&quot;  | 
 **metadata** | **optional.String**| could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  | 
 **callbackurl** | **optional.String**| Client&#39;s URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: &lt;protocol://&gt;&lt;ip | domain&gt;:&lt;port&gt;&lt;/path&gt;   * Example: http://10.0.1.100:8081/listenback  | 
 **body** | **optional.Interface of *os.File****optional.*os.File**|  | 

### Return type

[**InlineResponse2008**](inline_response_200_8.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SanitizedFile

> *os.File SanitizedFile(ctx, dataId, optional)

Download Sanitized Files

Retrieve sanitized file based on the `data_id` 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataId** | **string**| The data_id comes from the result of &#x60;Analyze a file&#x60;. In case of sanitizing the content of an archive, the data_id of contained file can be found in &#x60;Fetch analysis result&#x60;. | 
 **optional** | ***SanitizedFileOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a SanitizedFileOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[***os.File**](*os.File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WebhookStatus

> InlineResponse2009 WebhookStatus(ctx, dataId, optional)

Query webhook status

Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 

### Required Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**dataId** | **string**| Either &#x60;data_id&#x60; or &#x60;batch_id&#x60;. | 
 **optional** | ***WebhookStatusOpts** | optional parameters | nil if no parameters

### Optional Parameters

Optional parameters are passed through a pointer to a WebhookStatusOpts struct


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **apikey** | **optional.String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | 

### Return type

[**InlineResponse2009**](inline_response_200_9.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

