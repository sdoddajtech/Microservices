package com.sai.weblocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeblocationApplication {

	public static void main(String[] args) {
		//System.setProperty("server.servlet.context-path", "/weblocation");
		SpringApplication.run(WeblocationApplication.class, args);
	}

}
