# MetaDefenderCore.InlineResponse20012

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | If used by at least one engine | [optional] 
**defTime** | **String** | The database definition time for this engine | [optional] 
**downloadProgress** | **Number** | The percentage progress of download | [optional] 
**downloadTime** | **String** | When this engine downloaded from the update server. | [optional] 
**engId** | **String** | Engine internal ID | [optional] 
**engName** | **String** | Engine name | [optional] 
**engType** | **String** | Engine type in human readable form | [optional] 
**engVer** | **String** | Engine&#39;s version (format differs from one engine to another). | [optional] 
**engineType** | **String** | Engine&#39;s type:    * av   * archive   * filetype  | [optional] 
**state** | **String** | Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed  | [optional] 



## Enum: EngineTypeEnum


* `av` (value: `"av"`)

* `archive` (value: `"archive"`)

* `filetype` (value: `"filetype"`)





## Enum: StateEnum


* `downloading` (value: `"downloading"`)

* `downloaded` (value: `"downloaded"`)

* `staging` (value: `"staging"`)

* `production` (value: `"production"`)

* `removed` (value: `"removed"`)

* `temporary failed` (value: `"temporary failed"`)

* `permanently failed` (value: `"permanently failed"`)

* `content invalid` (value: `"content invalid"`)

* `download failed` (value: `"download failed"`)




