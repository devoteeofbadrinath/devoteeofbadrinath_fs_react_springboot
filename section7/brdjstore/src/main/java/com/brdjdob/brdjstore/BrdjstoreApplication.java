 package com.brdjdob.brdjstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

 @SpringBootApplication
//@ComponentScan(basePackages = {"com.brdjdob.brdjstore.controller"})
 public class BrdjstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrdjstoreApplication.class, args);
	}

}
