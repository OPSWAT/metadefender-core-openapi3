
package org.openapitools.client.model


case class AnalysisResult (
    /* data identifier of the requested file */
    _dataId: Option[String],
    _dlpInfo: Option[DLPResponse],
    _fileInfo: Option[FileInformation],
    _processInfo: Option[AnalysisResultProcessInfo],
    _scanResults: Option[MetascanReport],
    _vulnerabilityInfo: Option[VulnerabilityResponse],
    _yara: Option[YaraReport]
)
object AnalysisResult {
    def toStringBody(var_dataId: Object, var_dlpInfo: Object, var_fileInfo: Object, var_processInfo: Object, var_scanResults: Object, var_vulnerabilityInfo: Object, var_yara: Object) =
        s"""
        | {
        | "dataId":$var_dataId,"dlpInfo":$var_dlpInfo,"fileInfo":$var_fileInfo,"processInfo":$var_processInfo,"scanResults":$var_scanResults,"vulnerabilityInfo":$var_vulnerabilityInfo,"yara":$var_yara
        | }
        """.stripMargin
}
