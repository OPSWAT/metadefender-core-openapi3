

# DLPRuleMatchResult

An entry detailing the match.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **String** | The context after the matched data. |  [optional]
**before** | **String** | The context before the matched data. |  [optional]
**certainty** | [**CertaintyEnum**](#CertaintyEnum) | The text version of \&quot;certainty_score\&quot;, possible values:   * &#x60;Very Low&#x60;     * &#x60;Low&#x60;     * &#x60;Medium&#x60;     * &#x60;High&#x60;     * &#x60;Very High&#x60;  |  [optional]
**certaintyScore** | **Integer** | Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100]  |  [optional]
**hit** | **String** | The matched data. |  [optional]
**isRedacted** | **Boolean** | If file was redacted or not. |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious).  |  [optional]



## Enum: CertaintyEnum

Name | Value
---- | -----
VERY_LOW | &quot;Very Low&quot;
LOW | &quot;Low&quot;
MEDIUM | &quot;Medium&quot;
HIGH | &quot;High&quot;
VERY_HIGH | &quot;Very High&quot;



## Enum: SeverityEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1



