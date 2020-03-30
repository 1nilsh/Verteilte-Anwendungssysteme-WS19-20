FROM openjdk:11
ADD target/api-gateway-service.jar api-gateway-service.jar
ADD service.properties service.properties
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "api-gateway-service.jar", "--spring.config.location=/service.properties"]