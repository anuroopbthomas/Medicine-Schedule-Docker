# medicinescheduledocker
docker


This repo contains all of the project files, and images that display the dashboard.

Find the images of what the dashboard should look like in the "Pictures" folder

Steps to Replicate:
1. Open Docker Quickstart terminal
2. $ docker image pull anuroopthomas/medicinescheduledocker
3. $ docker container run -P -d anuroopthomas/medicinescheduledocker
4. (Optional if the port has changed) $ docker container port "container-id"
5. Open browser and type in the docker default machine IP with the port 8080
  ex: 192.168.99.101:8080
6. Click the 'Export Data' button and then click the 'Create file' button to save the data
7. All values are editable
8. $ docker container rm -f "container-id"
