

# BatchResponseBatchFilesFilesInBatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataId** | **String** | Unique identifer for the file. |  [optional]
**detectedBy** | **Integer** | Total number of engines that detected this file. |  [optional]
**displayName** | **String** | The filename reported via &#x60;filename&#x60; header. |  [optional]
**fileSize** | **Integer** | Total file size in bytes. |  [optional]
**fileType** | **String** | The filetype using mimetype. |  [optional]
**fileTypeDescription** | **String** | The filetype in human readable format. |  [optional]
**processInfo** | [**BatchResponseBatchFilesProcessInfo**](BatchResponseBatchFilesProcessInfo.md) |  |  [optional]
**progressPercentage** | **Integer** | Track analysis progress until reaches 100. |  [optional]
**scanAllResultA** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string |  [optional]
**scanAllResultI** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. |  [optional]
**scannedWith** | **Integer** | The total number of engines used to analyze this file. |  [optional]



