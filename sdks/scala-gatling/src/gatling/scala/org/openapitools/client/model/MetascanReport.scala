
package org.openapitools.client.model


case class MetascanReport (
    /* Data ID of the requested file */
    _dataId: Option[String],
    /* Track analysis progress until reaches 100. */
    _progressPercentage: Option[Integer],
    /* The overall scan result as string */
    _scanAllResultA: Option[ProcessingResultsStringEnum],
    /* The overall scan result as index in the Processing Results table. */
    _scanAllResultI: Option[ProcessingResultsIndexEnum],
    /* Timestamp when the scanning process starts. */
    _startTime: Option[String],
    /* Total number of scanning engines used as part of this analysis. */
    _totalAvs: Option[Integer],
    /* Total time elapsed during scan (in milliseconds). */
    _totalTime: Option[Integer],
    _scanDetails: Option[MetascanReportScanDetails]
)
object MetascanReport {
    def toStringBody(var_dataId: Object, var_progressPercentage: Object, var_scanAllResultA: Object, var_scanAllResultI: Object, var_startTime: Object, var_totalAvs: Object, var_totalTime: Object, var_scanDetails: Object) =
        s"""
        | {
        | "dataId":$var_dataId,"progressPercentage":$var_progressPercentage,"scanAllResultA":$var_scanAllResultA,"scanAllResultI":$var_scanAllResultI,"startTime":$var_startTime,"totalAvs":$var_totalAvs,"totalTime":$var_totalTime,"scanDetails":$var_scanDetails
        | }
        """.stripMargin
}
