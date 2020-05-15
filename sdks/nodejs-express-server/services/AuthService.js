/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Change Password
* Modify the current password for the user identified by apikey
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* inlineObject2 InlineObject2  (optional)
* no response value expected for this operation
* */
const userChangePass = ({ apikey, inlineObject2 }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        inlineObject2,
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
* Login
* Initiate a new session. Required for using protected REST APIs.
*
* inlineObject InlineObject  (optional)
* returns UserLogin
* */
const userLogin = ({ inlineObject }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        inlineObject,
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
* Logout
* Destroy session for not using protected REST APIs.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* no response value expected for this operation
* */
const userLogout = ({ apikey }) => new Promise(
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
  userChangePass,
  userLogin,
  userLogout,
};
