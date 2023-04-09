# Product management system (Back-end)

# Main Tech/Tools in back-end
* Springboot Framework
* Mybatis-plus
* MySql
* Postman

## Getting Started
These instructions will help you get a copy of the project up and running on your local machine for development and testing purposes.

## Properties （Important !）
Please do some config in file: **"/src/main/resources/application.properties"**, then do the following setting:
* Default port is 8090 (You can change, if needed)
* Please config your local mysql information on **"spring.datasource.url / username / password"**
  (In next release, I will package this project in docker. Please config your local mysql for now, thank you!)



## Prerequisites

What things you need to install and how to install them.

* JDK 1.8+
* Maven 3+
* MySql 5+
* IDEA (Recommend), Eclipse

## Preparation

1. Clone the repository
2. Build the project using Maven

```bash```
cd PsmBackend

```bash``` 

mvn clean install

**Make sure there is no error(no red label) in "/pom.xml", 
sometimes some dependencies can not download successfully, restart the IDE may work.**

Sometimes you need to set Maven in IDE: Maven home path, setting file, local repository. 

If you are the first time to use maven, it may take several minutes to download all the dependencies.



# MySql

https://dev.mysql.com/downloads/mysql/

Config Type: Development Computer

Default Port: 3306  (If you change the port, please match it in the property file)

Default Username: root

Use the port, username, and password in the property file. 



## Run the project


## API test case by Postman
/ProductManagementSystem-API.postman_collection.json
This contains all the API of this back-end project.
You can import it in postman to make the back-end API test. 



### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.11-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.11-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.11-SNAPSHOT/reference/htmlsingle/#web)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

