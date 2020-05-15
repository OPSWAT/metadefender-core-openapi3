# MetaDefenderCore.LicenseApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**licenseActivation**](LicenseApi.md#licenseActivation) | **POST** /admin/license/activation | Activate license
[**licenseGet**](LicenseApi.md#licenseGet) | **GET** /admin/license | Get Current License Information
[**licenseUpload**](LicenseApi.md#licenseUpload) | **POST** /admin/license | Upload license key



## licenseActivation

> licenseActivation(opts)

Activate license

This API initiates an online activation of the deployment.  In case of error, check the application logs for more details.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.LicenseApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'UNKNOWN_BASE_TYPE': {activationKey=xxxx-xxxx-xxxx-xxxx-xxxx-xxxx-xxxx, quantity=1, comment=MetaDefender Core Server 001} // UNKNOWN_BASE_TYPE | 
};
apiInstance.licenseActivation(opts, (error, data, response) => {
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
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **UNKNOWN_BASE_TYPE** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## licenseGet

> LicenseInformation licenseGet(opts)

Get Current License Information

Fetch all details about the licensing status of the product.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.LicenseApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.licenseGet(opts, (error, data, response) => {
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

[**LicenseInformation**](LicenseInformation.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## licenseUpload

> licenseUpload(opts)

Upload license key

Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key&#x3D;%activation_key%&amp;deployment&#x3D;%deployment_unique_ID%&amp;quantity&#x3D;%quantity%  Deployment unique ID can be fetched via Get Current License Information API.      

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.LicenseApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'body': "body_example" // String | 
};
apiInstance.licenseUpload(opts, (error, data, response) => {
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
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **body** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json

