FROM openjdk:11
ADD target/customer-microservice.jar customer-microservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "customer-microservice.jar"]