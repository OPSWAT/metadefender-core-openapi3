# WWW::OpenAPIClient::Object::LicenseInformation

## Load the model package
```perl
use WWW::OpenAPIClient::Object::LicenseInformation;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days_left** | **int** | Number of days left before expiration | [optional] 
**deployment** | **string** | Unique identifier which is maps the current deployment to the activation | [optional] 
**expiration** | **string** | Expiration date in MM/DD/YYYY format. | [optional] 
**licensed_engines** | **ARRAY[string]** | List of engine/module identifiers that have been licensed | [optional] 
**max_node_count** | **string** | Total number of deployed MetaDefender Nodes attached to this MetaDefender Core instance. | [optional] 
**online_activated** | **boolean** | Track online/offline activation mode | [optional] 
**product_id** | **string** | Official MetaDefender base SKU licensed. | [optional] 
**product_name** | **string** | Official MetaDefender base product name licensed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


