FROM openjdk:11
ADD target/customer-microservice.jar customer-microservice.jar
ADD service.properties service.properties
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "customer-microservice.jar", "--spring.config.location=/service.properties"]