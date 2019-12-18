package com.ustglobal.practicejpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.practicejpawithhibernate.dto.Movie;

public class SelectMovie {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		Movie movieInfo  = entityManager.find(Movie.class, 2);

		System.out.println("Movie id     : "+movieInfo.getMid());
		System.out.println("Movie Name   : "+movieInfo.getMname());
		System.out.println("Movie Certification : "+movieInfo.getCertification());
		System.out.println("Movie Price : "+movieInfo.getPrice());

		entityManager.close();




	}

}
