package com.teste.fatec.fatecteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@SpringBootApplication
public class FatecTesteApplication {
	@RequestMapping("/")
	String home() {
		return "hello world";
	}
	@RequestMapping("/number")
	int home3() {
		return 110;
	}
	@RequestMapping("/number1/{num}")
	Integer home2(@PathVariable Integer num) {
		return num;
	}
	public static void main(String[] args) {
		SpringApplication.run(FatecTesteApplication.class, args);
	}

}
