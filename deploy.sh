#!/bin/sh
ssh -i ~/clinic-rsa-key.pem ubuntu@54.160.70.246 "sudo docker-compose -f ~/jsf-webapp/docker-compose.prod.yml down"
ssh -i ~/clinic-rsa-key.pem ubuntu@54.160.70.246 "sudo mv jsf-webapp jsf_app_temp; mkdir jsf-webapp"
scp -i ~/clinic-rsa-key.pem ~/jsf-webapp/* ubuntu@54.160.70.246:/home/ubuntu/jsf-webapp
scp -r -i ~/clinic-rsa-key.pem ~/jsf-webapp/SampleWebApp ubuntu@54.160.70.246:/home/ubuntu/jsf-webapp
ssh -i ~/clinic-rsa-key.pem ubuntu@54.160.70.246 "sudo rm -rf jsf_app_temp"
ssh -i ~/clinic-rsa-key.pem ubuntu@54.160.70.246 "sudo docker-compose -f ~/jsf-webapp/docker-compose.prod.yml up --build -d"
