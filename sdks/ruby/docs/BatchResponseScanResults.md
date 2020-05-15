# OpenapiClient::BatchResponseScanResults

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **String** | The batch unique identifer | [optional] 
**scan_all_result_a** | [**ProcessingResultsStringEnum**](ProcessingResultsStringEnum.md) | The overall scan result as string | [optional] 
**scan_all_result_i** | [**ProcessingResultsIndexEnum**](ProcessingResultsIndexEnum.md) | The overall scan result as index in the Processing Results table. | [optional] 
**start_time** | **String** | Timestamp when the scanning process starts. | [optional] 
**total_avs** | **Integer** | Total number of scanning engines used as part of this analysis. | [optional] 
**total_time** | **Integer** | Total time elapsed during scan (in milliseconds). | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::BatchResponseScanResults.new(batch_id: b7cc760038324b02908a5c111cb1563d,
                                 scan_all_result_a: Infected,
                                 scan_all_result_i: 1,
                                 start_time: 2020-03-12T08:37:05.427Z,
                                 total_avs: 0,
                                 total_time: 18403)
```


