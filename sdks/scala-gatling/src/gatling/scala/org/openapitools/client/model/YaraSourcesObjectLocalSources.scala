
package org.openapitools.client.model


case class YaraSourcesObjectLocalSources (
    /* The location (file path) of the files. */
    _source: Option[String],
    /* Defining if this source is being used or not */
    _state: Option[String]
)
object YaraSourcesObjectLocalSources {
    def toStringBody(var_source: Object, var_state: Object) =
        s"""
        | {
        | "source":$var_source,"state":$var_state
        | }
        """.stripMargin
}
