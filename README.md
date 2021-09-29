# spring-rest-api-documenting-with-openapi-3-df (Design First)

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

## Documentation generation tools
* **SpringDoc**  
SpringDoc — a tool that simplifies the generation and maintenance of API docs based on the OpenAPI 3 specification for Spring Boot 1.x and 2.x applications.  

* **SpringFox**  
SpringFox is a useful tool, which can automatically generate Swagger documentation based on your Spring controller and model classes. It can also recognize JSR-303 annotations, so you'll have also documented all the constraints on your model classes. It can also utilize core swagger classes such as @ApiModelProperty.  

## This demo: spring-rest-api-documenting-with-openapi-3: _Design First_  
![spring-rest-api-documenting-with-openapi-3-df-1.png](spring-rest-api-documenting-with-openapi-3-df-1.png?id=1)







