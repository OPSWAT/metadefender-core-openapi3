
package org.openapitools.client.model


case class BatchResponseBatchFilesProcessInfo (
    /* Provides the reason why the file is blocked (if so). */
    _blockedReason: Option[String],
    /* Percentage of processing completed (from 1-100). */
    _progressPercentage: Option[Integer],
    /* The final result of processing the file (Allowed / Blocked / Processing). */
    _result: Option[String],
    /* Aggregated list of potential issues. */
    _verdicts: Option[List[String]]
)
object BatchResponseBatchFilesProcessInfo {
    def toStringBody(var_blockedReason: Object, var_progressPercentage: Object, var_result: Object, var_verdicts: Object) =
        s"""
        | {
        | "blockedReason":$var_blockedReason,"progressPercentage":$var_progressPercentage,"result":$var_result,"verdicts":$var_verdicts
        | }
        """.stripMargin
}
