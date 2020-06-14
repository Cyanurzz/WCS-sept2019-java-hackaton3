# Hackathon n°3 third place at WildCodeSchool
This was a particular hackathon, the company keolis asked us to carry at a new app in 48h. The main task was to get their actual app more attractive and give a way to sign up people in public transportation and show this ecological aspect.

## Manual 
### Requirements

For building and running the application you need:

- [MySql](https://www.mysql.com/fr/)    
      - create database called `keolis`    
      - a user `keolis`  
      - password : `Keolis1234*`  
        ( you can also modify user in `WCS-sept2019-java-hackaton3/src/main/resources/application.properties`)
- [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html)
- [Maven 3](https://maven.apache.org)


### Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `Hackaton3Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
