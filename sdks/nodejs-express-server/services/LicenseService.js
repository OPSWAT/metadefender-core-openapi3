/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Activate license
* This API initiates an online activation of the deployment.  In case of error, check the application logs for more details.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* uNKNOWNUnderscoreBASEUnderscoreTYPE UNKNOWN_BASE_TYPE  (optional)
* no response value expected for this operation
* */
const licenseActivation = ({ apikey, uNKNOWNUnderscoreBASEUnderscoreTYPE }) => new Promise(
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
* Get Current License Information
* Fetch all details about the licensing status of the product.
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* returns LicenseInformation
* */
const licenseGet = ({ apikey }) => new Promise(
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
* Upload license key
* Uploading a license file to the Metadefender Core.  There are two ways two obtain a license key file:  - via https://portal.opswat.com/activation portal  - via activation server REST API: https://activation.dl.opswat.com/activation?key=%activation_key%&deployment=%deployment_unique_ID%&quantity=%quantity%  Deployment unique ID can be fetched via Get Current License Information API.      
*
* apikey String Generated `session_id` from [Login](#operation/userLogin) call can be used as an `apikey` for API calls that require authentication.                 (optional)
* body String  (optional)
* no response value expected for this operation
* */
const licenseUpload = ({ apikey, body }) => new Promise(
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

module.exports = {
  licenseActivation,
  licenseGet,
  licenseUpload,
};
