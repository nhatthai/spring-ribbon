FROM java:8-jre

ADD ./target/user-0.0.1.jar /app/

ENTRYPOINT ["java", "-Xmx200m", "-jar", "/app/user-0.0.1.jar"]
EXPOSE 8888