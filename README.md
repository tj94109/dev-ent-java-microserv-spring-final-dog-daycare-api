# dev-ent-java-microserv-spring-final-proj-dog-daycare-api

Using the Spring Framework I created two POST microservices.  The "addDog' REST API microservice interacts with a mysql database by adding a dog record to the "dog" table of the dog_daycare_db.  The "addDogOwner" service completes a similar task but instead adds an dog owner record to the the dog_owner table.  

There are three GET microservices which retrieve lists of entries from the tables.  The "displayDogs" retrieves a list of all dog entries from the dog table and the "displayDogOwners" service returns a list of all the the dog owners from the dog_owner table.  The displayDogOwnersAndDogs service retrieves a joined table that lists dog_owner and matching dog record from both tables.  

