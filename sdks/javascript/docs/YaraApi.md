# MetaDefenderCore.YaraApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**yaraPackageGenerate**](YaraApi.md#yaraPackageGenerate) | **PUT** /yara/generate | Generate Yara package
[**yaraPackageStatus**](YaraApi.md#yaraPackageStatus) | **GET** /yara/package | Yara Generation Status
[**yaraSourcesGet**](YaraApi.md#yaraSourcesGet) | **GET** /admin/config/yara/sources | Get Yara sources
[**yaraSourcesPut**](YaraApi.md#yaraSourcesPut) | **PUT** /admin/config/yara/sources | Modify Yara sources



## yaraPackageGenerate

> InlineResponse2007 yaraPackageGenerate(opts)

Generate Yara package

Generate a new package based on the new added sources.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.YaraApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.yaraPackageGenerate(opts, (error, data, response) => {
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

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## yaraPackageStatus

> InlineResponse2007 yaraPackageStatus(opts)

Yara Generation Status

Get status of Yara package generation.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.YaraApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.yaraPackageStatus(opts, (error, data, response) => {
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

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## yaraSourcesGet

> YaraSourcesObject yaraSourcesGet(opts)

Get Yara sources

Retrieve a list of all sources for the Yara Engine.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.YaraApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.yaraSourcesGet(opts, (error, data, response) => {
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

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## yaraSourcesPut

> YaraSourcesObject yaraSourcesPut(opts)

Modify Yara sources

Modify one (or more) of the sources for the Yara Engine.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.YaraApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'yaraSourcesObject': new MetaDefenderCore.YaraSourcesObject() // YaraSourcesObject | A list of Yara Engine sources.
};
apiInstance.yaraSourcesPut(opts, (error, data, response) => {
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
 **yaraSourcesObject** | [**YaraSourcesObject**](YaraSourcesObject.md)| A list of Yara Engine sources. | [optional] 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

