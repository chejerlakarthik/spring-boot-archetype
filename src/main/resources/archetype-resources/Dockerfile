# Use Java8 as the base docker image
FROM java:8

# Our working directory inside the container
WORKDIR /app

# Copy the packaged Jar file
COPY target/${artifactId}-${version}.jar app.jar

# Expose port 80
EXPOSE 80

# Command to run inside the container to start the app
CMD ["java", "-jar", "app.jar"]