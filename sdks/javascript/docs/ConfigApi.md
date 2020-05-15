# MetaDefenderCore.ConfigApi

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

> InlineResponse200 configAuditLog(opts)

Audit clean up

Setting audit records (update history) clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'UNKNOWN_BASE_TYPE': new MetaDefenderCore.UNKNOWN_BASE_TYPE() // UNKNOWN_BASE_TYPE | 
};
apiInstance.configAuditLog(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configGetSkipHash

> SkipList configGetSkipHash(opts)

Get &#39;skip by hash&#39; list

Get the list of hashes whitelisted or blacklisted.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.configGetSkipHash(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## configQuarantine

> InlineResponse200 configQuarantine(opts)

Quarantine clean up

Setting quarantine clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'UNKNOWN_BASE_TYPE': new MetaDefenderCore.UNKNOWN_BASE_TYPE() // UNKNOWN_BASE_TYPE | 
};
apiInstance.configQuarantine(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configSanitizedRepo

> InlineResponse2001 configSanitizedRepo(opts)

Sanitized files clean up

Setting sanitized files clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'inlineObject1': new MetaDefenderCore.InlineObject1() // InlineObject1 | 
};
apiInstance.configSanitizedRepo(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configScanHistory

> InlineResponse200 configScanHistory(opts)

Processing history clean up

Setting processing history clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.  

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'UNKNOWN_BASE_TYPE': new MetaDefenderCore.UNKNOWN_BASE_TYPE() // UNKNOWN_BASE_TYPE | 
};
apiInstance.configScanHistory(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configSession

> AdminConfigSession configSession(opts)

Session settings

Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'adminConfigSession': new MetaDefenderCore.AdminConfigSession() // AdminConfigSession | 
};
apiInstance.configSession(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **adminConfigSession** | [**AdminConfigSession**](AdminConfigSession.md)|  | [optional] 

### Return type

[**AdminConfigSession**](AdminConfigSession.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configUpdate

> AdminConfigUpdate configUpdate(opts)

Modules Update Source and Frequency

Setting update frequency for all modules and engines.  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.  

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'adminConfigUpdate': new MetaDefenderCore.AdminConfigUpdate() // AdminConfigUpdate | 
};
apiInstance.configUpdate(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **adminConfigUpdate** | [**AdminConfigUpdate**](AdminConfigUpdate.md)|  | [optional] 

### Return type

[**AdminConfigUpdate**](AdminConfigUpdate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configUpdateSkipHash

> SkipList configUpdateSkipHash(opts)

Modify &#39;skip by hash&#39; list

Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist&#39;s rules in array under \&quot;whitelist\&quot; key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id&#39;s strings in array hash: md5, sha1 or sha256 hash 

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'skipList': new MetaDefenderCore.SkipList() // SkipList | A list of all skip/white/black-listed hashes.
};
apiInstance.configUpdateSkipHash(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **skipList** | [**SkipList**](SkipList.md)| A list of all skip/white/black-listed hashes. | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configUpdateWebhook

> AdminConfigWebhook configUpdateWebhook(opts)

Webhook set configuration

Modifying settings supported for webhook mode 

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'adminConfigWebhook': new MetaDefenderCore.AdminConfigWebhook() // AdminConfigWebhook | 
};
apiInstance.configUpdateWebhook(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **adminConfigWebhook** | [**AdminConfigWebhook**](AdminConfigWebhook.md)|  | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## configWebhook

> AdminConfigWebhook configWebhook(opts)

Webhook get configuration

Getting settings supported for webhook mode 

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.ConfigApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.configWebhook(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

