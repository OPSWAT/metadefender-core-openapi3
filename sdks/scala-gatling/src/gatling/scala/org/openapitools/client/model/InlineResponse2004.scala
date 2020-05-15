
package org.openapitools.client.model


case class InlineResponse2004 (
    _result: Option[String]
)
object InlineResponse2004 {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
