

# StatNodesEngines

Engine summary
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If used by at least one engine |  [optional]
**dbVer** | **String** | The database version for this engine |  [optional]
**defTime** | **String** | The database definition time for this engine |  [optional]
**engName** | **String** | Engine name |  [optional]
**engVer** | **String** | Engine&#39;s version (format differs from one engine to another). |  [optional]
**engineType** | [**EngineTypeEnum**](#EngineTypeEnum) | Engine&#39;s type:    * av   * archive   * filetype  |  [optional]
**id** | **String** | Engine internal ID |  [optional]



## Enum: EngineTypeEnum

Name | Value
---- | -----
AV | &quot;av&quot;
ARCHIVE | &quot;archive&quot;
FILETYPE | &quot;filetype&quot;



