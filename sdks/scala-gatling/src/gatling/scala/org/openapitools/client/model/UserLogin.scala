
package org.openapitools.client.model


case class UserLogin (
    /* The apikey used to make API calls which requires authentication */
    _sessionId: String
)
object UserLogin {
    def toStringBody(var_sessionId: Object) =
        s"""
        | {
        | "sessionId":$var_sessionId
        | }
        """.stripMargin
}
