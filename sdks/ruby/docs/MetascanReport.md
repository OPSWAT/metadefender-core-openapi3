# OpenapiClient::MetascanReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_id** | **String** | Data ID of the requested file | [optional] 
**progress_percentage** | **Integer** | Track analysis progress until reaches 100. | [optional] 
**scan_all_result_a** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**scan_all_result_i** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**start_time** | **String** | Timestamp when the scanning process starts. | [optional] 
**total_avs** | **Integer** | Total number of scanning engines used as part of this analysis. | [optional] 
**total_time** | **Integer** | Total time elapsed during scan (in milliseconds). | [optional] 
**scan_details** | [**MetascanReportScanDetails**](MetascanReportScanDetails.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::MetascanReport.new(data_id: 8101abae27be4d63859c55d9e0ed0135,
                                 progress_percentage: 100,
                                 scan_all_result_a: Sensitive Data Found,
                                 scan_all_result_i: 20,
                                 start_time: 2020-03-12T08:37:05.427Z,
                                 total_avs: 1,
                                 total_time: 4804,
                                 scan_details: null)
```


