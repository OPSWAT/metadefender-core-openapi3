

# AdminConfigSession

API object for /admin/config/session
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absoluteSessionTimeout** | **Integer** | The interval (in milliseconds) for overall session length timeout (regardless of activity). |  [optional]
**allowCrossIpSessions** | **Boolean** | Allow requests from the same user to come from different IPs. |  [optional]
**allowDuplicateSession** | **Boolean** | Allow same user to have multiple active sessions. |  [optional]
**sessionTimeout** | **Integer** | The interval (in milliseconds) for the user&#39;s session timeout, based on last activity. Timer starts after the last activity for the apikey. |  [optional]



