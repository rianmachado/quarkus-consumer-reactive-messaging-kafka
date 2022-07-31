#!/bin/bash

#####################################################################
echo 'INICIO .... Consumindo mensagens.'				    		#	   
								   	 								#
#####################################################################

docker run  -p 8080:8080 rianmachado/quarkus-consumer-reactive-messaging-kafka:v1



