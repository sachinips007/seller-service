FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-app.jar spring-boot-app.jar
ENTRYPOINT ["JAVA","-jar","/spring-boot-app.jar"]
