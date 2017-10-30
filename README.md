[![Build Status](https://travis-ci.org/YuKitAs/daily-learning-record.svg?branch=master)](https://travis-ci.org/YuKitAs/daily-learning-record)

# daily learning record

A simple Polymer 2.0 web application to record daily completion status of user-defined tasks.

The main purpose of this web-app is to learn the ropes of full-stack development. Tested in Chrome 61 and Firefox 56 only.

## Usage

0. Stop Apache Tomcat if it's running (see [note](https://github.com/YuKitAs/tech-note/blob/master/service-config/run-and-test-tomcat-on-ubuntu.md))
1. Start MongoDB (see [note](https://github.com/YuKitAs/tech-note/blob/master/database/mongodb/run-mongodb-on-ubuntu.md))
2. Run `java -jar path/to/daily-learning-record/dlr/build/libs/gs-rest-service-0.1.0.jar` (`gradle build` before if necessary)
3. Run `polymer serve --open` in `path/to/daily-learning-record/dlr-ui` (`bower install` before if necessary) to open the app in browser

## Screenshots

![](../master/screenshots/Screenshot-daily-learning-record.png)


![](../master/screenshots/Screenshot-daily-learning-record-editing.png)

## Main technologies involved

* Front-End
  * HTML/CSS
  * JavaScript with Polymer 2.0
  
* Back-End
  * Gradle
  * MongoDB
  * Java with Spring Boot
