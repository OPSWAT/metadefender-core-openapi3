# OpenapiClient::AdminConfigUpdateDisabledupdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**days** | **String** | A particular day (index of the week) or a defined interval (Fri-Sun -&gt; 5-7) | [optional] 
**from** | **Integer** | When to start the lockdown, expressed in minutes (8 AM&#x3D;480) | [optional] 
**to** | **Integer** | When to end the lockdown, expressed in minutes (4 PM&#x3D;960) | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AdminConfigUpdateDisabledupdate.new(days: 5-7,
                                 from: 480,
                                 to: 960)
```


