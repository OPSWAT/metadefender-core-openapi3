
package org.openapitools.client.model


case class InlineResponse2005 (
    _result: Option[String]
)
object InlineResponse2005 {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
