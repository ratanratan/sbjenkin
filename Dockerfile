# Use a small, production-friendly base image with JDK
FROM eclipse-temurin:17-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR into the container
COPY target/SpringBootdemo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on (adjust if different)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
