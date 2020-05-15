# OpenapiClient::InlineResponse20012

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If used by at least one engine | [optional] 
**def_time** | **String** | The database definition time for this engine | [optional] 
**download_progress** | **Integer** | The percentage progress of download | [optional] 
**download_time** | **String** | When this engine downloaded from the update server. | [optional] 
**eng_id** | **String** | Engine internal ID | [optional] 
**eng_name** | **String** | Engine name | [optional] 
**eng_type** | **String** | Engine type in human readable form | [optional] 
**eng_ver** | **String** | Engine&#39;s version (format differs from one engine to another). | [optional] 
**engine_type** | **String** | Engine&#39;s type:    * av   * archive   * filetype  | [optional] 
**state** | **String** | Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse20012.new(active: true,
                                 def_time: 2020-04-17T02:37:05.000Z,
                                 download_progress: 100,
                                 download_time: 2020-04-17T08:17:22.810Z,
                                 eng_id: clamav_1_linux,
                                 eng_name: ClamAV,
                                 eng_type: Bundled engine,
                                 eng_ver: 3.0-43,
                                 engine_type: av,
                                 state: production)
```


