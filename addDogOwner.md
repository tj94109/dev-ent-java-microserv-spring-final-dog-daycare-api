**Create Dog Owner Account**
----
  Creates a dog owner record into the "dog_owner" table of the dog_daycare_db database. 
  
* **URL**

  /addDogOwner

* **Method:**
  
  POST

  `GET` | `POST` | `DELETE` | `PUT`
  
* **Success Response:**
  
  "Added dog owner to database: 1"
  
  * **Code:** 200 <br />
  
* **Error Response:**

  Chunked data message
  
  * **Code:** 500 <br />
    
* **Sample Call:**

curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data "{\"lastName\": \"Richard\", \"firstName\": \"Keith\", \"phoneNumber\": \"415-101-0280\",\"email\": \"richardsk@email.com\"}" "http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/addDogOwner"

* **Notes:**

  