[![Build Status](https://travis-ci.org/YuKitAs/daily-learning-record.svg?branch=master)](https://travis-ci.org/YuKitAs/daily-learning-record)

# daily learning record

A single-page application (SPA) with REST API backend. It's used to record daily completion status of user-defined tasks.

Tested in Chrome 65 and Firefox 56 only.

## Usage

0. Stop Apache Tomcat if it's running (see [note](https://github.com/YuKitAs/tech-note/blob/master/service-config/run-and-test-tomcat-on-ubuntu.md))
1. Start MongoDB (see [note](https://github.com/YuKitAs/tech-note/blob/master/database/mongodb/run-mongodb-on-ubuntu.md))
2. In `path/to/daily-learning-record/dlr`, run `gradle build` (`gradle clean` before if necessary)
3. Run `java -jar build/libs/daily-learning-record-0.1.0.jar`
4. In `path/to/daily-learning-record/dlr-ui`, run `bower install` to install all the web components
5. Run `polymer serve --open` to open the app in default browser or open `http://localhost:8081/components/dlr-ui/dlr-ui-app/` in an arbitrary browser

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
