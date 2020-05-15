# WWW::OpenAPIClient::Object::AdminConfigSession

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdminConfigSession;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute_session_timeout** | **int** | The interval (in milliseconds) for overall session length timeout (regardless of activity). | [optional] 
**allow_cross_ip_sessions** | **boolean** | Allow requests from the same user to come from different IPs. | [optional] 
**allow_duplicate_session** | **boolean** | Allow same user to have multiple active sessions. | [optional] 
**session_timeout** | **int** | The interval (in milliseconds) for the user&#39;s session timeout, based on last activity. Timer starts after the last activity for the apikey. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


