# OpenAPI\Client\BatchApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCancel**](BatchApi.md#batchCancel) | **POST** /file/{batchId}/cancel | Cancel Batch
[**batchClose**](BatchApi.md#batchClose) | **POST** /file/batch/{batchId}/close | Close Batch
[**batchCreate**](BatchApi.md#batchCreate) | **POST** /file/batch | Initiate Batch
[**batchSignedResult**](BatchApi.md#batchSignedResult) | **GET** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**batchStatus**](BatchApi.md#batchStatus) | **GET** /file/batch/{batchId} | Status of Batch Analysis



## batchCancel

> object batchCancel($batch_id, $apikey)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$batch_id = 'batch_id_example'; // string | The batch identifier used to submit files in the batch and to close the batch.
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->batchCancel($batch_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->batchCancel: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. |
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


## batchClose

> \OpenAPI\Client\Model\BatchResponse batchClose($batch_id, $apikey)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$batch_id = 'batch_id_example'; // string | The batch identifier used to submit files in the batch and to close the batch.
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->batchClose($batch_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->batchClose: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. |
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

[**\OpenAPI\Client\Model\BatchResponse**](../Model/BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## batchCreate

> \OpenAPI\Client\Model\BatchId batchCreate($apikey, $rule, $user_agent, $user_data)

Initiate Batch

Create a new batch and retrieve the batch_id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$rule = 'rule_example'; // string | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)
$user_agent = 'user_agent_example'; // string | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.
$user_data = 'user_data_example'; // string | Additional custom information (max 1024 bytes, URL encoded UTF-8 string)

try {
    $result = $apiInstance->batchCreate($apikey, $rule, $user_agent, $user_data);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->batchCreate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **rule** | **string**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name) | [optional]
 **user_agent** | **string**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used. | [optional]
 **user_data** | **string**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string) | [optional]

### Return type

[**\OpenAPI\Client\Model\BatchId**](../Model/BatchId.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## batchSignedResult

> batchSignedResult($batch_id, $apikey)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$batch_id = 'batch_id_example'; // string | The batch identifier used to submit files in the batch and to close the batch.
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $apiInstance->batchSignedResult($batch_id, $apikey);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->batchSignedResult: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. |
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## batchStatus

> \OpenAPI\Client\Model\BatchResponse batchStatus($batch_id, $apikey)

Status of Batch Analysis

Retrieve status report for the entire batch

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\BatchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$batch_id = 'batch_id_example'; // string | The batch identifier used to submit files in the batch and to close the batch.
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->batchStatus($batch_id, $apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BatchApi->batchStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **string**| The batch identifier used to submit files in the batch and to close the batch. |
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

[**\OpenAPI\Client\Model\BatchResponse**](../Model/BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

