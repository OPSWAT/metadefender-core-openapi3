import connexion
import six

from openapi_server.models.inline_response2006 import InlineResponse2006  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.new_user_role_request import NewUserRoleRequest  # noqa: E501
from openapi_server.models.new_user_role_response import NewUserRoleResponse  # noqa: E501
from openapi_server.models.user_request import UserRequest  # noqa: E501
from openapi_server.models.user_response import UserResponse  # noqa: E501
from openapi_server import util


def admin_import(apikey=None, body=None):  # noqa: E501
    """Import configuration

    Import configuration from file. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param body: 
    :type body: str

    :rtype: InlineResponse2006
    """
    return 'do some magic!'


def role_create(apikey=None, new_user_role_request=None):  # noqa: E501
    """Create new role

    Add a new user role to the system. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param new_user_role_request: 
    :type new_user_role_request: dict | bytes

    :rtype: NewUserRoleResponse
    """
    if connexion.request.is_json:
        new_user_role_request = NewUserRoleRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def user_create(apikey=None, user_request=None):  # noqa: E501
    """Create user

     # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param user_request: 
    :type user_request: dict | bytes

    :rtype: UserResponse
    """
    if connexion.request.is_json:
        user_request = UserRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
