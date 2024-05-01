# Back-end Application Readme

## Technologies Used

1. Spring Boot: 3.0.1
2. MySQL: 8.0
3. Java: 17

## Installation Guide

Follow these steps to set up and run the back-end application:

### Prerequisites

- Java Development Kit (JDK) 17 or higher installed on your system.
- MySQL database installed and running.

### Steps

1. Clone the Repository:
   ```bash
   git clone <repository_url>
   ```

2. Navigate to the Backend Directory:
   ```bash
   cd backend
   ```

3. Build the Project:
   ```bash
   ./mvnw clean package
   ```

4. Run the Application:
   ```bash
   java -jar target/<jar_file_name>.jar or Run the src/main/java/com/davi/ShopApplication.java class manually by right click on then run java
   ```

5. Verify the Application:
   Open a web browser and go to `http://localhost:8080`. You should see the application up and running.

6. Database Configuration:
   - Update the `application.properties` file in the `src/main/resources` directory with your MySQL database credentials.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/<database_name>
   spring.datasource.username=<username>
   spring.datasource.password=<password>
   ```

   Ensure that the database specified (`<database_name>`) exists before running the application.

## Additional Notes

- This back-end application is built using Spring Boot, providing a robust and scalable framework for developing Java-based applications.
- Ensure that all dependencies mentioned in the `pom.xml` file are resolved before building the application.
- For any issues or further assistance, please refer to the project documentation or contact the project maintainer.