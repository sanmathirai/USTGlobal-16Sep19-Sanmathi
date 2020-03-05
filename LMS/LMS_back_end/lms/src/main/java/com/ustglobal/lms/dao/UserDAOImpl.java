package com.ustglobal.lms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.Admin;
import com.ustglobal.lms.dto.Users;

@Repository
public class UserDAOImpl implements UserDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;
	@Override
	public Users userLogin(int user_id,String user_password) {
		String jpql = "from Users where user_id=:user_id and user_password=:user_password";
		EntityManager manager = factory.createEntityManager();
		//Query query = manager.createQuery(jpql);
		TypedQuery<Users> query = manager.createQuery(jpql,Users.class);//to avoid downcasting
		query.setParameter("user_id", user_id);
		query.setParameter("user_password", user_password);
		try {
			Users bean = query.getSingleResult();
			return bean;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}