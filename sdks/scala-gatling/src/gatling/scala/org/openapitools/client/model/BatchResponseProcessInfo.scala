
package org.openapitools.client.model


case class BatchResponseProcessInfo (
    /* Provides the reason why the file is blocked (if so). */
    _blockedReason: Option[String],
    /* Indicates if the input file's detected type was configured to skip scanning. */
    _fileTypeSkippedScan: Option[Boolean],
    /* The used rule name. */
    _profile: Option[String],
    /* The final result of processing the file (Allowed / Blocked / Processing). */
    _result: Option[String],
    /* Identifier for the REST Client that calls the API. */
    _userAgent: Option[String],
    /* User identifier who submitted scan request earlier. */
    _username: Option[String]
)
object BatchResponseProcessInfo {
    def toStringBody(var_blockedReason: Object, var_fileTypeSkippedScan: Object, var_profile: Object, var_result: Object, var_userAgent: Object, var_username: Object) =
        s"""
        | {
        | "blockedReason":$var_blockedReason,"fileTypeSkippedScan":$var_fileTypeSkippedScan,"profile":$var_profile,"result":$var_result,"userAgent":$var_userAgent,"username":$var_username
        | }
        """.stripMargin
}
