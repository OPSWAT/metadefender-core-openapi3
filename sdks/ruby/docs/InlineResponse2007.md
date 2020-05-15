# OpenapiClient::InlineResponse2007

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | Current status of generating the package. | [optional] 
**start_time** | **String** | Used only when status is inprogress, otherwise its empty | [optional] 
**issues** | [**InlineResponse2007Issues**](InlineResponse2007Issues.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse2007.new(status: idle,
                                 start_time: ,
                                 issues: null)
```


