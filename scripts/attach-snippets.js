'use strict'
const fs = require('fs');
const yaml = require('js-yaml');
const utils = require('./utils.js')


var main = function (openApiPathsSpecsFolder, destinationFolder, snippetsFolder) {
        
    var openApiPathsSpecsFolder = process.argv[2];
    var destinationFolder = process.argv[3];
    var snippetsFolder = process.argv[4];
    
    fs.readdir(snippetsFolder, function(err, langs) {

        if (err) {
            console.log("Unable to read " + snippetsFolder + " directory");
            process.exit(1);
        }

        fs.readdir(openApiPathsSpecsFolder, function(err, files) {    
            if (err) {
                console.log("Unable to read " + openApiPathsSpecsFolder + " directory");
                process.exit(1);
            }
                    
            files.forEach(file => {
                
                if (file == 'README.md') {
                    // nothing to generate for README.md
                    return
                }
        
                var absFilePath = openApiPathsSpecsFolder + "/" + file
                var pathSpec = utils.loadYAML(absFilePath);
                // console.log("Generate snippet for: " + absFilePath);
                const verbs = Object.keys(pathSpec);

                for (var i in verbs) {                    
                    var allSnippets = []

                    for (var j in langs) {
                        var lang = langs[j];
                        var verb = verbs[i];
                        var sampleFilePath = (snippetsFolder + "/" + lang + "/" + file).replace(".yaml", "");
                        
                        var snippetFile = sampleFilePath + "/" + verb + "." + utils.langToExtension(lang);
                        var snippet = fs.readFileSync(snippetFile, 'utf-8');
                        
                        allSnippets.push( {"lang": lang, "source": snippet } );
                        
                    }
                    
                    // remove existing code snippets (might be outdated, we'll always generate new ones)
                    if (pathSpec[verb]["x-code-samples"]) {
                        delete pathSpec[verb]["x-code-samples"]
                    }

                    pathSpec[verb]["x-code-samples"] = allSnippets
                }        

                fs.writeFileSync(destinationFolder + "/paths/" + file, yaml.safeDump(pathSpec) );
                
            });
        });
        
    });
}

main();