package com.example.dameng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DamengApplication {

	public static void main(String[] args) {
		SpringApplication.run(DamengApplication.class, args);
	}

}

