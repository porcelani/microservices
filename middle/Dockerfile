FROM java:8-jre-alpine

COPY target/middle-1.0.0-SNAPSHOT.jar /opt/app.jar

WORKDIR /opt

ENTRYPOINT ["java", "-jar", "app.jar"]
