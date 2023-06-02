plugins {
    java
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "ru.vyatsu"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.4")
    implementation("org.springframework.boot:spring-boot-starter-security:3.0.4")
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
    implementation("org.springframework.boot:spring-boot-starter-websocket:3.0.4")
    implementation("io.jsonwebtoken:jjwt-impl:0.11.5")
    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
    implementation("io.jsonwebtoken:jjwt-jackson:0.11.5")
    implementation("io.jsonwebtoken:jjwt-extensions:0.11.5")
    implementation("io.jsonwebtoken:jjwt-orgjson:0.11.5")
    implementation("io.jsonwebtoken:jjwt-gson:0.11.5")
    implementation("io.jsonwebtoken:jjwt-root:0.11.5")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0")
    implementation("org.springframework.boot:spring-boot-starter-validation:3.0.4")
    compileOnly("org.projectlombok:lombok:1.18.26")
    developmentOnly("org.springframework.boot:spring-boot-devtools:3.0.4")
    developmentOnly("org.springframework.boot:spring-boot-docker-compose")
    runtimeOnly("org.postgresql:postgresql:42.5.4")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor:3.0.4")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
    testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
    testImplementation("org.springframework.security:spring-security-test:6.0.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
