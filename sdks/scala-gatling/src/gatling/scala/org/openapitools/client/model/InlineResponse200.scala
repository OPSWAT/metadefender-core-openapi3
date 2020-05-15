
package org.openapitools.client.model


case class InlineResponse200 (
    /* The number of hours of data retention. Anything older than this number will be deleted. */
    _cleanuprange: Option[Integer]
)
object InlineResponse200 {
    def toStringBody(var_cleanuprange: Object) =
        s"""
        | {
        | "cleanuprange":$var_cleanuprange
        | }
        """.stripMargin
}
