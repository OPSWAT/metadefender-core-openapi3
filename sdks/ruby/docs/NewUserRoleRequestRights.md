# OpenapiClient::NewUserRoleRequestRights

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agents** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for Node. | [optional] 
**cert** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for Certificates. | [optional] 
**configlog** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for Configuration logs. | [optional] 
**engines** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for Engines and Modules. | [optional] 
**external** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for External actions (External Scanner/Post Actions). | [optional] 
**license** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the License. | [optional] 
**quarantine** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the Quarantine. | [optional] 
**retention** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the retention policies. | [optional] 
**rule** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the workflow rules. | [optional] 
**scan** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing analysis actions. | [optional] 
**scanlog** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the analysis logs. | [optional] 
**skip** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the Whitelist/blacklist defined in the Inventory. | [optional] 
**update** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the update configuration. | [optional] 
**updatelog** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the update logs. | [optional] 
**users** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the users. | [optional] 
**workflow** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the workflow templates. | [optional] 
**zone** | [**RolePermissionObject**](RolePermissionObject.md) | What permissions are allowed for managing the network zones. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::NewUserRoleRequestRights.new(agents: null,
                                 cert: null,
                                 configlog: null,
                                 engines: null,
                                 external: null,
                                 license: null,
                                 quarantine: null,
                                 retention: null,
                                 rule: null,
                                 scan: null,
                                 scanlog: null,
                                 skip: null,
                                 update: null,
                                 updatelog: null,
                                 users: null,
                                 workflow: null,
                                 zone: null)
```


