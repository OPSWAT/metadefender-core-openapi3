/**
 * The BatchController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/BatchService');
const batchCancel = async (request, response) => {
  await Controller.handleRequest(request, response, service.batchCancel);
};

const batchClose = async (request, response) => {
  await Controller.handleRequest(request, response, service.batchClose);
};

const batchCreate = async (request, response) => {
  await Controller.handleRequest(request, response, service.batchCreate);
};

const batchSignedResult = async (request, response) => {
  await Controller.handleRequest(request, response, service.batchSignedResult);
};

const batchStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.batchStatus);
};


module.exports = {
  batchCancel,
  batchClose,
  batchCreate,
  batchSignedResult,
  batchStatus,
};
