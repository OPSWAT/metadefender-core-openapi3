require('shelljs/global');
const fs = require('fs');



var main=function() {
    var configFilePath = process.argv[2];
    var config = utils.loadYAML(configFilePath);
    
    mkdir('../.tmp');
    cp('out/html/index.html', '../.tmp/index.html');
    
    if (config.github.sdks.update) {
        if (fs.existsSync('out/sdks')) {
            cp('-R', 'out/sdks', '../.tmp/sdks');
        }
    }
    
    if (config.github.pages.update) {
    
        cd('../.tmp');
        exec('git init');
        exec('git config user.name "Travis-CI"');
        exec('git config user.email "travis@travis"');
        exec('git add .');
        exec('git commit -m "Deployed to Github Pages"');
    
        var repoUrl = "https://" + process.env.GITHUB_TOKEN + '@github.com/georgeprichici/metadefender-core-openapi3.git'
        exec('git push --force "'+ repoUrl + '" master:gh-pages');
    }
}

main();