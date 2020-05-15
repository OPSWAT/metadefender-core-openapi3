# OpenapiClient::AnalysisResultProcessInfoPostProcessing

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions_failed** | **String** | Empty string if no action failed or list of failed actions, separated by \&quot;|\&quot;. | [optional] 
**actions_ran** | **String** | List of successful actions, separated by \&quot;|\&quot;. Empty string if otherwise. | [optional] 
**converted_destination** | **String** | Contains the name of the sanitized file. | [optional] 
**converted_to** | **String** | Contains target type name of sanitization. | [optional] 
**copy_move_destination** | **String** | Contains target type name of sanitization. | [optional] 
**sanitization_details** | [**DeepCDRDetails**](DeepCDRDetails.md) | Contains target type name of sanitization. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::AnalysisResultProcessInfoPostProcessing.new(actions_failed: Sanitization Failed | PAscript failed,
                                 actions_ran: Sanitized | PAscript,
                                 converted_destination: OPSWAT_Proactive_DLP_CCN_sanitized.pdf,
                                 converted_to: ,
                                 copy_move_destination: ,
                                 sanitization_details: null)
```


