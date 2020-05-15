
# Org.OpenAPITools.Model.AVEngineScanReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DefTime** | **string** | The database definition time for this engine | [optional] 
**EngId** | **string** | The  unique identification string for the engine | [optional] 
**Location** | **string** | Where this engine is deployed (local/remote). | [optional] 
**ScanResultI** | **int** | Scan result as index in the Processing Results table | [optional] 
**ScanTime** | **int** | The time elapsed during scan with this engine (in milliseconds). | [optional] 
**ThreatFound** | **string** | The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine. | [optional] 
**WaitTime** | **int** | Time elapsed between sending file to node and receiving the result from the engine (in milliseconds). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

