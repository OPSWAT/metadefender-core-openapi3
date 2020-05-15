# WWW::OpenAPIClient::Object::AnalysisResultProcessInfo

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AnalysisResultProcessInfo;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blocked_reason** | **string** | Provides the reason why the file is blocked (if so). | [optional] 
**file_type_skipped_scan** | **boolean** | Indicates if the input file&#39;s detected type was configured to skip scanning. | [optional] 
**outdated_data** | **ARRAY[string]** | array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process&#39; rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available                | [optional] 
**processing_time** | **int** | Total time elapsed during processing file on the node (in milliseconds). | [optional] 
**profile** | **string** | The used rule name. | [optional] 
**progress_percentage** | **int** | Percentage of processing completed (from 1-100). | [optional] 
**queue_time** | **int** | Total time elapsed while the file waits in the queue (in milliseconds). | [optional] 
**result** | **string** | The final result of processing the file (Allowed / Blocked / Processing). | [optional] 
**user_agent** | **string** | Identifier for the REST Client that calls the API. | [optional] 
**username** | **string** | User identifier who submitted scan request earlier. | [optional] 
**verdicts** | **ARRAY[string]** | Aggregated list of potential issues. | [optional] 
**post_processing** | [**AnalysisResultProcessInfoPostProcessing**](AnalysisResultProcessInfoPostProcessing.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


