# WWW::OpenAPIClient::Object::AnalysisResult

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AnalysisResult;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_id** | **string** | data identifier of the requested file | [optional] 
**dlp_info** | [**DLPResponse**](DLPResponse.md) |  | [optional] 
**file_info** | [**FileInformation**](FileInformation.md) |  | [optional] 
**process_info** | [**AnalysisResultProcessInfo**](AnalysisResultProcessInfo.md) |  | [optional] 
**scan_results** | [**MetascanReport**](MetascanReport.md) |  | [optional] 
**vulnerability_info** | [**VulnerabilityResponse**](VulnerabilityResponse.md) |  | [optional] 
**yara** | [**YaraReport**](YaraReport.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


