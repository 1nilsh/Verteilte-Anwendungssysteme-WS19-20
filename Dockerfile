FROM openjdk:11
ADD target/article-microservice.jar article-microservice.jar
ADD service.properties service.properties
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "article-microservice.jar", "--spring.config.location=/service.properties"]