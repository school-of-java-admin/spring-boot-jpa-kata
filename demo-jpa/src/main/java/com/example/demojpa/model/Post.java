package com.example.demojpa.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
public class Post extends BaseClass {
    
    private String title;
    
    @Enumerated(EnumType.ORDINAL)
    private Status status;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "post_id")
    private List<PostComment> comments = new ArrayList<>();
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = PostAuthor.class)
    @JoinColumn(name = "author_id")
//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private PostAuthor author;
    
    public void addComment(PostComment comment) {
        comments.add(comment);
    }
    
    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", comments=" + comments +
                ", author=" + author +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title) && Objects.equals(comments, post.comments) && Objects.equals(author, post.author);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title, comments, author);
    }
}
