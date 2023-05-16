# Getting Started

Start by cloning or using the repository as a template.

```shell
git clone git@github.com:LIDPConsulting/FullStackChallenge.git
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.2/gradle-plugin/reference/html/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#web)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.7.2/reference/htmlsingle/#data.sql)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
* [Material Design Specification](https://material.io/design)
* [Material Icon Finder](https://fonts.google.com/icons?selected=Material+Icons)
* [Material Technical Documentation](https://material.angular.io/components/categories)

## Requirements

This application uses Java 17. Note that you may have to configure Gradle's Java version explicitly, in addition to the global project's Java version.

## Repository Organization

At the top of the repository, you will find gradle configuration files and some files that are generated and required by Angular.

### /server

This directory holds the backend of the application. It includes web services and Spring Boot application setup files.

In the `/resources` directory you will find SQL files that are used to create and update the H2 database. The `/application.yml` file there configures the backend. Static resources are also stored here.

### /ui

This directory holds the frontend of the application. There are many files generated and required by Angular at the top of the directory.

In the `/app` directory you will find the static content of the frontend, typescript files to control it, and a way to call the endpoints that are hosted on the backend. Module organization also occurs here.

The `/assets` directory contains some static assets used by the application.

### /data

This is the default location that the H2 Database will store its persistent data and any stacktrace information.

## Starting the Application

To start the application, run or debug the `main` method in `ChallengeApplication.java`.

To host the frontend, run `ngServe` in `/ui/build.gradle` to serve the Angular content on the default port, 9090. The first time you run it may take extra time, as it will automatically run `npmInstall` for first-time setup.

The H2 embedded database does not have any content initially. After starting the application, you will need to go to `http://localhost:9690/h2-management-console/` and run `schema.sql` and `data.sql` from the `/server/src/main/resources` directory. After running these, you will be able to browse the data populated on the frontend. The H2 database is configured in `server/src/main/resources/application.yml`.

Once everything is up and running, you can access the application on `http://localhost:9090/`.

## Questions?

If you encounter any difficulties with project setup, please email matthew.segreti@lidp.com for support! 
