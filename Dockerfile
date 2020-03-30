FROM openjdk:11
ADD target/api-gateway-service.jar api-gateway-service.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "api-gateway-service.jar"]