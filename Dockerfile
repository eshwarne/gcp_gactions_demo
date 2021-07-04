FROM openjdk:11-jre-slim
COPY ./target/gactiongcp-0.0.1-SNAPSHOT.jar ./gactiongcp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","./gactiongcp-0.0.1-SNAPSHOT.jar"]