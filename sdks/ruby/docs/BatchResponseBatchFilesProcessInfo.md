# OpenapiClient::BatchResponseBatchFilesProcessInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blocked_reason** | **String** | Provides the reason why the file is blocked (if so). | [optional] 
**progress_percentage** | **Integer** | Percentage of processing completed (from 1-100). | [optional] 
**result** | **String** | The final result of processing the file (Allowed / Blocked / Processing). | [optional] 
**verdicts** | **Array&lt;String&gt;** | Aggregated list of potential issues. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::BatchResponseBatchFilesProcessInfo.new(blocked_reason: Infected,
                                 progress_percentage: 100,
                                 result: Blocked,
                                 verdicts: [Infected])
```


