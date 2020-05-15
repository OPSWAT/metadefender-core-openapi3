/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Cancel Batch
* When cancelling a batch, the connected analysis that are still in progress will be cancelled also.   The cancelled batch will be closed.      
*
* batchId String The batch identifier used to submit files in the batch and to close the batch.
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns Object
* */
const batchCancel = ({ batchId, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        batchId,
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
* Close Batch
* The batch will be closed and files can no longer can be added to the current batch.      
*
* batchId String The batch identifier used to submit files in the batch and to close the batch.
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns BatchResponse
* */
const batchClose = ({ batchId, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        batchId,
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
* Initiate Batch
* Create a new batch and retrieve the batch_id
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* rule String Select rule for the analysis, if no header given the default rule will be selected (URL encoded string of rule name)        (optional)
* userUnderscoreagent String user_agent header used to identify (and limit) access to a particular rule. For rule selection, `rule` header should be used.  (optional)
* userData String Additional custom information (max 1024 bytes, URL encoded UTF-8 string)        (optional)
* returns BatchId
* */
const batchCreate = ({ apikey, rule, userUnderscoreagent, userData }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        rule,
        userUnderscoreagent,
        userData,
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
* Download Signed Batch Result
* Download digitally signed status report for the entire batch
*
* batchId String The batch identifier used to submit files in the batch and to close the batch.
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* no response value expected for this operation
* */
const batchSignedResult = ({ batchId, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        batchId,
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
* Status of Batch Analysis
* Retrieve status report for the entire batch
*
* batchId String The batch identifier used to submit files in the batch and to close the batch.
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns BatchResponse
* */
const batchStatus = ({ batchId, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        batchId,
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
  batchCancel,
  batchClose,
  batchCreate,
  batchSignedResult,
  batchStatus,
};
