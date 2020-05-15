# AnalysisApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analysisRules**](AnalysisApi.md#analysisRules) | **GET** /file/rules | Fetching Available Analysis Rules
[**fileAnalysisCancel**](AnalysisApi.md#fileAnalysisCancel) | **POST** /file/{data_id}/cancel | Cancel File Analysis
[**fileAnalysisGet**](AnalysisApi.md#fileAnalysisGet) | **GET** /file/{data_id} | Fetch Analysis Result
[**fileAnalysisPost**](AnalysisApi.md#fileAnalysisPost) | **POST** /file | Analyze File
[**sanitizedFile**](AnalysisApi.md#sanitizedFile) | **GET** /file/converted/{data_id} | Download Sanitized Files
[**webhookStatus**](AnalysisApi.md#webhookStatus) | **GET** /file/webhook/{data_id} | Query webhook status


<a name="analysisRules"></a>
# **analysisRules**
> List&lt;InlineResponse20010&gt; analysisRules(userAgent)

Fetching Available Analysis Rules

Retrieve all available rules with their custom configurations. Fetching available processing rules. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String userAgent = "userAgent_example"; // String | The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client's user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html). 
    try {
      List<InlineResponse20010> result = apiInstance.analysisRules(userAgent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#analysisRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userAgent** | **String**| The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client&#39;s user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  | [optional]

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
**200** | Returns the list of available rules. |  -  |
**500** | Unexpected event on server |  -  |

<a name="fileAnalysisCancel"></a>
# **fileAnalysisCancel**
> Object fileAnalysisCancel(dataId, apikey)

Cancel File Analysis

When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String dataId = "dataId_example"; // String | 
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      Object result = apiInstance.fileAnalysisCancel(dataId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#fileAnalysisCancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **String**|  |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

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
**200** | Analysis was successfully cancelled. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="fileAnalysisGet"></a>
# **fileAnalysisGet**
> AnalysisResult fileAnalysisGet(dataId, apikey)

Fetch Analysis Result

Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using &#x60;scan_results.progress_percentage&#x60; value from the response. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String dataId = "dataId_example"; // String | 
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      AnalysisResult result = apiInstance.fileAnalysisGet(dataId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#fileAnalysisGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **String**|  |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

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
**200** | Entire analysis report generated by MetaDefender |  -  |
**500** | Unexpected event on server |  -  |

<a name="fileAnalysisPost"></a>
# **fileAnalysisPost**
> InlineResponse2008 fileAnalysisPost(apikey, filename, filepath, userAgent, rule, workflow, batch, archivepwd, metadata, callbackurl, body)

Analyze File

## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. &gt; _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on &#x60;/file&#x60; API.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    String filename = "filename_example"; // String | The name of the submitted file
    String filepath = "filepath_example"; // String | if local file scan is enabled the path to the file (see Security rule configuration)
    String userAgent = "userAgent_example"; // String | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. 
    String rule = "rule_example"; // String | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
    String workflow = "workflow_example"; // String | name of the selected workflow (deprecated, use \"rule\" header parameter instead)
    String batch = "batch_example"; // String | Batch id to scan with, coming from `Initiate Batch` (If it is not given, it will be a single file scan.)
    String archivepwd = "archivepwd_example"; // String | password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd<X>     * X: Could be empty     * When having value, X must be a number >= 1   For example:     archivepwd1: \"fox\"     archivepwd2: \"cow\"     archivepwd3: \"bear\" 
    String metadata = "metadata_example"; // String | could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result). 
    URI callbackurl = http://10.0.1.100:8081/listenback; // URI | Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: <protocol://><ip | domain>:<port></path>   * Example: http://10.0.1.100:8081/listenback 
    File body = new File("/path/to/file"); // File | 
    try {
      InlineResponse2008 result = apiInstance.fileAnalysisPost(apikey, filename, filepath, userAgent, rule, workflow, batch, archivepwd, metadata, callbackurl, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#fileAnalysisPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]
 **filename** | **String**| The name of the submitted file | [optional]
 **filepath** | **String**| if local file scan is enabled the path to the file (see Security rule configuration) | [optional]
 **userAgent** | **String**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional]
 **rule** | **String**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional]
 **workflow** | **String**| name of the selected workflow (deprecated, use \&quot;rule\&quot; header parameter instead) | [optional]
 **batch** | **String**| Batch id to scan with, coming from &#x60;Initiate Batch&#x60; (If it is not given, it will be a single file scan.) | [optional]
 **archivepwd** | **String**| password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd&lt;X&gt;     * X: Could be empty     * When having value, X must be a number &gt;&#x3D; 1   For example:     archivepwd1: \&quot;fox\&quot;     archivepwd2: \&quot;cow\&quot;     archivepwd3: \&quot;bear\&quot;  | [optional]
 **metadata** | **String**| could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  | [optional]
 **callbackurl** | **URI**| Client&#39;s URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: &lt;protocol://&gt;&lt;ip | domain&gt;:&lt;port&gt;&lt;/path&gt;   * Example: http://10.0.1.100:8081/listenback  | [optional]
 **body** | **File**|  | [optional]

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
**200** | Successful file submission |  -  |
**400** | Callbackurl and/or apikey is invalid. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**411** | Content-Length header is missing from the request. |  -  |
**422** | Body input is empty. |  -  |
**500** | Unexpected event on server |  -  |
**503** | Server is too busy, scan queue is full. Try again later. |  -  |

<a name="sanitizedFile"></a>
# **sanitizedFile**
> File sanitizedFile(dataId, apikey)

Download Sanitized Files

Retrieve sanitized file based on the &#x60;data_id&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String dataId = 8101abae27be4d63859c55d9e0ed0135; // String | The data_id comes from the result of `Analyze a file`. In case of sanitizing the content of an archive, the data_id of contained file can be found in `Fetch analysis result`.
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      File result = apiInstance.sanitizedFile(dataId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#sanitizedFile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **String**| The data_id comes from the result of &#x60;Analyze a file&#x60;. In case of sanitizing the content of an archive, the data_id of contained file can be found in &#x60;Fetch analysis result&#x60;. |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the sanitized content. |  -  |
**404** | Requests resource was not found. |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

<a name="webhookStatus"></a>
# **webhookStatus**
> InlineResponse2009 webhookStatus(dataId, apikey)

Query webhook status

Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AnalysisApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8008");

    AnalysisApi apiInstance = new AnalysisApi(defaultClient);
    String dataId = "dataId_example"; // String | Either `data_id` or `batch_id`.
    String apikey = "apikey_example"; // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
    try {
      InlineResponse2009 result = apiInstance.webhookStatus(dataId, apikey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisApi#webhookStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataId** | **String**| Either &#x60;data_id&#x60; or &#x60;batch_id&#x60;. |
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional]

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
**200** | Webhooks status is fetched successfully. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

