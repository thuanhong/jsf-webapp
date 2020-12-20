build:
	docker-compose -f docker-compose.yaml -p jsf --build
up:
	docker-compose -f docker-compose.yaml -p jsf up -d
reset:
	docker-compose -f docker-compose.yaml -p jsf down
	docker-compose -f docker-compose.yaml -p jsf up -d
run:
	docker exec -it jsf_web_1 /bin/sh
initdb:
	mysql -h 127.0.0.1 -P 3307 -u user javawebtutor -ppassword < ./init.sql

