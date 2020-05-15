

# DeepCDRDetailsDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The type of action that was performed | 
**objectName** | **String** | The object type that was sanitized/removed. | 
**count** | **Integer** | The number of objects that were sanitized/removed. |  [optional]
**objectDetails** | **String** | Additional information about the sanitized object |  [optional]
**fileName** | **String** | If an embedded file was sanitized. |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
SANITIZED | &quot;sanitized&quot;
REMOVED | &quot;removed&quot;



