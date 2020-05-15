# AnalysisResultProcessInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlockedReason** | **string** | Provides the reason why the file is blocked (if so). | [optional] 
**FileTypeSkippedScan** | **bool** | Indicates if the input file&#39;s detected type was configured to skip scanning. | [optional] 
**OutdatedData** | **[]string** | array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process&#39; rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available                | [optional] 
**ProcessingTime** | **int32** | Total time elapsed during processing file on the node (in milliseconds). | [optional] 
**Profile** | **string** | The used rule name. | [optional] 
**ProgressPercentage** | **int32** | Percentage of processing completed (from 1-100). | [optional] 
**QueueTime** | **int32** | Total time elapsed while the file waits in the queue (in milliseconds). | [optional] 
**Result** | **string** | The final result of processing the file (Allowed / Blocked / Processing). | [optional] 
**UserAgent** | **string** | Identifier for the REST Client that calls the API. | [optional] 
**Username** | **string** | User identifier who submitted scan request earlier. | [optional] 
**Verdicts** | **[]string** | Aggregated list of potential issues. | [optional] 
**PostProcessing** | [**AnalysisResultProcessInfoPostProcessing**](AnalysisResult_process_info_post_processing.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


