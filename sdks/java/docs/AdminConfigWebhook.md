

# AdminConfigWebhook

Webhook configuration details.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxretrytime** | [**BigDecimal**](BigDecimal.md) | Number of allowed retries sending callback to client when failed.  &gt; _**For example**_: maxretrytime&#x3D; 3  Sending callback failed for some reasons   * 1st retry triggered after delayduration (ms)   * 2nd retry triggered after delayduration+ delayprogression (ms)   * 3rd retry triggered after delayduration+ 2*delayprogression (ms)  |  [optional]
**delayduration** | [**BigDecimal**](BigDecimal.md) | in milliseconds |  [optional]
**deplayprogression** | [**BigDecimal**](BigDecimal.md) | in milliseconds |  [optional]



