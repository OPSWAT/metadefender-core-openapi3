

# AnalysisResultProcessInfoPostProcessing

Contains information about result of sanitization process and any action done after finalizing the process using Post Actions.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionsFailed** | **String** | Empty string if no action failed or list of failed actions, separated by \&quot;|\&quot;. |  [optional]
**actionsRan** | **String** | List of successful actions, separated by \&quot;|\&quot;. Empty string if otherwise. |  [optional]
**convertedDestination** | **String** | Contains the name of the sanitized file. |  [optional]
**convertedTo** | **String** | Contains target type name of sanitization. |  [optional]
**copyMoveDestination** | **String** | Contains target type name of sanitization. |  [optional]
**sanitizationDetails** | [**DeepCDRDetails**](DeepCDRDetails.md) | Contains target type name of sanitization. |  [optional]



