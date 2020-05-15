
package org.openapitools.client.model


case class DLPResponse (
    _dlpInfo: Option[DLPResponseDlpInfo]
)
object DLPResponse {
    def toStringBody(var_dlpInfo: Object) =
        s"""
        | {
        | "dlpInfo":$var_dlpInfo
        | }
        """.stripMargin
}
