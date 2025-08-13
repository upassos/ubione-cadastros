# Etapa 1: build da aplicação com Maven + JDK 21
FROM maven:3.9.4-eclipse-temurin-21 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: runtime com JDK 21
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]