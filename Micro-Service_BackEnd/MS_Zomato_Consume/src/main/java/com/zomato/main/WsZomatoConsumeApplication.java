package com.zomato.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WsZomatoConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsZomatoConsumeApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate rt()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
