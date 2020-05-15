# AnalysisResultProcessInfoPostProcessing

Contains information about result of sanitization process and any action done after finalizing the process using Post Actions.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions_failed** | **str** | Empty string if no action failed or list of failed actions, separated by \&quot;|\&quot;. | [optional] 
**actions_ran** | **str** | List of successful actions, separated by \&quot;|\&quot;. Empty string if otherwise. | [optional] 
**converted_destination** | **str** | Contains the name of the sanitized file. | [optional] 
**converted_to** | **str** | Contains target type name of sanitization. | [optional] 
**copy_move_destination** | **str** | Contains target type name of sanitization. | [optional] 
**sanitization_details** | [**DeepCDRDetails**](DeepCDRDetails.md) | Contains target type name of sanitization. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


