# # AVEngineScanReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**def_time** | **string** | The database definition time for this engine | [optional] 
**eng_id** | **string** | The  unique identification string for the engine | [optional] 
**location** | **string** | Where this engine is deployed (local/remote). | [optional] 
**scan_result_i** | **int** | Scan result as index in the Processing Results table | [optional] 
**scan_time** | **int** | The time elapsed during scan with this engine (in milliseconds). | [optional] 
**threat_found** | **string** | The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine. | [optional] 
**wait_time** | **int** | Time elapsed between sending file to node and receiving the result from the engine (in milliseconds). | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


