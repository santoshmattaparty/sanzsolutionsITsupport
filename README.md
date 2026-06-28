<<<<<<< HEAD
# Sanzsolutions Tomcat 9 Website

Sample Java website for Sanzsolutions, built as a WAR file for Tomcat 9 and Docker deployment.

## Business Details

- Owner: Santosh
- Email: sanzsolutions@hotmail.com
- Contact Number: +974 51897989
- Services: IT support, computer support, network switches, and network accessories information

## Technology

- Java 11
- Spring Boot 2.7.18
- Maven
- Thymeleaf
- Spring Data JPA
- H2 SQL database for local development
- MySQL SQL database for Docker/production
- Tomcat 9 container

## Build

```powershell
mvn clean package
```

The WAR file is created at `target/sanzsolutions.war`.

## Run Locally Without Docker

```powershell
mvn spring-boot:run
```

Open `http://localhost:8080`.

H2 console: `http://localhost:8080/h2-console`

H2 JDBC URL: `jdbc:h2:mem:sanzsolutionsdb`, username `sa`, password empty.

## Deploy With Docker and MySQL

```powershell
mvn clean package
docker compose up --build
```

Open `http://localhost:8080`.

## Deploy WAR To Existing Tomcat 9

Copy `target/sanzsolutions.war` to the Tomcat 9 `webapps` folder. Rename it to `ROOT.war` if you want the website at the server root.
=======
# sanzsolutionsITsupport
IT support Sanzsolution site
>>>>>>> 1d6a8ca939af7dd16d26b376ce6babff6b7cf837
