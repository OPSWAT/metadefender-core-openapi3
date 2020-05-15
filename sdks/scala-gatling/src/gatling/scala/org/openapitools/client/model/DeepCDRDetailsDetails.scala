
package org.openapitools.client.model


case class DeepCDRDetailsDetails (
    /* The type of action that was performed */
    _action: String,
    /* The object type that was sanitized/removed. */
    _objectName: String,
    /* The number of objects that were sanitized/removed. */
    _count: Option[Integer],
    /* Additional information about the sanitized object */
    _objectDetails: Option[String],
    /* If an embedded file was sanitized. */
    _fileName: Option[String]
)
object DeepCDRDetailsDetails {
    def toStringBody(var_action: Object, var_objectName: Object, var_count: Object, var_objectDetails: Object, var_fileName: Object) =
        s"""
        | {
        | "action":$var_action,"objectName":$var_objectName,"count":$var_count,"objectDetails":$var_objectDetails,"fileName":$var_fileName
        | }
        """.stripMargin
}
