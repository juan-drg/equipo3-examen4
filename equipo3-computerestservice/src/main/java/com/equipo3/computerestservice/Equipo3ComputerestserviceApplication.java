package com.equipo3.computerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Equipo3ComputerestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo3ComputerestserviceApplication.class, args);
	}

}
