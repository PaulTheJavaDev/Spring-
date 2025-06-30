package com.pls.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Animal dog = new Animal(8, "Peter");
		dog.makeNoise("wuff wuff");
		//I renamed the branch but it didn't work really well
	}

}
