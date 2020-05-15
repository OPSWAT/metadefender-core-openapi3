
package org.openapitools.client.model


case class BatchId (
    /* The batch identifier used to submit files in the batch and to close the batch. */
    _batchId: String
)
object BatchId {
    def toStringBody(var_batchId: Object) =
        s"""
        | {
        | "batchId":$var_batchId
        | }
        """.stripMargin
}
