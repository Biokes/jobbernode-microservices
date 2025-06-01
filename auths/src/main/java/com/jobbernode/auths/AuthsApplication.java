package com.jobbernode.auths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthsApplication.class, args);
	}

}
