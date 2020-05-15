# DlpRuleMatchResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | **string** | The context after the matched data. | [optional] 
**Before** | **string** | The context before the matched data. | [optional] 
**Certainty** | **string** | The text version of \&quot;certainty_score\&quot;, possible values:   * &#x60;Very Low&#x60;     * &#x60;Low&#x60;     * &#x60;Medium&#x60;     * &#x60;High&#x60;     * &#x60;Very High&#x60;  | [optional] 
**CertaintyScore** | **int32** | Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100]  | [optional] 
**Hit** | **string** | The matched data. | [optional] 
**IsRedacted** | **bool** | If file was redacted or not. | [optional] 
**Severity** | **int32** | (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious).  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


