# Services for running an example Heartbeat Demo for Uptime
_This will require OpenJDK 11+ and Gradle to compile.  
As well as access to the required code dependencies/libraries.

Both services function in relatively the same manner they have an inventory of mock products you can access._


# RESTFul Service Endpoint
###### Compiling

`cd services/soap; gradle clean; gradle build fatjar`


###### Executing

`
cd services/soap/build/libs; java -jar restful-1.0.0.jar
`

###### Validation
curl http://localhost:9001/product/logstash

_Note: You can change this port in the file services/restful/src/main/resources/application.properties_

`server.port: 9001`


#SOAP Service Endpoint

###### Compiling

`cd services/soap; gradle clean; gradle build fatjar`


###### Executing

`
cd services/soap/build/libs; java -jar soap-1.0.0.jar
`

###### Validation
curl http://localhost:9002/ws/product.wsdl?

This is is purely to make sure the end point is running. Use heartbeat configuration to send a sample payload for request/response validation.

_Note: You can change this port in the file services/soap/src/main/java/ProductPublisher.java_

`Endpoint.publish("http://localhost:9002/ws/product", new ProductServiceImpl());`
