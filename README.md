# Spring Boot Dockerized Application

This is a simple Spring Boot application with one sample REST endpoint. The application is Dockerized and pushed to Docker Hub for easy deployment.

## Features

- Spring Boot application
- Exposes a REST API to demonstrate basic functionality
- Dockerized for container-based deployment
- Pushed to Docker Hub for easy retrieval and running

## Sample REST Endpoint

The application exposes a simple endpoint that returns a welcome message.

### Endpoint: `/api/hello`

- **URL**: `http://localhost:8080/message`
- **Method**: `GET`
- **Response**: 
  ```json
  {
    "message": "Welcome to Spring Boot Docker Application"
  }

**Prerequisites**

JDK 17+<br>
Docker<br>
Maven<br>
Running the Application Locally

**Clone the repository:**

git clone https://github.com/Harish1606/Spring_Boot_Docker.git
cd Spring_Boot_Docker
<br>

**Build the application:**

mvn clean package

<br>

**Run the Spring Boot application locally:**

java -jar target/spring-boot-docker.jar

<br>

Access the application at http://localhost:8080/message

**Dockerizing the Application**
The project is Dockerized using a Dockerfile. Here's how you can build and run the Docker image:

Build Docker Image
Ensure the JAR file is built using Maven:

mvn clean package

<br>
Build the Docker image:

docker build -t your-username/spring-boot-dockerized-app .

<br>
Verify the Docker image is created:

docker images

<br>
Run the Docker container:

docker run -p 8080:8080 your-username/spring-boot-dockerized-app

<br>
Access the application via the following URL:

http://localhost:8080/message

<br>

**To push the Docker image to Docker Hub, follow these steps:**

Log in to Docker Hub:

docker login

<br>
Tag the Docker image:

docker tag your-username/spring-boot-dockerized-app your-username/spring-boot-dockerized-app:latest

<br>
Push the Docker image:

docker push your-username/spring-boot-dockerized-app:latest

<br>
The image is now available at Docker Hub under:

https://hub.docker.com/r/your-username/spring-boot-dockerized-app

<br>
**Pull the image from Docker Hub:**

docker pull your-username/spring-boot-dockerized-app:latest

<br>
Run the container:

docker run -p 8080:8080 your-username/spring-boot-dockerized-app

<br>
Access the application:

http://localhost:8080/message
