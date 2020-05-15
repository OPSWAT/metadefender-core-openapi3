# OpenapiClient::StatNodesIssues

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Text detailing the issue. | [optional] 
**severity** | **String** | How important is the reported issue. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::StatNodesIssues.new(description: 1 engines are not deployed to this node,
                                 severity: warning)
```


