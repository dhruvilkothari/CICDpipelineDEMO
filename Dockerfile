FROM openjdk:17

WORKDIR /app

COPY ./target/cicd.jar /app

EXPOSE 9000

CMD ["java" , "-jar", "cicd.jar"]