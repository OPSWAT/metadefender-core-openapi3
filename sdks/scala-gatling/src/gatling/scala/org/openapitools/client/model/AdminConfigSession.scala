
package org.openapitools.client.model


case class AdminConfigSession (
    /* The interval (in milliseconds) for overall session length timeout (regardless of activity). */
    _absoluteSessionTimeout: Option[Integer],
    /* Allow requests from the same user to come from different IPs. */
    _allowCrossIpSessions: Option[Boolean],
    /* Allow same user to have multiple active sessions. */
    _allowDuplicateSession: Option[Boolean],
    /* The interval (in milliseconds) for the user's session timeout, based on last activity. Timer starts after the last activity for the apikey. */
    _sessionTimeout: Option[Integer]
)
object AdminConfigSession {
    def toStringBody(var_absoluteSessionTimeout: Object, var_allowCrossIpSessions: Object, var_allowDuplicateSession: Object, var_sessionTimeout: Object) =
        s"""
        | {
        | "absoluteSessionTimeout":$var_absoluteSessionTimeout,"allowCrossIpSessions":$var_allowCrossIpSessions,"allowDuplicateSession":$var_allowDuplicateSession,"sessionTimeout":$var_sessionTimeout
        | }
        """.stripMargin
}
