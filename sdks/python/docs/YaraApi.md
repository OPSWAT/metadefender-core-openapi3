# openapi_client.YaraApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**yara_package_generate**](YaraApi.md#yara_package_generate) | **PUT** /yara/generate | Generate Yara package
[**yara_package_status**](YaraApi.md#yara_package_status) | **GET** /yara/package | Yara Generation Status
[**yara_sources_get**](YaraApi.md#yara_sources_get) | **GET** /admin/config/yara/sources | Get Yara sources
[**yara_sources_put**](YaraApi.md#yara_sources_put) | **PUT** /admin/config/yara/sources | Modify Yara sources


# **yara_package_generate**
> InlineResponse2007 yara_package_generate(apikey=apikey)

Generate Yara package

Generate a new package based on the new added sources.

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
    api_instance = openapi_client.YaraApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Generate Yara package
        api_response = api_instance.yara_package_generate(apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling YaraApi->yara_package_generate: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **yara_package_status**
> InlineResponse2007 yara_package_status(apikey=apikey)

Yara Generation Status

Get status of Yara package generation.

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
    api_instance = openapi_client.YaraApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Yara Generation Status
        api_response = api_instance.yara_package_status(apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling YaraApi->yara_package_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **yara_sources_get**
> YaraSourcesObject yara_sources_get(apikey=apikey)

Get Yara sources

Retrieve a list of all sources for the Yara Engine.

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
    api_instance = openapi_client.YaraApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Get Yara sources
        api_response = api_instance.yara_sources_get(apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling YaraApi->yara_sources_get: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Yara Engine sources. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **yara_sources_put**
> YaraSourcesObject yara_sources_put(apikey=apikey, yara_sources_object=yara_sources_object)

Modify Yara sources

Modify one (or more) of the sources for the Yara Engine.

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
    api_instance = openapi_client.YaraApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
yara_sources_object = openapi_client.YaraSourcesObject() # YaraSourcesObject | A list of Yara Engine sources. (optional)

    try:
        # Modify Yara sources
        api_response = api_instance.yara_sources_put(apikey=apikey, yara_sources_object=yara_sources_object)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling YaraApi->yara_sources_put: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **yara_sources_object** | [**YaraSourcesObject**](YaraSourcesObject.md)| A list of Yara Engine sources. | [optional] 

### Return type

[**YaraSourcesObject**](YaraSourcesObject.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of Yara Engine sources. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

