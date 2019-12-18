package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class Reattaching {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			Product productInfo = entityManager.find(Product.class, 2);
			System.out.println(entityManager.contains(productInfo));
			entityManager.detach(productInfo);     						//detach
			System.out.println(entityManager.contains(productInfo));	//contains
			Product productInfo1 = entityManager.merge(productInfo);	//merge
			entityTransaction.begin();
			productInfo1.setPname("chair");
			entityTransaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.clear();
		entityManager.close();


	}



}
