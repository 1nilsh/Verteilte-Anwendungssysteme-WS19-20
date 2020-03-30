FROM openjdk:11
ADD target/order-microservice.jar order-microservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "order-microservice.jar"]