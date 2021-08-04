package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients 
// SpringBoot sets up all the necessary default configuration required for FeignClient and 
// automatically scans for the classes annotated with @FeignClient
public class SpringBootFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignClientApplication.class, args);
	}

}
