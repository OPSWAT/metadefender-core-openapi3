
package org.openapitools.client.model


case class InlineObject (
    /* Username */
    _user: Option[String],
    /* User's password */
    _password: Option[String]
)
object InlineObject {
    def toStringBody(var_user: Object, var_password: Object) =
        s"""
        | {
        | "user":$var_user,"password":$var_password
        | }
        """.stripMargin
}
