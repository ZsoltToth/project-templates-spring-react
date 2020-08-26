#!/usr/bin/env bash
MYSQL_ROOT_PASS=password

docker run \
    --name mysql \
     -e MYSQL_ROOT_PASSWORD=$MYSQL_ROOT_PASS \
     --rm -d \
     -p 3306:3306 \
     mysql:8
