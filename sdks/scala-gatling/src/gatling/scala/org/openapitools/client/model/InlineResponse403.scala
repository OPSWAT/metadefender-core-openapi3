
package org.openapitools.client.model


case class InlineResponse403 (
    /* <error message> will describe the incident. More details would be logged in MetaDefender Core logs */
    _err: Option[String]
)
object InlineResponse403 {
    def toStringBody(var_err: Object) =
        s"""
        | {
        | "err":$var_err
        | }
        """.stripMargin
}
