package com.example.demojpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
@Data
public class PostAuthor extends BaseClass {
    
    public PostAuthor() {
    
    }
    
    public PostAuthor(String name) {
        super();
        this.name = name;
    }
    
    private String name;
}
