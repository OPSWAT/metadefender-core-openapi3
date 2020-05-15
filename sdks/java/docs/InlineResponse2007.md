

# InlineResponse2007

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**StatusEnum**](#StatusEnum) | Current status of generating the package. |  [optional]
**startTime** | **String** | Used only when status is inprogress, otherwise its empty |  [optional]
**issues** | [**InlineResponse2007Issues**](InlineResponse2007Issues.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
IDLE | &quot;idle&quot;
ERROR | &quot;error&quot;
INPROGRESS | &quot;inprogress&quot;



