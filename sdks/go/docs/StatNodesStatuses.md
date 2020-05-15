# StatNodesStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** | The location of the Node. If local, is empty string. | [optional] 
**CpuCores** | **int32** | The number of CPU Cores allocated to this Node. | [optional] 
**Engines** | [**[]StatNodesEngines**](_stat_nodes_engines.md) | Summary of each engine status deployed on this Node. | [optional] 
**FreeDiskSpace** | **int32** | Reported available disk on that Node (in bytes). | [optional] 
**Id** | **string** | Node identfier | [optional] 
**Issues** | [**[]StatNodesIssues**](_stat_nodes_issues.md) | A list of all potentials problems on that Node. | [optional] 
**Load** | **int32** | Current CPU utilization on this Node (in percentage). | [optional] 
**Os** | **string** | Current used OS | [optional] 
**ScanQueue** | **int32** | Current load on the Node, how many files are in the queue | [optional] 
**TotalMemory** | **int32** | How much memory is allocated on this Node (in MB). | [optional] 
**Version** | **string** | Product version | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


