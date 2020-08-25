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

**Show all Dogs**
----
  Retrieves a list of all dogs from the "dog" table
  in the dog_daycare_db database. 

* **URL**

  /displayDogs

* **Method:**
  
  GET

  `GET` | `POST` | `DELETE` | `PUT`
  
* **Success Response:**
  
  User can see one or more dog entries
  * **Code:** 200 <br />
  
* **Error Response:**

  Users cannot see any entries
  * **Code:** 200 <br />
    
* **Sample Call:**

  curl http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/displayDogs

* **Notes:**

**Show all Dog Owners**
----
  Retrieves a list of all dogs owners from the dog_owner table
  in the dog_daycare_db database. 
  
* **URL**

  /displayDogOwners

* **Method:**
  
  GET

  `GET` | `POST` | `DELETE` | `PUT`
  
* **Success Response:**
  
  User can see one or more dog owner entries
  * **Code:** 200 <br />
  
* **Error Response:**

  Users cannot see any entries
  * **Code:** 200 <br />
    
* **Sample Call:**

  curl http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/displayDogOwners
  
* **Notes:**

**Show all Dog Owners joined with Dog records**
----
  Retrieves a joined list of all dog owners and 
  their dogs from the "dog_owner" and "dog" tables
  in the dog_daycare_db database. 
  
* **URL**

  /displayDogOwnersAndDogs

* **Method:**
  
  GET

  `GET` | `POST` | `DELETE` | `PUT`
  
* **Success Response:**
  
  User can see one or more dog owner entries
  * **Code:** 200 <br />
  
* **Error Response:**

  Users cannot see any entries
  * **Code:** 200 <br />
    
* **Sample Call:**

  curl http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/displayDogOwnersAndDogs
* **Notes:**