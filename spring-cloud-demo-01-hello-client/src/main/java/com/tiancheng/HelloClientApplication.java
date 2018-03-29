package com.tiancheng;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HelloClientApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(HelloClientApplication.class).web(true).run(args);
	}
}
