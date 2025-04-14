FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/Users-0.0.1-SNAPSHOT.jar /app/app.jar	 
EXPOSE 1234
ENTRYPOINT ["java", "-jar", "app.jar"]
