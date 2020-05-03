
const fs = require('fs');
const path = require('path');
const yaml = require('js-yaml');

var langDict = { 
    "c_libcurl": {"ext": "c", "alias": "C"},
    "csharp_restsharp": {"ext": "cs", "alias": "C#"},
    "go_native": {"ext": "go", "alias": "Go"},
    "java_okhttp": {"ext": "java", "alias": "Java"},
    "java_unirest": {"ext": "java", "alias": "Java"},
    "javascript_jquery": {"ext": "js", "alias": "Javascript"},
    "javascript_xhr": {"ext": "js", "alias": "Javascript"},
    "node_native": {"ext": "js", "alias": "Node"},
    "node_request": {"ext": "js", "alias": "Node Request"},
    "node_unirest": {"ext": "js", "alias": "Node Unirest"},
    "objc_nsurlsession": {"ext": "m", "alias": "Objective-C"},
    "ocaml_cohttp": {"ext": "ml", "alias": "OCaml"},
    "php_curl": {"ext": "php", "alias": "PHP"},
    "php_http1": {"ext": "php", "alias": "PHP"},
    "php_http2": {"ext": "php", "alias": "PHP"},
    "powershell_webrequest": {"ext": "ps1", "alias": "Powershell"},
    "python_python3": {"ext": "py", "alias": "Python"},
    "python_requests": {"ext": "py", "alias": "Python"},
    "ruby_native": {"ext": "py", "alias": "Python"},
    "shell_curl": {"ext": "sh", "alias": "Shell-Curl"},
    "shell_httpie": {"ext": "sh", "alias": "Shell-HTTP"},
    "shell_wget": {"ext": "sh", "alias": "Shell-wget"},
    "swift_nsurlsession": {"ext": "swift", "alias": "Swift"},
  }


const langExtMap = { 
    "C": "c",
    "C#": "cs", 
    "Go": "go",
    "Java": "java",
    "Javascript": "js",
    "Node": "js",
    "Node Request": "js",
    "Node Unirest": "js",
    "Objective-C": "m",
    "OCaml": "ml",
    "PHP": "php",
    "Powershell": "ps1",
    "Python": "py",
    "Shell-Curl": "sh",
    "Shell-HTTP": "sh",
    "Shell-wget": "sh",
    "Swift": "swift"
  }


exports.loadYAML = function(path) {
    try {
      let fileContents = fs.readFileSync(path, 'utf8');
      let data = yaml.safeLoad(fileContents);
              
      return data
  
    } catch (e) {
      console.log(e);
    //   process.exit(1);
    }
}  

exports.absolutePath = function(relativePath) {
    return path.join(__dirname, relativePath);
}

exports.langExtension = function(lang) {
    return lang in langDict ? langDict[lang]['ext'] : 'txt'
}

exports.langAlias = function(lang){
    return lang in langDict ? langDict[lang]['alias'] : 'Undefined';
}

exports.langToExtension = function(lang){
    return langExtMap[lang];
}