package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Day1MsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day1MsServerApplication.class, args);
	}

}
