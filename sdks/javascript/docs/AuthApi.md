# MetaDefenderCore.AuthApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userChangePass**](AuthApi.md#userChangePass) | **POST** /user/changepassword | Change Password
[**userLogin**](AuthApi.md#userLogin) | **POST** /login | Login
[**userLogout**](AuthApi.md#userLogout) | **POST** /logout | Logout



## userChangePass

> userChangePass(opts)

Change Password

Modify the current password for the user identified by apikey

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.AuthApi();
let opts = {
  'apikey': "apikey_example", // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  'inlineObject2': new MetaDefenderCore.InlineObject2() // InlineObject2 | 
};
apiInstance.userChangePass(opts, (error, data, response) => {
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## userLogin

> UserLogin userLogin(opts)

Login

Initiate a new session. Required for using protected REST APIs.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';

let apiInstance = new MetaDefenderCore.AuthApi();
let opts = {
  'inlineObject': new MetaDefenderCore.InlineObject() // InlineObject | 
};
apiInstance.userLogin(opts, (error, data, response) => {
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | [optional] 

### Return type

[**UserLogin**](UserLogin.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## userLogout

> userLogout(opts)

Logout

Destroy session for not using protected REST APIs.

### Example

```javascript
import MetaDefenderCore from 'meta_defender_core';
let defaultClient = MetaDefenderCore.ApiClient.instance;
// Configure API key authorization: apikey
let apikey = defaultClient.authentications['apikey'];
apikey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apikey.apiKeyPrefix = 'Token';

let apiInstance = new MetaDefenderCore.AuthApi();
let opts = {
  'apikey': "apikey_example" // String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
};
apiInstance.userLogout(opts, (error, data, response) => {
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

### Return type

null (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

