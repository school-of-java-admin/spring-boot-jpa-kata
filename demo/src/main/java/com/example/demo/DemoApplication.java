package com.example.demo;

import com.example.demo.model.DateDisplay;
import com.example.demo.service.DisplayService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		DisplayService service = context.getBean(DisplayService.class);
		service.display();
	}
}
