# openapi_client.AnalysisApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analysis_rules**](AnalysisApi.md#analysis_rules) | **GET** /file/rules | Fetching Available Analysis Rules
[**file_analysis_cancel**](AnalysisApi.md#file_analysis_cancel) | **POST** /file/{data_id}/cancel | Cancel File Analysis
[**file_analysis_get**](AnalysisApi.md#file_analysis_get) | **GET** /file/{data_id} | Fetch Analysis Result
[**file_analysis_post**](AnalysisApi.md#file_analysis_post) | **POST** /file | Analyze File
[**sanitized_file**](AnalysisApi.md#sanitized_file) | **GET** /file/converted/{data_id} | Download Sanitized Files
[**webhook_status**](AnalysisApi.md#webhook_status) | **GET** /file/webhook/{data_id} | Query webhook status


# **analysis_rules**
> list[InlineResponse20010] analysis_rules(user_agent=user_agent)

Fetching Available Analysis Rules

Retrieve all available rules with their custom configurations. Fetching available processing rules. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AnalysisApi(api_client)
    user_agent = 'user_agent_example' # str | The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client's user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  (optional)

    try:
        # Fetching Available Analysis Rules
        api_response = api_instance.analysis_rules(user_agent=user_agent)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AnalysisApi->analysis_rules: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_agent** | **str**| The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client&#39;s user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  | [optional] 

### Return type

[**list[InlineResponse20010]**](InlineResponse20010.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **file_analysis_cancel**
> object file_analysis_cancel(data_id, apikey=apikey)

Cancel File Analysis

When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AnalysisApi(api_client)
    data_id = 'data_id_example' # str | 
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Cancel File Analysis
        api_response = api_instance.file_analysis_cancel(data_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AnalysisApi->file_analysis_cancel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **str**|  | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**object**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **file_analysis_get**
> AnalysisResult file_analysis_get(data_id, apikey=apikey)

Fetch Analysis Result

Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AnalysisApi(api_client)
    data_id = 'data_id_example' # str | 
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Fetch Analysis Result
        api_response = api_instance.file_analysis_get(data_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AnalysisApi->file_analysis_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **str**|  | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **file_analysis_post**
> InlineResponse2008 file_analysis_post(apikey=apikey, filename=filename, filepath=filepath, user_agent=user_agent, rule=rule, workflow=workflow, batch=batch, archivepwd=archivepwd, metadata=metadata, callbackurl=callbackurl, body=body)

Analyze File

## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AnalysisApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
filename = 'filename_example' # str | The name of the submitted file (optional)
filepath = 'filepath_example' # str | if local file scan is enabled the path to the file (see Security rule configuration) (optional)
user_agent = 'user_agent_example' # str | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.  (optional)
rule = 'rule_example' # str | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        (optional)
workflow = 'workflow_example' # str | name of the selected workflow (deprecated, use \"rule\" header parameter instead) (optional)
batch = 'batch_example' # str | Batch id to scan with, coming from `Initiate Batch` (If it is not given, it will be a single file scan.) (optional)
archivepwd = 'archivepwd_example' # str | password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd<X>     * X: Could be empty     * When having value, X must be a number >= 1   For example:     archivepwd1: \"fox\"     archivepwd2: \"cow\"     archivepwd3: \"bear\"  (optional)
metadata = 'metadata_example' # str | could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  (optional)
callbackurl = 'http://10.0.1.100:8081/listenback' # str | Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: <protocol://><ip | domain>:<port></path>   * Example: http://10.0.1.100:8081/listenback  (optional)
body = '/path/to/file' # file |  (optional)

    try:
        # Analyze File
        api_response = api_instance.file_analysis_post(apikey=apikey, filename=filename, filepath=filepath, user_agent=user_agent, rule=rule, workflow=workflow, batch=batch, archivepwd=archivepwd, metadata=metadata, callbackurl=callbackurl, body=body)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AnalysisApi->file_analysis_post: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **filename** | **str**| The name of the submitted file | [optional] 
 **filepath** | **str**| if local file scan is enabled the path to the file (see Security rule configuration) | [optional] 
 **user_agent** | **str**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **rule** | **str**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **workflow** | **str**| name of the selected workflow (deprecated, use \&quot;rule\&quot; header parameter instead) | [optional] 
 **batch** | **str**| Batch id to scan with, coming from &#x60;Initiate Batch&#x60; (If it is not given, it will be a single file scan.) | [optional] 
 **archivepwd** | **str**| password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd&lt;X&gt;     * X: Could be empty     * When having value, X must be a number &gt;&#x3D; 1   For example:     archivepwd1: \&quot;fox\&quot;     archivepwd2: \&quot;cow\&quot;     archivepwd3: \&quot;bear\&quot;  | [optional] 
 **metadata** | **str**| could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  | [optional] 
 **callbackurl** | **str**| Client&#39;s URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: &lt;protocol://&gt;&lt;ip | domain&gt;:&lt;port&gt;&lt;/path&gt;   * Example: http://10.0.1.100:8081/listenback  | [optional] 
 **body** | **file**|  | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sanitized_file**
> file sanitized_file(data_id, apikey=apikey)

Download Sanitized Files

Retrieve sanitized file based on the `data_id` 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AnalysisApi(api_client)
    data_id = '8101abae27be4d63859c55d9e0ed0135' # str | The data_id comes from the result of `Analyze a file`. In case of sanitizing the content of an archive, the data_id of contained file can be found in `Fetch analysis result`.
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Download Sanitized Files
        api_response = api_instance.sanitized_file(data_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AnalysisApi->sanitized_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **str**| The data_id comes from the result of &#x60;Analyze a file&#x60;. In case of sanitizing the content of an archive, the data_id of contained file can be found in &#x60;Fetch analysis result&#x60;. | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**file**

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **webhook_status**
> InlineResponse2009 webhook_status(data_id, apikey=apikey)

Query webhook status

Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AnalysisApi(api_client)
    data_id = 'data_id_example' # str | Either `data_id` or `batch_id`.
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Query webhook status
        api_response = api_instance.webhook_status(data_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling AnalysisApi->webhook_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **str**| Either &#x60;data_id&#x60; or &#x60;batch_id&#x60;. | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

