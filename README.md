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
6. **Clients:**
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
          
   2. Getting all Clients
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
7. **Policies:**
      1. Adding Policy:
       http method: POST
       url: http://localhost:8080/api/policies
       content-type: application/json
       body:
       {
            "policyNumber": "A123456",
            "policyType" : "Life Insurance",
            "coverageAmount" : "10000000",
            "premium" : "50000",
            "startDate" : "06-04-2023",
            "endDate": "06-04-2033",
            "clientId" : "1"
        }
          
   2. Getting all Policies
      http method: GET
      url: http://localhost:8080/api/policies
      
   3. Get policy by id
      http method: GET
      url: http://localhost:8080/api/policies/1
      
   4. Update policy by id
      http method: PUT
      url: http://localhost:8080/api/policies/1
      body:
       {
            "policyNumber": "A123456",
            "policyType" : "Life Insurance",
            "coverageAmount" : "10000000",
            "premium" : "50000",
            "startDate" : "06-04-2023",
            "endDate": "06-04-2038",
            "clientId" : "1"
        }
          
    5. Delete policy by Id
       http method: DELETE
       url: http://localhost:8080/api/policies/1`
8. **Claims:**
      1. Adding Claim:
       http method: POST
       url: http://localhost:8080/api/claims
       content-type: application/json
       body:
       {
            "claimNumber" : "A123456",
            "description" : ",Medical Bills",
            "claimDate" : "06-04-2023",
            "claimStatus" : "pending",
            "policyId" : "1"
        }
          
   2. Getting all claims
      http method: GET
      url: http://localhost:8080/api/claims
      
   3. Get claim by id
      http method: GET
      url: http://localhost:8080/api/claims/1
      
   4. Update claim by id
      http method: PUT
      url: http://localhost:8080/api/claims/1
      body:
       {
            "claimNumber" : "A123456",
            "description" : ",Medical Bills",
            "claimDate" : "06-04-2023",
            "claimStatus" : "pending",
            "policyId" : "1"
        }
          
    5. Delete claim by Id
       http method: DELETE
       url: http://localhost:8080/api/claims/1`
       
