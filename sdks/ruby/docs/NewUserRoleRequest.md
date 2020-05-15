# OpenapiClient::NewUserRoleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name identifier of the role | [optional] 
**display_name** | **String** | The extended name showed in the Management Console. | [optional] 
**rights** | [**NewUserRoleRequestRights**](NewUserRoleRequestRights.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::NewUserRoleRequest.new(name: new_role,
                                 display_name: New MetaDefender User Role,
                                 rights: null)
```


