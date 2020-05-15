# OpenapiClient::AnalysisResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_id** | **String** | data identifier of the requested file | [optional] 
**dlp_info** | [**DLPResponse**](DLPResponse.md) |  | [optional] 
**file_info** | [**FileInformation**](FileInformation.md) |  | [optional] 
**process_info** | [**AnalysisResultProcessInfo**](AnalysisResultProcessInfo.md) |  | [optional] 
**scan_results** | [**MetascanReport**](MetascanReport.md) |  | [optional] 
**vulnerability_info** | [**VulnerabilityResponse**](VulnerabilityResponse.md) |  | [optional] 
**yara** | [**YaraReport**](YaraReport.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AnalysisResult.new(data_id: 8101abae27be4d63859c55d9e0ed0135,
                                 dlp_info: null,
                                 file_info: null,
                                 process_info: null,
                                 scan_results: null,
                                 vulnerability_info: null,
                                 yara: null)
```


