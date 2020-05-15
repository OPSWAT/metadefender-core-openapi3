
package org.openapitools.client.model


case class InlineResponse2008 (
    _dataId: String
)
object InlineResponse2008 {
    def toStringBody(var_dataId: Object) =
        s"""
        | {
        | "dataId":$var_dataId
        | }
        """.stripMargin
}
