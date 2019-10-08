package com.equipo3.computerestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Equipo3ComputerestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Equipo3ComputerestserviceApplication.class, args);
	}


}
