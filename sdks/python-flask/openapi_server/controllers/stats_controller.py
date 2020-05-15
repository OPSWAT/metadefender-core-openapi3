import connexion
import six

from openapi_server.models.inline_response20011 import InlineResponse20011  # noqa: E501
from openapi_server.models.inline_response20012 import InlineResponse20012  # noqa: E501
from openapi_server.models.inline_response20013 import InlineResponse20013  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server import util


def engines_status(apikey=None):  # noqa: E501
    """Engines Status

    The response is an array of engines with database information. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: List[InlineResponse20012]
    """
    return 'do some magic!'


def nodes_status(apikey=None):  # noqa: E501
    """Nodes Status

    Get a list of all connected nodes and their status. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: List[InlineResponse20013]
    """
    return 'do some magic!'


def product_version(apikey=None):  # noqa: E501
    """Get Product Version

    Fetch details about the product version. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: InlineResponse20011
    """
    return 'do some magic!'
