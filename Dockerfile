# Lightweight JDK base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy everything
COPY . .

# Fix: Ensure `mvnw` is executable
RUN chmod +x mvnw

# Build the JAR
RUN ./mvnw clean package -DskipTests

# ✅ Automatically detect and copy the correct JAR
RUN cp target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
