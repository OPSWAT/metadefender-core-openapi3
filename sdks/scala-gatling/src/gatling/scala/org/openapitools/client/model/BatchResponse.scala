
package org.openapitools.client.model


case class BatchResponse (
    _batchFiles: Option[BatchResponseBatchFiles],
    /* The batch unique identifer */
    _batchId: Option[String],
    /* The batch status (open/close). */
    _isClosed: Option[Boolean],
    _processInfo: Option[BatchResponseProcessInfo],
    _scanResults: Option[BatchResponseScanResults],
    /* Metadata submitted at batch creation. */
    _userData: Option[String]
)
object BatchResponse {
    def toStringBody(var_batchFiles: Object, var_batchId: Object, var_isClosed: Object, var_processInfo: Object, var_scanResults: Object, var_userData: Object) =
        s"""
        | {
        | "batchFiles":$var_batchFiles,"batchId":$var_batchId,"isClosed":$var_isClosed,"processInfo":$var_processInfo,"scanResults":$var_scanResults,"userData":$var_userData
        | }
        """.stripMargin
}
