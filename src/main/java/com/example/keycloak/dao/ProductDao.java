package com.example.keycloak.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTable(){
        var query = "CREATE TABLE products(id SERIAL PRIMARY KEY,name VARCHAR(255) NOT NULL,description VARCHAR(255) NOT NULL,type VARCHAR(255) NOT NULL)";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }
}
