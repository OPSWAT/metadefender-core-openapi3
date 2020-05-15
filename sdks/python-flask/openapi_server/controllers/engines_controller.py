import connexion
import six

from openapi_server.models.inline_response2002 import InlineResponse2002  # noqa: E501
from openapi_server.models.inline_response2003 import InlineResponse2003  # noqa: E501
from openapi_server.models.inline_response2004 import InlineResponse2004  # noqa: E501
from openapi_server.models.inline_response2005 import InlineResponse2005  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server import util


def engine_disable(engine_id, apikey=None):  # noqa: E501
    """Disable engines

    Disable to use the selected engines on the nodes. # noqa: E501

    :param engine_id: The unique engine identifier
    :type engine_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: InlineResponse2005
    """
    return 'do some magic!'


def engine_enable(engine_id, apikey=None):  # noqa: E501
    """Enable engines

    Enable to use the selected engine on the nodes. # noqa: E501

    :param engine_id: The unique engine identifier
    :type engine_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: InlineResponse2004
    """
    return 'do some magic!'


def engine_pin(engine_id, apikey=None, type=None):  # noqa: E501
    """Pin engine to prevent auto-updates

    Pin engines to prevent applying automatic updates on them. Manual updates still can be applied. # noqa: E501

    :param engine_id: The unique engine identifier
    :type engine_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param type: Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.)
    :type type: str

    :rtype: InlineResponse2002
    """
    return 'do some magic!'


def engine_unpin(engine_id, apikey=None, type=None):  # noqa: E501
    """Unpin engine to prevent auto-updates

    Unpin engines so automatic updates will be applied on them. # noqa: E501

    :param engine_id: The unique engine identifier
    :type engine_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param type: Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.)
    :type type: str

    :rtype: InlineResponse2003
    """
    return 'do some magic!'
