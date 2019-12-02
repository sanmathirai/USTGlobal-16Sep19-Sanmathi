package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {
	@Autowired
	private Auther auther;
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Auther getAuther() {
		return auther;
	}
	public void setAuther(Auther auther) {
		this.auther = auther;
	}
	

}
