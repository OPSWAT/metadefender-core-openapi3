# MetaDefenderCore.EnginesApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engineDisable**](EnginesApi.md#engineDisable) | **POST** /admin/engine/{engineId}/disable | Disable engines
[**engineEnable**](EnginesApi.md#engineEnable) | **POST** /admin/engine/{engineId}/enable | Enable engines
[**enginePin**](EnginesApi.md#enginePin) | **POST** /admin/engine/{engineId}/pin | Pin engine to prevent auto-updates
[**engineUnpin**](EnginesApi.md#engineUnpin) | **POST** /admin/engine/{engineId}/unpin | Unpin engine to prevent auto-updates



## engineDisable

> InlineResponse2005 engineDisable(engineId, opts)

Disable engines

Disable to use the selected engines on the nodes.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.EnginesApi();
let engineId = clamav_7_linux; // String | The unique engine identifier
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.engineDisable(engineId, opts, (error, data, response) => {
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
 **engineId** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## engineEnable

> InlineResponse2004 engineEnable(engineId, opts)

Enable engines

Enable to use the selected engine on the nodes.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.EnginesApi();
let engineId = clamav_7_linux; // String | The unique engine identifier
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.engineEnable(engineId, opts, (error, data, response) => {
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
 **engineId** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## enginePin

> InlineResponse2002 enginePin(engineId, opts)

Pin engine to prevent auto-updates

Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.EnginesApi();
let engineId = clamav_7_linux; // String | The unique engine identifier
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'type': engine // String | Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.)
};
apiInstance.enginePin(engineId, opts, (error, data, response) => {
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
 **engineId** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **String**| Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## engineUnpin

> InlineResponse2003 engineUnpin(engineId, opts)

Unpin engine to prevent auto-updates

Unpin engines so automatic updates will be applied on them.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.EnginesApi();
let engineId = clamav_7_linux; // String | The unique engine identifier
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'type': engine // String | Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.)
};
apiInstance.engineUnpin(engineId, opts, (error, data, response) => {
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
 **engineId** | **String**| The unique engine identifier | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **String**| Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

