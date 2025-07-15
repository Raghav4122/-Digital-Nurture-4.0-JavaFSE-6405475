package com.library;

import com.library.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		// Load Spring context fro XML
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get BookService bean
		BookService bookService = (BookService) context.getBean("bookService");
		
		bookService.addBook("spring in ACTION");
	}
}
