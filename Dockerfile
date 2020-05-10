FROM openjdk:14-alpine
COPY target/micronaut-2-demo-*.jar micronaut-2-demo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-2-demo.jar"]