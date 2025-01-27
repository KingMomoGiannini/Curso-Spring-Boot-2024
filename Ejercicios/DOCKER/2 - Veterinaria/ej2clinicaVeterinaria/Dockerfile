FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/clinica_veterinaria-0.0.1.jar
COPY ${JAR_FILE} clinica_veterinaria.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/clinica_veterinaria.jar"]