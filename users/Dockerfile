# -------- Stage 1: Build --------
FROM maven:3.9.9-eclipse-temurin-17 AS builder

WORKDIR /build

# Copy root pom
COPY pom.xml .

# Copy module pom
COPY users/pom.xml users/pom.xml

# Download dependencies (cached layer)
RUN mvn -pl users -am dependency:go-offline -B

# Copy full source
COPY . .

# Build only users module
RUN mvn -pl users -am clean package -DskipTests

# -------- Stage 2: Run --------
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY --from=builder /build/users/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
