
# define base docker image
FROM openjdk:8-jre-alpine
COPY  target/employee_service.jar employee_service.jar
ENTRYPOINT ["java", "-jar", "/employee.jar"]



#docker run -d -p [host_port]:[container_port] --name [container_name] [image_id/image_tag]
#docker build -t employee .
#docker run -d -p 8080:8080 employee:latest
#docker inspect employee:latest
#docker push <Name of the image> <Name of the repo>
#docker pull employee

#To push docker images
#docker image tag SOURCE_IMAGE[:TAG] TARGET_IMAGE[:TAG]
#docker image tag employee:latest syedmj/employee:latest
#docker image push [OPTIONS] NAME[:TAG] 
#docker push syedmj/employee