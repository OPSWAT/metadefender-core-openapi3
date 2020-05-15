/**
 * The YaraController file is a very simple one, which does not need to be changed manually,
 * unless there's a case where business logic reoutes the request to an entity which is not
 * the service.
 * The heavy lifting of the Controller item is done in Request.js - that is where request
 * parameters are extracted and sent to the service, and where response is handled.
 */

const Controller = require('./Controller');
const service = require('../services/YaraService');
const yaraPackageGenerate = async (request, response) => {
  await Controller.handleRequest(request, response, service.yaraPackageGenerate);
};

const yaraPackageStatus = async (request, response) => {
  await Controller.handleRequest(request, response, service.yaraPackageStatus);
};

const yaraSourcesGet = async (request, response) => {
  await Controller.handleRequest(request, response, service.yaraSourcesGet);
};

const yaraSourcesPut = async (request, response) => {
  await Controller.handleRequest(request, response, service.yaraSourcesPut);
};


module.exports = {
  yaraPackageGenerate,
  yaraPackageStatus,
  yaraSourcesGet,
  yaraSourcesPut,
};
