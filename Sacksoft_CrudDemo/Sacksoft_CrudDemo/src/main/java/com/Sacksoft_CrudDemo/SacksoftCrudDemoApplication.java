package com.Sacksoft_CrudDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Sacksoft_CrudDemo.Dao")
public class SacksoftCrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SacksoftCrudDemoApplication.class, args);

	}

}
