import connexion
import six

from openapi_server.models.inline_response2007 import InlineResponse2007  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.yara_sources_object import YaraSourcesObject  # noqa: E501
from openapi_server import util


def yara_package_generate(apikey=None):  # noqa: E501
    """Generate Yara package

    Generate a new package based on the new added sources. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: InlineResponse2007
    """
    return 'do some magic!'


def yara_package_status(apikey=None):  # noqa: E501
    """Yara Generation Status

    Get status of Yara package generation. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: InlineResponse2007
    """
    return 'do some magic!'


def yara_sources_get(apikey=None):  # noqa: E501
    """Get Yara sources

    Retrieve a list of all sources for the Yara Engine. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: YaraSourcesObject
    """
    return 'do some magic!'


def yara_sources_put(apikey=None, yara_sources_object=None):  # noqa: E501
    """Modify Yara sources

    Modify one (or more) of the sources for the Yara Engine. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param yara_sources_object: A list of Yara Engine sources.
    :type yara_sources_object: dict | bytes

    :rtype: YaraSourcesObject
    """
    if connexion.request.is_json:
        yara_sources_object = YaraSourcesObject.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
