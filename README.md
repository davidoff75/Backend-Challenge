# Backend-Challenge
Exercise to practise Java Spring boot Rest services

Initial requirements provided in the file Backend-Challenge.pdf

Design summary:

- Catalog resource: microservice to provide catalog management operations 
/phones : end-point resource
Methods implemented:
		- GET  
			/phones: return all the phones in the catalog
			/phones/{id}: return one phone with the id of the parameter
			/phones/{id}/price: return the price of the phone with the id of the parameter
		- POST 
			/phones: create a new phone

- Ordering resource: microservice for orders management.
/orders: end-point resource
Methods implemented:
		- GET 
			/orders: get all the orders
		- POST 
			/orders: create a new order
- Swagger included in both projects, to enable the OpenAPI documentation  discovery.

- Spring boot based, using Jar packaging with the Tomcat server embbeded. Port configured in the application properties file.
- DDBB: H2 (in memory database)
- Logging: Logback (provided by default with Spring Boot). Logging to the console with an INFO line a record of the orders created (with the 'Getting richer!' text) 
- Tests: some unit and integration test have been created, for some of the methods, for demonstration purposes.
- Launch of each microservice withe the standard Maven command,like
	mvn spring-boot:run
 
 
QUESTIONS
Q.1 How would you improve the system?

In a real scenario, although this 2 resources are very simple, several improvement will be necessary, for reliability, security and scalability purposes.
- First, create more test cases (unit, contract, integration), covering at least all the methods of the APIS, validations, and controlled error cases.
- Define specific Exceptions, catch the exceptions appropiately.
- Introduce security, only admitting https traffic, and using and authentication system. At least the http Basic authorization. Recommended to use an Outh2 solution like Keycloack, enabling the option to create different roles.
- In order to automate the live deployment and auto-scaling, with Docker and Kubernetes (for example), a service registry solutions should be installed.
- A API proxy , with autodiscovery ( Zuul, for example) will balance the load, perform security check agains the Outh2 system.
- Monitoring: include the convenient traces in all the code. Use a log design oriented to be processed in a monitoring solution like ELK stack.

Q.2 How would you avoid your order API to be overflow?
- Auto scaling should increase capacity on demand.
- Use a Rest API management solution, like Mashery, to filter suspicious high traffic, and to define quotes per IP.
- Use a CDN solution with attacks prevention features (like Shape)
- Caching: introduce a cache layer to cache the calls to the phone catalog service.
- Circuit breakers for the calls to other services and the DDBB transactions.

