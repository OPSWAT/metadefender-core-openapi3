
package org.openapitools.client.model


case class UserRequestAllOf (
    /* The user's password */
    _password: Option[String]
)
object UserRequestAllOf {
    def toStringBody(var_password: Object) =
        s"""
        | {
        | "password":$var_password
        | }
        """.stripMargin
}
