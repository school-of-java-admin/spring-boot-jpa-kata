package com.example.demojpa.repository;

import com.example.demojpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    
//    List<Post> findByAuthorId(Long authorId);
//
//    List<Post> findByAuthorName(String authorName);
//
//    @Query(value = "SELECT DISTINCT p.ID, p.CREATED_DATE, p.TITLE FROM POST p " +
//            "INNER JOIN POST_AUTHOR pa ON p.AUTHOR_ID = pa.ID " +
//            "JOIN POST_COMMENT pc ON p.ID = pc.POST_ID " +
//            "WHERE (SELECT COUNT(POST_ID) FROM POST_COMMENT WHERE POST_ID = p.ID) = ?1 " +
//            "AND pa.NAME = ?2",
//            nativeQuery = true)
//    Object findByAuthorNameWhereCommentsCountIs(int commentsCount, String authorName);
}
