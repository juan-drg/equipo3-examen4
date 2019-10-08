package com.everis.quotationrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Equipo3QuotationRestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo3QuotationRestServiceApplication.class, args);
	}

}
