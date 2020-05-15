# OpenapiClient::AnalysisResultProcessInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blocked_reason** | **String** | Provides the reason why the file is blocked (if so). | [optional] 
**file_type_skipped_scan** | **Boolean** | Indicates if the input file&#39;s detected type was configured to skip scanning. | [optional] 
**outdated_data** | **Array&lt;String&gt;** | array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process&#39; rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available                | [optional] 
**processing_time** | **Integer** | Total time elapsed during processing file on the node (in milliseconds). | [optional] 
**profile** | **String** | The used rule name. | [optional] 
**progress_percentage** | **Integer** | Percentage of processing completed (from 1-100). | [optional] 
**queue_time** | **Integer** | Total time elapsed while the file waits in the queue (in milliseconds). | [optional] 
**result** | **String** | The final result of processing the file (Allowed / Blocked / Processing). | [optional] 
**user_agent** | **String** | Identifier for the REST Client that calls the API. | [optional] 
**username** | **String** | User identifier who submitted scan request earlier. | [optional] 
**verdicts** | **Array&lt;String&gt;** | Aggregated list of potential issues. | [optional] 
**post_processing** | [**AnalysisResultProcessInfoPostProcessing**](AnalysisResultProcessInfoPostProcessing.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AnalysisResultProcessInfo.new(blocked_reason: Sensitive Data Found,
                                 file_type_skipped_scan: false,
                                 outdated_data: [enginedefinition, configuration, sanitization],
                                 processing_time: 4804,
                                 profile: File process,
                                 progress_percentage: 100,
                                 queue_time: 321,
                                 result: Blocked,
                                 user_agent: webscan,
                                 username: LOCAL/admin,
                                 verdicts: [Sensitive Data Found],
                                 post_processing: null)
```


