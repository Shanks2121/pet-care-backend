# Universal Pet Care - Server

This is the backend server for the Universal Pet Care web application. It is built using Spring Boot and provides APIs for pet management, authentication, scheduling, and more.

## Table of Contents

- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)


## Features

- **RESTful API**: Provides endpoints for managing pets, users, and veterinarians.
- **Security**: Implements JWT-based authentication and authorization using Spring Security.
- **Data Persistence**: Uses Spring Data JPA with a MySQL database for data storage.
- **Validation**: Ensures data integrity with validation annotations.
- **Email Notifications**: Supports email notifications via Spring Boot Starter Mail.
- **Object Mapping**: Uses ModelMapper for entity to DTO conversions.

## Requirements

- **Java**: Version 17 or higher
- **Maven**: Version 3.6.0 or higher
- **MySQL**: A running MySQL instance for the database

## Installation

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/Shanks2121/universal-pet-care.git
    cd universal-pet-care/server
    ```

2. **Set Up MySQL Database**:
    - Create a new database for the application.
    - Update the `application.properties` file with your MySQL credentials and database name.

3. **Install Maven Dependencies**:
    ```bash
    mvn clean install
    ```

## Configuration

Update the `src/main/resources/application.properties` file with your specific configurations:

```properties
# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password

# JPA Hibernate Settings
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.ddl-auto=update

# Logging Configuration
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE

# Frontend Configuration
frontend.base.url=http://localhost:5174
```
## Running The Application
mvn spring-boot:run
