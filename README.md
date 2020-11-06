## Build docker images

- docker build -t jsf-java-images .

## Run docker images

- docker exec -it [container-jsf-id] /bin/sh

## Run jsf web

- /bin/sh run_server.sh SampleWebApp

## Generate project

- mvn archetype:generate -DgroupId=com.sample.webproject -DartifactId=SampleWebApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

