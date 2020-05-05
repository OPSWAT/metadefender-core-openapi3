# MetaDefender Core OpenAPI Definition
[![Build Status](https://travis-ci.com/georgeprichici/metadefender-core-openapi3.svg?branch=master)](https://travis-ci.com/georgeprichici/metadefender-core-openapi3)
## Working on your OpenAPI Definition

### Install

1. Install [Node JS](https://nodejs.org/).
2. Clone this repo and run `npm install` in the repo root.

### Usage

#### `npm start`
Will run the build scripts and generate the output based on the config file.
But first make sure you validate the configuration file (more in [Config file](#config) section).

## Config

The config file will dictate the build flow and output. All the logic is managed by feature switches within the config file, no code updates should be required (except new functionality to be added) 

### Default configuration

````yaml
source: '../openapi/openapi.yaml' ### provide the original file. 
output: '../out'                  ### output location               
snippets:
  generate: true                  ### feature toggle for: generating code samples. by default are generated in `out/code_samples`
  attachSnippets: true            ### feature toggle for: generating an openapi spec with attached code snippets. by default is generated in `out/openapi-with-snippets/metadefender-core-openapi3.docs.json`
  langs:                          ### list of the languages supported. enable/disable (uncomment/comment) which you want active or not. 
    - c_libcurl             # (default)
    - csharp_restsharp      #(default)
    #- go_native             #(default)
    - java_okhttp
    #- java_unirest          #(default)
    #- javascript_jquery
    #- javascript_xhr        #(default)
    - node_native           #(default)
    #- node_request
    #- node_unirest
    #- objc_nsurlsession     #(default)
    #- ocaml_cohttp          #(default)
    - powershell_webrequest
    - php_curl              #(default)
    #- php_http1
    #- php_http2
    - python_python3        #(default)
    #- python_requests
    #- vruby_native          #(default)
    - shell_curl            #(default)
    #- shell_httpie
    #- shell_wget
    #- swift_nsurlsession    #(default)
docs:
    generate: true              ### feature toggle for: generate the html documentation
    bundleSnippets: true        ### feature toggle for: add code snippets (samples) to the html docs. Requires for snippets.generate is enabled as well.
sdks:
  generate: false               ### feature toggle for: generate SDKs. default location would be `out/sdks`   
  updateInfo: false             ### feature toggle for: update the Info description block with the list of SDKs (links to Github location), Dependency on `github.sdks.update` and `github.pages.update`
  langs:                        ### list of the languages supported. enable/disable (uncomment/comment) which you want active or not. 
    - python
    - c
    - cpp-qt5-client
    - csharp
    - go 
    - java
    - javascript
    - jmeter
    - perl
    - php
    - powershell
    - ruby
    - scala-gatling      
pdf:                            ### Not supported for now. 
  generate: false
github:
  sdks:                         
    update: true                ### feature toggle for: push the SDKs to github `repo/gh-pages/out/sdks`. Travis will do that as part of the deploy process. dependency on `sdks.generate`
  pages:
    update: true                ### feature toggle for: push the html docs to github `repo/gh-pages/out/sdks`. Travis will do that as part of the deploy process. dependency on `docs.generate`
````

#### Generate Docs

You can generate html docs by enabling `config.yaml#docs.generate`. 
This functionality is using the amazing [Redocly's Redoc](https://github.com/Redocly/redoc). Love it, couldn't recommend it more! 

Redoc supports code-snippets, by using the `x-code-samples` tag. As long as the code samples are listed in the openapi docs, Redoc will render them. 
In order to do so, you need to: 
* Generate and attach code snippets to the openapi spec (see [Generate Code Samples](#generate-code-samples) section).
* enable `docs.bundleSnippets`(otherwise will generate from the openapi spec without the code snippets)

#### Generate Code Samples

Code samples (snippets) are generated on demand by using the `config.yaml#snippets` object. 
In order to generate an openapi spec with code snippets embedded: 
* enable code snippets generation (`config.yaml#snippets.generate`).
* select your desired languages (`config.yaml#snippets.langs`)
* enable attach snippets (`config.yaml#snippets.attachSnippets`)

#### Generate SDKs

SDKs are generated on demand by using the `config.yaml#sdks` object. 
In order to generate client (or server side) SDKs: 
* enable SDKs generation (`config.yaml#sdks.generate`).
* select your desired languages/platforms (`config.yaml#snippets.langs`)
> _**Optional**_: You can list all the supported sdks in the Info section by enabling `config.yaml#sdks.updateInfo`. Please note that this will require both `config.yaml#github` configurations to be enabled (see more in [Github updates](#generate-github-updates) section)



#### Generate Github updates

Github can display your documentation using Github Pages, if the documentation is available in the `gh-pages` branch. 
Travis CI is configured to automatically run the deploy script, which can publish to `gh-pages` the new build. 

In order to update the github pages, you should: 
* enable publishing to github pages (`config.yaml#github.pages.update`)
  * has dependency on creating the html docs `docs.generate`
* can publish also the sdks as part of the same branch (`config.yaml#github.sdks.update`)
  * has dependency on generating the sdks (`config.yaml#sdks.generate`)
  

## Contribution Guide

All changes should be done in [openapi folder](https://github.com/georgeprichici/metadefender-core-openapi3/tree/master/openapi), which contains the raw openapi spec. 
Please note that the format is openapi v3.0.0 and is using [Redocly's create-open-repo](https://github.com/Redocly/create-openapi-repo/) to ease the management of the API spec. 

> _**Note**_: You will have to build the project to generate the full valid openapi spec, otherwise will rely on the relative file path, not component based paths. 

### Schemas

#### Adding Schemas

1. Navigate to the `openapi/components/schemas` folder.
2. Add a file named as you wish to name the schema.
3. Define the schema.
4. Refer to the schema using the `$ref` (see example below).

```yaml
file_info:
    $ref: ./FileInformation.yaml
```

which will be built as: 

```yaml
file_info:
    $ref: '#components/schemas/FileInformation.yaml'
```


##### Using the `$ref`

Notice in the complex example above the schema definition itself has `$ref` links to other schemas defined.
The value of the `$ref` is the path to the other schema definition.

You may use `$ref`s to compose schema from other existing schema to avoid duplication.

You will use `$ref`s to reference schema from your path definitions.

#### Editing Schemas

1. Navigate to the `openapi/components/schemas` folder.
2. Open the file you wish to edit.
3. Edit.

### Paths

#### Adding a Path

1. Navigate to the `openapi/paths` folder.
2. Add a new YAML file named like your URL endpoint except replacing `/` with `@` and putting path parameters into curly braces like `{example}`.
3. Add the path and a ref to it inside of your `openapi.yaml` file inside of the `openapi` folder.

Example addition to the `openapi.yaml` file:
```yaml
'/customers/{id}':
  $ref: './paths/customers@{id}.yaml'
```

### Code samples

> _**Note**_: Don't generate your own code samples! 

Make sure you set your configuration in `config/config.yaml` to: 
* generate code snippets 
  * if you select to bundle snippets, those will be attached to the final response (in `out/openapi-with-snippets/metadefender-core-openapi3.docs.json`)
* generate SDKs
  * you can also update the Info block, to list all the SDKs generated in a table


