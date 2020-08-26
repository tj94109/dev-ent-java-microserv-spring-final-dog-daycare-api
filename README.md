# dev-ent-java-microserv-spring-final-proj-dog-daycare-api

Using the Spring Framework I created two POST and three GET microservices that interact with a mysql database.  The database architecture consists a schema named "dog_daycare_db" and its tables are described as follows:  

  dog_owner: owner_id(primary key), owner_last_name, owner_first_name, owner_phone, and owner_email. 
  dog table: dog_id, dog_name, dog_breed, dog_dob, and owner_id(foreign key). 



The "addDog' REST API microservice interacts with a mysql database by adding a dog record to the "dog" table of the dog_daycare_db.  

  Sample:
  curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data "{\"dogName\": \"Babe\", \"dogBreed\": \"Rotweiler\", \"dogDOB\":       \"2017-
  10-02\"}" "http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/addDog"
  
  Expected Output:
  HTTP/1.1 200 OK
  Content-Type: application/json;charset=utf-8
  Content-Length: 29
  Server: Jetty(9.4.30.v20200611)

Dog Added to Dog Database: 1



The "addDogOwner" service completes a similar task but instead adds an dog owner record to the the dog_owner table.  

  Sample:
  curl -i -H "Accept: application/json" -H "Content-Type:application/json" -X POST --data "{\"lastName\": \"Jones\", \"firstName\": \"Bob\", \"phoneNumber\": \"415-999-0280\",\"email\": \"jonesk@email.com\"}" "http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/addDogOwner"

  Expected Output:
  HTTP/1.1 200 OK
  Content-Type: application/json;charset=utf-8
  Content-Length: 31
  Server: Jetty(9.4.30.v20200611)

  Added dog owner to database: 1




There are three GET microservices which retrieve lists of entries from the tables. The "displayDogs" retrieves a list of all dog entries from the dog table and the "displayDogOwners" service returns a list of all the the dog owners from the dog_owner table.  

  Sample:
  curl http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/displayDogs

  Expected Output:
  DOG RESIDENT LIST:
  Buddy, 25, 1, Pit Bull, 2015-02-01
  Banjo, 26, 2, Jack Russell, 2017-03-10
  Tiberius, 27, 3, Doberman, 2020-01-10
  Babe, 28, 4, Rotweiler, 2017-10-02
  Winston, 29, 4, Pug, 2018-05-10
  Alvin, 30, 5, Husky, 2019-01-15
  bugsy, 31, 4, Pug, 2018-05-10
  War Machine, 32, 9, Belgian Shepard, 2012-11-28
  Patty, 33, 8, Pomeranian, 2011-12-05
  Nino, 34, 7, Dachhund, 2016-01-01
  Sebastian, 35, 6, Mini Pincher, 2015-02-01
  Curtis, 38, 999, Poodle, 2016-04-19
  
  Sample:
  curl http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/displayDogOwners

  Expected Output:
  1, Brady, Marsha, 555-537-8765, marsha.brady@somewhere.com, 
  2, Burns, Chuck, 555-222-8651, chuckie@gmail.com, 
  3, Stevens, Tom, 510-202-8888, tommy@gmail.com, 
  4, Terry, Todd, 415-425-0100, todd@email.com, 
  5, Hernandez, Ron, 415-555-0000, ron@email.com, 
  6, Page, Betty, 415-555-1111, bpage@email.com, 
  7, Russell, Jane, 510-568-8898, jane@yahoo.com, 
  8, Grable, Betty, 415-292-7778, betty@gmail.com, 
  9, Neil, Vince, 789-202-8118, vince@ups.com, 
  10, Richard, Keith, 415-101-0280, richardsk@email.com, 
  11, Richard, Keith, 415-101-0280, richardsk@email.com, 
  12, Jones, Bob, 415-999-0280, jonesk@email.com, 



The displayDogOwnersAndDogs service retrieves a joined table that lists dog_owner and matching dog record from both tables.
  Sample:
  curl http://ec2-54-242-96-177.compute-1.amazonaws.com:8080/dog-daycare-api/displayDogOwnersAndDogs
  
  Expected Output:
  
  DOG Owner and dog:
  Owner Name: Marsha Brady, Dog Name: Buddy , 
  Owner Name: Chuck Burns, Dog Name: Banjo , 
  Owner Name: Tom Stevens, Dog Name: Tiberius , 
  Owner Name: Todd Terry, Dog Name: Babe , 
  Owner Name: Todd Terry, Dog Name: Winston , 
  Owner Name: Ron Hernandez, Dog Name: Alvin , 
  Owner Name: Todd Terry, Dog Name: bugsy , 
  Owner Name: Vince Neil, Dog Name: War Machine , 
  Owner Name: Betty Grable, Dog Name: Patty , 
  Owner Name: Jane Russell, Dog Name: Nino , 
  Owner Name: Betty Page, Dog Name: Sebastian 
  
