# MetaDefenderCore.StatNodesStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | The location of the Node. If local, is empty string. | [optional] 
**cpuCores** | **Number** | The number of CPU Cores allocated to this Node. | [optional] 
**engines** | [**[StatNodesEngines]**](StatNodesEngines.md) | Summary of each engine status deployed on this Node. | [optional] 
**freeDiskSpace** | **Number** | Reported available disk on that Node (in bytes). | [optional] 
**id** | **String** | Node identfier | [optional] 
**issues** | [**[StatNodesIssues]**](StatNodesIssues.md) | A list of all potentials problems on that Node. | [optional] 
**load** | **Number** | Current CPU utilization on this Node (in percentage). | [optional] 
**os** | **String** | Current used OS | [optional] 
**scanQueue** | **Number** | Current load on the Node, how many files are in the queue | [optional] 
**totalMemory** | **Number** | How much memory is allocated on this Node (in MB). | [optional] 
**version** | **String** | Product version | [optional] 


