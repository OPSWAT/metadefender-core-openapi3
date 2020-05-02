from __future__ import print_statement
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AnalysisApi()
body =  # Object |  (optional)
filename = filename_example # String | The name of the submitted file (optional)
filepath = filepath_example # String | if local file scan is enabled the path to the file (see Security rule configuration) (optional)
workflow = workflow_example # String | name of the selected workflow (deprecated, use "rule" header parameter instead) (optional)
archivepwd = archivepwd_example # String | password for archive ( URL encoded UTF-8 string)
  Multiple passwords is also supported, format: archivepwd
    * X: Could be empty
    * When having value, X must be a number >= 1
  For example:
    archivepwd1: "fox"
    archivepwd2: "cow"
    archivepwd3: "bear"
(optional)
metadata = metadata_example # String | could be utilized for:
Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input).
Customized macro variable for watermarking text (Proactive DLP engine feature).
Additional context / verbose information for each file submission (appended into JSON response scan result).
(optional)
callbackurl = callbackurl_example # String | Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing
Format: :
Example: http://10.0.1.100:8081/listenback
(optional)

try: 
    # Analyze File
    api_response = api_instance.file_post(body=body, filename=filename, filepath=filepath, workflow=workflow, archivepwd=archivepwd, metadata=metadata, callbackurl=callbackurl)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnalysisApi->filePost: %s\n" % e)
