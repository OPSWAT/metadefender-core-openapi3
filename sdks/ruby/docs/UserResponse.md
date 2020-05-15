# OpenapiClient::UserResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apikey** | **String** | Associated apikey with this user | [optional] 
**directory_id** | **Integer** | To which User Directories belongs to (LOCAL/System/etc.) | [optional] 
**display_name** | **String** | Which is the name showed in the Management Console | [optional] 
**email** | **String** | User&#39;s email address | [optional] 
**name** | **String** | User&#39;s full name | [optional] 
**roles** | **Array&lt;String&gt;** | A list of roles attached to this user | [optional] 
**ui_settings** | [**Object**](.md) | Configuration of Management Console for this user. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::UserResponse.new(apikey: b8a4b52f19de88e365aa4f7e403fa91b352f,
                                 directory_id: 1,
                                 display_name: jsmith,
                                 email: john.smith@company.com,
                                 name: John Smith,
                                 roles: [1, 2, 3, ...],
                                 ui_settings: {refresh_rate&#x3D;{value&#x3D;30}, time_period&#x3D;{value&#x3D;24, unitsInHour&#x3D;1}})
```


