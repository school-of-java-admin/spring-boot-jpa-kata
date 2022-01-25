package com.example.demo.service;

import com.example.demo.model.DateDisplay;
import com.example.demo.model.GreetingDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisplayService {
    
    @Autowired
    private GreetingDisplay greetingDisplay;
    
    private final DateDisplay dateDisplay;
    
    @Autowired
    public DisplayService(DateDisplay dateDisplay) {
        this.dateDisplay = dateDisplay;
    }
    
    public void display() {
        System.out.println(this.greetingDisplay.displayGreeting());
        System.out.println(this.dateDisplay.displayDate());
    }
}
