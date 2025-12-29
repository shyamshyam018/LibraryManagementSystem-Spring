package com.library.LibraryManagementSystem;
import java.util.*;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository // Specialized component annotation for data storage

// Singleton component : common database for all

public class BookRepository {
	@Value("${library.db.name}") // REASON: Injects the value from the properties file
    private String dbName;
	private List<Book> db = new ArrayList<>();
	
	// Lifecycle Hook - Runs after Spring creates the bean
	@PostConstruct
	public void init() {
		System.out.println(">> Database Connection Opened With : " + dbName);
	}
	
	public void save(Book book) {
		db.add(book);
	}
	
	public List<Book> findAll(){
		return db;
	}
	
	// Lifecycle Hook - Runs before the app shuts down
	@PreDestroy
	public void cleanup() {
		System.out.println(">> Database Connection Closed safely.");
        db.clear();
	}
	
	
	
}
