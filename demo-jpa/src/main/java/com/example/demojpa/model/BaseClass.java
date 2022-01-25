package com.example.demojpa.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.sql.Timestamp;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseClass {
    
    @Id
    @GeneratedValue
    protected Long id;
    
    @CreatedDate
    protected Timestamp createdDate;
    
    @Version
    protected Integer version;
}
