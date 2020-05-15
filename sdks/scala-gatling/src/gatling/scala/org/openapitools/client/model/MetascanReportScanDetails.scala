
package org.openapitools.client.model


case class MetascanReportScanDetails (
    _clamAV: Option[AVEngineScanReport]
)
object MetascanReportScanDetails {
    def toStringBody(var_clamAV: Object) =
        s"""
        | {
        | "clamAV":$var_clamAV
        | }
        """.stripMargin
}
