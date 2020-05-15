# MetascanReport

Result of the scanning process.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_id** | **str** | Data ID of the requested file | [optional] 
**progress_percentage** | **int** | Track analysis progress until reaches 100. | [optional] 
**scan_all_result_a** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**scan_all_result_i** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**start_time** | **str** | Timestamp when the scanning process starts. | [optional] 
**total_avs** | **int** | Total number of scanning engines used as part of this analysis. | [optional] 
**total_time** | **int** | Total time elapsed during scan (in milliseconds). | [optional] 
**scan_details** | [**MetascanReportScanDetails**](MetascanReportScanDetails.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


