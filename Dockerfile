FROM java:8

EXPOSE 8082

RUN mkdir -p /files

COPY public_key.der /files/public_key.der

ADD /target/gateway-0.0.1-SNAPSHOT.jar gateway-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-Dspring.profiles.active=prod", "-jar", "gateway-0.0.1-SNAPSHOT.jar", "dev-entrypoint" ]
#ENTRYPOINT ["java","-Dspring.profiles.active=stage", "-jar", "communication-0.0.1-SNAPSHOT.jar", "prod-entrypoint" ]
