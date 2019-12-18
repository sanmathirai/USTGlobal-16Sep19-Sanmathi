package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetoone.EmpExperience;
import com.ustglobal.jpawithhibernateapp.onetoone.EmployeeInfo;
import com.ustglobal.jpawithhibernateapp.onetoone.EmployeeOtherDetails;
import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class EmployeeOneToOne {
	public static void main(String[] args) {
		EmployeeInfo vc =  new EmployeeInfo();
		vc.setId(2);
		vc.setEmail("sanmathi@gmail");
		vc.setName("sanmathi");
		
		
		/*
		 * EmployeeOtherDetails eot = new EmployeeOtherDetails(); eot.setEid(2);
		 * eot.setFname("santho"); eot.setPassword("1234"); eot.setEmp(vc);
		 */
		EmpExperience exp = new EmpExperience();
		exp.setCname("UST");
		exp.setExpid(4);
		exp.setYear(2019);
		exp.setEmp(vc);
		EmpExperience exp1 = new EmpExperience();
		exp1.setCname("Testyantra");
		exp1.setExpid(5);
		exp1.setYear(2018);
		exp1.setEmp(vc);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			
			/*
			 * entityManager.persist(eot);
			 */
			entityManager.persist(exp);
			entityManager.persist(exp1);
			 
			entityTransaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();

		}
		entityManager.close();
		System.out.println("Record saved");
	}
}
