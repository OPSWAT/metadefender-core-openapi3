# OpenapiClient::FileInformation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_name** | **String** | The filename reported via &#x60;filename&#x60; header. | [optional] 
**file_size** | **Integer** | Total file size in bytes. | [optional] 
**file_type** | **String** | The filetype using mimetype. | [optional] 
**file_type_description** | **String** | The filetype in human readable format. | [optional] 
**md5** | **String** | File&#39;s MD5 hash. | [optional] 
**sha1** | **String** | File&#39;s SHA1 hash. | [optional] 
**sha256** | **String** | File&#39;s SHA256 Hash. | [optional] 
**upload_timestamp** | **String** | The timestamp when file was successfully uploaded to MetaDefender. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::FileInformation.new(display_name: OPSWAT_Proactive_DLP_CCN.pdf,
                                 file_size: 75906,
                                 file_type: application/pdf,
                                 file_type_description: Adobe Portable Document Format,
                                 md5: c4863c8ce44fb7ae84eb48c9b78f8b5e,
                                 sha1: a33c72a996a9603d479e3dff3d23bf619c975fbe,
                                 sha256: b9fdc10b47950b9e503ef4dc0ef42d28e7c37ccd749d4a5dcd7d9b3218996b7f,
                                 upload_timestamp: 2020-03-12T08:37:05.412Z)
```


