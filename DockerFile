FROM adoptopenjdk/openjdk8:alpine-jre
ADD target/Backend-0.0.1-SNAPSHOT.jar backend.jar
RUN mkdir ImageStorage
ENTRYPOINT ["java","-jar","backend.jar"]