# OpenapiClient::AnalysisApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analysis_rules**](AnalysisApi.md#analysis_rules) | **GET** /file/rules | Fetching Available Analysis Rules
[**file_analysis_cancel**](AnalysisApi.md#file_analysis_cancel) | **POST** /file/{data_id}/cancel | Cancel File Analysis
[**file_analysis_get**](AnalysisApi.md#file_analysis_get) | **GET** /file/{data_id} | Fetch Analysis Result
[**file_analysis_post**](AnalysisApi.md#file_analysis_post) | **POST** /file | Analyze File
[**sanitized_file**](AnalysisApi.md#sanitized_file) | **GET** /file/converted/{data_id} | Download Sanitized Files
[**webhook_status**](AnalysisApi.md#webhook_status) | **GET** /file/webhook/{data_id} | Query webhook status



## analysis_rules

> Array&lt;InlineResponse20010&gt; analysis_rules(opts)

Fetching Available Analysis Rules

Retrieve all available rules with their custom configurations. Fetching available processing rules. 

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::AnalysisApi.new
opts = {
  user_agent: 'user_agent_example' # String | The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client's user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html). 
}

begin
  #Fetching Available Analysis Rules
  result = api_instance.analysis_rules(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AnalysisApi->analysis_rules: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_agent** | **String**| The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client&#39;s user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  | [optional] 

### Return type

[**Array&lt;InlineResponse20010&gt;**](InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## file_analysis_cancel

> Object file_analysis_cancel(data_id, opts)

Cancel File Analysis

When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::AnalysisApi.new
data_id = 'data_id_example' # String | 
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Cancel File Analysis
  result = api_instance.file_analysis_cancel(data_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AnalysisApi->file_analysis_cancel: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **String**|  | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## file_analysis_get

> AnalysisResult file_analysis_get(data_id, opts)

Fetch Analysis Result

Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. 

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::AnalysisApi.new
data_id = 'data_id_example' # String | 
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Fetch Analysis Result
  result = api_instance.file_analysis_get(data_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AnalysisApi->file_analysis_get: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **String**|  | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**AnalysisResult**](AnalysisResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## file_analysis_post

> InlineResponse2008 file_analysis_post(opts)

Analyze File

## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::AnalysisApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  filename: 'filename_example', # String | The name of the submitted file
  filepath: 'filepath_example', # String | if local file scan is enabled the path to the file (see Security rule configuration)
  user_agent: 'user_agent_example', # String | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. 
  rule: 'rule_example', # String | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
  workflow: 'workflow_example', # String | name of the selected workflow (deprecated, use \"rule\" header parameter instead)
  batch: 'batch_example', # String | Batch id to scan with, coming from `Initiate Batch` (If it is not given, it will be a single file scan.)
  archivepwd: 'archivepwd_example', # String | password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd<X>     * X: Could be empty     * When having value, X must be a number >= 1   For example:     archivepwd1: \"fox\"     archivepwd2: \"cow\"     archivepwd3: \"bear\" 
  metadata: 'metadata_example', # String | could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result). 
  callbackurl: 'http://10.0.1.100:8081/listenback', # String | Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: <protocol://><ip | domain>:<port></path>   * Example: http://10.0.1.100:8081/listenback 
  body: File.new('/path/to/file') # File | 
}

begin
  #Analyze File
  result = api_instance.file_analysis_post(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AnalysisApi->file_analysis_post: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **filename** | **String**| The name of the submitted file | [optional] 
 **filepath** | **String**| if local file scan is enabled the path to the file (see Security rule configuration) | [optional] 
 **user_agent** | **String**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **rule** | **String**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **workflow** | **String**| name of the selected workflow (deprecated, use \&quot;rule\&quot; header parameter instead) | [optional] 
 **batch** | **String**| Batch id to scan with, coming from &#x60;Initiate Batch&#x60; (If it is not given, it will be a single file scan.) | [optional] 
 **archivepwd** | **String**| password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd&lt;X&gt;     * X: Could be empty     * When having value, X must be a number &gt;&#x3D; 1   For example:     archivepwd1: \&quot;fox\&quot;     archivepwd2: \&quot;cow\&quot;     archivepwd3: \&quot;bear\&quot;  | [optional] 
 **metadata** | **String**| could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  | [optional] 
 **callbackurl** | **String**| Client&#39;s URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: &lt;protocol://&gt;&lt;ip | domain&gt;:&lt;port&gt;&lt;/path&gt;   * Example: http://10.0.1.100:8081/listenback  | [optional] 
 **body** | **File**|  | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json


## sanitized_file

> File sanitized_file(data_id, opts)

Download Sanitized Files

Retrieve sanitized file based on the `data_id` 

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::AnalysisApi.new
data_id = '8101abae27be4d63859c55d9e0ed0135' # String | The data_id comes from the result of `Analyze a file`. In case of sanitizing the content of an archive, the data_id of contained file can be found in `Fetch analysis result`.
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Download Sanitized Files
  result = api_instance.sanitized_file(data_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AnalysisApi->sanitized_file: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **String**| The data_id comes from the result of &#x60;Analyze a file&#x60;. In case of sanitizing the content of an archive, the data_id of contained file can be found in &#x60;Fetch analysis result&#x60;. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**File**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


## webhook_status

> InlineResponse2009 webhook_status(data_id, opts)

Query webhook status

Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::AnalysisApi.new
data_id = 'data_id_example' # String | Either `data_id` or `batch_id`.
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Query webhook status
  result = api_instance.webhook_status(data_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling AnalysisApi->webhook_status: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **String**| Either &#x60;data_id&#x60; or &#x60;batch_id&#x60;. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

