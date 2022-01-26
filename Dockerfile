FROM adoptopenjdk/openjdk11:alpine
RUN addgroup -S mylearings && adduser -S mylearings -G mylearings
USER mylearings:mylearings
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} /app/ds-with-java.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/ds-with-java.jar"]