FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/ShopItemH2-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 1236 
ENTRYPOINT ["java", "-jar", "app.jar"] 
