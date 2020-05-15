
package org.openapitools.client.model


case class StatNodesStatuses (
    /* The location of the Node. If local, is empty string. */
    _address: Option[String],
    /* The number of CPU Cores allocated to this Node. */
    _cpuCores: Option[Integer],
    /* Summary of each engine status deployed on this Node. */
    _engines: Option[List[StatNodesEngines]],
    /* Reported available disk on that Node (in bytes). */
    _freeDiskSpace: Option[Integer],
    /* Node identfier */
    _id: Option[String],
    /* A list of all potentials problems on that Node. */
    _issues: Option[List[StatNodesIssues]],
    /* Current CPU utilization on this Node (in percentage). */
    _load: Option[Integer],
    /* Current used OS */
    _os: Option[String],
    /* Current load on the Node, how many files are in the queue */
    _scanQueue: Option[Integer],
    /* How much memory is allocated on this Node (in MB). */
    _totalMemory: Option[Integer],
    /* Product version */
    _version: Option[String]
)
object StatNodesStatuses {
    def toStringBody(var_address: Object, var_cpuCores: Object, var_engines: Object, var_freeDiskSpace: Object, var_id: Object, var_issues: Object, var_load: Object, var_os: Object, var_scanQueue: Object, var_totalMemory: Object, var_version: Object) =
        s"""
        | {
        | "address":$var_address,"cpuCores":$var_cpuCores,"engines":$var_engines,"freeDiskSpace":$var_freeDiskSpace,"id":$var_id,"issues":$var_issues,"load":$var_load,"os":$var_os,"scanQueue":$var_scanQueue,"totalMemory":$var_totalMemory,"version":$var_version
        | }
        """.stripMargin
}
