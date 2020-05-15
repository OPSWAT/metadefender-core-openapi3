
package org.openapitools.client.model


case class BatchResponseBatchFiles (
    /* How many files/entries in the batch. */
    _batchCount: Option[Integer],
    /* The list of files in this batch. */
    _filesInBatch: Option[List[BatchResponseBatchFilesFilesInBatch]],
    /* The starting index in the batch. Used for pagination. */
    _firstIndex: Option[Integer],
    /* The number of entries per page. */
    _pageSize: Option[Integer]
)
object BatchResponseBatchFiles {
    def toStringBody(var_batchCount: Object, var_filesInBatch: Object, var_firstIndex: Object, var_pageSize: Object) =
        s"""
        | {
        | "batchCount":$var_batchCount,"filesInBatch":$var_filesInBatch,"firstIndex":$var_firstIndex,"pageSize":$var_pageSize
        | }
        """.stripMargin
}
