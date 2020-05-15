/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Import configuration
* Import configuration from file.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* body File  (optional)
* returns inline_response_200_6
* */
const adminImport = ({ apikey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
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
* Create new role
* Add a new user role to the system.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* newUserRoleRequest NewUserRoleRequest  (optional)
* returns NewUserRoleResponse
* */
const roleCreate = ({ apikey, newUserRoleRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        newUserRoleRequest,
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
* Create user
* 
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* userRequest UserRequest  (optional)
* returns UserResponse
* */
const userCreate = ({ apikey, userRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        apikey,
        userRequest,
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
  adminImport,
  roleCreate,
  userCreate,
};
