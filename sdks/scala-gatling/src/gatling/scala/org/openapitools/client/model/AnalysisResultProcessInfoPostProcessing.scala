
package org.openapitools.client.model


case class AnalysisResultProcessInfoPostProcessing (
    /* Empty string if no action failed or list of failed actions, separated by \"|\". */
    _actionsFailed: Option[String],
    /* List of successful actions, separated by \"|\". Empty string if otherwise. */
    _actionsRan: Option[String],
    /* Contains the name of the sanitized file. */
    _convertedDestination: Option[String],
    /* Contains target type name of sanitization. */
    _convertedTo: Option[String],
    /* Contains target type name of sanitization. */
    _copyMoveDestination: Option[String],
    /* Contains target type name of sanitization. */
    _sanitizationDetails: Option[DeepCDRDetails]
)
object AnalysisResultProcessInfoPostProcessing {
    def toStringBody(var_actionsFailed: Object, var_actionsRan: Object, var_convertedDestination: Object, var_convertedTo: Object, var_copyMoveDestination: Object, var_sanitizationDetails: Object) =
        s"""
        | {
        | "actionsFailed":$var_actionsFailed,"actionsRan":$var_actionsRan,"convertedDestination":$var_convertedDestination,"convertedTo":$var_convertedTo,"copyMoveDestination":$var_copyMoveDestination,"sanitizationDetails":$var_sanitizationDetails
        | }
        """.stripMargin
}
