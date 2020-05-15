
package org.openapitools.client.model


case class YaraReport (
    /* detailed results that contains the name of the matched rules and a description for each. */
    _hits: Option[Any],
    _verdict: Option[ScanResultEnum]
)
object YaraReport {
    def toStringBody(var_hits: Object, var_verdict: Object) =
        s"""
        | {
        | "hits":$var_hits,"verdict":$var_verdict
        | }
        """.stripMargin
}
