package com.library.LibraryManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	private final BookRepository repository;
	private final LoggerService logger;
	
	
	// Constructor Injection is the safest way to ensure the repo is never null.
	@Autowired
	public LibraryService(BookRepository repository, LoggerService logger) {
		this.repository = repository;
		this.logger = logger;
	}
	
	public void addBookToLibrary(Book book) {
		logger.log("Attempting to add book: " + book.getTitle()); 
        repository.save(book);
        logger.log("Successfully saved " + book.getTitle());
	}
	
	public void showAllBooks() {
		logger.log("Fetching all books from repository...");
		repository.findAll().forEach(b -> System.out.println("- " + b.getTitle()));
	}
}
