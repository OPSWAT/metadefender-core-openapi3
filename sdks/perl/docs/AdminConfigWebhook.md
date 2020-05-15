# WWW::OpenAPIClient::Object::AdminConfigWebhook

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdminConfigWebhook;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxretrytime** | **double** | Number of allowed retries sending callback to client when failed.  &gt; _**For example**_: maxretrytime&#x3D; 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms)  | [optional] 
**delayduration** | **double** | in milliseconds | [optional] 
**deplayprogression** | **double** | in milliseconds | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


