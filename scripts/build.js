'use strict'
require('shelljs/global');
const fs = require('fs');
const path = require('path');
const utils = require('./utils.js');

var configFilePath = 'config/config.yaml'
var config = {
    "source": "./openapi/openapi.yaml",
    "output": "./out",
    "redoc":{
        "generate": true,
        "withSnippets": true
    },
    "snippets": {
        "generate": false
    },
    "sdks": {
        "generate": false
    }
}

const outDir = path.join(__dirname, './out');



var init = function() {
    try {
      configFilePath = process.argv[2] || configFilePath
    } catch (e) {
      console.log("Using default config file path: " + configFilePath);
    }
  }
  

var cleanup = function(outDir) {
    
    console.log("Clean up for existing artifacts ");
    if (fs.existsSync(outDir)) {
        rm('-rf', outDir + "/*");
    } else {
        mkdir(outDir);
    }

    
    mkdir(outDir + "/openapi");
    mkdir(outDir + "/openapi/paths");    
    mkdir(outDir + "/code_samples");
    mkdir(outDir + "/html");
    mkdir(outDir + "/pdf");
    mkdir(outDir + "/sdks");
    
}

var __exec = function(execCmd, cmdName, logMsg) {
    if (logMsg) {
        logMsg = cmdName + " > " + execCmd
        console.log(logMsg);
    }
    
    const {code, stdout, stderr} = exec(execCmd);

    console.log(cmdName + ' exit code:', code);
    console.log(cmdName + ' output:', stdout);
    console.log(cmdName + ' stderr:', stderr);
}

var initialValidation = function(openAPISpecPath) {
    __exec('openapi validate', "Validate spec");    
}

var copyComponents = function(source, destFolder) {

    console.log("Copying all components");
    cp('-R', source + "/components", destFolder + "/openapi");
    console.log("Copying index spec");
    cp(source + "/openapi.yaml", destFolder + "/openapi");    
}


var bundleFullSpecFile = function(openAPISpecPath, destFolder, outputName) {        
    __exec('openapi bundle -o' + destFolder + "/" + outputName + " " + openAPISpecPath, "openapi bundle");    
}

var buildDocs = function(openAPISpecPath, destFolder) {    
    __exec('node ./node_modules/redoc-cli/index.js bundle -o ' + destFolder + '/index.html ' + openAPISpecPath, "redoc bundle");   
    cp(destFolder + '/index.html', './dist');
}

var generatePDF = function(openAPISpecPath, lang, destFolder) {
    console.log("PDF not available");    
}

var generateSDK = function(openAPISpecPath, destFolder, lang) {    
    __exec('openapi-generator generate -i' + openAPISpecPath + ' -g ' + lang + ' -o ' + destFolder + "/" + lang + " --generate-alias-as-model", "Generate SDK");    
}

var generateSDKs = function(openAPISpecPath, destFolder, langs) {
    for (var lang of langs) { 
        generateSDK(openAPISpecPath, destFolder, lang);
    }
}

var generateSnippets =function(openApiFullSpec, snippetsFolder, configFilePath) {
    __exec('node ./scripts/generate.js ' + openApiFullSpec + ' ' + snippetsFolder + ' ' + configFilePath, "Generate snippets");
}

var attachSnippets = function(openApiPathsSpecsFolder, destinationFolder, snippetsFolder){ 
    __exec('node ./scripts/attach-snippets.js ' + openApiPathsSpecsFolder + ' ' + destinationFolder + ' ' + snippetsFolder, "Attach snippets");
}

var addSDKstoOpenApiInfo = function(openApiPathsSpecsFolder, configFilePath){ 
    __exec('node ./scripts/list-sdks.js ' + openApiPathsSpecsFolder + ' ' + configFilePath, "List SDKs");
}

var main = function() {

    init();


    config = utils.loadYAML(configFilePath);


    var openApiSpecs = utils.absolutePath(config.source);
    var destinationFolder = utils.absolutePath(config.output);
    var openAPISpecFolder = openApiSpecs.substring(0, openApiSpecs.lastIndexOf("/"));

    cleanup(destinationFolder);
    copyComponents(openAPISpecFolder, destinationFolder);

    initialValidation(openApiSpecs);

    bundleFullSpecFile(openApiSpecs, destinationFolder + "/openapi-no-snippets", "metadefender-core-openapi3.docs.json");    
    var fullSpec = destinationFolder + "/openapi-no-snippets/metadefender-core-openapi3.docs.json";

    if (config.snippets.generate) {        
        
        generateSnippets(fullSpec, destinationFolder + "/code_samples", configFilePath);
        attachSnippets(openAPISpecFolder + "/paths", destinationFolder + "/openapi", destinationFolder + "/code_samples", config);
                
        bundleFullSpecFile(destinationFolder + "/openapi/openapi.yaml", destinationFolder + "/openapi-with-snippets", "metadefender-core-openapi3.docs.json");         
    }
    var fullSpec = destinationFolder + "/openapi-with-snippets/metadefender-core-openapi3.docs.json";

    if (config.sdks.generate) {
        generateSDKs(openApiSpecs, destinationFolder + "/sdks", config.sdks.langs);

        if (config.sdks.updateInfo) {
            addSDKstoOpenApiInfo(fullSpec, configFilePath);
        }
    }

    if (config.docs.generate) {        
        buildDocs(fullSpec, destinationFolder + "/html")        
    }

    if (config.pdf.generate) {
        generatePDF();
    }
}


main();