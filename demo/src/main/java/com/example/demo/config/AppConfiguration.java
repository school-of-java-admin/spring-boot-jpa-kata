package com.example.demo.config;

import com.example.demo.model.GreetingDisplay;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    
    @Bean
    public GreetingDisplay greetingDisplay() {
        return new GreetingDisplay();
    }
}
