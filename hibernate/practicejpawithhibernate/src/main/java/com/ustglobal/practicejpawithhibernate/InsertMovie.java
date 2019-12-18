package com.ustglobal.practicejpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.practicejpawithhibernate.dto.Movie;

public class InsertMovie {
	public static void main(String[] args) {
		Movie movieInfo = new Movie();
		movieInfo.setMid(2);
		movieInfo.setMname("KGF");
		movieInfo.setCertification("U/A");
		movieInfo.setPrice(250);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(movieInfo);
		entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
			
		}
		System.out.println("Movie added");
		entityManager.close();

	}
}
