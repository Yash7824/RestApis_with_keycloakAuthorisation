package com.example.keycloak;

import com.example.keycloak.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class SpringbootKeycloakApplication implements CommandLineRunner {
//	@Autowired
//	private ProductDao productDao;
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringbootKeycloakApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		this.productDao.createTable();
//	}
//}

@SpringBootApplication
public class SpringbootKeycloakApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKeycloakApplication.class, args);
	}

}
