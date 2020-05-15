
package org.openapitools.client.model


case class StatNodesEngines (
    /* If used by at least one engine */
    _active: Option[Boolean],
    /* The database version for this engine */
    _dbVer: Option[String],
    /* The database definition time for this engine */
    _defTime: Option[String],
    /* Engine name */
    _engName: Option[String],
    /* Engine's version (format differs from one engine to another). */
    _engVer: Option[String],
    /* Engine's type:    * av   * archive   * filetype  */
    _engineType: Option[String],
    /* Engine internal ID */
    _id: Option[String]
)
object StatNodesEngines {
    def toStringBody(var_active: Object, var_dbVer: Object, var_defTime: Object, var_engName: Object, var_engVer: Object, var_engineType: Object, var_id: Object) =
        s"""
        | {
        | "active":$var_active,"dbVer":$var_dbVer,"defTime":$var_defTime,"engName":$var_engName,"engVer":$var_engVer,"engineType":$var_engineType,"id":$var_id
        | }
        """.stripMargin
}
