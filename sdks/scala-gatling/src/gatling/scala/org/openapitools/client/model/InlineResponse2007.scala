
package org.openapitools.client.model


case class InlineResponse2007 (
    /* Current status of generating the package. */
    _status: Option[String],
    /* Used only when status is inprogress, otherwise its empty */
    _startTime: Option[String],
    _issues: Option[InlineResponse2007Issues]
)
object InlineResponse2007 {
    def toStringBody(var_status: Object, var_startTime: Object, var_issues: Object) =
        s"""
        | {
        | "status":$var_status,"startTime":$var_startTime,"issues":$var_issues
        | }
        """.stripMargin
}
