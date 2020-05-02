require('shelljs/global');



var main=function() {
    mkdir('../.tmp');
    cp('out/html/index.html', '../.tmp/index.html');
    
    cd('../.tmp');
    exec('git init');
    exec('git config user.name "Travis-CI"');
    exec('git config user.email "travis@travis"');
    exec('git add .');
    exec('git commit -m "Deployed to Github Pages"');
    var repoUrl = "https://" + process.env.GITHUB_TOKEN + '@github.com/georgeprichici/metadefender-core-openapi3.git'
    exec('git push --force "'+ repoUrl + '" master:gh-pages');
}

main();