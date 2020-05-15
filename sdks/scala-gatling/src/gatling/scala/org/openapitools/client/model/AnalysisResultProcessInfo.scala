
package org.openapitools.client.model


case class AnalysisResultProcessInfo (
    /* Provides the reason why the file is blocked (if so). */
    _blockedReason: Option[String],
    /* Indicates if the input file's detected type was configured to skip scanning. */
    _fileTypeSkippedScan: Option[Boolean],
    /* array of flags - if occur - describing outdated data in the result, these can be   * enginedefinitions: at least one of the AV engines the item was scanned with has a newer definition database   * configuration: the process' rule - or any item used by the rule - was modified since the item was processed   * sanitization: if item was sanitized this flag notifies that the sanitization information regarding this result is outdated, meaning the sanitized item is no longer available                */
    _outdatedData: Option[List[String]],
    /* Total time elapsed during processing file on the node (in milliseconds). */
    _processingTime: Option[Integer],
    /* The used rule name. */
    _profile: Option[String],
    /* Percentage of processing completed (from 1-100). */
    _progressPercentage: Option[Integer],
    /* Total time elapsed while the file waits in the queue (in milliseconds). */
    _queueTime: Option[Integer],
    /* The final result of processing the file (Allowed / Blocked / Processing). */
    _result: Option[String],
    /* Identifier for the REST Client that calls the API. */
    _userAgent: Option[String],
    /* User identifier who submitted scan request earlier. */
    _username: Option[String],
    /* Aggregated list of potential issues. */
    _verdicts: Option[List[String]],
    _postProcessing: Option[AnalysisResultProcessInfoPostProcessing]
)
object AnalysisResultProcessInfo {
    def toStringBody(var_blockedReason: Object, var_fileTypeSkippedScan: Object, var_outdatedData: Object, var_processingTime: Object, var_profile: Object, var_progressPercentage: Object, var_queueTime: Object, var_result: Object, var_userAgent: Object, var_username: Object, var_verdicts: Object, var_postProcessing: Object) =
        s"""
        | {
        | "blockedReason":$var_blockedReason,"fileTypeSkippedScan":$var_fileTypeSkippedScan,"outdatedData":$var_outdatedData,"processingTime":$var_processingTime,"profile":$var_profile,"progressPercentage":$var_progressPercentage,"queueTime":$var_queueTime,"result":$var_result,"userAgent":$var_userAgent,"username":$var_username,"verdicts":$var_verdicts,"postProcessing":$var_postProcessing
        | }
        """.stripMargin
}
