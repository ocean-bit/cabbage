# 这种并非最优 see https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#container-images.dockerfiles
FROM openjdk:17.0.2-jdk-bullseye

WORKDIR /app

COPY target/jdk-module.jar /app/app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]