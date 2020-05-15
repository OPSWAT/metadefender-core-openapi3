import connexion
import six

from openapi_server.models.analysis_result import AnalysisResult  # noqa: E501
from openapi_server.models.inline_response20010 import InlineResponse20010  # noqa: E501
from openapi_server.models.inline_response2008 import InlineResponse2008  # noqa: E501
from openapi_server.models.inline_response2009 import InlineResponse2009  # noqa: E501
from openapi_server.models.inline_response400 import InlineResponse400  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server import util


def analysis_rules(user_agent=None):  # noqa: E501
    """Fetching Available Analysis Rules

    Retrieve all available rules with their custom configurations. Fetching available processing rules.  # noqa: E501

    :param user_agent: The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client&#39;s user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html). 
    :type user_agent: str

    :rtype: List[InlineResponse20010]
    """
    return 'do some magic!'


def file_analysis_cancel(data_id, apikey=None):  # noqa: E501
    """Cancel File Analysis

    When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed.  # noqa: E501

    :param data_id: 
    :type data_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: object
    """
    return 'do some magic!'


def file_analysis_get(data_id, apikey=None):  # noqa: E501
    """Fetch Analysis Result

    Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using &#x60;scan_results.progress_percentage&#x60; value from the response.  # noqa: E501

    :param data_id: 
    :type data_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: AnalysisResult
    """
    return 'do some magic!'


def file_analysis_post(apikey=None, filename=None, filepath=None, user_agent=None, rule=None, workflow=None, batch=None, archivepwd=None, metadata=None, callbackurl=None, body=None):  # noqa: E501
    """Analyze File

    ## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. &gt; _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on &#x60;/file&#x60; API. # noqa: E501

    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str
    :param filename: The name of the submitted file
    :type filename: str
    :param filepath: if local file scan is enabled the path to the file (see Security rule configuration)
    :type filepath: str
    :param user_agent: user_agent header used to identify (and limit) access to a particular rule. For rule selection, &#x60;rule&#x60; header should be used. 
    :type user_agent: str
    :param rule: Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)       
    :type rule: str
    :param workflow: name of the selected workflow (deprecated, use \&quot;rule\&quot; header parameter instead)
    :type workflow: str
    :param batch: Batch id to scan with, coming from &#x60;Initiate Batch&#x60; (If it is not given, it will be a single file scan.)
    :type batch: str
    :param archivepwd: password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd&lt;X&gt;     * X: Could be empty     * When having value, X must be a number &gt;&#x3D; 1   For example:     archivepwd1: \&quot;fox\&quot;     archivepwd2: \&quot;cow\&quot;     archivepwd3: \&quot;bear\&quot; 
    :type archivepwd: str
    :param metadata: could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result). 
    :type metadata: str
    :param callbackurl: Client&#39;s URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: &lt;protocol://&gt;&lt;ip | domain&gt;:&lt;port&gt;&lt;/path&gt;   * Example: http://10.0.1.100:8081/listenback 
    :type callbackurl: str
    :param body: 
    :type body: str

    :rtype: InlineResponse2008
    """
    return 'do some magic!'


def sanitized_file(data_id, apikey=None):  # noqa: E501
    """Download Sanitized Files

    Retrieve sanitized file based on the &#x60;data_id&#x60;  # noqa: E501

    :param data_id: The data_id comes from the result of &#x60;Analyze a file&#x60;. In case of sanitizing the content of an archive, the data_id of contained file can be found in &#x60;Fetch analysis result&#x60;.
    :type data_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: file
    """
    return 'do some magic!'


def webhook_status(data_id, apikey=None):  # noqa: E501
    """Query webhook status

    Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status.  # noqa: E501

    :param data_id: Either &#x60;data_id&#x60; or &#x60;batch_id&#x60;.
    :type data_id: str
    :param apikey: Generated &#x60;session_id&#x60; from [Login](#operation/userLogin) call can be used as an &#x60;apikey&#x60; for API calls that require authentication.                
    :type apikey: str

    :rtype: InlineResponse2009
    """
    return 'do some magic!'
