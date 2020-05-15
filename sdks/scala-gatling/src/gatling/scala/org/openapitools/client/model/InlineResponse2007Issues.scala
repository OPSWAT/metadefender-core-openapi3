
package org.openapitools.client.model


case class InlineResponse2007Issues (
    /* Contains general errors occurred during the generation process */
    _general: Option[List[InlineResponse2007IssuesGeneral]],
    _source: Option[List[InlineResponse2007IssuesSource]]
)
object InlineResponse2007Issues {
    def toStringBody(var_general: Object, var_source: Object) =
        s"""
        | {
        | "general":$var_general,"source":$var_source
        | }
        """.stripMargin
}
