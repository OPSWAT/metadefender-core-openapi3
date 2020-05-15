# WWW::OpenAPIClient::LicenseApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LicenseApi;
```

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**license_activation**](LicenseApi.md#license_activation) | **POST** /admin/license/activation | Activate license
[**license_get**](LicenseApi.md#license_get) | **GET** /admin/license | Get Current License Information
[**license_upload**](LicenseApi.md#license_upload) | **POST** /admin/license | Upload license key


# **license_activation**
> license_activation(apikey => $apikey, unknown_base_type => $unknown_base_type)

Activate license

This API initiates an online activation of the deployment.  In case of error, check the application logs for more details.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LicenseApi;
my $api_instance = WWW::OpenAPIClient::LicenseApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $unknown_base_type = WWW::OpenAPIClient::Object::UNKNOWN_BASE_TYPE->new(); # UNKNOWN_BASE_TYPE | 

eval { 
    $api_instance->license_activation(apikey => $apikey, unknown_base_type => $unknown_base_type);
};
if ($@) {
    warn "Exception when calling LicenseApi->license_activation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **license_get**
> LicenseInformation license_get(apikey => $apikey)

Get Current License Information

Fetch all details about the licensing status of the product.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LicenseApi;
my $api_instance = WWW::OpenAPIClient::LicenseApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                

eval { 
    my $result = $api_instance->license_get(apikey => $apikey);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LicenseApi->license_get: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**LicenseInformation**](LicenseInformation.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **license_upload**
> license_upload(apikey => $apikey, body => $body)

Upload license key

Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key=%activation_key%&deployment=%deployment_unique_ID%&quantity=%quantity%  Deployment unique ID can be fetched via Get Current License Information API.      

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LicenseApi;
my $api_instance = WWW::OpenAPIClient::LicenseApi->new(

    # Configure API key authorization: apikey
    api_key => {'apikey' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'apikey' => 'Bearer'},
);

my $apikey = "apikey_example"; # string | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                
my $body = WWW::OpenAPIClient::Object::string->new(); # string | 

eval { 
    $api_instance->license_upload(apikey => $apikey, body => $body);
};
if ($@) {
    warn "Exception when calling LicenseApi->license_upload: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **string**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **body** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

