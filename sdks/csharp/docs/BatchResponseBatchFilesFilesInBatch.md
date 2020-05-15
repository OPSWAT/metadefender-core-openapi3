
# Org.OpenAPITools.Model.BatchResponseBatchFilesFilesInBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataId** | **string** | Unique identifer for the file. | [optional] 
**DetectedBy** | **int** | Total number of engines that detected this file. | [optional] 
**DisplayName** | **string** | The filename reported via &#x60;filename&#x60; header. | [optional] 
**FileSize** | **int** | Total file size in bytes. | [optional] 
**FileType** | **string** | The filetype using mimetype. | [optional] 
**FileTypeDescription** | **string** | The filetype in human readable format. | [optional] 
**ProcessInfo** | [**BatchResponseBatchFilesProcessInfo**](BatchResponseBatchFilesProcessInfo.md) |  | [optional] 
**ProgressPercentage** | **int** | Track analysis progress until reaches 100. | [optional] 
**ScanAllResultA** | **ProcessingResultsStringEnum** | The overall scan result as string | [optional] 
**ScanAllResultI** | **ProcessingResultsIndexEnum** | The overall scan result as index in the Processing Results table. | [optional] 
**ScannedWith** | **int** | The total number of engines used to analyze this file. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

