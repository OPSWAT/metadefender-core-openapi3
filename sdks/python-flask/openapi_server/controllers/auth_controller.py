import connexion
import six

from openapi_server.models.inline_object import InlineObject  # noqa: E501
from openapi_server.models.inline_object2 import InlineObject2  # noqa: E501
from openapi_server.models.inline_response403 import InlineResponse403  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.user_login import UserLogin  # noqa: E501
from openapi_server import util


def user_change_pass(apikey=None, inline_object2=None):  # noqa: E501
    """Change Password

    Modify the current password for the user identified by apikey # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param inline_object2: 
    :type inline_object2: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        inline_object2 = InlineObject2.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def user_login(inline_object=None):  # noqa: E501
    """Login

    Initiate a new session. Required for using protected REST APIs. # noqa: E501

    :param inline_object: 
    :type inline_object: dict | bytes

    :rtype: UserLogin
    """
    if connexion.request.is_json:
        inline_object = InlineObject.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def user_logout(apikey=None):  # noqa: E501
    """Logout

    Destroy session for not using protected REST APIs. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: None
    """
    return 'do some magic!'
