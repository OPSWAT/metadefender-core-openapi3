# OpenapiClient::AVEngineScanReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**def_time** | **String** | The database definition time for this engine | [optional] 
**eng_id** | **String** | The  unique identification string for the engine | [optional] 
**location** | **String** | Where this engine is deployed (local/remote). | [optional] 
**scan_result_i** | **Integer** | Scan result as index in the Processing Results table | [optional] 
**scan_time** | **Integer** | The time elapsed during scan with this engine (in milliseconds). | [optional] 
**threat_found** | **String** | The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine. | [optional] 
**wait_time** | **Integer** | Time elapsed between sending file to node and receiving the result from the engine (in milliseconds). | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AVEngineScanReport.new(def_time: 2020-03-11T11:08:00.000Z,
                                 eng_id: clamav_1_windows,
                                 location: local,
                                 scan_result_i: 0,
                                 scan_time: 336,
                                 threat_found: ,
                                 wait_time: 3)
```


