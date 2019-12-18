package com.ustglobal.practicejpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.practicejpawithhibernate.dto.Movie;

public class DeleteMovie {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	Movie movieInfo = entityManager.find(Movie.class, 2);
	entityTransaction.begin();
	entityManager.remove(movieInfo);
	System.out.println("data deleted");
	entityTransaction.commit();
	entityManager.close();
}
}
