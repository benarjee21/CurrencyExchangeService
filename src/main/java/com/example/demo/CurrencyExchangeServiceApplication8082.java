package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServiceApplication8082 {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication8082.class, args);
		System.out.println("Started Currency exchange service");
	}

}
