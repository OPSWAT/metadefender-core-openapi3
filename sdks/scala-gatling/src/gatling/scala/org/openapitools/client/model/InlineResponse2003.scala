
package org.openapitools.client.model


case class InlineResponse2003 (
    _result: Option[String]
)
object InlineResponse2003 {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
