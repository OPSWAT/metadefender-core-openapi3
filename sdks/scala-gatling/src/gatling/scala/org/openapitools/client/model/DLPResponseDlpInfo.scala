
package org.openapitools.client.model


case class DLPResponseDlpInfo (
    /* Describes how certain the hit is, possible values:   * `Very Low`   * `Low`   * `Medium`   * `High`   * `Very High`  */
    _certainty: Option[String],
    /* A  list of error objects (empty if no errors happened), each error object contains following keys:   * `scan`: scan related error description   * `redact`: redaction related error description   * `watermark`: watermark related error description   * `metadata_removal`: metadata removal related error description  */
    _errors: Option[Any],
    /* Output processed file name (pre-configured on engine settings under Core's worflow rule) */
    _filename: Option[String],
    _hits: Option[DLPResponseDlpInfoHits],
    _metadataRemoval: Option[DLPResponseDlpInfoMetadataRemoval],
    _redact: Option[DLPResponseDlpInfoRedact],
    /* (NOTE: this field is deprecated): represents the severity of the data loss, possible values:   * `0` - Certainly is data loss   * `1` - Might be data loss  */
    _severity: Option[Integer],
    /* The overall result for the scanned file. It can be   | index         | status                       |   |---------------|------------------------------|   | 0             | Clean                        |   | 1             | Found matched data           |   | 2             | Suspicious                   |   | 3             | Failed                       |   | 4             | Not scanned                  |  */
    _verdict: Option[Integer],
    _watermark: Option[DLPResponseDlpInfoWatermark]
)
object DLPResponseDlpInfo {
    def toStringBody(var_certainty: Object, var_errors: Object, var_filename: Object, var_hits: Object, var_metadataRemoval: Object, var_redact: Object, var_severity: Object, var_verdict: Object, var_watermark: Object) =
        s"""
        | {
        | "certainty":$var_certainty,"errors":$var_errors,"filename":$var_filename,"hits":$var_hits,"metadataRemoval":$var_metadataRemoval,"redact":$var_redact,"severity":$var_severity,"verdict":$var_verdict,"watermark":$var_watermark
        | }
        """.stripMargin
}
