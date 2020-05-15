# openapi_client.ConfigApi

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
> InlineResponse200 config_audit_log(apikey=apikey, unknown_base_type=unknown_base_type)

Audit clean up

Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
unknown_base_type = openapi_client.UNKNOWN_BASE_TYPE() # UNKNOWN_BASE_TYPE |  (optional)

    try:
        # Audit clean up
        api_response = api_instance.config_audit_log(apikey=apikey, unknown_base_type=unknown_base_type)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_audit_log: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

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
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_get_skip_hash**
> SkipList config_get_skip_hash(apikey=apikey)

Get 'skip by hash' list

Get the list of hashes whitelisted or blacklisted.

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Get 'skip by hash' list
        api_response = api_instance.config_get_skip_hash(apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_get_skip_hash: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of all skip/white/black-listed hashes. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_quarantine**
> InlineResponse200 config_quarantine(apikey=apikey, unknown_base_type=unknown_base_type)

Quarantine clean up

Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
unknown_base_type = openapi_client.UNKNOWN_BASE_TYPE() # UNKNOWN_BASE_TYPE |  (optional)

    try:
        # Quarantine clean up
        api_response = api_instance.config_quarantine(apikey=apikey, unknown_base_type=unknown_base_type)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_quarantine: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

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
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_sanitized_repo**
> InlineResponse2001 config_sanitized_repo(apikey=apikey, inline_object1=inline_object1)

Sanitized files clean up

Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
inline_object1 = openapi_client.InlineObject1() # InlineObject1 |  (optional)

    try:
        # Sanitized files clean up
        api_response = api_instance.config_sanitized_repo(apikey=apikey, inline_object1=inline_object1)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_sanitized_repo: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **inline_object1** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_scan_history**
> InlineResponse200 config_scan_history(apikey=apikey, unknown_base_type=unknown_base_type)

Processing history clean up

Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
unknown_base_type = openapi_client.UNKNOWN_BASE_TYPE() # UNKNOWN_BASE_TYPE |  (optional)

    try:
        # Processing history clean up
        api_response = api_instance.config_scan_history(apikey=apikey, unknown_base_type=unknown_base_type)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_scan_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **unknown_base_type** | [**UNKNOWN_BASE_TYPE**](UNKNOWN_BASE_TYPE.md)|  | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

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
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_session**
> AdminConfigSession config_session(apikey=apikey, admin_config_session=admin_config_session)

Session settings

Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
admin_config_session = openapi_client.AdminConfigSession() # AdminConfigSession |  (optional)

    try:
        # Session settings
        api_response = api_instance.config_session(apikey=apikey, admin_config_session=admin_config_session)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_session: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_session** | [**AdminConfigSession**](AdminConfigSession.md)|  | [optional] 

### Return type

[**AdminConfigSession**](AdminConfigSession.md)

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
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_update**
> AdminConfigUpdate config_update(apikey=apikey, admin_config_update=admin_config_update)

Modules Update Source and Frequency

Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
admin_config_update = openapi_client.AdminConfigUpdate() # AdminConfigUpdate |  (optional)

    try:
        # Modules Update Source and Frequency
        api_response = api_instance.config_update(apikey=apikey, admin_config_update=admin_config_update)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_update** | [**AdminConfigUpdate**](AdminConfigUpdate.md)|  | [optional] 

### Return type

[**AdminConfigUpdate**](AdminConfigUpdate.md)

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
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_update_skip_hash**
> SkipList config_update_skip_hash(apikey=apikey, skip_list=skip_list)

Modify 'skip by hash' list

Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash 

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
skip_list = openapi_client.SkipList() # SkipList | A list of all skip/white/black-listed hashes. (optional)

    try:
        # Modify 'skip by hash' list
        api_response = api_instance.config_update_skip_hash(apikey=apikey, skip_list=skip_list)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_update_skip_hash: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **skip_list** | [**SkipList**](SkipList.md)| A list of all skip/white/black-listed hashes. | [optional] 

### Return type

[**SkipList**](SkipList.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of all skip/white/black-listed hashes. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_update_webhook**
> AdminConfigWebhook config_update_webhook(apikey=apikey, admin_config_webhook=admin_config_webhook)

Webhook set configuration

Modifying settings supported for webhook mode 

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
admin_config_webhook = openapi_client.AdminConfigWebhook() # AdminConfigWebhook |  (optional)

    try:
        # Webhook set configuration
        api_response = api_instance.config_update_webhook(apikey=apikey, admin_config_webhook=admin_config_webhook)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_update_webhook: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 
 **admin_config_webhook** | [**AdminConfigWebhook**](AdminConfigWebhook.md)|  | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

[apikey](../README.md#apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**404** | Requests resource was not found. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **config_webhook**
> AdminConfigWebhook config_webhook(apikey=apikey)

Webhook get configuration

Getting settings supported for webhook mode 

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
    api_instance = openapi_client.ConfigApi(api_client)
    apikey = 'apikey_example' # str | Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)

    try:
        # Webhook get configuration
        api_response = api_instance.config_webhook(apikey=apikey)
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling ConfigApi->config_webhook: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apikey** | **str**| Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                 | [optional] 

### Return type

[**AdminConfigWebhook**](AdminConfigWebhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request processed successfully. |  -  |
**403** | Invalid user information or Not Allowed |  -  |
**405** | The user has no rights for this operation. |  -  |
**500** | Unexpected event on server |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

