package com.library.LibraryManagementSystem;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoggerService {
	@Value("${library.log.prefix}")
	private String prefix;
	public void log(String message) {
        // Simple log with a timestamp
        System.out.println(prefix + "@" + LocalDateTime.now() + ":" + message);
    }
}
