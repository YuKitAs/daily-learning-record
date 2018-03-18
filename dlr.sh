gradle -p dlr/ clean build
java -jar dlr/build/libs/daily-learning-record-0.1.0.jar &
cd dlr-ui/ && bower install && polymer serve --open
