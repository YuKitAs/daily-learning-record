[![Build Status](https://travis-ci.org/YuKitAs/daily-learning-record.svg?branch=master)](https://travis-ci.org/YuKitAs/daily-learning-record)

# daily learning record

A simple Polymer 2.0 web application to record daily completion status of user-defined tasks. Tested in Chrome 63 and Firefox 56 only.

The main purpose of building this web app is to get a basic understanding of full-stack web development - single-page web app with REST API backend.

## Usage

0. Stop Apache Tomcat if it's running (see [note](https://github.com/YuKitAs/tech-note/blob/master/service-config/run-and-test-tomcat-on-ubuntu.md))
1. Start MongoDB (see [note](https://github.com/YuKitAs/tech-note/blob/master/database/mongodb/run-mongodb-on-ubuntu.md))
2. In `path/to/daily-learning-record/dlr`, run `gradle build` (`gradle clean` before if necessary)
3. Run `java -jar build/libs/daily-learning-record-0.1.0.jar`
4. In `path/to/daily-learning-record/dlr-ui`, run `bower install` to install all the web components
5. Run `polymer serve --open` to open the app in browser

## Screenshots

![](../master/screenshots/Screenshot-daily-learning-record.png)


![](../master/screenshots/Screenshot-daily-learning-record-editing.png)

## Main techniques involved

* Frontend
  * HTML/CSS
  * JavaScript
  * Polymer
  * Bower
  
* Backend
  * Java
  * Gradle
  * MongoDB
  * RESTful services with Spring Boot
