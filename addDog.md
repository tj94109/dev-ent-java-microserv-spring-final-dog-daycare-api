**Create Dog Account**
----
  Creates a dog record into the "dog" table of the dog_daycare_db database. 
  
* **URL**

  /addDog

* **Method:**
  
  POST

  `GET` | `POST` | `DELETE` | `PUT`
  
* **Success Response:**
  
  "Added dog to database: 1"
  
  * **Code:** 200 <br />
  
* **Error Response:**

  Chunked data message
  
  * **Code:** 500 <br />
    
* **Sample Call:**

curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data "{\"dogName\": \"Babe\", \"dogBreed\": \"Rotweiler\", \"dogDOB\": \"2017-10-02\"}" "http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/addDog"

* **Notes:**

  