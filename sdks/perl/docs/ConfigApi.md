# WWW::OpenAPIClient::ConfigApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ConfigApi;
```

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


# **config_audit_log**
> InlineResponse200 config_audit_log(apikey => $apikey, unknown_base_type => $unknown_base_type)

Audit clean up

Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $unknown_base_type = WWW::OpenAPIClient::Object::UNKNOWN_BASE_TYPE->new(); # UNKNOWN_BASE_TYPE | 

eval { 
    my $result = $api_instance->config_audit_log(apikey => $apikey, unknown_base_type => $unknown_base_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_audit_log: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_get_skip_hash**
> SkipList config_get_skip_hash(apikey => $apikey)

Get 'skip by hash' list

Get the list of hashes whitelisted or blacklisted.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->config_get_skip_hash(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_get_skip_hash: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_quarantine**
> InlineResponse200 config_quarantine(apikey => $apikey, unknown_base_type => $unknown_base_type)

Quarantine clean up

Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $unknown_base_type = WWW::OpenAPIClient::Object::UNKNOWN_BASE_TYPE->new(); # UNKNOWN_BASE_TYPE | 

eval { 
    my $result = $api_instance->config_quarantine(apikey => $apikey, unknown_base_type => $unknown_base_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_quarantine: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_sanitized_repo**
> InlineResponse2001 config_sanitized_repo(apikey => $apikey, inline_object1 => $inline_object1)

Sanitized files clean up

Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $inline_object1 = WWW::OpenAPIClient::Object::InlineObject1->new(); # InlineObject1 | 

eval { 
    my $result = $api_instance->config_sanitized_repo(apikey => $apikey, inline_object1 => $inline_object1);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_sanitized_repo: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **inline_object1** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_scan_history**
> InlineResponse200 config_scan_history(apikey => $apikey, unknown_base_type => $unknown_base_type)

Processing history clean up

Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $unknown_base_type = WWW::OpenAPIClient::Object::UNKNOWN_BASE_TYPE->new(); # UNKNOWN_BASE_TYPE | 

eval { 
    my $result = $api_instance->config_scan_history(apikey => $apikey, unknown_base_type => $unknown_base_type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_scan_history: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_session**
> AdminConfigSession config_session(apikey => $apikey, admin_config_session => $admin_config_session)

Session settings

Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $admin_config_session = WWW::OpenAPIClient::Object::AdminConfigSession->new(); # AdminConfigSession | 

eval { 
    my $result = $api_instance->config_session(apikey => $apikey, admin_config_session => $admin_config_session);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_session: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_session** | [**AdminConfigSession**](AdminConfigSession.md)|  | [optional] 

### Return type

[**AdminConfigSession**](AdminConfigSession.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_update**
> AdminConfigUpdate config_update(apikey => $apikey, admin_config_update => $admin_config_update)

Modules Update Source and Frequency

Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $admin_config_update = WWW::OpenAPIClient::Object::AdminConfigUpdate->new(); # AdminConfigUpdate | 

eval { 
    my $result = $api_instance->config_update(apikey => $apikey, admin_config_update => $admin_config_update);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_update** | [**AdminConfigUpdate**](AdminConfigUpdate.md)|  | [optional] 

### Return type

[**AdminConfigUpdate**](AdminConfigUpdate.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_update_skip_hash**
> SkipList config_update_skip_hash(apikey => $apikey, skip_list => $skip_list)

Modify 'skip by hash' list

Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $skip_list = WWW::OpenAPIClient::Object::SkipList->new(); # SkipList | A list of all skip/white/black-listed hashes.

eval { 
    my $result = $api_instance->config_update_skip_hash(apikey => $apikey, skip_list => $skip_list);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_update_skip_hash: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **skip_list** | [**SkipList**](SkipList.md)| A list of all skip/white/black-listed hashes. | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_update_webhook**
> AdminConfigWebhook config_update_webhook(apikey => $apikey, admin_config_webhook => $admin_config_webhook)

Webhook set configuration

Modifying settings supported for webhook mode 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $admin_config_webhook = WWW::OpenAPIClient::Object::AdminConfigWebhook->new(); # AdminConfigWebhook | 

eval { 
    my $result = $api_instance->config_update_webhook(apikey => $apikey, admin_config_webhook => $admin_config_webhook);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_update_webhook: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_webhook** | [**AdminConfigWebhook**](AdminConfigWebhook.md)|  | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_webhook**
> AdminConfigWebhook config_webhook(apikey => $apikey)

Webhook get configuration

Getting settings supported for webhook mode 

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConfigApi;
my $api_instance = WWW::OpenAPIClient::ConfigApi->new(
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->config_webhook(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConfigApi->config_webhook: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

