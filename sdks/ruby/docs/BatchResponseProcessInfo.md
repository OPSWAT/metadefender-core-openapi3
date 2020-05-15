# OpenapiClient::BatchResponseProcessInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blocked_reason** | **String** | Provides the reason why the file is blocked (if so). | [optional] 
**file_type_skipped_scan** | **Boolean** | Indicates if the input file&#39;s detected type was configured to skip scanning. | [optional] 
**profile** | **String** | The used rule name. | [optional] 
**result** | **String** | The final result of processing the file (Allowed / Blocked / Processing). | [optional] 
**user_agent** | **String** | Identifier for the REST Client that calls the API. | [optional] 
**username** | **String** | User identifier who submitted scan request earlier. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::BatchResponseProcessInfo.new(blocked_reason: Infected,
                                 file_type_skipped_scan: false,
                                 profile: File process,
                                 result: Blocked,
                                 user_agent: mdicapserver,
                                 username: LOCAL/admin)
```


