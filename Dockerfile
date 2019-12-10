From openjdk:8

WORKDIR /var/src

ADD . .
RUN chmod +x mvnw
ENTRYPOINT [ "./mvnw", "spring-boot:run" ]



