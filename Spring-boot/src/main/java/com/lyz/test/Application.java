package com.lyz.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@Value("${book.author}")
	private String bookAuthor;
	
	@Value("${book.name}")
	private String bookName;
	
	@RequestMapping("/")
	public String index() {
		return "Hello Spring Boot Book name is : "+bookName+"; Book Author is： "+bookAuthor;
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
