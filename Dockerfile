FROM openjdk:17
EXPOSE 8081
ADD target/deliveryboy-service.jar deliveryboy-service.jar
ENTRYPOINT [ "java","-jar","/deliveryboy-service.jar"]
