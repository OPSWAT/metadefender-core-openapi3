
package org.openapitools.client.model


case class AdminConfigUpdate (
    /* The interval (in minutes) for checking for new updates. */
    _autoupdateperiod: Option[Integer],
    /* If you want to clean the pickup folder after the updates have been applied. */
    _deleteafterimport: Option[Boolean],
    /* Lockdown a time interval when the engines are not allowed to update. */
    _disabledupdate: Option[List[AdminConfigUpdateDisabledupdate]],
    /* The folder where MetaDefender will look for the new engine files. */
    _pickupfolder: Option[String],
    /* Define where the updates will be loaded from. <p> This can be either:   * `internet` -> if selected, will check for new updates every `autoupdateperiod` minutes   * `folder` -> make sure that MetaDefender has access/permission to that folder   * `manual` -> requires manually uploading the packages in Inventory > Modules > Upload package.  */
    _source: Option[String]
)
object AdminConfigUpdate {
    def toStringBody(var_autoupdateperiod: Object, var_deleteafterimport: Object, var_disabledupdate: Object, var_pickupfolder: Object, var_source: Object) =
        s"""
        | {
        | "autoupdateperiod":$var_autoupdateperiod,"deleteafterimport":$var_deleteafterimport,"disabledupdate":$var_disabledupdate,"pickupfolder":$var_pickupfolder,"source":$var_source
        | }
        """.stripMargin
}
