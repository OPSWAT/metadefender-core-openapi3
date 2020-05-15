
package org.openapitools.client.model


case class NewUserRoleRequest (
    /* The name identifier of the role */
    _name: Option[String],
    /* The extended name showed in the Management Console. */
    _displayName: Option[String],
    _rights: Option[NewUserRoleRequestRights]
)
object NewUserRoleRequest {
    def toStringBody(var_name: Object, var_displayName: Object, var_rights: Object) =
        s"""
        | {
        | "name":$var_name,"displayName":$var_displayName,"rights":$var_rights
        | }
        """.stripMargin
}
