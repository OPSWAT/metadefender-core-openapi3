# WWW::OpenAPIClient::YaraApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::YaraApi;
```

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**yara_package_generate**](YaraApi.md#yara_package_generate) | **PUT** /yara/generate | Generate Yara package
[**yara_package_status**](YaraApi.md#yara_package_status) | **GET** /yara/package | Yara Generation Status
[**yara_sources_get**](YaraApi.md#yara_sources_get) | **GET** /admin/config/yara/sources | Get Yara sources
[**yara_sources_put**](YaraApi.md#yara_sources_put) | **PUT** /admin/config/yara/sources | Modify Yara sources


# **yara_package_generate**
> InlineResponse2007 yara_package_generate(apikey => $apikey)

Generate Yara package

Generate a new package based on the new added sources.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::YaraApi;
my $api_instance = WWW::OpenAPIClient::YaraApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->yara_package_generate(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling YaraApi->yara_package_generate: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **yara_package_status**
> InlineResponse2007 yara_package_status(apikey => $apikey)

Yara Generation Status

Get status of Yara package generation.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::YaraApi;
my $api_instance = WWW::OpenAPIClient::YaraApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->yara_package_status(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling YaraApi->yara_package_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **yara_sources_get**
> YaraSourcesObject yara_sources_get(apikey => $apikey)

Get Yara sources

Retrieve a list of all sources for the Yara Engine.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::YaraApi;
my $api_instance = WWW::OpenAPIClient::YaraApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->yara_sources_get(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling YaraApi->yara_sources_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **yara_sources_put**
> YaraSourcesObject yara_sources_put(apikey => $apikey, yara_sources_object => $yara_sources_object)

Modify Yara sources

Modify one (or more) of the sources for the Yara Engine.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::YaraApi;
my $api_instance = WWW::OpenAPIClient::YaraApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $yara_sources_object = WWW::OpenAPIClient::Object::YaraSourcesObject->new(); # YaraSourcesObject | A list of Yara Engine sources.

eval { 
    my $result = $api_instance->yara_sources_put(apikey => $apikey, yara_sources_object => $yara_sources_object);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling YaraApi->yara_sources_put: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **yara_sources_object** | [**YaraSourcesObject**](YaraSourcesObject.md)| A list of Yara Engine sources. | [optional] 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

