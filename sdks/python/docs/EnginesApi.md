# openapi_client.EnginesApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**engine_disable**](EnginesApi.md#engine_disable) | **POST** /admin/engine/{engineId}/disable | Disable engines
[**engine_enable**](EnginesApi.md#engine_enable) | **POST** /admin/engine/{engineId}/enable | Enable engines
[**engine_pin**](EnginesApi.md#engine_pin) | **POST** /admin/engine/{engineId}/pin | Pin engine to prevent auto-updates
[**engine_unpin**](EnginesApi.md#engine_unpin) | **POST** /admin/engine/{engineId}/unpin | Unpin engine to prevent auto-updates


# **engine_disable**
> InlineResponse2005 engine_disable(engine_id, apikey=apikey)

Disable engines

Disable to use the selected engines on the nodes.

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
    api_instance = openapi_client.EnginesApi(api_client)
    engine_id = 'clamav_7_linux' # str | The unique engine identifier
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Disable engines
        api_response = api_instance.engine_disable(engine_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnginesApi->engine_disable: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **str**| The unique engine identifier | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **engine_enable**
> InlineResponse2004 engine_enable(engine_id, apikey=apikey)

Enable engines

Enable to use the selected engine on the nodes.

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
    api_instance = openapi_client.EnginesApi(api_client)
    engine_id = 'clamav_7_linux' # str | The unique engine identifier
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Enable engines
        api_response = api_instance.engine_enable(engine_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnginesApi->engine_enable: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **str**| The unique engine identifier | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **engine_pin**
> InlineResponse2002 engine_pin(engine_id, apikey=apikey, type=type)

Pin engine to prevent auto-updates

Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.

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
    api_instance = openapi_client.EnginesApi(api_client)
    engine_id = 'clamav_7_linux' # str | The unique engine identifier
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
type = 'engine' # str | Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) (optional)

    try:
        # Pin engine to prevent auto-updates
        api_response = api_instance.engine_pin(engine_id, apikey=apikey, type=type)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnginesApi->engine_pin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **str**| The unique engine identifier | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **str**| Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **engine_unpin**
> InlineResponse2003 engine_unpin(engine_id, apikey=apikey, type=type)

Unpin engine to prevent auto-updates

Unpin engines so automatic updates will be applied on them.

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
    api_instance = openapi_client.EnginesApi(api_client)
    engine_id = 'clamav_7_linux' # str | The unique engine identifier
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
type = 'engine' # str | Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) (optional)

    try:
        # Unpin engine to prevent auto-updates
        api_response = api_instance.engine_unpin(engine_id, apikey=apikey, type=type)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling EnginesApi->engine_unpin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **str**| The unique engine identifier | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **type** | **str**| Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) | [optional] 

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

