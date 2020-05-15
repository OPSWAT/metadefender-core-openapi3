
package org.openapitools.client.model


case class InlineResponse20010 (
    /* The maximum allowed file size (in bytes) for this rule. */
    _maxFileSize: Option[Integer],
    /* A unique identifier for identify in the used rule for a scan.. */
    _name: Option[String]
)
object InlineResponse20010 {
    def toStringBody(var_maxFileSize: Object, var_name: Object) =
        s"""
        | {
        | "maxFileSize":$var_maxFileSize,"name":$var_name
        | }
        """.stripMargin
}
