
package org.openapitools.client.model


case class InlineResponse500 (
    /* Error reason */
    _err: Option[String]
)
object InlineResponse500 {
    def toStringBody(var_err: Object) =
        s"""
        | {
        | "err":$var_err
        | }
        """.stripMargin
}
