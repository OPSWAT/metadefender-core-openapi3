# OpenapiClient::DLPRuleMatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **String** | The context after the matched data. | [optional] 
**before** | **String** | The context before the matched data. | [optional] 
**certainty** | **String** | The text version of \&quot;certainty_score\&quot;, possible values:   * &#x60;Very Low&#x60;     * &#x60;Low&#x60;     * &#x60;Medium&#x60;     * &#x60;High&#x60;     * &#x60;Very High&#x60;  | [optional] 
**certainty_score** | **Integer** | Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100]  | [optional] 
**hit** | **String** | The matched data. | [optional] 
**is_redacted** | **Boolean** | If file was redacted or not. | [optional] 
**severity** | **Integer** | (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious).  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DLPRuleMatchResult.new(after: 123 Cherry Lane st.,
                                 before: Card Number,
                                 certainty: Very High,
                                 certainty_score: 100,
                                 hit: XXXXXXXXXXXXXXX1938,
                                 is_redacted: false,
                                 severity: 0)
```


