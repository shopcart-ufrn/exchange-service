FROM openjdk:21-jdk-slim-bullseye

EXPOSE 8080

COPY ./build/libs/exchange-0.0.1-SNAPSHOT.jar /src/app.jar

WORKDIR /src

CMD ["java", "-jar", "app.jar"]
