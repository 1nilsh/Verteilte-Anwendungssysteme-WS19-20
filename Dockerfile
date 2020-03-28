FROM openjdk:8
ADD target/eureka-discovery-server.jar eureka-discovery-server.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "eureka-discovery-server.jar"]