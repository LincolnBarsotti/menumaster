FROM openjdk:21-slim

WORKDIR /menumaster

COPY target/menumaster-0.0.1-SNAPSHOT.jar .

RUN ls

CMD ["java", "-jar", "menumaster-0.0.1-SNAPSHOT.jar"]