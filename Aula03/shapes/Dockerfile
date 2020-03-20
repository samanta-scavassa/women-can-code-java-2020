FROM maven:3.6-jdk-13-alpine

RUN mkdir /wcc
WORKDIR /wcc

COPY ./src ./src
COPY pom.xml pom.xml

RUN mvn clean package

ENTRYPOINT [ "java", "-jar", "./target/shapes-1.0-SNAPSHOT.jar" ]
