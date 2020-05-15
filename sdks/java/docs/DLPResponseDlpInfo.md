

# DLPResponseDlpInfo

Information on matched sensitive data
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certainty** | [**CertaintyEnum**](#CertaintyEnum) | Describes how certain the hit is, possible values:   * &#x60;Very Low&#x60;   * &#x60;Low&#x60;   * &#x60;Medium&#x60;   * &#x60;High&#x60;   * &#x60;Very High&#x60;  |  [optional]
**errors** | [**Object**](.md) | A  list of error objects (empty if no errors happened), each error object contains following keys:   * &#x60;scan&#x60;: scan related error description   * &#x60;redact&#x60;: redaction related error description   * &#x60;watermark&#x60;: watermark related error description   * &#x60;metadata_removal&#x60;: metadata removal related error description  |  [optional]
**filename** | **String** | Output processed file name (pre-configured on engine settings under Core&#39;s worflow rule) |  [optional]
**hits** | [**DLPResponseDlpInfoHits**](DLPResponseDlpInfoHits.md) |  |  [optional]
**metadataRemoval** | [**DLPResponseDlpInfoMetadataRemoval**](DLPResponseDlpInfoMetadataRemoval.md) |  |  [optional]
**redact** | [**DLPResponseDlpInfoRedact**](DLPResponseDlpInfoRedact.md) |  |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * &#x60;0&#x60; - Certainly is data loss   * &#x60;1&#x60; - Might be data loss  |  [optional]
**verdict** | [**VerdictEnum**](#VerdictEnum) | The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  |  |  [optional]
**watermark** | [**DLPResponseDlpInfoWatermark**](DLPResponseDlpInfoWatermark.md) |  |  [optional]



## Enum: CertaintyEnum

Name | Value
---- | -----
VERY_LOW | &quot;Very Low&quot;
LOW | &quot;Low&quot;
MEDIUM | &quot;Medium&quot;
HIGH | &quot;High&quot;
VERY_HIGH | &quot;Very High&quot;



## Enum: SeverityEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1



## Enum: VerdictEnum

Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4



