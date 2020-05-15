
package org.openapitools.client.model


case class BatchResponseScanResults (
    /* The batch unique identifer */
    _batchId: Option[String],
    /* The overall scan result as string */
    _scanAllResultA: Option[ProcessingResultsStringEnum],
    /* The overall scan result as index in the Processing Results table. */
    _scanAllResultI: Option[ProcessingResultsIndexEnum],
    /* Timestamp when the scanning process starts. */
    _startTime: Option[String],
    /* Total number of scanning engines used as part of this analysis. */
    _totalAvs: Option[Integer],
    /* Total time elapsed during scan (in milliseconds). */
    _totalTime: Option[Integer]
)
object BatchResponseScanResults {
    def toStringBody(var_batchId: Object, var_scanAllResultA: Object, var_scanAllResultI: Object, var_startTime: Object, var_totalAvs: Object, var_totalTime: Object) =
        s"""
        | {
        | "batchId":$var_batchId,"scanAllResultA":$var_scanAllResultA,"scanAllResultI":$var_scanAllResultI,"startTime":$var_startTime,"totalAvs":$var_totalAvs,"totalTime":$var_totalTime
        | }
        """.stripMargin
}
