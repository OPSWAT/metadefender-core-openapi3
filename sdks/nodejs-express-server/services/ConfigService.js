/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Audit clean up
* Setting audit records (update history) clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* uNKNOWNUnderscoreBASEUnderscoreTYPE UNKNOWN_BASE_TYPE  (optional)
* returns inline_response_200
* */
const configAuditLog = ({ apikey, uNKNOWNUnderscoreBASEUnderscoreTYPE }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        uNKNOWNUnderscoreBASEUnderscoreTYPE,
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
* Get 'skip by hash' list
* Get the list of hashes whitelisted or blacklisted.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns SkipList
* */
const configGetSkipHash = ({ apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Quarantine clean up
* Setting quarantine clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* uNKNOWNUnderscoreBASEUnderscoreTYPE UNKNOWN_BASE_TYPE  (optional)
* returns inline_response_200
* */
const configQuarantine = ({ apikey, uNKNOWNUnderscoreBASEUnderscoreTYPE }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        uNKNOWNUnderscoreBASEUnderscoreTYPE,
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
* Sanitized files clean up
* Setting sanitized files clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `minutes`.  
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* inlineObject1 InlineObject1  (optional)
* returns inline_response_200_1
* */
const configSanitizedRepo = ({ apikey, inlineObject1 }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        inlineObject1,
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
* Processing history clean up
* Setting processing history clean up time (clean up records older than).  > _**Note**_:The clean up range is defined in `hours`.  
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* uNKNOWNUnderscoreBASEUnderscoreTYPE UNKNOWN_BASE_TYPE  (optional)
* returns inline_response_200
* */
const configScanHistory = ({ apikey, uNKNOWNUnderscoreBASEUnderscoreTYPE }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        uNKNOWNUnderscoreBASEUnderscoreTYPE,
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
* Session settings
* Configure settings for session generated upon a successful login See more at [Login](#operation/userLogin) 
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* adminConfigSession AdminConfigSession  (optional)
* returns AdminConfigSession
* */
const configSession = ({ apikey, adminConfigSession }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        adminConfigSession,
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
* Modules Update Source and Frequency
* Setting update frequency for all modules and engines.  > _**Note**_:The clean up range is defined in `minutes`.  
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* adminConfigUpdate AdminConfigUpdate  (optional)
* returns AdminConfigUpdate
* */
const configUpdate = ({ apikey, adminConfigUpdate }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        adminConfigUpdate,
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
* Modify 'skip by hash' list
* Modify one (or more) of the sources for the Yara Engine. The request body containing whitelist's rules in array under \"whitelist\" key; Each object in the array represents a whitelist: comment: same comment for detailed more information this whitelist settings. engines: containing engine id's strings in array hash: md5, sha1 or sha256 hash 
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* skipList SkipList A list of all skip/white/black-listed hashes. (optional)
* returns SkipList
* */
const configUpdateSkipHash = ({ apikey, skipList }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        skipList,
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
* Webhook set configuration
* Modifying settings supported for webhook mode 
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* adminConfigWebhook AdminConfigWebhook  (optional)
* returns AdminConfigWebhook
* */
const configUpdateWebhook = ({ apikey, adminConfigWebhook }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        adminConfigWebhook,
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
* Webhook get configuration
* Getting settings supported for webhook mode 
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns AdminConfigWebhook
* */
const configWebhook = ({ apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  configAuditLog,
  configGetSkipHash,
  configQuarantine,
  configSanitizedRepo,
  configScanHistory,
  configSession,
  configUpdate,
  configUpdateSkipHash,
  configUpdateWebhook,
  configWebhook,
};
