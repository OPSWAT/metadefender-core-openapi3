# OpenapiClient::StatNodesEngines

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If used by at least one engine | [optional] 
**db_ver** | **String** | The database version for this engine | [optional] 
**def_time** | **String** | The database definition time for this engine | [optional] 
**eng_name** | **String** | Engine name | [optional] 
**eng_ver** | **String** | Engine&#39;s version (format differs from one engine to another). | [optional] 
**engine_type** | **String** | Engine&#39;s type:    * av   * archive   * filetype  | [optional] 
**id** | **String** | Engine internal ID | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::StatNodesEngines.new(active: true,
                                 db_ver: 25050,
                                 def_time: 2020-04-17T02:37:05.000Z,
                                 eng_name: ClamAV,
                                 eng_ver: 3.0-43,
                                 engine_type: av,
                                 id: clamav_1_linux)
```


