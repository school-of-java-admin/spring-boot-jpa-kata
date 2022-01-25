package com.example.demojpa.model;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Data
public class PostComment extends BaseClass {
    
    public PostComment() {
    
    }
    
    public PostComment(String content) {
        super();
        this.content = content;
    }
    
    private String content;
    
    @Override
    public String toString() {
        return "PostComment{" +
                "content='" + content + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PostComment that = (PostComment) o;
        return Objects.equals(content, that.content);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }
}
