# openapi_client.BatchApi

All URIs are relative to *http://localhost:8008*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_cancel**](BatchApi.md#batch_cancel) | **POST** /file/{batchId}/cancel | Cancel Batch
[**batch_close**](BatchApi.md#batch_close) | **POST** /file/batch/{batchId}/close | Close Batch
[**batch_create**](BatchApi.md#batch_create) | **POST** /file/batch | Initiate Batch
[**batch_signed_result**](BatchApi.md#batch_signed_result) | **GET** /file/batch/{batchId}/certificate | Download Signed Batch Result
[**batch_status**](BatchApi.md#batch_status) | **GET** /file/batch/{batchId} | Status of Batch Analysis


# **batch_cancel**
> object batch_cancel(batch_id, apikey=apikey)

Cancel Batch

When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BatchApi(api_client)
    batch_id = 'batch_id_example' # str | The batch identifier used to submit files in the batch and to close the batch.
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Cancel Batch
        api_response = api_instance.batch_cancel(batch_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BatchApi->batch_cancel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **str**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch cancelled. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Batch not found (invalid id) |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_close**
> BatchResponse batch_close(batch_id, apikey=apikey)

Close Batch

The batch will be closed and files can no longer can be added to the current batch.      

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BatchApi(api_client)
    batch_id = 'batch_id_example' # str | The batch identifier used to submit files in the batch and to close the batch.
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Close Batch
        api_response = api_instance.batch_close(batch_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BatchApi->batch_close: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **str**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch successfully closed. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_create**
> BatchId batch_create(apikey=apikey, rule=rule, user_agent=user_agent, user_data=user_data)

Initiate Batch

Create a new batch and retrieve the batch_id

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BatchApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
rule = 'rule_example' # str | Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        (optional)
user_agent = 'user_agent_example' # str | user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.  (optional)
user_data = 'user_data_example' # str | Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        (optional)

    try:
        # Initiate Batch
        api_response = api_instance.batch_create(apikey=apikey, rule=rule, user_agent=user_agent, user_data=user_data)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BatchApi->batch_create: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **rule** | **str**| Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        | [optional] 
 **user_agent** | **str**| user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used.  | [optional] 
 **user_data** | **str**| Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        | [optional] 

### Return type

[**BatchId**](BatchId.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch created successfully. |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_signed_result**
> batch_signed_result(batch_id, apikey=apikey)

Download Signed Batch Result

Download digitally signed status report for the entire batch

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BatchApi(api_client)
    batch_id = 'batch_id_example' # str | The batch identifier used to submit files in the batch and to close the batch.
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Download Signed Batch Result
        api_instance.batch_signed_result(batch_id, apikey=apikey)
    except ApiException as e:
        print("Exception when calling BatchApi->batch_signed_result: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **str**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Signed batch result and certificate are sent back in response body (YAML format). |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_status**
> BatchResponse batch_status(batch_id, apikey=apikey)

Status of Batch Analysis

Retrieve status report for the entire batch

### Example

```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Enter a context with an instance of the API client
with openapi_client.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BatchApi(api_client)
    batch_id = 'batch_id_example' # str | The batch identifier used to submit files in the batch and to close the batch.
apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Status of Batch Analysis
        api_response = api_instance.batch_status(batch_id, apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BatchApi->batch_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **str**| The batch identifier used to submit files in the batch and to close the batch. | 
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**BatchResponse**](BatchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Batch progress paginated report (50 entries/page). |  -  |
**400** | Bad Request (e.g. invalid header, apikey is missing or invalid). |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

