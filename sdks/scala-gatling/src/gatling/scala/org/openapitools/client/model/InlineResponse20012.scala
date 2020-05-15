
package org.openapitools.client.model


case class InlineResponse20012 (
    /* If used by at least one engine */
    _active: Option[Boolean],
    /* The database definition time for this engine */
    _defTime: Option[String],
    /* The percentage progress of download */
    _downloadProgress: Option[Integer],
    /* When this engine downloaded from the update server. */
    _downloadTime: Option[String],
    /* Engine internal ID */
    _engId: Option[String],
    /* Engine name */
    _engName: Option[String],
    /* Engine type in human readable form */
    _engType: Option[String],
    /* Engine's version (format differs from one engine to another). */
    _engVer: Option[String],
    /* Engine's type:    * av   * archive   * filetype  */
    _engineType: Option[String],
    /* Status of the engine:   * downloading   * downloaded   * staging   * production   * removed   * temporary failed   * permanently failed   * content invalid   * download failed  */
    _state: Option[String]
)
object InlineResponse20012 {
    def toStringBody(var_active: Object, var_defTime: Object, var_downloadProgress: Object, var_downloadTime: Object, var_engId: Object, var_engName: Object, var_engType: Object, var_engVer: Object, var_engineType: Object, var_state: Object) =
        s"""
        | {
        | "active":$var_active,"defTime":$var_defTime,"downloadProgress":$var_downloadProgress,"downloadTime":$var_downloadTime,"engId":$var_engId,"engName":$var_engName,"engType":$var_engType,"engVer":$var_engVer,"engineType":$var_engineType,"state":$var_state
        | }
        """.stripMargin
}
