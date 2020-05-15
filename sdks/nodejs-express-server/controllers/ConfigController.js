/**
 * The ConfigController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/ConfigService');
const configAuditLog = async (request, response) => {
  await Controller.handleRequest(request, response, service.configAuditLog);
};

const configGetSkipHash = async (request, response) => {
  await Controller.handleRequest(request, response, service.configGetSkipHash);
};

const configQuarantine = async (request, response) => {
  await Controller.handleRequest(request, response, service.configQuarantine);
};

const configSanitizedRepo = async (request, response) => {
  await Controller.handleRequest(request, response, service.configSanitizedRepo);
};

const configScanHistory = async (request, response) => {
  await Controller.handleRequest(request, response, service.configScanHistory);
};

const configSession = async (request, response) => {
  await Controller.handleRequest(request, response, service.configSession);
};

const configUpdate = async (request, response) => {
  await Controller.handleRequest(request, response, service.configUpdate);
};

const configUpdateSkipHash = async (request, response) => {
  await Controller.handleRequest(request, response, service.configUpdateSkipHash);
};

const configUpdateWebhook = async (request, response) => {
  await Controller.handleRequest(request, response, service.configUpdateWebhook);
};

const configWebhook = async (request, response) => {
  await Controller.handleRequest(request, response, service.configWebhook);
};


module.exports = {
  configAuditLog,
  configGetSkipHash,
  configQuarantine,
  configSanitizedRepo,
  configScanHistory,
  configSession,
  configUpdate,
  configUpdateSkipHash,
  configUpdateWebhook,
  configWebhook,
};
