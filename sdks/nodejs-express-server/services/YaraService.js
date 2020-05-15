/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Generate Yara package
* Generate a new package based on the new added sources.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns inline_response_200_7
* */
const yaraPackageGenerate = ({ apikey }) => new Promise(
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
* Yara Generation Status
* Get status of Yara package generation.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns inline_response_200_7
* */
const yaraPackageStatus = ({ apikey }) => new Promise(
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
* Get Yara sources
* Retrieve a list of all sources for the Yara Engine.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns YaraSourcesObject
* */
const yaraSourcesGet = ({ apikey }) => new Promise(
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
* Modify Yara sources
* Modify one (or more) of the sources for the Yara Engine.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* yaraSourcesObject YaraSourcesObject A list of Yara Engine sources. (optional)
* returns YaraSourcesObject
* */
const yaraSourcesPut = ({ apikey, yaraSourcesObject }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        yaraSourcesObject,
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
  yaraPackageGenerate,
  yaraPackageStatus,
  yaraSourcesGet,
  yaraSourcesPut,
};
