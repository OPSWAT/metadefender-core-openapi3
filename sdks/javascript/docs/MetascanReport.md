# MetaDefenderCore.MetascanReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataId** | **String** | Data ID of the requested file | [optional] 
**progressPercentage** | **Number** | Track analysis progress until reaches 100. | [optional] 
**scanAllResultA** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**scanAllResultI** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**startTime** | **String** | Timestamp when the scanning process starts. | [optional] 
**totalAvs** | **Number** | Total number of scanning engines used as part of this analysis. | [optional] 
**totalTime** | **Number** | Total time elapsed during scan (in milliseconds). | [optional] 
**scanDetails** | [**MetascanReportScanDetails**](MetascanReportScanDetails.md) |  | [optional] 


