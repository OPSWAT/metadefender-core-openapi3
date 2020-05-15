# OpenapiClient::DLPResponseDlpInfoHitsCcn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_name** | **String** | Credit Card Number, Social Security Number, or in case of RegEx, the name of the rule that has been given by the user | [optional] 
**hits** | [**Array&lt;DLPRuleMatchResult&gt;**](DLPRuleMatchResult.md) | A list of detections that matched this rule/pattern. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DLPResponseDlpInfoHitsCcn.new(display_name: Credit Card Number,
                                 hits: null)
```


