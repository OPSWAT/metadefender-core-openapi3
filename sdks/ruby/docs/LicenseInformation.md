# OpenapiClient::LicenseInformation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days_left** | **Integer** | Number of days left before expiration | [optional] 
**deployment** | **String** | Unique identifier which is maps the current deployment to the activation | [optional] 
**expiration** | **String** | Expiration date in MM/DD/YYYY format. | [optional] 
**licensed_engines** | **Array&lt;String&gt;** | List of engine/module identifiers that have been licensed | [optional] 
**max_node_count** | **String** | Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance. | [optional] 
**online_activated** | **Boolean** | Track online/offline activation mode | [optional] 
**product_id** | **String** | Official MetaDefender base SKU licensed. | [optional] 
**product_name** | **String** | Official MetaDefender base product name licensed. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::LicenseInformation.new(days_left: null,
                                 deployment: null,
                                 expiration: null,
                                 licensed_engines: null,
                                 max_node_count: null,
                                 online_activated: null,
                                 product_id: null,
                                 product_name: null)
```


