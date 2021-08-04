https://codingnconcepts.com/spring-boot/configure-feign-rest-client/

https://github.com/ashishlahoti/springboot-examples/tree/main/springboot-api


FeignClient is a Declarative REST Client in Spring Boot Web Application. 
Declarative REST Client means you just give the client specification as an Interface and 
spring boot takes care of the implementation for you.

FeignClient is used to consume RESTFul API endpoints exposed by thirdparty or microservice.

Feign vs RestTemplate
It is an alternative of RestTemplate and has following advantages over RestTemplate:-

Do not need to write implementation classes to call other services, just provide specification as an Interface
Client configurations such as encoding/decoding, timeout, logging can just be done through property files.
Client configurations can be done from Java Configuration file as well.
Developed by Netflix. It has great support to work with other spring-boot cloud libraries such as Hystrix, Eureka and Ribbon
Spring Boot provide support for writing test cases for Feign Client using WireMock
Provide support for fallback data if API call fails.