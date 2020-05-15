
package org.openapitools.client.model


case class AVEngineScanReport (
    /* The database definition time for this engine */
    _defTime: Option[String],
    /* The  unique identification string for the engine */
    _engId: Option[String],
    /* Where this engine is deployed (local/remote). */
    _location: Option[String],
    /* Scan result as index in the Processing Results table */
    _scanResultI: Option[Integer],
    /* The time elapsed during scan with this engine (in milliseconds). */
    _scanTime: Option[Integer],
    /* The threat name, IF scan result is Infected or Suspicious. Otherwise empty string or error message from the engine. */
    _threatFound: Option[String],
    /* Time elapsed between sending file to node and receiving the result from the engine (in milliseconds). */
    _waitTime: Option[Integer]
)
object AVEngineScanReport {
    def toStringBody(var_defTime: Object, var_engId: Object, var_location: Object, var_scanResultI: Object, var_scanTime: Object, var_threatFound: Object, var_waitTime: Object) =
        s"""
        | {
        | "defTime":$var_defTime,"engId":$var_engId,"location":$var_location,"scanResultI":$var_scanResultI,"scanTime":$var_scanTime,"threatFound":$var_threatFound,"waitTime":$var_waitTime
        | }
        """.stripMargin
}
