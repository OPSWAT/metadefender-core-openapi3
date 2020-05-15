# StatNodesStatuses

Node status
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **str** | The location of the Node. If local, is empty string. | [optional] 
**cpu_cores** | **int** | The number of CPU Cores allocated to this Node. | [optional] 
**engines** | [**list[StatNodesEngines]**](StatNodesEngines.md) | Summary of each engine status deployed on this Node. | [optional] 
**free_disk_space** | **int** | Reported available disk on that Node (in bytes). | [optional] 
**id** | **str** | Node identfier | [optional] 
**issues** | [**list[StatNodesIssues]**](StatNodesIssues.md) | A list of all potentials problems on that Node. | [optional] 
**load** | **int** | Current CPU utilization on this Node (in percentage). | [optional] 
**os** | **str** | Current used OS | [optional] 
**scan_queue** | **int** | Current load on the Node, how many files are in the queue | [optional] 
**total_memory** | **int** | How much memory is allocated on this Node (in MB). | [optional] 
**version** | **str** | Product version | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


