# OpenapiClient::InlineResponse2009

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_id** | **String** | The file submission identifier | [optional] 
**request_time** | **String** | A timestamp when the request has been made. | [optional] 
**status_code** | **Integer** | What was the returned HTTP status code. | [optional] 
**url** | **String** | What was the called URL (should match the &#x60;callbackurl&#x60; header). | [optional] 

## Code Sample

```ruby
require 'OpenapiClient'

instance = OpenapiClient::InlineResponse2009.new(data_id: j2939fh3ifoqkhwhr3h9h1h0re,
                                 request_time: ,
                                 status_code: 200,
                                 url: https://apigateway.corporate.com/metadefender/callbackurl)
```


