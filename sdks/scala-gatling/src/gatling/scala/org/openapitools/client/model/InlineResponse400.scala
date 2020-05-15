
package org.openapitools.client.model


case class InlineResponse400 (
    _err: Option[String]
)
object InlineResponse400 {
    def toStringBody(var_err: Object) =
        s"""
        | {
        | "err":$var_err
        | }
        """.stripMargin
}
