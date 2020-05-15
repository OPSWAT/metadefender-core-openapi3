# OpenapiClient::ConfigApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**config_audit_log**](ConfigApi.md#config_audit_log) | **PUT** /admin/config/auditlog | Audit clean up
[**config_get_skip_hash**](ConfigApi.md#config_get_skip_hash) | **GET** /admin/config/skip | Get &#39;skip by hash&#39; list
[**config_quarantine**](ConfigApi.md#config_quarantine) | **PUT** /admin/config/quarantine | Quarantine clean up
[**config_sanitized_repo**](ConfigApi.md#config_sanitized_repo) | **PUT** /admin/config/sanitize | Sanitized files clean up
[**config_scan_history**](ConfigApi.md#config_scan_history) | **PUT** /admin/config/scanhistory | Processing history clean up
[**config_session**](ConfigApi.md#config_session) | **PUT** /admin/config/session | Session settings
[**config_update**](ConfigApi.md#config_update) | **PUT** /admin/config/update | Modules Update Source and Frequency
[**config_update_skip_hash**](ConfigApi.md#config_update_skip_hash) | **PUT** /admin/config/skip | Modify &#39;skip by hash&#39; list
[**config_update_webhook**](ConfigApi.md#config_update_webhook) | **PUT** /admin/config/webhook | Webhook set configuration
[**config_webhook**](ConfigApi.md#config_webhook) | **GET** /admin/config/webhook | Webhook get configuration



## config_audit_log

> InlineResponse200 config_audit_log(opts)

Audit clean up

Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  unknown_base_type: OpenapiClient::UNKNOWN_BASE_TYPE.new # UNKNOWN_BASE_TYPE | 
}

begin
  #Audit clean up
  result = api_instance.config_audit_log(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_audit_log: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_get_skip_hash

> SkipList config_get_skip_hash(opts)

Get 'skip by hash' list

Get the list of hashes whitelisted or blacklisted.

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Get 'skip by hash' list
  result = api_instance.config_get_skip_hash(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_get_skip_hash: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## config_quarantine

> InlineResponse200 config_quarantine(opts)

Quarantine clean up

Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  unknown_base_type: OpenapiClient::UNKNOWN_BASE_TYPE.new # UNKNOWN_BASE_TYPE | 
}

begin
  #Quarantine clean up
  result = api_instance.config_quarantine(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_quarantine: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_sanitized_repo

> InlineResponse2001 config_sanitized_repo(opts)

Sanitized files clean up

Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  inline_object1: OpenapiClient::InlineObject1.new # InlineObject1 | 
}

begin
  #Sanitized files clean up
  result = api_instance.config_sanitized_repo(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_sanitized_repo: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **inline_object1** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_scan_history

> InlineResponse200 config_scan_history(opts)

Processing history clean up

Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  unknown_base_type: OpenapiClient::UNKNOWN_BASE_TYPE.new # UNKNOWN_BASE_TYPE | 
}

begin
  #Processing history clean up
  result = api_instance.config_scan_history(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_scan_history: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_session

> AdminConfigSession config_session(opts)

Session settings

Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  admin_config_session: OpenapiClient::AdminConfigSession.new # AdminConfigSession | 
}

begin
  #Session settings
  result = api_instance.config_session(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_session: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_session** | [**AdminConfigSession**](AdminConfigSession.md)|  | [optional] 

### Return type

[**AdminConfigSession**](AdminConfigSession.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_update

> AdminConfigUpdate config_update(opts)

Modules Update Source and Frequency

Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  admin_config_update: OpenapiClient::AdminConfigUpdate.new # AdminConfigUpdate | 
}

begin
  #Modules Update Source and Frequency
  result = api_instance.config_update(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_update: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_update** | [**AdminConfigUpdate**](AdminConfigUpdate.md)|  | [optional] 

### Return type

[**AdminConfigUpdate**](AdminConfigUpdate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_update_skip_hash

> SkipList config_update_skip_hash(opts)

Modify 'skip by hash' list

Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash 

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  skip_list: OpenapiClient::SkipList.new # SkipList | A list of all skip/white/black-listed hashes.
}

begin
  #Modify 'skip by hash' list
  result = api_instance.config_update_skip_hash(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_update_skip_hash: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **skip_list** | [**SkipList**](SkipList.md)| A list of all skip/white/black-listed hashes. | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_update_webhook

> AdminConfigWebhook config_update_webhook(opts)

Webhook set configuration

Modifying settings supported for webhook mode 

### Example

```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: apikey
  config.api_key['apikey'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['apikey'] = 'Bearer'
end

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example', # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
  admin_config_webhook: OpenapiClient::AdminConfigWebhook.new # AdminConfigWebhook | 
}

begin
  #Webhook set configuration
  result = api_instance.config_update_webhook(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_update_webhook: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_webhook** | [**AdminConfigWebhook**](AdminConfigWebhook.md)|  | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## config_webhook

> AdminConfigWebhook config_webhook(opts)

Webhook get configuration

Getting settings supported for webhook mode 

### Example

```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::ConfigApi.new
opts = {
  apikey: 'apikey_example' # String | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
}

begin
  #Webhook get configuration
  result = api_instance.config_webhook(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling ConfigApi->config_webhook: #{e}"
end
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **String**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

