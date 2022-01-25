package com.example.demo.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateDisplay {
    
    public String displayDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime date = LocalDateTime.now();
        
        return "Today is " + date.format(formatter);
    }
}
