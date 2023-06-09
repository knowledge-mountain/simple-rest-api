FROM openjdk:17.0.1-jdk-slim as builder
WORKDIR /build
COPY . .
RUN ./gradlew build

FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY --from=builder ./build/build/libs/*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
