FROM java:8-jre-alpine

COPY target/eureka-1.0.0-SNAPSHOT.jar /opt/app.jar

WORKDIR /opt

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "app.jar"]
