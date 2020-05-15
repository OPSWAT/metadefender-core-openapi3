# OpenapiClient::DLPResponseDlpInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certainty** | **String** | Describes how certain the hit is, possible values:   * &#x60;Very Low&#x60;   * &#x60;Low&#x60;   * &#x60;Medium&#x60;   * &#x60;High&#x60;   * &#x60;Very High&#x60;  | [optional] 
**errors** | [**Object**](.md) | A  list of error objects (empty if no errors happened), each error object contains following keys:   * &#x60;scan&#x60;: scan related error description   * &#x60;redact&#x60;: redaction related error description   * &#x60;watermark&#x60;: watermark related error description   * &#x60;metadata_removal&#x60;: metadata removal related error description  | [optional] 
**filename** | **String** | Output processed file name (pre-configured on engine settings under Core&#39;s worflow rule) | [optional] 
**hits** | [**DLPResponseDlpInfoHits**](DLPResponseDlpInfoHits.md) |  | [optional] 
**metadata_removal** | [**DLPResponseDlpInfoMetadataRemoval**](DLPResponseDlpInfoMetadataRemoval.md) |  | [optional] 
**redact** | [**DLPResponseDlpInfoRedact**](DLPResponseDlpInfoRedact.md) |  | [optional] 
**severity** | **Integer** | (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * &#x60;0&#x60; - Certainly is data loss   * &#x60;1&#x60; - Might be data loss  | [optional] 
**verdict** | **Integer** | The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  |  | [optional] 
**watermark** | [**DLPResponseDlpInfoWatermark**](DLPResponseDlpInfoWatermark.md) |  | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DLPResponseDlpInfo.new(certainty: High,
                                 errors: {redact&#x3D;File structure invalid.},
                                 filename: OPSWAT_Proactive_DLP_CCN_proactive-dlp-processed_by_OPSWAT_MetaDefender_8101abae27be4d63859c55d9e0ed0135.pdf,
                                 hits: null,
                                 metadata_removal: null,
                                 redact: null,
                                 severity: 0,
                                 verdict: 1,
                                 watermark: null)
```


