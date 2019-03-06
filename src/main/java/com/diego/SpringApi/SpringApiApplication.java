package com.diego.SpringApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.diego.services"})
@RestController
public class SpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

	@RequestMapping(value="/")
	public String firstservice(){
			return "Index fro SpringApi v2.0 from netbans";
	}
}
