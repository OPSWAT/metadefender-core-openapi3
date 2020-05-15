/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Engines Status
* The response is an array of engines with database information.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns List
* */
const enginesStatus = ({ apikey }) => new Promise(
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
* Nodes Status
* Get a list of all connected nodes and their status.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns List
* */
const nodesStatus = ({ apikey }) => new Promise(
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
* Get Product Version
* Fetch details about the product version.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns inline_response_200_11
* */
const productVersion = ({ apikey }) => new Promise(
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
  enginesStatus,
  nodesStatus,
  productVersion,
};
