# GameScore

How to start the GameScore application
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/game-score-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`

Endpoint
---

### Score Rolls 

`/scoreRolls` with POST only request. 
See [tdd-bowling-game](https://github.com/alex-d-bondarev/tdd-bowling-game) for more details.

Max score example:
```shell script
curl -s http://localhost:8080/scoreRolls \
-H "Content-Type: application/json" \
--request POST \
--data '{"id":"1","rolls":[10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10]}'
```