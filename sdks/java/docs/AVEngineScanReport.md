

# AVEngineScanReport

Scan report per each engine.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defTime** | **String** | The database definition time for this engine |  [optional]
**engId** | **String** | The  unique identification string for the engine |  [optional]
**location** | **String** | Where this engine is deployed (local/remote). |  [optional]
**scanResultI** | **Integer** | Scan result as index in the Processing Results table |  [optional]
**scanTime** | **Integer** | The time elapsed during scan with this engine (in milliseconds). |  [optional]
**threatFound** | **String** | The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine. |  [optional]
**waitTime** | **Integer** | Time elapsed between sending file to node and receiving the result from the engine (in milliseconds). |  [optional]



