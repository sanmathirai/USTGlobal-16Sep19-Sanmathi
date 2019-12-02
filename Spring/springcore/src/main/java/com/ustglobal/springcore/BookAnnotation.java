package com.ustglobal.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationBook;
import com.ustglobal.springcore.config.ConfigurationClass;
import com.ustglobal.springcore.di.Auther;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;

public class BookAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBook.class);
		Book book = context.getBean(Book.class);
		book.setName("Jva");
		book.setPrice(100);
		book.getAuther().setName("xyz");
		book.getAuther().setPenName("REnolds");
		System.out.println(book.getName());
		System.out.println(book.getPrice());
		System.out.println(book.getAuther().getName());
		System.out.println(book.getAuther().getPenName());
	}
}
