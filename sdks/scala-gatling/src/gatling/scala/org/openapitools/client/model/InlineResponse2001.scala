
package org.openapitools.client.model


case class InlineResponse2001 (
    /* The number of minutes of data retention. Anything older than this number will be deleted. */
    _maxage: Option[Integer]
)
object InlineResponse2001 {
    def toStringBody(var_maxage: Object) =
        s"""
        | {
        | "maxage":$var_maxage
        | }
        """.stripMargin
}
