
package org.openapitools.client.model


case class BatchResponseBatchFilesFilesInBatch (
    /* Unique identifer for the file. */
    _dataId: Option[String],
    /* Total number of engines that detected this file. */
    _detectedBy: Option[Integer],
    /* The filename reported via `filename` header. */
    _displayName: Option[String],
    /* Total file size in bytes. */
    _fileSize: Option[Integer],
    /* The filetype using mimetype. */
    _fileType: Option[String],
    /* The filetype in human readable format. */
    _fileTypeDescription: Option[String],
    _processInfo: Option[BatchResponseBatchFilesProcessInfo],
    /* Track analysis progress until reaches 100. */
    _progressPercentage: Option[Integer],
    /* The overall scan result as string */
    _scanAllResultA: Option[ProcessingResultsStringEnum],
    /* The overall scan result as index in the Processing Results table. */
    _scanAllResultI: Option[ProcessingResultsIndexEnum],
    /* The total number of engines used to analyze this file. */
    _scannedWith: Option[Integer]
)
object BatchResponseBatchFilesFilesInBatch {
    def toStringBody(var_dataId: Object, var_detectedBy: Object, var_displayName: Object, var_fileSize: Object, var_fileType: Object, var_fileTypeDescription: Object, var_processInfo: Object, var_progressPercentage: Object, var_scanAllResultA: Object, var_scanAllResultI: Object, var_scannedWith: Object) =
        s"""
        | {
        | "dataId":$var_dataId,"detectedBy":$var_detectedBy,"displayName":$var_displayName,"fileSize":$var_fileSize,"fileType":$var_fileType,"fileTypeDescription":$var_fileTypeDescription,"processInfo":$var_processInfo,"progressPercentage":$var_progressPercentage,"scanAllResultA":$var_scanAllResultA,"scanAllResultI":$var_scanAllResultI,"scannedWith":$var_scannedWith
        | }
        """.stripMargin
}
