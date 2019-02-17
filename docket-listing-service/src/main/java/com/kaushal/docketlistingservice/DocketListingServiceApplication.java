package com.kaushal.docketlistingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DocketListingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocketListingServiceApplication.class, args);
	}

}
