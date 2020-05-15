# openapi_client.LicenseApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**license_activation**](LicenseApi.md#license_activation) | **POST** /admin/license/activation | Activate license
[**license_get**](LicenseApi.md#license_get) | **GET** /admin/license | Get Current License Information
[**license_upload**](LicenseApi.md#license_upload) | **POST** /admin/license | Upload license key


# **license_activation**
> license_activation(apikey=apikey, unknown_base_type=unknown_base_type)

Activate license

This API initiates an online activation of the deployment.  In case of error, check the application logs for more details.

### Example

* Api Key Authentication (apikey):
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
configuration = openapi_client.Configuration()
# Configure API key authorization: apikey
configuration.api_key['apikey'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Defining host is optional and default to http://localhost:8008
configuration.host = "http://localhost:8008"

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LicenseApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
unknown_base_type = {activationKey=xxxx-xxxx-xxxx-xxxx-xxxx-xxxx-xxxx, quantity=1, comment=MetaDefender Core Server 001} # UNKNOWN_BASE_TYPE |  (optional)

    try:
        # Activate license
        api_instance.license_activation(apikey=apikey, unknown_base_type=unknown_base_type)
    except ApiException as e:
        print("Exception when calling LicenseApi->license_activation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **license_get**
> LicenseInformation license_get(apikey=apikey)

Get Current License Information

Fetch all details about the licensing status of the product.

### Example

* Api Key Authentication (apikey):
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
configuration = openapi_client.Configuration()
# Configure API key authorization: apikey
configuration.api_key['apikey'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Defining host is optional and default to http://localhost:8008
configuration.host = "http://localhost:8008"

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LicenseApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Get Current License Information
        api_response = api_instance.license_get(apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling LicenseApi->license_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**LicenseInformation**](LicenseInformation.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the licensed product (product type, number of activations, deploymentId, expiration date and days left) |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **license_upload**
> license_upload(apikey=apikey, body=body)

Upload license key

Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key=%activation_key%&deployment=%deployment_unique_ID%&quantity=%quantity%  Deployment unique ID can be fetched via Get Current License Information API.      

### Example

* Api Key Authentication (apikey):
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint
configuration = openapi_client.Configuration()
# Configure API key authorization: apikey
configuration.api_key['apikey'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['apikey'] = 'Bearer'

# Defining host is optional and default to http://localhost:8008
configuration.host = "http://localhost:8008"

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LicenseApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
body = 'body_example' # str |  (optional)

    try:
        # Upload license key
        api_instance.license_upload(apikey=apikey, body=body)
    except ApiException as e:
        print("Exception when calling LicenseApi->license_upload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **body** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Invalid license file |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

