
package org.openapitools.client.model


case class InlineResponse20013 (
    /* Configuration option if additional external nodes could be connected. */
    _externalNodesAllowed: Option[Boolean],
    /* Remaining available slots to connect to this instance. */
    _maxNodeCount: Option[Integer],
    /* Array with a status for each attached node. */
    _statuses: Option[List[StatNodesStatuses]]
)
object InlineResponse20013 {
    def toStringBody(var_externalNodesAllowed: Object, var_maxNodeCount: Object, var_statuses: Object) =
        s"""
        | {
        | "externalNodesAllowed":$var_externalNodesAllowed,"maxNodeCount":$var_maxNodeCount,"statuses":$var_statuses
        | }
        """.stripMargin
}
