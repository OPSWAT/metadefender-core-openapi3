# MetaDefenderCore.DLPResponseDlpInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certainty** | **String** | Describes how certain the hit is, possible values:   * &#x60;Very Low&#x60;   * &#x60;Low&#x60;   * &#x60;Medium&#x60;   * &#x60;High&#x60;   * &#x60;Very High&#x60;  | [optional] 
**errors** | [**Object**](.md) | A  list of error objects (empty if no errors happened), each error object contains following keys:   * &#x60;scan&#x60;: scan related error description   * &#x60;redact&#x60;: redaction related error description   * &#x60;watermark&#x60;: watermark related error description   * &#x60;metadata_removal&#x60;: metadata removal related error description  | [optional] 
**filename** | **String** | Output processed file name (pre-configured on engine settings under Core&#39;s worflow rule) | [optional] 
**hits** | [**DLPResponseDlpInfoHits**](DLPResponseDlpInfoHits.md) |  | [optional] 
**metadataRemoval** | [**DLPResponseDlpInfoMetadataRemoval**](DLPResponseDlpInfoMetadataRemoval.md) |  | [optional] 
**redact** | [**DLPResponseDlpInfoRedact**](DLPResponseDlpInfoRedact.md) |  | [optional] 
**severity** | **Number** | (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * &#x60;0&#x60; - Certainly is data loss   * &#x60;1&#x60; - Might be data loss  | [optional] 
**verdict** | **Number** | The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  |  | [optional] 
**watermark** | [**DLPResponseDlpInfoWatermark**](DLPResponseDlpInfoWatermark.md) |  | [optional] 



## Enum: CertaintyEnum


* `Very Low` (value: `"Very Low"`)

* `Low` (value: `"Low"`)

* `Medium` (value: `"Medium"`)

* `High` (value: `"High"`)

* `Very High` (value: `"Very High"`)





## Enum: SeverityEnum


* `0` (value: `0`)

* `1` (value: `1`)





## Enum: VerdictEnum


* `0` (value: `0`)

* `1` (value: `1`)

* `2` (value: `2`)

* `3` (value: `3`)

* `4` (value: `4`)




