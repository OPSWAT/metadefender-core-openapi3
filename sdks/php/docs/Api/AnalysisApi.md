# OpenAPI\Client\AnalysisApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analysisRules**](AnalysisApi.md#analysisRules) | **GET** /file/rules | Fetching Available Analysis Rules
[**fileAnalysisCancel**](AnalysisApi.md#fileAnalysisCancel) | **POST** /file/{data_id}/cancel | Cancel File Analysis
[**fileAnalysisGet**](AnalysisApi.md#fileAnalysisGet) | **GET** /file/{data_id} | Fetch Analysis Result
[**fileAnalysisPost**](AnalysisApi.md#fileAnalysisPost) | **POST** /file | Analyze File
[**sanitizedFile**](AnalysisApi.md#sanitizedFile) | **GET** /file/converted/{data_id} | Download Sanitized Files
[**webhookStatus**](AnalysisApi.md#webhookStatus) | **GET** /file/webhook/{data_id} | Query webhook status



## analysisRules

> \OpenAPI\Client\Model\InlineResponse20010[] analysisRules($user_agent)

Fetching Available Analysis Rules

Retrieve all available rules with their custom configurations. Fetching available processing rules.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\AnalysisApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$user_agent = 'user_agent_example'; // string | The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client's user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).

try {
    $result = $apiInstance->analysisRules($user_agent);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalysisApi->analysisRules: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_agent** | **string**| The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client&#39;s user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html). | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse20010[]**](../Model/InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## fileAnalysisCancel

> object fileAnalysisCancel($data_id, $apikey)

Cancel File Analysis

When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\AnalysisApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$data_id = 'data_id_example'; // string | 
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->fileAnalysisCancel($data_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalysisApi->fileAnalysisCancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **string**|  |
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## fileAnalysisGet

> \OpenAPI\Client\Model\AnalysisResult fileAnalysisGet($data_id, $apikey)

Fetch Analysis Result

Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\AnalysisApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$data_id = 'data_id_example'; // string | 
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->fileAnalysisGet($data_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalysisApi->fileAnalysisGet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **string**|  |
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

[**\OpenAPI\Client\Model\AnalysisResult**](../Model/AnalysisResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## fileAnalysisPost

> \OpenAPI\Client\Model\InlineResponse2008 fileAnalysisPost($apikey, $filename, $filepath, $user_agent, $rule, $workflow, $batch, $archivepwd, $metadata, $callbackurl, $body)

Analyze File

## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\AnalysisApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$filename = 'filename_example'; // string | The name of the submitted file
$filepath = 'filepath_example'; // string | if local file scan is enabled the path to the file (see Security rule configuration)
$user_agent = 'user_agent_example'; // string | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.
$rule = 'rule_example'; // string | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)
$workflow = 'workflow_example'; // string | name of the selected workflow (deprecated, use \"rule\" header parameter instead)
$batch = 'batch_example'; // string | Batch id to scan with, coming from `Initiate Batch` (If it is not given, it will be a single file scan.)
$archivepwd = 'archivepwd_example'; // string | password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd<X>     * X: Could be empty     * When having value, X must be a number >= 1   For example:     archivepwd1: \"fox\"     archivepwd2: \"cow\"     archivepwd3: \"bear\"
$metadata = 'metadata_example'; // string | could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).
$callbackurl = http://10.0.1.100:8081/listenback; // string | Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: <protocol://><ip | domain>:<port></path>   * Example: http://10.0.1.100:8081/listenback
$body = "/path/to/file.txt"; // \SplFileObject | 

try {
    $result = $apiInstance->fileAnalysisPost($apikey, $filename, $filepath, $user_agent, $rule, $workflow, $batch, $archivepwd, $metadata, $callbackurl, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalysisApi->fileAnalysisPost: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **filename** | **string**| The name of the submitted file | [optional]
 **filepath** | **string**| if local file scan is enabled the path to the file (see Security rule configuration) | [optional]
 **user_agent** | **string**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used. | [optional]
 **rule** | **string**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name) | [optional]
 **workflow** | **string**| name of the selected workflow (deprecated, use \&quot;rule\&quot; header parameter instead) | [optional]
 **batch** | **string**| Batch id to scan with, coming from &#x60;Initiate Batch&#x60; (If it is not given, it will be a single file scan.) | [optional]
 **archivepwd** | **string**| password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd&lt;X&gt;     * X: Could be empty     * When having value, X must be a number &gt;&#x3D; 1   For example:     archivepwd1: \&quot;fox\&quot;     archivepwd2: \&quot;cow\&quot;     archivepwd3: \&quot;bear\&quot; | [optional]
 **metadata** | **string**| could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result). | [optional]
 **callbackurl** | **string**| Client&#39;s URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: &lt;protocol://&gt;&lt;ip | domain&gt;:&lt;port&gt;&lt;/path&gt;   * Example: http://10.0.1.100:8081/listenback | [optional]
 **body** | **\SplFileObject****\SplFileObject**|  | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse2008**](../Model/InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## sanitizedFile

> \SplFileObject sanitizedFile($data_id, $apikey)

Download Sanitized Files

Retrieve sanitized file based on the `data_id`

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\AnalysisApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$data_id = 8101abae27be4d63859c55d9e0ed0135; // string | The data_id comes from the result of `Analyze a file`. In case of sanitizing the content of an archive, the data_id of contained file can be found in `Fetch analysis result`.
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->sanitizedFile($data_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalysisApi->sanitizedFile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **string**| The data_id comes from the result of &#x60;Analyze a file&#x60;. In case of sanitizing the content of an archive, the data_id of contained file can be found in &#x60;Fetch analysis result&#x60;. |
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

[**\SplFileObject**](../Model/\SplFileObject.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## webhookStatus

> \OpenAPI\Client\Model\InlineResponse2009 webhookStatus($data_id, $apikey)

Query webhook status

Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\AnalysisApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$data_id = 'data_id_example'; // string | Either `data_id` or `batch_id`.
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->webhookStatus($data_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AnalysisApi->webhookStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_id** | **string**| Either &#x60;data_id&#x60; or &#x60;batch_id&#x60;. |
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse2009**](../Model/InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

