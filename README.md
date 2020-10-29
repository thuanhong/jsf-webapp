## Build docker images

docker build -t jsf-java-images .

## Run docker images

docker run -it -p 8080:8080 -v ~/jsf-webapp:/app jsf-java-images:latest

## Run jsf web

/bin/sh run_server.sh JavaServerFaces