# MetaDefenderCore.AnalysisResultProcessInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockedReason** | **String** | Provides the reason why the file is blocked (if so). | [optional] 
**fileTypeSkippedScan** | **Boolean** | Indicates if the input file&#39;s detected type was configured to skip scanning. | [optional] 
**outdatedData** | **[String]** | array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process&#39; rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available                | [optional] 
**processingTime** | **Number** | Total time elapsed during processing file on the node (in milliseconds). | [optional] 
**profile** | **String** | The used rule name. | [optional] 
**progressPercentage** | **Number** | Percentage of processing completed (from 1-100). | [optional] 
**queueTime** | **Number** | Total time elapsed while the file waits in the queue (in milliseconds). | [optional] 
**result** | **String** | The final result of processing the file (Allowed / Blocked / Processing). | [optional] 
**userAgent** | **String** | Identifier for the REST Client that calls the API. | [optional] 
**username** | **String** | User identifier who submitted scan request earlier. | [optional] 
**verdicts** | **[String]** | Aggregated list of potential issues. | [optional] 
**postProcessing** | [**AnalysisResultProcessInfoPostProcessing**](AnalysisResultProcessInfoPostProcessing.md) |  | [optional] 



## Enum: [OutdatedDataEnum]


* `enginedefinition` (value: `"enginedefinition"`)

* `configuration` (value: `"configuration"`)

* `sanitization` (value: `"sanitization"`)




