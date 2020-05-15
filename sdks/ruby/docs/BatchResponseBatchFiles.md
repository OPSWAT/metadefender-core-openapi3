# OpenapiClient::BatchResponseBatchFiles

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_count** | **Integer** | How many files/entries in the batch. | [optional] 
**files_in_batch** | [**Array&lt;BatchResponseBatchFilesFilesInBatch&gt;**](BatchResponseBatchFilesFilesInBatch.md) | The list of files in this batch. | [optional] 
**first_index** | **Integer** | The starting index in the batch. Used for pagination. | [optional] 
**page_size** | **Integer** | The number of entries per page. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::BatchResponseBatchFiles.new(batch_count: 4,
                                 files_in_batch: null,
                                 first_index: 0,
                                 page_size: 50)
```


