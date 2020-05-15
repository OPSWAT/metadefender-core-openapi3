
package org.openapitools.client.model


case class DLPRuleMatchResult (
    /* The context after the matched data. */
    _after: Option[String],
    /* The context before the matched data. */
    _before: Option[String],
    /* The text version of \"certainty_score\", possible values:   * `Very Low`     * `Low`     * `Medium`     * `High`     * `Very High`  */
    _certainty: Option[String],
    /* Is  defined by the relevance of the given hit in its context. It is calculated based on multiple factors such as the number of digits, possible values: [0-100]  */
    _certaintyScore: Option[Integer],
    /* The matched data. */
    _hit: Option[String],
    /* If file was redacted or not. */
    _isRedacted: Option[Boolean],
    /* (NOTE: this field is deprecated): can be 0 (detected) or 1 (suspicious).  */
    _severity: Option[Integer]
)
object DLPRuleMatchResult {
    def toStringBody(var_after: Object, var_before: Object, var_certainty: Object, var_certaintyScore: Object, var_hit: Object, var_isRedacted: Object, var_severity: Object) =
        s"""
        | {
        | "after":$var_after,"before":$var_before,"certainty":$var_certainty,"certaintyScore":$var_certaintyScore,"hit":$var_hit,"isRedacted":$var_isRedacted,"severity":$var_severity
        | }
        """.stripMargin
}
