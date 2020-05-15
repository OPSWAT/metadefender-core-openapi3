
# Org.OpenAPITools.Model.StatNodesStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Address** | **string** | The location of the Node. If local, is empty string. | [optional] 
**CpuCores** | **int** | The number of CPU Cores allocated to this Node. | [optional] 
**Engines** | [**List&lt;StatNodesEngines&gt;**](StatNodesEngines.md) | Summary of each engine status deployed on this Node. | [optional] 
**FreeDiskSpace** | **int** | Reported available disk on that Node (in bytes). | [optional] 
**Id** | **string** | Node identfier | [optional] 
**Issues** | [**List&lt;StatNodesIssues&gt;**](StatNodesIssues.md) | A list of all potentials problems on that Node. | [optional] 
**Load** | **int** | Current CPU utilization on this Node (in percentage). | [optional] 
**Os** | **string** | Current used OS | [optional] 
**ScanQueue** | **int** | Current load on the Node, how many files are in the queue | [optional] 
**TotalMemory** | **int** | How much memory is allocated on this Node (in MB). | [optional] 
**Version** | **string** | Product version | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

