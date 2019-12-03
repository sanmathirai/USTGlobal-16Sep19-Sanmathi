package com.ustglobal.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.ManyToMany;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.springrest.dto.EmployeeBean;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(bean);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean modifyEmployee(EmployeeBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
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
	public boolean deleteEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		EmployeeBean bean = manager.find(EmployeeBean.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}else {

			return false;
		}
	}


	@Override
	public EmployeeBean getEmployee(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(EmployeeBean.class, id);

	}

	@Override
	public List<EmployeeBean> getAllEmployee() {
		String jpql = "from EmployeeBean";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<EmployeeBean> query = manager.createQuery(jpql,EmployeeBean.class);
		List<EmployeeBean> empBean = query.getResultList();
		return empBean;
	}

}
