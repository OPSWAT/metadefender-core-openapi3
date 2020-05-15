# OpenapiClient::AdminConfigSession

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute_session_timeout** | **Integer** | The interval (in milliseconds) for overall session length timeout (regardless of activity). | [optional] 
**allow_cross_ip_sessions** | **Boolean** | Allow requests from the same user to come from different IPs. | [optional] 
**allow_duplicate_session** | **Boolean** | Allow same user to have multiple active sessions. | [optional] 
**session_timeout** | **Integer** | The interval (in milliseconds) for the user&#39;s session timeout, based on last activity. Timer starts after the last activity for the apikey. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AdminConfigSession.new(absolute_session_timeout: 0,
                                 allow_cross_ip_sessions: true,
                                 allow_duplicate_session: true,
                                 session_timeout: 300000)
```


