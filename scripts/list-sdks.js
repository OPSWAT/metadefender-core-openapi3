'use strict'
const fs = require('fs');
const utils = require('./utils.js')


var main = function() {
    var openapiSpec = process.argv[2];
    var configFilePath = process.argv[3];

    var config = utils.loadYAML(configFilePath);
    var spec = JSON.parse(fs.readFileSync(openapiSpec));

    var description = spec["info"]["description"];

    var startIndex = description.indexOf("## How to Interact with MetaDefender Core");

    var sdksListText = "## List of Available SDKS \n> _**Note**:_ These SDKs have been generated using openapi-generator. Use them **AS IS**, there are no warranties for generated code.\n\n  | Programming Language         | Github              |\n  |---------------|------------------------------|\n";

    var langs = config.sdks.langs;


    for (var lang of langs) {
        sdksListText += "  | " + lang + " | [Github > sdks/" + lang + "](https://github.com/georgeprichici/metadefender-core-openapi3/tree/gh-pages/sdks/"+ lang + ") |\n";
    }
    sdksListText += "\n\n----\n\n"

    spec["info"]["description"] = description.substring(0, startIndex) + sdksListText + description.substring(startIndex);

    fs.writeFile(openapiSpec, JSON.stringify(spec), (err) => {        
        if (err)  {
          console.log("Can't write file: " + openapiSpec);
          console.log(err);        
        }
      });
}

main();