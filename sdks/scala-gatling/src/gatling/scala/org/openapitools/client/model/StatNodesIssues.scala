
package org.openapitools.client.model


case class StatNodesIssues (
    /* Text detailing the issue. */
    _description: Option[String],
    /* How important is the reported issue. */
    _severity: Option[String]
)
object StatNodesIssues {
    def toStringBody(var_description: Object, var_severity: Object) =
        s"""
        | {
        | "description":$var_description,"severity":$var_severity
        | }
        """.stripMargin
}
