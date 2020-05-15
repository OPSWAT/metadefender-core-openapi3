# MetaDefenderCore.StatsApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enginesStatus**](StatsApi.md#enginesStatus) | **GET** /stat/engines | Engines Status
[**nodesStatus**](StatsApi.md#nodesStatus) | **GET** /stat/nodes | Nodes Status
[**productVersion**](StatsApi.md#productVersion) | **GET** /version | Get Product Version



## enginesStatus

> [InlineResponse20012] enginesStatus(opts)

Engines Status

The response is an array of engines with database information.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.StatsApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.enginesStatus(opts, (error, data, response) => {
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

[**[InlineResponse20012]**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## nodesStatus

> [InlineResponse20013] nodesStatus(opts)

Nodes Status

Get a list of all connected nodes and their status.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.StatsApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.nodesStatus(opts, (error, data, response) => {
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

[**[InlineResponse20013]**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## productVersion

> InlineResponse20011 productVersion(opts)

Get Product Version

Fetch details about the product version.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.StatsApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.productVersion(opts, (error, data, response) => {
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

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

