package com.ustglobal.empspringmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.ustglobal.empspringmvc.dto.EmployeeBean;

@Repository
public class EmployeeDAOImplementation implements EmployeeDAO{

	/*
	 * private EntityManagerFactory factory =
	 * Persistence.createEntityManagerFactory("employee-unit");
	 */
	@PersistenceUnit
	private EntityManagerFactory factory;//Automatically bean creates Object of factory

	@Override
	public EmployeeBean login(int id, String password) {
		String jpql = "from EmployeeBean where id =:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		//Query query = manager.createQuery(jpql);
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);//to avoid downcasting
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
			EmployeeBean bean = query.getSingleResult();
			return bean;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public int register(EmployeeBean bean) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		}catch (Exception e) {
			e.printStackTrace();
			return -1;
		}

	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean bean = manager.find(EmployeeBean.class, id);
			manager.remove(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EmployeeBean searchEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		return manager.find(EmployeeBean.class, id);


	}

	@Override
	public boolean updateEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean empBean = manager.find(EmployeeBean.class, bean.getId());
			empBean.setName(bean.getName());
			empBean.setGender(bean.getGender());
			empBean.setPassword(bean.getPassword());
			empBean.setDate(bean.getDate());
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			EmployeeBean empBean = manager.find(EmployeeBean.class, id);
			empBean.setPassword(password);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
