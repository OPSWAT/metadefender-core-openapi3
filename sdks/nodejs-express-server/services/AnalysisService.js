/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Fetching Available Analysis Rules
* Retrieve all available rules with their custom configurations. Fetching available processing rules. 
*
* userUnderscoreagent String The user agent string value sent in the header (specified by the client).  Only those rules are returned, that:   * Match the client's user agent sent using the user_agent header, or   * Are not restricted to a specific user agent.  For details see KB article [What are Security Policies and how do I use them?](https://onlinehelp.opswat.com/corev4/What_are_Security_Policies_and_how_do_I_use_them_.html).  (optional)
* returns List
* */
const analysisRules = ({ userUnderscoreagent }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        userUnderscoreagent,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Cancel File Analysis
* When cancelling a file analysis, the connected analysis (e.g. files in an archive) that are still in progress will be cancelled also.   The cancelled analysis will be automatically closed. 
*
* dataUnderscoreid String 
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns Object
* */
const fileAnalysisCancel = ({ dataUnderscoreid, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dataUnderscoreid,
        apikey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Fetch Analysis Result
* Retrieve scan results. Scan is done asynchronously and each scan request is tracked by a data ID. Initiating file scans and retrieving the results need to be done using two separate API calls. This request needs to be made multiple times until the scan is complete. Scan completion can be traced using `scan_results.progress_percentage` value from the response. 
*
* dataUnderscoreid String 
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns AnalysisResult
* */
const fileAnalysisGet = ({ dataUnderscoreid, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dataUnderscoreid,
        apikey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Analyze File
* ## Scanning a file using a specified workflow. Scan is done asynchronously and each scan request is tracked by data id of which result can be retrieved by API Fetch Scan Result. > _**Note**_: Chunked transfer encoding (applying header Transfer-Encoding: Chunked) is **not supported** on `/file` API.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* filename String The name of the submitted file (optional)
* filepath String if local file scan is enabled the path to the file (see Security rule configuration) (optional)
* userUnderscoreagent String user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.  (optional)
* rule String Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        (optional)
* workflow String name of the selected workflow (deprecated, use \"rule\" header parameter instead) (optional)
* batch String Batch id to scan with, coming from `Initiate Batch` (If it is not given, it will be a single file scan.) (optional)
* archivepwd String password for archive ( URL encoded UTF-8 string)   Multiple passwords is also supported, format: archivepwd<X>     * X: Could be empty     * When having value, X must be a number >= 1   For example:     archivepwd1: \"fox\"     archivepwd2: \"cow\"     archivepwd3: \"bear\"  (optional)
* metadata String could be utilized for: Additional parameter for pre-defined post actions and external scanners (as a part of STDIN input). Customized macro variable for watermarking text (Proactive DLP engine feature). Additional context / verbose information for each file submission (appended into JSON response scan result).  (optional)
* callbackurl URI Client's URL where MetaDefender Core will notify scan result back to whenever scan is finished (webhooks model). See details at 8.1.11.1. Individual file processing   * Format: <protocol://><ip | domain>:<port></path>   * Example: http://10.0.1.100:8081/listenback  (optional)
* body File  (optional)
* returns inline_response_200_8
* */
const fileAnalysisPost = ({ apikey, filename, filepath, userUnderscoreagent, rule, workflow, batch, archivepwd, metadata, callbackurl, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        filename,
        filepath,
        userUnderscoreagent,
        rule,
        workflow,
        batch,
        archivepwd,
        metadata,
        callbackurl,
        body,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Download Sanitized Files
* Retrieve sanitized file based on the `data_id` 
*
* dataUnderscoreid String The data_id comes from the result of `Analyze a file`. In case of sanitizing the content of an archive, the data_id of contained file can be found in `Fetch analysis result`.
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns File
* */
const sanitizedFile = ({ dataUnderscoreid, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dataUnderscoreid,
        apikey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Query webhook status
* Prior to being notified by Core when webhooks mode is set, client can anytime ask Core for file / batch processing webhooks status. 
*
* dataUnderscoreid String Either `data_id` or `batch_id`.
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns inline_response_200_9
* */
const webhookStatus = ({ dataUnderscoreid, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        dataUnderscoreid,
        apikey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  analysisRules,
  fileAnalysisCancel,
  fileAnalysisGet,
  fileAnalysisPost,
  sanitizedFile,
  webhookStatus,
};
