
package org.openapitools.client.model


case class DLPResponseDlpInfoRedact (
    /* Result of the redaction process, possible values: * `redacted` * `not redacted` * `failed to redact`  */
    _result: Option[String]
)
object DLPResponseDlpInfoRedact {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
