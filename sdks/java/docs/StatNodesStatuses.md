

# StatNodesStatuses

Node status
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | The location of the Node. If local, is empty string. |  [optional]
**cpuCores** | **Integer** | The number of CPU Cores allocated to this Node. |  [optional]
**engines** | [**List&lt;StatNodesEngines&gt;**](StatNodesEngines.md) | Summary of each engine status deployed on this Node. |  [optional]
**freeDiskSpace** | **Integer** | Reported available disk on that Node (in bytes). |  [optional]
**id** | **String** | Node identfier |  [optional]
**issues** | [**List&lt;StatNodesIssues&gt;**](StatNodesIssues.md) | A list of all potentials problems on that Node. |  [optional]
**load** | **Integer** | Current CPU utilization on this Node (in percentage). |  [optional]
**os** | **String** | Current used OS |  [optional]
**scanQueue** | **Integer** | Current load on the Node, how many files are in the queue |  [optional]
**totalMemory** | **Integer** | How much memory is allocated on this Node (in MB). |  [optional]
**version** | **String** | Product version |  [optional]



