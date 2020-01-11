package com.satya.SpringCloudEurekaservertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudEurekaServerTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerTestApplication.class, args);
	}

}
