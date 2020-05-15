# OpenapiClient::DeepCDRDetailsDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The type of action that was performed | 
**object_name** | **String** | The object type that was sanitized/removed. | 
**count** | **Integer** | The number of objects that were sanitized/removed. | [optional] 
**object_details** | **String** | Additional information about the sanitized object | [optional] 
**file_name** | **String** | If an embedded file was sanitized. | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::DeepCDRDetailsDetails.new(action: sanitized,
                                 object_name: XML content,
                                 count: 1,
                                 object_details: &quot;&lt;ddeLink xmlns:r&#x3D;\&quot;http://schemas.openxmlformats.org/officeDocument/2006/relationships\&quot; ddeService&#x3D;\&quot;calc\&quot; ddeTopic&#x3D;\&quot;topic\&quot; xmlns&#x3D;\&quot;http://schemas.openxmlformats.org/spreadsheetml/2006/main\&quot;&gt;\r\n  &lt;ddeItems&gt;\r\n    &lt;ddeItem name&#x3D;\&quot;_xlbgnm.A3\&quot; advise&#x3D;\&quot;1\&quot; /&gt;\r\n    &lt;ddeItem name&#x3D;\&quot;StdDocumentName\&quot; ole&#x3D;\&quot;1\&quot; advise&#x3D;\&quot;1\&quot; /&gt;\r\n  &lt;/ddeItems&gt;\r\n&lt;/ddeLink&gt;&quot;
,
                                 file_name: Microsoft_Excel_97-2003_Worksheet.xls)
```


