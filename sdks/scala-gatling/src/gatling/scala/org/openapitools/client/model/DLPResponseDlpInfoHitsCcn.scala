
package org.openapitools.client.model


case class DLPResponseDlpInfoHitsCcn (
    /* Credit Card Number, Social Security Number, or in case of RegEx, the name of the rule that has been given by the user */
    _displayName: Option[String],
    /* A list of detections that matched this rule/pattern. */
    _hits: Option[List[DLPRuleMatchResult]]
)
object DLPResponseDlpInfoHitsCcn {
    def toStringBody(var_displayName: Object, var_hits: Object) =
        s"""
        | {
        | "displayName":$var_displayName,"hits":$var_hits
        | }
        """.stripMargin
}
