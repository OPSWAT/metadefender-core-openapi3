
package org.openapitools.client.model


case class InlineResponse2006 (
    _result: Option[String]
)
object InlineResponse2006 {
    def toStringBody(var_result: Object) =
        s"""
        | {
        | "result":$var_result
        | }
        """.stripMargin
}
