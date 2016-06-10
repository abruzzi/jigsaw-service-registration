FROM java:8

ADD build/libs/jigsaw-service-registration-1.0.0.jar /app/jigsaw-service-registration.jar
EXPOSE 8761

ENTRYPOINT ["java", "-jar","/app/jigsaw-service-registration.jar"]
