
package org.openapitools.client.model


case class NewUserRoleResponseAllOf (
    /* If the role can be altered or not. */
    _editable: Boolean,
    /* Internal used identifier */
    _id: Integer
)
object NewUserRoleResponseAllOf {
    def toStringBody(var_editable: Object, var_id: Object) =
        s"""
        | {
        | "editable":$var_editable,"id":$var_id
        | }
        """.stripMargin
}
