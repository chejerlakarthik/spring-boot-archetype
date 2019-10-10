# Use Java8 as the base docker image
FROM java:8

# Our working directory inside the container
WORKDIR /app

# Copy the packaged Jar file
COPY target/spring-boot-starter-1.0.0-SNAPSHOT.jar spring-boot-starter.jar

# Expose port 80
EXPOSE 80

# Command to run inside the container to start the app
CMD ["java", "-jar", "spring-boot-starter.jar"]