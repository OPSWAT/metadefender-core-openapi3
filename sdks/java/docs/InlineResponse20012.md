

# InlineResponse20012

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If used by at least one engine |  [optional]
**defTime** | **String** | The database definition time for this engine |  [optional]
**downloadProgress** | **Integer** | The percentage progress of download |  [optional]
**downloadTime** | **String** | When this engine downloaded from the update server. |  [optional]
**engId** | **String** | Engine internal ID |  [optional]
**engName** | **String** | Engine name |  [optional]
**engType** | **String** | Engine type in human readable form |  [optional]
**engVer** | **String** | Engine&#39;s version (format differs from one engine to another). |  [optional]
**engineType** | [**EngineTypeEnum**](#EngineTypeEnum) | Engine&#39;s type:    * av   * archive   * filetype  |  [optional]
**state** | [**StateEnum**](#StateEnum) | Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed  |  [optional]



## Enum: EngineTypeEnum

Name | Value
---- | -----
AV | &quot;av&quot;
ARCHIVE | &quot;archive&quot;
FILETYPE | &quot;filetype&quot;



## Enum: StateEnum

Name | Value
---- | -----
DOWNLOADING | &quot;downloading&quot;
DOWNLOADED | &quot;downloaded&quot;
STAGING | &quot;staging&quot;
PRODUCTION | &quot;production&quot;
REMOVED | &quot;removed&quot;
TEMPORARY_FAILED | &quot;temporary failed&quot;
PERMANENTLY_FAILED | &quot;permanently failed&quot;
CONTENT_INVALID | &quot;content invalid&quot;
DOWNLOAD_FAILED | &quot;download failed&quot;



