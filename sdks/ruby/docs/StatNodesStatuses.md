# OpenapiClient::StatNodesStatuses

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | The location of the Node. If local, is empty string. | [optional] 
**cpu_cores** | **Integer** | The number of CPU Cores allocated to this Node. | [optional] 
**engines** | [**Array&lt;StatNodesEngines&gt;**](StatNodesEngines.md) | Summary of each engine status deployed on this Node. | [optional] 
**free_disk_space** | **Integer** | Reported available disk on that Node (in bytes). | [optional] 
**id** | **String** | Node identfier | [optional] 
**issues** | [**Array&lt;StatNodesIssues&gt;**](StatNodesIssues.md) | A list of all potentials problems on that Node. | [optional] 
**load** | **Integer** | Current CPU utilization on this Node (in percentage). | [optional] 
**os** | **String** | Current used OS | [optional] 
**scan_queue** | **Integer** | Current load on the Node, how many files are in the queue | [optional] 
**total_memory** | **Integer** | How much memory is allocated on this Node (in MB). | [optional] 
**version** | **String** | Product version | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::StatNodesStatuses.new(address: ,
                                 cpu_cores: 8,
                                 engines: null,
                                 free_disk_space: 173993443328,
                                 id: :69,
                                 issues: null,
                                 load: 14,
                                 os: Linux Mint 18.3 Sylvia,
                                 scan_queue: 24,
                                 total_memory: 40100,
                                 version: 4.18.0)
```


