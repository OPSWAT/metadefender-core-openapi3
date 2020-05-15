
package org.openapitools.client.model


case class InlineObject2 (
    /* The current password in plain text */
    _oldPassword: Option[String],
    /* The new password in plain text */
    _newPassword: Option[String]
)
object InlineObject2 {
    def toStringBody(var_oldPassword: Object, var_newPassword: Object) =
        s"""
        | {
        | "oldPassword":$var_oldPassword,"newPassword":$var_newPassword
        | }
        """.stripMargin
}
