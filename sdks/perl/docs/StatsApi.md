# WWW::OpenAPIClient::StatsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::StatsApi;
```

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engines_status**](StatsApi.md#engines_status) | **GET** /stat/engines | Engines Status
[**nodes_status**](StatsApi.md#nodes_status) | **GET** /stat/nodes | Nodes Status
[**product_version**](StatsApi.md#product_version) | **GET** /version | Get Product Version


# **engines_status**
> ARRAY[InlineResponse20012] engines_status(apikey => $apikey)

Engines Status

The response is an array of engines with database information.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::StatsApi;
my $api_instance = WWW::OpenAPIClient::StatsApi->new(
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->engines_status(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling StatsApi->engines_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**ARRAY[InlineResponse20012]**](InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **nodes_status**
> ARRAY[InlineResponse20013] nodes_status(apikey => $apikey)

Nodes Status

Get a list of all connected nodes and their status.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::StatsApi;
my $api_instance = WWW::OpenAPIClient::StatsApi->new(
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->nodes_status(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling StatsApi->nodes_status: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**ARRAY[InlineResponse20013]**](InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_version**
> InlineResponse20011 product_version(apikey => $apikey)

Get Product Version

Fetch details about the product version.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::StatsApi;
my $api_instance = WWW::OpenAPIClient::StatsApi->new(
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->product_version(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling StatsApi->product_version: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

