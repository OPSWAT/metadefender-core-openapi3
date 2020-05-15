# OpenapiClient::YaraSourcesObjectHttpSources

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The location (URL) of the package. | [optional] 
**state** | **String** | Defining if this source is being used or not | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::YaraSourcesObjectHttpSources.new(source: http://onlineyarasources.net/source.zip,
                                 state: disabled)
```


