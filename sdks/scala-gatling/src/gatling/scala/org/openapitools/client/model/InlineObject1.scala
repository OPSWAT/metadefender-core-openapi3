
package org.openapitools.client.model


case class InlineObject1 (
    /* The number of minutes of data retention. Anything older than this number will be deleted. */
    _maxage: Option[Integer]
)
object InlineObject1 {
    def toStringBody(var_maxage: Object) =
        s"""
        | {
        | "maxage":$var_maxage
        | }
        """.stripMargin
}
