package com.ustglobal.lms.dto;

import java.util.List;

import lombok.Data;
@Data
public class AdminResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<Admin> Admin;
	private List<Users> User;
	private List<Book> Book;
	private List<TrackBook> trackBooks;

}