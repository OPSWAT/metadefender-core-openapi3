
package org.openapitools.client.model


case class UserRequest (
    /* Associated apikey with this user */
    _apikey: Option[String],
    /* To which User Directories belongs to (LOCAL/System/etc.) */
    _directoryId: Option[Integer],
    /* Which is the name showed in the Management Console */
    _displayName: Option[String],
    /* User's email address */
    _email: Option[String],
    /* User's full name */
    _name: Option[String],
    /* A list of roles attached to this user */
    _roles: Option[List[String]],
    /* Configuration of Management Console for this user. */
    _uiSettings: Option[Any],
    /* The user's password */
    _password: Option[String]
)
object UserRequest {
    def toStringBody(var_apikey: Object, var_directoryId: Object, var_displayName: Object, var_email: Object, var_name: Object, var_roles: Object, var_uiSettings: Object, var_password: Object) =
        s"""
        | {
        | "apikey":$var_apikey,"directoryId":$var_directoryId,"displayName":$var_displayName,"email":$var_email,"name":$var_name,"roles":$var_roles,"uiSettings":$var_uiSettings,"password":$var_password
        | }
        """.stripMargin
}
