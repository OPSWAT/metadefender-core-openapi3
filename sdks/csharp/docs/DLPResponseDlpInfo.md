
# Org.OpenAPITools.Model.DLPResponseDlpInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Certainty** | **string** | Describes how certain the hit is, possible values:   * &#x60;Very Low&#x60;   * &#x60;Low&#x60;   * &#x60;Medium&#x60;   * &#x60;High&#x60;   * &#x60;Very High&#x60;  | [optional] 
**Errors** | [**Object**](.md) | A  list of error objects (empty if no errors happened), each error object contains following keys:   * &#x60;scan&#x60;: scan related error description   * &#x60;redact&#x60;: redaction related error description   * &#x60;watermark&#x60;: watermark related error description   * &#x60;metadata_removal&#x60;: metadata removal related error description  | [optional] 
**Filename** | **string** | Output processed file name (pre-configured on engine settings under Core&#39;s worflow rule) | [optional] 
**Hits** | [**DLPResponseDlpInfoHits**](DLPResponseDlpInfoHits.md) |  | [optional] 
**MetadataRemoval** | [**DLPResponseDlpInfoMetadataRemoval**](DLPResponseDlpInfoMetadataRemoval.md) |  | [optional] 
**Redact** | [**DLPResponseDlpInfoRedact**](DLPResponseDlpInfoRedact.md) |  | [optional] 
**Severity** | **int** | (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * &#x60;0&#x60; - Certainly is data loss   * &#x60;1&#x60; - Might be data loss  | [optional] 
**Verdict** | **int** | The overall result for the scanned file. It can be   | index         | status                       |   |- -- -- -- -- -- -- --|- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  |  | [optional] 
**Watermark** | [**DLPResponseDlpInfoWatermark**](DLPResponseDlpInfoWatermark.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

