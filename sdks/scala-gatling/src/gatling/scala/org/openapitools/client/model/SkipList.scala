
package org.openapitools.client.model


case class SkipList (
    _blacklist: Option[Any],
    _skip: Option[Any],
    _whitelist: Option[Any]
)
object SkipList {
    def toStringBody(var_blacklist: Object, var_skip: Object, var_whitelist: Object) =
        s"""
        | {
        | "blacklist":$var_blacklist,"skip":$var_skip,"whitelist":$var_whitelist
        | }
        """.stripMargin
}
