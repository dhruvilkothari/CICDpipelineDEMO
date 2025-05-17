FROM openjdk:17

WORKDIR /app

COPY ./target/cicd.jar /app

EXPOSE 8080

CMD ["java" , "-jar", "cicd.jar"]