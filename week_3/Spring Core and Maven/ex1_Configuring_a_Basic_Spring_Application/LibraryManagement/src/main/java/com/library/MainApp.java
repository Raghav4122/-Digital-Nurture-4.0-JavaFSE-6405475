package com.library;

import com.library.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookService bookService = (BookService) context.getBean("bookService");
		bookService.addBook("spring in ACTION");
	}
}
