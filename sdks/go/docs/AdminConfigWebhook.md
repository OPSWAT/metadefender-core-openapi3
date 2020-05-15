# AdminConfigWebhook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Maxretrytime** | **float32** | Number of allowed retries sending callback to client when failed.  &gt; _**For example**_: maxretrytime&#x3D; 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms)  | [optional] 
**Delayduration** | **float32** | in milliseconds | [optional] 
**Deplayprogression** | **float32** | in milliseconds | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


