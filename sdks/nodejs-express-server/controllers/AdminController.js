/**
 * The AdminController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AdminService');
const adminImport = async (request, response) => {
  await Controller.handleRequest(request, response, service.adminImport);
};

const roleCreate = async (request, response) => {
  await Controller.handleRequest(request, response, service.roleCreate);
};

const userCreate = async (request, response) => {
  await Controller.handleRequest(request, response, service.userCreate);
};


module.exports = {
  adminImport,
  roleCreate,
  userCreate,
};
