FROM eclipse-temurin:21-jre-jammy as builder
EXPOSE 9999
ADD ./target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]