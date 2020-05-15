
package org.openapitools.client.model


case class InlineResponse2002 (
    _result: Option[String]
)
object InlineResponse2002 {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
