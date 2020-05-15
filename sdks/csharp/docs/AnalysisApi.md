# Org.OpenAPITools.Api.AnalysisApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalysisRules**](AnalysisApi.md#analysisrules) | **GET** /file/rules | Fetching Available Analysis Rules
[**FileAnalysisCancel**](AnalysisApi.md#fileanalysiscancel) | **POST** /file/{data_id}/cancel | Cancel File Analysis
[**FileAnalysisGet**](AnalysisApi.md#fileanalysisget) | **GET** /file/{data_id} | Fetch Analysis Result
[**FileAnalysisPost**](AnalysisApi.md#fileanalysispost) | **POST** /file | Analyze File
[**SanitizedFile**](AnalysisApi.md#sanitizedfile) | **GET** /file/converted/{data_id} | Download Sanitized Files
[**WebhookStatus**](AnalysisApi.md#webhookstatus) | **GET** /file/webhook/{data_id} | Query webhook status



## AnalysisRules

> List&lt;InlineResponse20010&gt; AnalysisRules (string userAgent = null)

Fetching Available Analysis Rules

Retrieve all available rules with their custom configurations. Fetching available processing rules. 

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AnalysisRulesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new AnalysisApi(Configuration.Default);
            var userAgent = userAgent_example;  // string | The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client's user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  (optional) 

            try
            {
                // Fetching Available Analysis Rules
                List<InlineResponse20010> result = apiInstance.AnalysisRules(userAgent);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AnalysisApi.AnalysisRules: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **string**| The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client&#39;s user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  | [optional] 

### Return type

[**List&lt;InlineResponse20010&gt;**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the list of available rules. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FileAnalysisCancel

> Object FileAnalysisCancel (string dataId, string apikey = null)

Cancel File Analysis

When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FileAnalysisCancelExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new AnalysisApi(Configuration.Default);
            var dataId = dataId_example;  // string | 
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Cancel File Analysis
                Object result = apiInstance.FileAnalysisCancel(dataId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AnalysisApi.FileAnalysisCancel: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **string**|  | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Analysis was successfully cancelled. |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **404** | Requests resource was not found. |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FileAnalysisGet

> AnalysisResult FileAnalysisGet (string dataId, string apikey = null)

Fetch Analysis Result

Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. 

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FileAnalysisGetExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new AnalysisApi(Configuration.Default);
            var dataId = dataId_example;  // string | 
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Fetch Analysis Result
                AnalysisResult result = apiInstance.FileAnalysisGet(dataId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AnalysisApi.FileAnalysisGet: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **string**|  | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**AnalysisResult**](AnalysisResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entire analysis report generated by MetaDefender |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FileAnalysisPost

> InlineResponse2008 FileAnalysisPost (string apikey = null, string filename = null, string filepath = null, string userAgent = null, string rule = null, string workflow = null, string batch = null, string archivepwd = null, string metadata = null, string callbackurl = null, System.IO.Stream body = null)

Analyze File

## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class FileAnalysisPostExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new AnalysisApi(Configuration.Default);
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 
            var filename = filename_example;  // string | The name of the submitted file (optional) 
            var filepath = filepath_example;  // string | if local file scan is enabled the path to the file (see Security rule configuration) (optional) 
            var userAgent = userAgent_example;  // string | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.  (optional) 
            var rule = rule_example;  // string | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        (optional) 
            var workflow = workflow_example;  // string | name of the selected workflow (deprecated, use \"rule\" header parameter instead) (optional) 
            var batch = batch_example;  // string | Batch id to scan with, coming from `Initiate Batch` (If it is not given, it will be a single file scan.) (optional) 
            var archivepwd = archivepwd_example;  // string | password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd<X>     * X: Could be empty     * When having value, X must be a number >= 1   For example:     archivepwd1: \"fox\"     archivepwd2: \"cow\"     archivepwd3: \"bear\"  (optional) 
            var metadata = metadata_example;  // string | could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  (optional) 
            var callbackurl = http://10.0.1.100:8081/listenback;  // string | Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: <protocol://><ip | domain>:<port></path>   * Example: http://10.0.1.100:8081/listenback  (optional) 
            var body = BINARY_DATA_HERE;  // System.IO.Stream |  (optional) 

            try
            {
                // Analyze File
                InlineResponse2008 result = apiInstance.FileAnalysisPost(apikey, filename, filepath, userAgent, rule, workflow, batch, archivepwd, metadata, callbackurl, body);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AnalysisApi.FileAnalysisPost: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **filename** | **string**| The name of the submitted file | [optional] 
 **filepath** | **string**| if local file scan is enabled the path to the file (see Security rule configuration) | [optional] 
 **userAgent** | **string**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **rule** | **string**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **workflow** | **string**| name of the selected workflow (deprecated, use \&quot;rule\&quot; header parameter instead) | [optional] 
 **batch** | **string**| Batch id to scan with, coming from &#x60;Initiate Batch&#x60; (If it is not given, it will be a single file scan.) | [optional] 
 **archivepwd** | **string**| password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd&lt;X&gt;     * X: Could be empty     * When having value, X must be a number &gt;&#x3D; 1   For example:     archivepwd1: \&quot;fox\&quot;     archivepwd2: \&quot;cow\&quot;     archivepwd3: \&quot;bear\&quot;  | [optional] 
 **metadata** | **string**| could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  | [optional] 
 **callbackurl** | **string**| Client&#39;s URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: &lt;protocol://&gt;&lt;ip | domain&gt;:&lt;port&gt;&lt;/path&gt;   * Example: http://10.0.1.100:8081/listenback  | [optional] 
 **body** | **System.IO.Stream**|  | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful file submission |  -  |
| **400** | Callbackurl and/or apikey is invalid. |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **411** | Content-Length header is missing from the request. |  -  |
| **422** | Body input is empty. |  -  |
| **500** | Unexpected event on server |  -  |
| **503** | Server is too busy, scan queue is full. Try again later. |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SanitizedFile

> System.IO.Stream SanitizedFile (string dataId, string apikey = null)

Download Sanitized Files

Retrieve sanitized file based on the `data_id` 

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SanitizedFileExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new AnalysisApi(Configuration.Default);
            var dataId = 8101abae27be4d63859c55d9e0ed0135;  // string | The data_id comes from the result of `Analyze a file`. In case of sanitizing the content of an archive, the data_id of contained file can be found in `Fetch analysis result`.
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Download Sanitized Files
                System.IO.Stream result = apiInstance.SanitizedFile(dataId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AnalysisApi.SanitizedFile: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **string**| The data_id comes from the result of &#x60;Analyze a file&#x60;. In case of sanitizing the content of an archive, the data_id of contained file can be found in &#x60;Fetch analysis result&#x60;. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**System.IO.Stream**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the sanitized content. |  -  |
| **404** | Requests resource was not found. |  -  |
| **405** | The user has no rights for this operation. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## WebhookStatus

> InlineResponse2009 WebhookStatus (string dataId, string apikey = null)

Query webhook status

Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class WebhookStatusExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost:8008";
            var apiInstance = new AnalysisApi(Configuration.Default);
            var dataId = dataId_example;  // string | Either `data_id` or `batch_id`.
            var apikey = apikey_example;  // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional) 

            try
            {
                // Query webhook status
                InlineResponse2009 result = apiInstance.WebhookStatus(dataId, apikey);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AnalysisApi.WebhookStatus: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **string**| Either &#x60;data_id&#x60; or &#x60;batch_id&#x60;. | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Webhooks status is fetched successfully. |  -  |
| **400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
| **403** | Invalid user information or Not Allowed |  -  |
| **404** | Requests resource was not found. |  -  |
| **500** | Unexpected event on server |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

