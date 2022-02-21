powershell wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.27/swagger-codegen-cli-3.0.27.jar
java -jar swagger-codegen-cli-3.0.27.jar generate -i ../viki3d-cars-api-v1.yaml -o generated-sources -c config.json
pause
