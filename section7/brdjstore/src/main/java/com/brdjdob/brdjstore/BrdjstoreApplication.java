 package com.brdjdob.brdjstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

 @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BrdjstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrdjstoreApplication.class, args);
	}

}
