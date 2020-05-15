# OpenapiClient::InlineResponse20013

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_nodes_allowed** | **Boolean** | Configuration option if additional external nodes could be connected. | [optional] 
**max_node_count** | **Integer** | Remaining available slots to connect to this instance. | [optional] 
**statuses** | [**Array&lt;StatNodesStatuses&gt;**](StatNodesStatuses.md) | Array with a status for each attached node. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse20013.new(external_nodes_allowed: false,
                                 max_node_count: 1,
                                 statuses: null)
```


