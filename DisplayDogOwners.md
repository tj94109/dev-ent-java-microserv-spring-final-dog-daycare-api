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

  