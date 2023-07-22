# StudentPortal_MappingPractice


The student portal is a Java application built using Maven and the SpringBoot framework.

## Table of Contents

- [Frameworks and Language Used](#frameworks-and-language-used)
- [Dataflow](#dataflow)
- [Data Structure](#data-structure)
- [Project Summary](#project-summary)

## Frameworks and Language Used

- Java: The primary programming language used for developing the application.
- Maven: A build automation tool and dependency management tool used for managing the project's dependencies and building the application.
- SpringBoot: A powerful and widely used framework for building Java-based enterprise applications. It provides features like inversion of control, dependency injection, and seamless integration with various other libraries.

## Dataflow


* Entities : I have 5 enties namely Student , Address , Laptop , Course and Book. All mapped to each other according to relations.
 
* Controller : I have to five controllers for each entity to make endpoint according to entities basically crud operations.

* Service : Similary for service I have to five service classes for all controller of enties and here I have all my logic and also called crud repo method of jpa for crud operations by the object of it in service class.

* Repository : Basically repository is an interface which is extending CrudRepository of JPA. It is used to to do crud operations on DB. I have a for repo for each entity so total repos are 5.

* DataBase Design : I have used MYSQL as my data base. I have used my sql connector and in applications.properties I have all details about database authentication and which database I am using.

## Data Structure

I have used MYSQL as an database to store my data in persistant way.

## Project Summary

Basically this is student portal where all things like student it's address and which types of laptop he has and also in which course he is and which booked he issued basially it is like library portal to track students details. I have exposed APIs for crud operations for each thing.
