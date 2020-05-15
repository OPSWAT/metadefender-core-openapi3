# MetaDefenderCore.BatchApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchCancel**](BatchApi.md#batchCancel) | **POST** /file/{batchId}/cancel | Cancel Batch
[**batchClose**](BatchApi.md#batchClose) | **POST** /file/batch/{batchId}/close | Close Batch
[**batchCreate**](BatchApi.md#batchCreate) | **POST** /file/batch | Initiate Batch
[**batchSignedResult**](BatchApi.md#batchSignedResult) | **GET** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**batchStatus**](BatchApi.md#batchStatus) | **GET** /file/batch/{batchId} | Status of Batch Analysis



## batchCancel

> Object batchCancel(batchId, opts)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.BatchApi();
let batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.batchCancel(batchId, opts, (error, data, response) => {
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
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## batchClose

> BatchResponse batchClose(batchId, opts)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.      

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.BatchApi();
let batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.batchClose(batchId, opts, (error, data, response) => {
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
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## batchCreate

> BatchId batchCreate(opts)

Initiate Batch

Create a new batch and retrieve the batch_id

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.BatchApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'rule': "rule_example", // String | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
  'userAgent': "userAgent_example", // String | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used. 
  'userData': "userData_example" // String | Additional custom information (max 1024 bytes, URL encoded UTF-8 string)       
};
apiInstance.batchCreate(opts, (error, data, response) => {
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
 **rule** | **String**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **userAgent** | **String**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **userData** | **String**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        | [optional] 

### Return type

[**BatchId**](BatchId.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## batchSignedResult

> batchSignedResult(batchId, opts)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.BatchApi();
let batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.batchSignedResult(batchId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json


## batchStatus

> BatchResponse batchStatus(batchId, opts)

Status of Batch Analysis

Retrieve status report for the entire batch

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.BatchApi();
let batchId = "batchId_example"; // String | The batch identifier used to submit files in the batch and to close the batch.
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.batchStatus(batchId, opts, (error, data, response) => {
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
 **batchId** | **String**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

