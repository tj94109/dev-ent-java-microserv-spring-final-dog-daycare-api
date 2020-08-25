package com.stevenson.finalproj;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.web.bind.annotation.*;


@RestController
public class JDBCController {
    private final static String KEYFILEPATH = "./keyFile.key";


    @CrossOrigin
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String printCryptTest() {
        AESUtils aesUtils = new AESUtils();

        String encryptedStr = aesUtils.encrypt("Hello World!", KEYFILEPATH);
        return ("Decrypt = " + aesUtils.decrypt(encryptedStr, KEYFILEPATH));
    }

    @CrossOrigin
    @RequestMapping(value = "/displayDogOwners", method = RequestMethod.GET)
    public String displayDogOwners() {
        JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();
        StringBuilder resultStr = new StringBuilder();

        String queryStr = "SELECT * from dog_owner;";
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(queryStr);
        while (sqlRowSet.next()) {
            resultStr.append(sqlRowSet.getString("owner_id")).append(", ")
                    .append(sqlRowSet.getString("owner_last_name")).append(", ")
                    .append(sqlRowSet.getString("owner_first_name")).append(", ")
                    .append(sqlRowSet.getString("owner_phone")).append(", ")
                    .append(sqlRowSet.getString("owner_email")).append(", ")
                    .append("\n");
        }
        return ("DOG OWNER LIST:\r" + resultStr);
    }

    @CrossOrigin
    @RequestMapping(value = "/displayDogs", method = RequestMethod.GET)
    public String displayDog() {
        JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();
        StringBuilder resultStr = new StringBuilder();

        String queryStr = "SELECT * from dog;";
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(queryStr);
        while (sqlRowSet.next()) {
            resultStr.append(sqlRowSet.getString("dog_name")).append(", ")
                    .append(sqlRowSet.getString("dog_id")).append(", ")
                    .append(sqlRowSet.getString("owner_id")).append(", ")
                    .append(sqlRowSet.getString("dog_breed")).append(", ")
                    .append(sqlRowSet.getString("dog_DOB"))
                    .append("\n");
        }
        return ("DOG RESIDENT LIST:\n" + resultStr);
    }

    @CrossOrigin
    @RequestMapping(value = "/displayDogOwnersAndDogs", method = RequestMethod.GET)
    public String displayDogOwnersAndDogs() {
        JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();
        StringBuilder resultStr = new StringBuilder();

        String queryStr = "SELECT o.owner_first_name, owner_last_name, dog_name\n" +
                "FROM dog_owner o, dog d\n" +
                "WHERE o.owner_id = d.owner_id;";
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet(queryStr);
        while (sqlRowSet.next()) {
            resultStr.append("Owner Name: ")
                    .append(sqlRowSet.getString("owner_first_name")).append(" ")
                    .append(sqlRowSet.getString("owner_last_name")).append(", Dog Name: ")
                    .append(sqlRowSet.getString("dog_name")).append(" , ")
                    .append("\n");
        }
        return ("DOG Owner and dog:\n" + resultStr);
    }


    @CrossOrigin
    @RequestMapping(value = "/addDogOwner", method = RequestMethod.POST)
    public String addDogOwnerData(@RequestBody AddDogOwnerData addDogOwnerData) {
        JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();
        String queryStr = "INSERT INTO dog_owner (owner_first_name, owner_last_name, owner_phone, owner_email) " +
                "VALUES (" +
                "'" + addDogOwnerData.getFirstName() + "'," +
                "'" + addDogOwnerData.getLastName() + "'," +
                "'" + addDogOwnerData.getPhoneNumber() + "'," +
                "'" + addDogOwnerData.getEmail() + "'" +
                ");";
        int rowsUpdated = jdbcTemplate.update(queryStr);
        return ("Dog owner to database: " + rowsUpdated);
    }

    @CrossOrigin
    @RequestMapping(value = "/addDog", method = RequestMethod.POST)
    public String addDogOwnerData(@RequestBody AddDog addDog) {
        JdbcTemplate jdbcTemplate = JDBCConnector.getJdbcTemplate();
        String queryStr = "INSERT INTO dog (dog_name, dog_breed, dog_DOB) " +
                "VALUES (" +
                "'" + addDog.getDogName() + "'," +
                "'" + addDog.getDogBreed() + "'," +
                "'" + addDog.getDogDOB() + "'" +
                ");";
        int rowsUpdated = jdbcTemplate.update(queryStr);
        return ("Dog Added to Dog Database: " + rowsUpdated);
    }
}
