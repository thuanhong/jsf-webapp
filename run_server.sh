#!/bin/bash
$CATALINA_HOME/bin/shutdown.sh

rm -rf $CATALINA_HOME/webapps/SampleWebApp

cd /app/$1

mvn clean package

rm $CATALINA_HOME/webapps/$1.war

cp /app/$1/target/$1.war $CATALINA_HOME/webapps

$CATALINA_HOME/bin/startup.sh
