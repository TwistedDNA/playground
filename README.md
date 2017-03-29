# playground
How to run application with docker (asuming on Windows and docker is installed):
- mvn package docker:build
- docker run -p 8080:8080 -t twisteddna/playground --rm
- open in browser localhost:8080/time or localhost:8080/loggingTime
