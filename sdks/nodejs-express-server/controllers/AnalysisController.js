/**
 * The AnalysisController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/AnalysisService');
const analysisRules = async (request, response) => {
  await Controller.handleRequest(request, response, service.analysisRules);
};

const fileAnalysisCancel = async (request, response) => {
  await Controller.handleRequest(request, response, service.fileAnalysisCancel);
};

const fileAnalysisGet = async (request, response) => {
  await Controller.handleRequest(request, response, service.fileAnalysisGet);
};

const fileAnalysisPost = async (request, response) => {
  await Controller.handleRequest(request, response, service.fileAnalysisPost);
};

const sanitizedFile = async (request, response) => {
  await Controller.handleRequest(request, response, service.sanitizedFile);
};

const webhookStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.webhookStatus);
};


module.exports = {
  analysisRules,
  fileAnalysisCancel,
  fileAnalysisGet,
  fileAnalysisPost,
  sanitizedFile,
  webhookStatus,
};
