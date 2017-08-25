FROM maven:alpine
MAINTAINER kyle <"none@gmail.com">

EXPOSE 8888
COPY build/libs/*.jar /opt/config-server/
ENTRYPOINT ["java", "-jar", "/opt/spring-cloud-config-server/target/configuration-server-0.0.1-SNAPSHOT.jar", "--spring.config.name=config-server"]
