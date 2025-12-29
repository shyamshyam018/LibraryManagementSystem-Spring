package com.library.LibraryManagementSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        LibraryService service = context.getBean(LibraryService.class);
        Book book1 = context.getBean(Book.class);
        book1.setTitle("Spring in Action");
        Book book2 = context.getBean(Book.class);
        book2.setTitle("Code Clean");
        
        service.addBookToLibrary(book1);
        service.addBookToLibrary(book2);
        service.showAllBooks();
        
        context.close();
        
    }
}
