FROM openjdk:8
ADD target/article-microservice.jar article-microservice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "article-microservice.jar"]