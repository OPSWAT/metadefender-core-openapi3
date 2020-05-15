# WWW::OpenAPIClient::Object::BatchResponseProcessInfo

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BatchResponseProcessInfo;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blocked_reason** | **string** | Provides the reason why the file is blocked (if so). | [optional] 
**file_type_skipped_scan** | **boolean** | Indicates if the input file&#39;s detected type was configured to skip scanning. | [optional] 
**profile** | **string** | The used rule name. | [optional] 
**result** | **string** | The final result of processing the file (Allowed / Blocked / Processing). | [optional] 
**user_agent** | **string** | Identifier for the REST Client that calls the API. | [optional] 
**username** | **string** | User identifier who submitted scan request earlier. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


