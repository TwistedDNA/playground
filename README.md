# playground
How to run application with docker (asuming on Windows and docker is installed):
- mvn package docker:build
- docker run -p 8080:8080 -t twisteddna/playground
- open in browser localhost:8080/time
