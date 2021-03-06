package com.tiancheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;



@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {
	public static void main(String[] args) {
		new SpringApplication(EurekaServer.class).run(args);
		System.out.println("test");
	}
}
