# OpenapiClient::BatchResponseBatchFilesFilesInBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_id** | **String** | Unique identifer for the file. | [optional] 
**detected_by** | **Integer** | Total number of engines that detected this file. | [optional] 
**display_name** | **String** | The filename reported via &#x60;filename&#x60; header. | [optional] 
**file_size** | **Integer** | Total file size in bytes. | [optional] 
**file_type** | **String** | The filetype using mimetype. | [optional] 
**file_type_description** | **String** | The filetype in human readable format. | [optional] 
**process_info** | [**BatchResponseBatchFilesProcessInfo**](BatchResponseBatchFilesProcessInfo.md) |  | [optional] 
**progress_percentage** | **Integer** | Track analysis progress until reaches 100. | [optional] 
**scan_all_result_a** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**scan_all_result_i** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**scanned_with** | **Integer** | The total number of engines used to analyze this file. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::BatchResponseBatchFilesFilesInBatch.new(data_id: 24c8b5dadd48445989ac3431544fdc34,
                                 detected_by: 4,
                                 display_name: eicar.com,
                                 file_size: 68,
                                 file_type: application/octet-stream,
                                 file_type_description: EICAR virus test files,
                                 process_info: null,
                                 progress_percentage: 100,
                                 scan_all_result_a: Infected,
                                 scan_all_result_i: 1,
                                 scanned_with: 4)
```


