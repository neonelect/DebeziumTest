FROM openjdk:17-alpine
RUN cd / && mkdir target && chmod 777 -R /target
COPY ./build/libs/debezium-test-0.0.1-SNAPSHOT /target/
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "/target/debezium-test-0.0.1-SNAPSHOT.jar"]