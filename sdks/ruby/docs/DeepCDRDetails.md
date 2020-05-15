# OpenapiClient::DeepCDRDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Action was successful or not. | [optional] 
**details** | [**Array&lt;DeepCDRDetailsDetails&gt;**](DeepCDRDetailsDetails.md) | List of all sanitized objects | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DeepCDRDetails.new(description: Sanitized successfully,
                                 details: null)
```


