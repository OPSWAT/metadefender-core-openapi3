
package org.openapitools.client.model


case class YaraSourcesObjectHttpSources (
    /* The location (URL) of the package. */
    _source: Option[String],
    /* Defining if this source is being used or not */
    _state: Option[String]
)
object YaraSourcesObjectHttpSources {
    def toStringBody(var_source: Object, var_state: Object) =
        s"""
        | {
        | "source":$var_source,"state":$var_state
        | }
        """.stripMargin
}
