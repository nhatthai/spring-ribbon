FROM java:8-jre

ADD ./target/say-hello-0.0.1.jar /app/

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/app/say-hello-0.0.1.jar"]
EXPOSE 8090