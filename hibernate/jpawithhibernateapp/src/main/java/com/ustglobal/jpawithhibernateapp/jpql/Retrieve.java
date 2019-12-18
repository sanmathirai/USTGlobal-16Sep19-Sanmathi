package com.ustglobal.jpawithhibernateapp.jpql;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;



public class Retrieve {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * String jpql = "from Product";
		 * 
		 * Query query = entityManager.createQuery(jpql);
		 * 
		 * List<Product> productsInfo = query.getResultList();
		 * System.out.println("Product detils"); for (Product product : productsInfo) {
		 * System.out.println("Product id       :"+product.getPid());
		 * System.out.println("Product name     :"+product.getPname());
		 * System.out.println("Product quantity :"+product.getQuantity());
		 * System.out.println("***********************");
		 * 
		 * }
		 */

		//To select only pname
		String jpql = "select pname from Product ";
		Query   query = entityManager.createQuery(jpql);

		List<String> list = query.getResultList();

		System.out.println("Product detils");
		for (String product : list) {
			System.out.println("Product name     :"+product);
			System.out.println("***********************");

		}


	}
}
