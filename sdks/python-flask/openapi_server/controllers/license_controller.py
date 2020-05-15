import connexion
import six

from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.models.license_information import LicenseInformation  # noqa: E501
from openapi_server.models.unknownbasetype import UNKNOWN_BASE_TYPE  # noqa: E501
from openapi_server import util


def license_activation(apikey=None, unknown_base_type=None):  # noqa: E501
    """Activate license

    This API initiates an online activation of the deployment.  In case of error, check the application logs for more details. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param unknown_base_type: 
    :type unknown_base_type: dict | bytes

    :rtype: None
    """
    if connexion.request.is_json:
        unknown_base_type = UNKNOWN_BASE_TYPE.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def license_get(apikey=None):  # noqa: E501
    """Get Current License Information

    Fetch all details about the licensing status of the product. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: LicenseInformation
    """
    return 'do some magic!'


def license_upload(apikey=None, body=None):  # noqa: E501
    """Upload license key

    Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key&#x3D;%activation_key%&amp;deployment&#x3D;%deployment_unique_ID%&amp;quantity&#x3D;%quantity%  Deployment unique ID can be fetched via Get Current License Information API.       # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param body: 
    :type body: str

    :rtype: None
    """
    return 'do some magic!'
