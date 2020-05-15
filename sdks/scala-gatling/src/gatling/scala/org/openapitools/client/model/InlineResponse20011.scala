
package org.openapitools.client.model


case class InlineResponse20011 (
    /* Product identifier. */
    _productId: Option[String],
    /* The product version currently used. */
    _version: Option[String]
)
object InlineResponse20011 {
    def toStringBody(var_productId: Object, var_version: Object) =
        s"""
        | {
        | "productId":$var_productId,"version":$var_version
        | }
        """.stripMargin
}
