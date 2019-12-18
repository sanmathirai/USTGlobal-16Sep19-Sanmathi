package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetails = entityManager.find(Product.class, 1);
		int id = productDetails.getPid();
		String pname = productDetails.getPname();
		int quantity =  productDetails.getQuantity();
		System.out.println("Product  Id is   :"+id);
		System.out.println("Product name is  :"+pname);
		System.out.println("Product quantity :"+quantity);

	}
}
