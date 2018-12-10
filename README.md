# Backend-Challenge
Exercise to practise Java Spring boot Rest services

Initial requirements provided in the file Backend-Challenge.pdf

Design summary:

- Catalog resource: microservice to provide catalog management operations 
	/phones : end-point resource
	Methods implemented:
		- GET  /phones:
		- POST /phones:

- Ordering resource: microservice for orders management.
	/orders: end-point resource
	Methods implemented:
		- GET /orders
		- POST /orders

- Project management based on Maven
- Spring boot based, using Jar packaging with the Tomcat server included. Port configured in the application properties file.
- Use of Java 8, Java 9 and 10 are not available anymore, Java 11 isn't still Spring Boot compatible
- logging: Logback (provided by default with Spring Boot). Logging to the console with an INFO line a record of the orders created (with the 'Getting richer!' text) 
- Tests: unit tests only make sense for one method, Class phoneOrder- Method calcPrice, where there's some lines of code. The rest of the method are just trivial.
 - Improvements:

 - Launch
	mvn spring-boot:run
 
Proxy API
Service register

Avoiding overflow:
Circuit breakers

