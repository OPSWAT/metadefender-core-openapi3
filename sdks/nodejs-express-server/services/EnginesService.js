/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Disable engines
* Disable to use the selected engines on the nodes.
*
* engineId String The unique engine identifier
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns inline_response_200_5
* */
const engineDisable = ({ engineId, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        engineId,
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
* Enable engines
* Enable to use the selected engine on the nodes.
*
* engineId String The unique engine identifier
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns inline_response_200_4
* */
const engineEnable = ({ engineId, apikey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        engineId,
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
* Pin engine to prevent auto-updates
* Pin engines to prevent applying automatic updates on them. Manual updates still can be applied.
*
* engineId String The unique engine identifier
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* type String Pin engine or database to prevent applying automatic updates on it. (If the type is not defined both engine and database will be pinned.) (optional)
* returns inline_response_200_2
* */
const enginePin = ({ engineId, apikey, type }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        engineId,
        apikey,
        type,
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
* Unpin engine to prevent auto-updates
* Unpin engines so automatic updates will be applied on them.
*
* engineId String The unique engine identifier
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* type String Unpin engine or database to applying automatic updates on it. (If it is not defined both engine and database will be unpinned.) (optional)
* returns inline_response_200_3
* */
const engineUnpin = ({ engineId, apikey, type }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        engineId,
        apikey,
        type,
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
  engineDisable,
  engineEnable,
  enginePin,
  engineUnpin,
};
