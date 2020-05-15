
package org.openapitools.client.model


case class InlineResponse2009 (
    /* The file submission identifier */
    _dataId: Option[String],
    /* A timestamp when the request has been made. */
    _requestTime: Option[String],
    /* What was the returned HTTP status code. */
    _statusCode: Option[Integer],
    /* What was the called URL (should match the `callbackurl` header). */
    _url: Option[String]
)
object InlineResponse2009 {
    def toStringBody(var_dataId: Object, var_requestTime: Object, var_statusCode: Object, var_url: Object) =
        s"""
        | {
        | "dataId":$var_dataId,"requestTime":$var_requestTime,"statusCode":$var_statusCode,"url":$var_url
        | }
        """.stripMargin
}
