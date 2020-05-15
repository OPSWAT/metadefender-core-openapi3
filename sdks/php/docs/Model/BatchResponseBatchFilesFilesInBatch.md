# # BatchResponseBatchFilesFilesInBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_id** | **string** | Unique identifer for the file. | [optional] 
**detected_by** | **int** | Total number of engines that detected this file. | [optional] 
**display_name** | **string** | The filename reported via &#x60;filename&#x60; header. | [optional] 
**file_size** | **int** | Total file size in bytes. | [optional] 
**file_type** | **string** | The filetype using mimetype. | [optional] 
**file_type_description** | **string** | The filetype in human readable format. | [optional] 
**process_info** | [**\OpenAPI\Client\Model\BatchResponseBatchFilesProcessInfo**](BatchResponseBatchFilesProcessInfo.md) |  | [optional] 
**progress_percentage** | **int** | Track analysis progress until reaches 100. | [optional] 
**scan_all_result_a** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**scan_all_result_i** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**scanned_with** | **int** | The total number of engines used to analyze this file. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


