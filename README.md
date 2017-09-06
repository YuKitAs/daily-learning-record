# daily learning record

A Polymer 2.0 web application to record the daily completion status of user-defined tasks.

Tested in Chrome 57 and Firefox 54 only.

## Usage:

0. Stop Apache Tomcat if it's running
1. Start MongoDB
2. Run `java -jar path/to/daily-learning-record/dlr/build/libs/gs-rest-service-0.1.0.jar` (`gradle build` before if necessary)
3. Run `polymer serve --open` in `path/to/daily-learning-record/dlr-ui` (`bower install` before if necessary) to open the app in browser

## Screenshots

![](../master/screenshots/Screenshot-daily-learning-record.png)


![](../master/screenshots/Screenshot-daily-learning-record-editing.png)


The purpose is to learn about full-stack web app development.

## Main technologies involved

* Front-End
  * HTML/CSS
  * JavaScript with Polymer 2.0
  
* Back-End
  * Gradle
  * MongoDB
  * Java with Spring Boot
