# MetaDefenderCore.AdminConfigWebhook

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxretrytime** | **Number** | Number of allowed retries sending callback to client when failed.  &gt; _**For example**_: maxretrytime&#x3D; 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms)  | [optional] 
**delayduration** | **Number** | in milliseconds | [optional] 
**deplayprogression** | **Number** | in milliseconds | [optional] 


