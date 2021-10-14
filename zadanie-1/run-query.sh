#!/bin/bash

QUERY_FILE=$1
FILE_NAME=${QUERY_FILE%%\.js}
QUERY_NUMBER=${FILE_NAME##*-}

mongosh --quiet nbd "${QUERY_FILE}" > "./wynik-${QUERY_NUMBER}.json"
echo "Saved results of query to wynik-${QUERY_NUMBER}.json"