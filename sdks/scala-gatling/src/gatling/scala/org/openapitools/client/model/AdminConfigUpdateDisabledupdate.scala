
package org.openapitools.client.model


case class AdminConfigUpdateDisabledupdate (
    /* A particular day (index of the week) or a defined interval (Fri-Sun -> 5-7) */
    _days: Option[String],
    /* When to start the lockdown, expressed in minutes (8 AM=480) */
    _from: Option[Integer],
    /* When to end the lockdown, expressed in minutes (4 PM=960) */
    _to: Option[Integer]
)
object AdminConfigUpdateDisabledupdate {
    def toStringBody(var_days: Object, var_from: Object, var_to: Object) =
        s"""
        | {
        | "days":$var_days,"from":$var_from,"to":$var_to
        | }
        """.stripMargin
}
