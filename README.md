[![Build Status](https://travis-ci.org/YuKitAs/daily-learning-record.svg?branch=master)](https://travis-ci.org/YuKitAs/daily-learning-record)

# Daily Learning Record

A single-page application (SPA) with REST API backend. It's used to record daily completion status of user-defined tasks.

Tested in Chrome 65 and Firefox 56 only.

## Usage

0. Stop Apache Tomcat if it's running (see [note](https://github.com/YuKitAs/tech-note/blob/master/service-config/run-and-test-tomcat-on-ubuntu.md)) and make sure the port 8081 is not in use
1. Start MongoDB (see [note](https://github.com/YuKitAs/tech-note/blob/master/database/mongodb/run-mongodb-on-ubuntu.md))
2. Open `path/to/daily-learning-record`
3. Run `./dlr.sh`

## Screenshots

View mode:

![](../master/screenshots/dlr-ui.png)

Edit mode:

![](../master/screenshots/dlr-ui-editing.png)

Task details:

![](../master/screenshots/dlr-ui-info.png)

## Main techniques involved

* Frontend
  * HTML5/CSS
  * JavaScript
  * Polymer 2.0
  * Bower

* Backend
  * Java
  * Gradle
  * MongoDB
  * RESTful services with Spring Boot
