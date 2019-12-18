package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

 public class GetRefference {
	public static void main(String[] args) {

		EntityManager entityManager = null;




		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		//Product productDetails = entityManager.getReference(Product.class, 7);//it dose not hit db productDetails is not used
		Product productDetails = entityManager.find(Product.class, 6);//it will hit db even if productDetails is not used
		System.out.println(productDetails.getClass());
		
		  System.out.println("Product  Id is   :"+productDetails.getPid());
		  System.out.println("Product  Id is   :"+productDetails.getPname());
		  System.out.println("Product  Id is   :"+productDetails.getQuantity());
		 



	}
}
