# OpenapiClient::BatchResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_files** | [**BatchResponseBatchFiles**](BatchResponseBatchFiles.md) |  | [optional] 
**batch_id** | **String** | The batch unique identifer | [optional] 
**is_closed** | **Boolean** | The batch status (open/close). | [optional] 
**process_info** | [**BatchResponseProcessInfo**](BatchResponseProcessInfo.md) |  | [optional] 
**scan_results** | [**BatchResponseScanResults**](BatchResponseScanResults.md) |  | [optional] 
**user_data** | **String** | Metadata submitted at batch creation. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::BatchResponse.new(batch_files: null,
                                 batch_id: b7cc760038324b02908a5c111cb1563d,
                                 is_closed: false,
                                 process_info: null,
                                 scan_results: null,
                                 user_data: http://localhost:8008/)
```


