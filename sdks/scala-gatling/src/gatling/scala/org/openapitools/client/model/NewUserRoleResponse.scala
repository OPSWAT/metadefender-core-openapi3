
package org.openapitools.client.model


case class NewUserRoleResponse (
    /* The name identifier of the role */
    _name: Option[String],
    /* The extended name showed in the Management Console. */
    _displayName: Option[String],
    _rights: Option[NewUserRoleRequestRights],
    /* If the role can be altered or not. */
    _editable: Boolean,
    /* Internal used identifier */
    _id: Integer
)
object NewUserRoleResponse {
    def toStringBody(var_name: Object, var_displayName: Object, var_rights: Object, var_editable: Object, var_id: Object) =
        s"""
        | {
        | "name":$var_name,"displayName":$var_displayName,"rights":$var_rights,"editable":$var_editable,"id":$var_id
        | }
        """.stripMargin
}
