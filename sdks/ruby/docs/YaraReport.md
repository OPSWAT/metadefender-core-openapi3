# OpenapiClient::YaraReport

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hits** | [**Object**](.md) | detailed results that contains the name of the matched rules and a description for each. | [optional] 
**verdict** | [**ScanResultEnum**](ScanResultEnum.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::YaraReport.new(hits: null,
                                 verdict: null)
```


