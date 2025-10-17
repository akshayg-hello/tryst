FROM openjdk:17
LABEL authors="akshayg"
WORKDIR app
COPY profile-manager .
#RUN ./mvnw package && java -jar target/profile-manager-0.1.0.jar
ENTRYPOINT ["top", "-b"]