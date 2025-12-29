package com.library.LibraryManagementSystem;

import org.springframework.context.annotation.Scope;
import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // New copy of book for each instance
public class Book {
	private String title;
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
}
