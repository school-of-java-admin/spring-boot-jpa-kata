package com.example.demojpa;

import com.example.demojpa.model.Post;
import com.example.demojpa.model.PostAuthor;
import com.example.demojpa.model.PostComment;
import com.example.demojpa.model.Status;
import com.example.demojpa.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class DemoJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(PostRepository repository) {
		return args -> {
			PostAuthor author = new PostAuthor("Radi V");

			Post post = new Post();
			post.setTitle("Post 1");
			post.setAuthor(author);
			post.setStatus(Status.NEW);

			post.addComment(new PostComment("First comment."));
			post.addComment(new PostComment("Second comment."));
			post.addComment(new PostComment("Third comment."));

			repository.save(post);
			
		};
	}

}
