wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.2.1/openapi-generator-cli-5.2.1.jar
java -jar openapi-generator-cli-5.2.1.jar generate -i ../viki3d-cars-api-v1.yaml -o generated-sources -g spring

