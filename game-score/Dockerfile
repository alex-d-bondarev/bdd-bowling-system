FROM java:openjdk-8-jre-alpine

EXPOSE 8080 8081

COPY ./target /target
COPY ./config.yml config.yml

CMD java -jar \
    target/game-score-1.0-SNAPSHOT.jar \
    server config.yml

HEALTHCHECK --interval=5m --timeout=15s --retries=5 \
  CMD curl -f http://localhost:8081/healthcheck || exit 1