'use strict'
require('shelljs/global');
const fs = require('fs');
const utils = require('./utils.js')
const OpenAPISnippet = require('openapi-snippet')


var saveCodeSnippets = function(result, samplesFolder) {
  // replace each "/"" with "@"" and also ignore the first "/"
  var path = result.url.replace(/http.*:8008/,'').replace(/\//g,'@').substring(1);
  
  result.snippets.forEach( function(snippet) {    
    const lang = snippet.id;    
    const ext = utils.langExtension(lang)
    const langAlias = utils.langAlias(lang)
    var langDir = samplesFolder + langAlias + '/' + path + '/';
    
    // create a folder for each endpoint
    mkdir('-p', langDir);

    var absolutePath = langDir + result.method.toLowerCase() + "." + ext
  
    fs.writeFile(absolutePath,snippet.content, (err) => {
      // console.log("Snippet " + absolutePath + " saved");
      if (err)  {
        console.log("Can't write file: " + absolutePath);
        console.log(err);        
      }
    });

  });

}


var main = function() {

  var openApiSpec = process.argv[2];
  var samplesFolder = process.argv[3];
  var configPath = process.argv[4];

  var openApiSpec = utils.loadYAML(openApiSpec);
  var config = utils.loadYAML(configPath);
  
  var results = OpenAPISnippet.getSnippets(openApiSpec, config.snippets.langs);
  
  results.forEach(function (result){
    saveCodeSnippets(result, samplesFolder + "/");
  }); 
}

main();
