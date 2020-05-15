# OpenapiClient::YaraSourcesObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**local_sources** | [**Array&lt;YaraSourcesObjectLocalSources&gt;**](YaraSourcesObjectLocalSources.md) | A list of all locals sources | [optional] 
**http_sources** | [**Array&lt;YaraSourcesObjectHttpSources&gt;**](YaraSourcesObjectHttpSources.md) | A list of all remote sources. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::YaraSourcesObject.new(local_sources: null,
                                 http_sources: null)
```


