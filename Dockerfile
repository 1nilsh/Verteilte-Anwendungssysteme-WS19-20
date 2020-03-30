FROM openjdk:11
ADD target/order-microservice.jar order-microservice.jar
ADD service.properties service.properties
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "order-microservice.jar", "--spring.config.location=/service.properties"]