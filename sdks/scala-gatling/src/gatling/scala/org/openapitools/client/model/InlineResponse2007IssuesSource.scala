
package org.openapitools.client.model


case class InlineResponse2007IssuesSource (
    _severity: Option[String],
    _message: Option[String]
)
object InlineResponse2007IssuesSource {
    def toStringBody(var_severity: Object, var_message: Object) =
        s"""
        | {
        | "severity":$var_severity,"message":$var_message
        | }
        """.stripMargin
}
