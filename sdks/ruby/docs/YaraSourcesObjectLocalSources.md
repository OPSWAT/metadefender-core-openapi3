# OpenapiClient::YaraSourcesObjectLocalSources

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The location (file path) of the files. | [optional] 
**state** | **String** | Defining if this source is being used or not | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::YaraSourcesObjectLocalSources.new(source: /mnt/yara,
                                 state: enabled)
```


