# merchant-insurance
Project for maintaining insurance policies and their claims for clients

Pre-requisites:
1. java 8+ version
2. maven 
3. postman

Steps to run this code:

1. Clone the repo
2. navigate to project repo and run:     mvn clean install
3.Once build is successfull, run this to start the application:  java -jar target\merchant-insurance-0.0.1-SNAPSHOT.jar
4. Now app is started and running on port 8080
5. Check in the inmemory H2 DB has tables created or not. For that open browser and enter http://localhost:8080/h2-console  and click on connect and can see tables with client,policy,claim. Use this jdbc url: **jdbc url: jdbc:h2:mem:merchantinsurancedb**
6. For Client:
    1. Adding Client:
       http method: POST
       url: http://localhost:8080/api/clients
       content-type: application/json
       body:
       {
            "name":"bindu",
            "dob":"12-12-2001",
            "address": "rkv",
            "contact": "9191919191"
        }
          
   2. Getting all Clinet
      http method: GET
      url: http://localhost:8080/api/clients
      
   3. Get client by id
      http method: GET
      url: http://localhost:8080/api/clients/1
      
   4. Update client by id
      http method: PUT
      url: http://localhost:8080/api/clients/1
      body:
        {
              "name":"bindu",
              "dob":"12-12-2001",
              "address": "rkv university",
              "contact": "9191919191"
          }
          
    5. Delete client by Id
       http method: DELETE
       url: http://localhost:8080/api/clients/1`
       
      
