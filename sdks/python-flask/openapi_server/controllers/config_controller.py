import connexion
import six

from openapi_server.models.admin_config_session import AdminConfigSession  # noqa: E501
from openapi_server.models.admin_config_update import AdminConfigUpdate  # noqa: E501
from openapi_server.models.admin_config_webhook import AdminConfigWebhook  # noqa: E501
from openapi_server.models.inline_object1 import InlineObject1  # noqa: E501
from openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from openapi_server.models.inline_response2001 import InlineResponse2001  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.skip_list import SkipList  # noqa: E501
from openapi_server.models.unknownbasetype import UNKNOWN_BASE_TYPE  # noqa: E501
from openapi_server import util


def config_audit_log(apikey=None, unknown_base_type=None):  # noqa: E501
    """Audit clean up

    Setting audit records (update history) clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.   # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param unknown_base_type: 
    :type unknown_base_type: dict | bytes

    :rtype: InlineResponse200
    """
    if connexion.request.is_json:
        unknown_base_type = UNKNOWN_BASE_TYPE.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_get_skip_hash(apikey=None):  # noqa: E501
    """Get &#39;skip by hash&#39; list

    Get the list of hashes whitelisted or blacklisted. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: SkipList
    """
    return 'do some magic!'


def config_quarantine(apikey=None, unknown_base_type=None):  # noqa: E501
    """Quarantine clean up

    Setting quarantine clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.   # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param unknown_base_type: 
    :type unknown_base_type: dict | bytes

    :rtype: InlineResponse200
    """
    if connexion.request.is_json:
        unknown_base_type = UNKNOWN_BASE_TYPE.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_sanitized_repo(apikey=None, inline_object1=None):  # noqa: E501
    """Sanitized files clean up

    Setting sanitized files clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.   # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param inline_object1: 
    :type inline_object1: dict | bytes

    :rtype: InlineResponse2001
    """
    if connexion.request.is_json:
        inline_object1 = InlineObject1.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_scan_history(apikey=None, unknown_base_type=None):  # noqa: E501
    """Processing history clean up

    Setting processing history clean up time (clean up records older than).  &gt; _**Note**_:The clean up range is defined in &#x60;hours&#x60;.   # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param unknown_base_type: 
    :type unknown_base_type: dict | bytes

    :rtype: InlineResponse200
    """
    if connexion.request.is_json:
        unknown_base_type = UNKNOWN_BASE_TYPE.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_session(apikey=None, admin_config_session=None):  # noqa: E501
    """Session settings

    Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin)  # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param admin_config_session: 
    :type admin_config_session: dict | bytes

    :rtype: AdminConfigSession
    """
    if connexion.request.is_json:
        admin_config_session = AdminConfigSession.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_update(apikey=None, admin_config_update=None):  # noqa: E501
    """Modules Update Source and Frequency

    Setting update frequency for all modules and engines.  &gt; _**Note**_:The clean up range is defined in &#x60;minutes&#x60;.   # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param admin_config_update: 
    :type admin_config_update: dict | bytes

    :rtype: AdminConfigUpdate
    """
    if connexion.request.is_json:
        admin_config_update = AdminConfigUpdate.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_update_skip_hash(apikey=None, skip_list=None):  # noqa: E501
    """Modify &#39;skip by hash&#39; list

    Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist&#39;s rules in array under \&quot;whitelist\&quot; key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id&#39;s strings in array hash: md5, sha1 or sha256 hash  # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param skip_list: A list of all skip/white/black-listed hashes.
    :type skip_list: dict | bytes

    :rtype: SkipList
    """
    if connexion.request.is_json:
        skip_list = SkipList.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_update_webhook(apikey=None, admin_config_webhook=None):  # noqa: E501
    """Webhook set configuration

    Modifying settings supported for webhook mode  # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param admin_config_webhook: 
    :type admin_config_webhook: dict | bytes

    :rtype: AdminConfigWebhook
    """
    if connexion.request.is_json:
        admin_config_webhook = AdminConfigWebhook.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def config_webhook(apikey=None):  # noqa: E501
    """Webhook get configuration

    Getting settings supported for webhook mode  # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: AdminConfigWebhook
    """
    return 'do some magic!'
