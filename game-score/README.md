# GameScore

How to start the GameScore application from terminal
---

1. Run `mvn clean install` to build your application
1. Start application with `java -jar target/game-score-1.0-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

How to start the GameScore application from Dockerfile
---

1. Download Docker from https://www.docker.com/get-docker
1. Install Docker
1. Run `mvn clean install` to build application (including docker container)
1. Run image `docker container run -p 8080:8080 -p 8081:8081 -d org.practice.app/game-score:1.0-SNAPSHOT` 
(may very, based on service version).
1. To check that application is running navigate to url `http://localhost:8081/healthcheck`
1. To stop running image `docker stop $(docker ps -aq)` (stops all images, including non project ones).
1. To clear environment from image `docker rm $(docker ps -aq)` (clears all images, including non project ones).
1. To fully delete image `docker rmi $(docker ps -aq)` (deletes all images, including non project ones).

Use started application:
---

### Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`

### Endpoint

#### Score Rolls 

`/scoreRolls` with POST only request. 
See [tdd-bowling-game](https://github.com/alex-d-bondarev/tdd-bowling-game) for more details.

Max score example:
```shell script
## Request:
curl -s http://localhost:8080/scoreRolls \
-H "Content-Type: application/json" \
--request POST \
--data '{"id":"1","rolls":[10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10]}' \
| jq .

## Expected response:
{
  "rolls": [
    10,
    10,
    10,
    10,
    10,
    10,
    10,
    10,
    10,
    10,
    10,
    10
  ],
  "score": 300,
  "id": 1
}
```