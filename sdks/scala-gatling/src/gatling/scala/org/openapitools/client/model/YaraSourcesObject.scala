
package org.openapitools.client.model


case class YaraSourcesObject (
    /* A list of all locals sources */
    _localSources: Option[List[YaraSourcesObjectLocalSources]],
    /* A list of all remote sources. */
    _httpSources: Option[List[YaraSourcesObjectHttpSources]]
)
object YaraSourcesObject {
    def toStringBody(var_localSources: Object, var_httpSources: Object) =
        s"""
        | {
        | "localSources":$var_localSources,"httpSources":$var_httpSources
        | }
        """.stripMargin
}
