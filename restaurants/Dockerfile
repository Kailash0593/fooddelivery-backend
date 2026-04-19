# ---------- Stage 1: Build ----------
FROM maven:3.9.9-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy pom first (for caching dependencies)
COPY pom.xml .
RUN mvn -B -q -e -DskipTests dependency:go-offline

# Copy source and build
COPY src ./src
RUN mvn clean package -DskipTests

# ---------- Stage 2: Run ----------
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy built jar
# COPY --from=builder /app/build/libs/*.jar app.jar
COPY --from=builder /app/restaurants/target/*.jar app.jar

# Render provides PORT env variable
ENV PORT=8080

EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
