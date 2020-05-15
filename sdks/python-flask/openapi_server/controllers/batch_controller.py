import connexion
import six

from openapi_server.models.batch_id import BatchId  # noqa: E501
from openapi_server.models.batch_response import BatchResponse  # noqa: E501
from openapi_server.models.inline_response400 import InlineResponse400  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server import util


def batch_cancel(batch_id, apikey=None):  # noqa: E501
    """Cancel Batch

    When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.       # noqa: E501

    :param batch_id: The batch identifier used to submit files in the batch and to close the batch.
    :type batch_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: object
    """
    return 'do some magic!'


def batch_close(batch_id, apikey=None):  # noqa: E501
    """Close Batch

    The batch will be closed and files can no longer can be added to the current batch.       # noqa: E501

    :param batch_id: The batch identifier used to submit files in the batch and to close the batch.
    :type batch_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: BatchResponse
    """
    return 'do some magic!'


def batch_create(apikey=None, rule=None, user_agent=None, user_data=None):  # noqa: E501
    """Initiate Batch

    Create a new batch and retrieve the batch_id # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param rule: Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
    :type rule: str
    :param user_agent: user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used. 
    :type user_agent: str
    :param user_data: Additional custom information (max 1024 bytes, URL encoded UTF-8 string)       
    :type user_data: str

    :rtype: BatchId
    """
    return 'do some magic!'


def batch_signed_result(batch_id, apikey=None):  # noqa: E501
    """Download Signed Batch Result

    Download digitally signed status report for the entire batch # noqa: E501

    :param batch_id: The batch identifier used to submit files in the batch and to close the batch.
    :type batch_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: None
    """
    return 'do some magic!'


def batch_status(batch_id, apikey=None):  # noqa: E501
    """Status of Batch Analysis

    Retrieve status report for the entire batch # noqa: E501

    :param batch_id: The batch identifier used to submit files in the batch and to close the batch.
    :type batch_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: BatchResponse
    """
    return 'do some magic!'
