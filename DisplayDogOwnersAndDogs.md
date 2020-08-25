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

  