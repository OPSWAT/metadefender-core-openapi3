# OpenAPI\Client\ConfigApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**configAuditLog**](ConfigApi.md#configAuditLog) | **PUT** /admin/config/auditlog | Audit clean up
[**configGetSkipHash**](ConfigApi.md#configGetSkipHash) | **GET** /admin/config/skip | Get &#39;skip by hash&#39; list
[**configQuarantine**](ConfigApi.md#configQuarantine) | **PUT** /admin/config/quarantine | Quarantine clean up
[**configSanitizedRepo**](ConfigApi.md#configSanitizedRepo) | **PUT** /admin/config/sanitize | Sanitized files clean up
[**configScanHistory**](ConfigApi.md#configScanHistory) | **PUT** /admin/config/scanhistory | Processing history clean up
[**configSession**](ConfigApi.md#configSession) | **PUT** /admin/config/session | Session settings
[**configUpdate**](ConfigApi.md#configUpdate) | **PUT** /admin/config/update | Modules Update Source and Frequency
[**configUpdateSkipHash**](ConfigApi.md#configUpdateSkipHash) | **PUT** /admin/config/skip | Modify &#39;skip by hash&#39; list
[**configUpdateWebhook**](ConfigApi.md#configUpdateWebhook) | **PUT** /admin/config/webhook | Webhook set configuration
[**configWebhook**](ConfigApi.md#configWebhook) | **GET** /admin/config/webhook | Webhook get configuration



## configAuditLog

> \OpenAPI\Client\Model\InlineResponse200 configAuditLog($apikey, $unknown_base_type)

Audit clean up

Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$unknown_base_type = new \OpenAPI\Client\Model\UNKNOWN_BASE_TYPE(); // \OpenAPI\Client\Model\UNKNOWN_BASE_TYPE | 

try {
    $result = $apiInstance->configAuditLog($apikey, $unknown_base_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configAuditLog: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **unknown_base_type** | [**\OpenAPI\Client\Model\UNKNOWN_BASE_TYPE**](../Model/UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configGetSkipHash

> \OpenAPI\Client\Model\SkipList configGetSkipHash($apikey)

Get 'skip by hash' list

Get the list of hashes whitelisted or blacklisted.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->configGetSkipHash($apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configGetSkipHash: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

[**\OpenAPI\Client\Model\SkipList**](../Model/SkipList.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configQuarantine

> \OpenAPI\Client\Model\InlineResponse200 configQuarantine($apikey, $unknown_base_type)

Quarantine clean up

Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$unknown_base_type = new \OpenAPI\Client\Model\UNKNOWN_BASE_TYPE(); // \OpenAPI\Client\Model\UNKNOWN_BASE_TYPE | 

try {
    $result = $apiInstance->configQuarantine($apikey, $unknown_base_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configQuarantine: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **unknown_base_type** | [**\OpenAPI\Client\Model\UNKNOWN_BASE_TYPE**](../Model/UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configSanitizedRepo

> \OpenAPI\Client\Model\InlineResponse2001 configSanitizedRepo($apikey, $inline_object1)

Sanitized files clean up

Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$inline_object1 = new \OpenAPI\Client\Model\InlineObject1(); // \OpenAPI\Client\Model\InlineObject1 | 

try {
    $result = $apiInstance->configSanitizedRepo($apikey, $inline_object1);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configSanitizedRepo: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **inline_object1** | [**\OpenAPI\Client\Model\InlineObject1**](../Model/InlineObject1.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configScanHistory

> \OpenAPI\Client\Model\InlineResponse200 configScanHistory($apikey, $unknown_base_type)

Processing history clean up

Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$unknown_base_type = new \OpenAPI\Client\Model\UNKNOWN_BASE_TYPE(); // \OpenAPI\Client\Model\UNKNOWN_BASE_TYPE | 

try {
    $result = $apiInstance->configScanHistory($apikey, $unknown_base_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configScanHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **unknown_base_type** | [**\OpenAPI\Client\Model\UNKNOWN_BASE_TYPE**](../Model/UNKNOWN_BASE_TYPE.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configSession

> \OpenAPI\Client\Model\AdminConfigSession configSession($apikey, $admin_config_session)

Session settings

Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$admin_config_session = new \OpenAPI\Client\Model\AdminConfigSession(); // \OpenAPI\Client\Model\AdminConfigSession | 

try {
    $result = $apiInstance->configSession($apikey, $admin_config_session);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configSession: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **admin_config_session** | [**\OpenAPI\Client\Model\AdminConfigSession**](../Model/AdminConfigSession.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\AdminConfigSession**](../Model/AdminConfigSession.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configUpdate

> \OpenAPI\Client\Model\AdminConfigUpdate configUpdate($apikey, $admin_config_update)

Modules Update Source and Frequency

Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$admin_config_update = new \OpenAPI\Client\Model\AdminConfigUpdate(); // \OpenAPI\Client\Model\AdminConfigUpdate | 

try {
    $result = $apiInstance->configUpdate($apikey, $admin_config_update);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configUpdate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **admin_config_update** | [**\OpenAPI\Client\Model\AdminConfigUpdate**](../Model/AdminConfigUpdate.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\AdminConfigUpdate**](../Model/AdminConfigUpdate.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configUpdateSkipHash

> \OpenAPI\Client\Model\SkipList configUpdateSkipHash($apikey, $skip_list)

Modify 'skip by hash' list

Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$skip_list = new \OpenAPI\Client\Model\SkipList(); // \OpenAPI\Client\Model\SkipList | A list of all skip/white/black-listed hashes.

try {
    $result = $apiInstance->configUpdateSkipHash($apikey, $skip_list);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configUpdateSkipHash: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **skip_list** | [**\OpenAPI\Client\Model\SkipList**](../Model/SkipList.md)| A list of all skip/white/black-listed hashes. | [optional]

### Return type

[**\OpenAPI\Client\Model\SkipList**](../Model/SkipList.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configUpdateWebhook

> \OpenAPI\Client\Model\AdminConfigWebhook configUpdateWebhook($apikey, $admin_config_webhook)

Webhook set configuration

Modifying settings supported for webhook mode

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apikey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('apikey', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('apikey', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.
$admin_config_webhook = new \OpenAPI\Client\Model\AdminConfigWebhook(); // \OpenAPI\Client\Model\AdminConfigWebhook | 

try {
    $result = $apiInstance->configUpdateWebhook($apikey, $admin_config_webhook);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configUpdateWebhook: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]
 **admin_config_webhook** | [**\OpenAPI\Client\Model\AdminConfigWebhook**](../Model/AdminConfigWebhook.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\AdminConfigWebhook**](../Model/AdminConfigWebhook.md)

### Authorization

[apikey](../../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)


## configWebhook

> \OpenAPI\Client\Model\AdminConfigWebhook configWebhook($apikey)

Webhook get configuration

Getting settings supported for webhook mode

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


$apiInstance = new OpenAPI\Client\Api\ConfigApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$apikey = 'apikey_example'; // string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.

try {
    $result = $apiInstance->configWebhook($apikey);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConfigApi->configWebhook: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication. | [optional]

### Return type

[**\OpenAPI\Client\Model\AdminConfigWebhook**](../Model/AdminConfigWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../../README.md#documentation-for-models)
[[Back to README]](../../README.md)

