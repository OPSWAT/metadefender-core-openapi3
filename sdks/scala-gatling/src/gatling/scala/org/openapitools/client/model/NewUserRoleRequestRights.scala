
package org.openapitools.client.model


case class NewUserRoleRequestRights (
    /* What permissions are allowed for Node. */
    _agents: Option[RolePermissionObject],
    /* What permissions are allowed for Certificates. */
    _cert: Option[RolePermissionObject],
    /* What permissions are allowed for Configuration logs. */
    _configlog: Option[RolePermissionObject],
    /* What permissions are allowed for Engines and Modules. */
    _engines: Option[RolePermissionObject],
    /* What permissions are allowed for External actions (External Scanner/Post Actions). */
    _external: Option[RolePermissionObject],
    /* What permissions are allowed for managing the License. */
    _license: Option[RolePermissionObject],
    /* What permissions are allowed for managing the Quarantine. */
    _quarantine: Option[RolePermissionObject],
    /* What permissions are allowed for managing the retention policies. */
    _retention: Option[RolePermissionObject],
    /* What permissions are allowed for managing the workflow rules. */
    _rule: Option[RolePermissionObject],
    /* What permissions are allowed for managing analysis actions. */
    _scan: Option[RolePermissionObject],
    /* What permissions are allowed for managing the analysis logs. */
    _scanlog: Option[RolePermissionObject],
    /* What permissions are allowed for managing the Whitelist/blacklist defined in the Inventory. */
    _skip: Option[RolePermissionObject],
    /* What permissions are allowed for managing the update configuration. */
    _update: Option[RolePermissionObject],
    /* What permissions are allowed for managing the update logs. */
    _updatelog: Option[RolePermissionObject],
    /* What permissions are allowed for managing the users. */
    _users: Option[RolePermissionObject],
    /* What permissions are allowed for managing the workflow templates. */
    _workflow: Option[RolePermissionObject],
    /* What permissions are allowed for managing the network zones. */
    _zone: Option[RolePermissionObject]
)
object NewUserRoleRequestRights {
    def toStringBody(var_agents: Object, var_cert: Object, var_configlog: Object, var_engines: Object, var_external: Object, var_license: Object, var_quarantine: Object, var_retention: Object, var_rule: Object, var_scan: Object, var_scanlog: Object, var_skip: Object, var_update: Object, var_updatelog: Object, var_users: Object, var_workflow: Object, var_zone: Object) =
        s"""
        | {
        | "agents":$var_agents,"cert":$var_cert,"configlog":$var_configlog,"engines":$var_engines,"external":$var_external,"license":$var_license,"quarantine":$var_quarantine,"retention":$var_retention,"rule":$var_rule,"scan":$var_scan,"scanlog":$var_scanlog,"skip":$var_skip,"update":$var_update,"updatelog":$var_updatelog,"users":$var_users,"workflow":$var_workflow,"zone":$var_zone
        | }
        """.stripMargin
}
