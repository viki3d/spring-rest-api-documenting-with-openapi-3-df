# spring-rest-api-generating-with-openapi-3 (Design First Approach)
![Design First Approach](https://github.com/viki3d/spring-rest-api-documenting-with-openapi-3)

## OpenApi 3 + SwaggerUI

[OpenAPI Specification](https://swagger.io/specification/)  

The OpenAPI Specification (OAS) defines a standard, language-agnostic interface to RESTful APIs which allows both humans and computers to discover and understand the capabilities of the service without access to source code, documentation, or through network traffic inspection. When properly defined, a consumer can understand and interact with the remote service with a minimal amount of implementation logic.  

An OpenAPI definition can then be used by documentation generation tools to <u>display the API</u>, <u>code generation</u> tools to generate servers and clients in various programming languages, <u>testing</u> tools, and many other use cases.  

## OpenApi 3 Tools
* **Swagger UI**  
Generates UI(html) from _YAML(JSON)_ or _code_.  
![openapi-swagger-ui.png](openapi-swagger-ui.png?id=1)

* **Swagger Codegen**  
Generates _server_ and _client stubs_ from OpenAPI Specification definitions.  
![openapi-swagger-codegen.png](openapi-swagger-codegen.png?id=1)

* **Swagger Editor**  
API editor for designing APIs with the OpenAPI Specification.  
![openapi-swagger-editor.png](openapi-swagger-editor.png?id=1)

* **Swagger Inspector**  
Test and generate API definitions from your browser in seconds. Apps like SwaggerHub can emulate server for you, so you can test the API even without having implementation.  
![openapi-swagger-inspector.png](openapi-swagger-inspector.png?id=1)

## Documentation generation tools - Swagger UI
* **SpringDoc**  
SpringDoc — a tool that simplifies the generation and maintenance of API docs based on the OpenAPI 3 specification for Spring Boot 1.x and 2.x applications.  

* **SpringFox**  
SpringFox is a useful tool, which can automatically generate Swagger documentation based on your Spring controller and model classes. It can also recognize JSR-303 annotations, so you'll have also documented all the constraints on your model classes. It can also utilize core swagger classes such as @ApiModelProperty.  

## Code Generation based on YAML(JSON) - Swagger Codegen
[Swagger Codegen Generators](https://github.com/swagger-api/swagger-codegen-generators)  
[Swagger Codegen - Main Page](https://github.com/swagger-api/swagger-codegen)  
[Swagger Codegen - Maven Plugin](https://github.com/swagger-api/swagger-codegen/tree/master/modules/swagger-codegen-maven-plugin)  
[Swagger Codegen - Server Stub Howto](https://github.com/swagger-api/swagger-codegen/wiki/Server-stub-generator-HOWTO#java-springboot)  

## This demo: spring-rest-api-documenting-with-openapi-3: _Design First_  
![spring-rest-api-generating-with-openapi-3-1.png](spring-rest-api-generating-with-openapi-3-1.png?id=2)


## OpenAPI Swagger-Codegen (swagger-codegen-maven-plugin)

![MavenRepo](https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/)  

### generate-with-jar
1. Get JAR
> wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.27/swagger-codegen-cli-3.0.27.jar

[Find all versions here](https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/)  

2. Help commands

>	\# List all generate options:  
>	java -jar swagger-codegen-cli-3.0.27.jar generate -h  

>	\# List all generate possible languages:  
>	java -jar swagger-codegen-cli-3.0.27.jar generate -l help  

>	\# List all generate additional-options:  
>	java -jar swagger-codegen-cli.jar config-help -l spring  

3. Usage examples

> \# Set model package  
> java -jar swagger-codegen-cli-3.0.27.jar generate -i viki3d-cars-api-v1.yaml -o generated-sources --model-package com.viki3d.spring.rest.api.generating.api.model  

> \# Use external config file
> java -jar swagger-codegen-cli-3.0.27.jar generate -i viki3d-cars-api-v1.yaml -o generated-sources -c config.json


## OpenAPI Generator (openapi-generator-maven-plugin)

[MavenRepo](https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/)  
[Home](https://openapi-generator.tech/)

OpenAPI Generator is a fork of <b>swagger-codegen</b> between versions 2.3.1 and 2.4.0. For this reason, much of the foundational concepts and offerings underlying OpenAPI Generator should feel quite familiar. The fork occurred for several reasons, as detailed in the OpenAPI Generator documentation. They mostly come down to simplicity in function, reduction in concurrent branch developments, and greater community ownership. This community involvement is significant and is a significant part of the OpenAPI Generator ethos.  

Swagger Codegen is driven by SmartBear while OpenAPI Generator is driven by the community.

