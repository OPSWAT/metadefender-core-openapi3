# MetascanReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DataId** | **string** | Data ID of the requested file | [optional] 
**ProgressPercentage** | **int32** | Track analysis progress until reaches 100. | [optional] 
**ScanAllResultA** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**ScanAllResultI** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**StartTime** | **string** | Timestamp when the scanning process starts. | [optional] 
**TotalAvs** | **int32** | Total number of scanning engines used as part of this analysis. | [optional] 
**TotalTime** | **int32** | Total time elapsed during scan (in milliseconds). | [optional] 
**ScanDetails** | [**MetascanReportScanDetails**](MetascanReport_scan_details.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


