# WWW::OpenAPIClient::EnginesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::EnginesApi;
```

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engine_disable**](EnginesApi.md#engine_disable) | **POST** /admin/engine/{engineId}/disable | Disable engines
[**engine_enable**](EnginesApi.md#engine_enable) | **POST** /admin/engine/{engineId}/enable | Enable engines
[**engine_pin**](EnginesApi.md#engine_pin) | **POST** /admin/engine/{engineId}/pin | Pin engine to prevent auto-updates
[**engine_unpin**](EnginesApi.md#engine_unpin) | **POST** /admin/engine/{engineId}/unpin | Unpin engine to prevent auto-updates


# **engine_disable**
> InlineResponse2005 engine_disable(engine_id => $engine_id, apikey => $apikey)

Disable engines

Disable to use the selected engines on the nodes.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnginesApi;
my $api_instance = WWW::OpenAPIClient::EnginesApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $engine_id = clamav_7_linux; # string | The unique engine identifier
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->engine_disable(engine_id => $engine_id, apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnginesApi->engine_disable: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **engine_enable**
> InlineResponse2004 engine_enable(engine_id => $engine_id, apikey => $apikey)

Enable engines

Enable to use the selected engine on the nodes.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnginesApi;
my $api_instance = WWW::OpenAPIClient::EnginesApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $engine_id = clamav_7_linux; # string | The unique engine identifier
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->engine_enable(engine_id => $engine_id, apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnginesApi->engine_enable: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **engine_pin**
> InlineResponse2002 engine_pin(engine_id => $engine_id, apikey => $apikey, type => $type)

Pin engine to prevent auto-updates

Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnginesApi;
my $api_instance = WWW::OpenAPIClient::EnginesApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $engine_id = clamav_7_linux; # string | The unique engine identifier
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $type = engine; # string | Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.)

eval { 
    my $result = $api_instance->engine_pin(engine_id => $engine_id, apikey => $apikey, type => $type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnginesApi->engine_pin: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **string**| Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **engine_unpin**
> InlineResponse2003 engine_unpin(engine_id => $engine_id, apikey => $apikey, type => $type)

Unpin engine to prevent auto-updates

Unpin engines so automatic updates will be applied on them.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::EnginesApi;
my $api_instance = WWW::OpenAPIClient::EnginesApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $engine_id = clamav_7_linux; # string | The unique engine identifier
my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $type = engine; # string | Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.)

eval { 
    my $result = $api_instance->engine_unpin(engine_id => $engine_id, apikey => $apikey, type => $type);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling EnginesApi->engine_unpin: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**| The unique engine identifier | 
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **string**| Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

