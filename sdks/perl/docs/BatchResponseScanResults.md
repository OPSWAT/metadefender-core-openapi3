# WWW::OpenAPIClient::Object::BatchResponseScanResults

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BatchResponseScanResults;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **string** | The batch unique identifer | [optional] 
**scan_all_result_a** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**scan_all_result_i** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**start_time** | **string** | Timestamp when the scanning process starts. | [optional] 
**total_avs** | **int** | Total number of scanning engines used as part of this analysis. | [optional] 
**total_time** | **int** | Total time elapsed during scan (in milliseconds). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


