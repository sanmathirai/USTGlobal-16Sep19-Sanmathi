package com.ustglobal.managementstockbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.managementstockbackend.dto.OrderInfo;
import com.ustglobal.managementstockbackend.dto.ProductsInfo;

@Repository
public class ProductDAOImpl implements ProductDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductsInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateProduct(ProductsInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			ProductsInfo p = manager.find(ProductsInfo.class, product.getId());
			p.setCatagory(product.getCatagory());
			p.setName(product.getName());
			p.setPrice(product.getPrice());
			p.setQuantity(product.getQuantity());
			manager.persist(p);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean deleteProductById(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();

		ProductsInfo bean = manager.find(ProductsInfo.class, id);
		if(bean!=null) {
			manager.remove(bean);
			transaction.commit();
			return true;
		}else {

			return false;
		}
	}

	@Override
	public boolean deleteProductByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProductByCategory(String category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductsInfo getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductsInfo getProductByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductsInfo where name=:name";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
			typedQuery.setParameter("name", name);
			
			ProductsInfo product = typedQuery.getSingleResult();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProductsInfo> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductsInfo> getAllProduct() {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductsInfo";
			TypedQuery<ProductsInfo> typedQuery = manager.createQuery(jpql, ProductsInfo.class);
			
			List<ProductsInfo> product = typedQuery.getResultList();
			return product;
		}catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean orderProduct(OrderInfo order, int quantity,int id) {
		
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Query query = manager.createQuery(
				"update ProductsInfo set quantity = quantity - :quantity where id=:id");
			query.setParameter("quantity", quantity);
			query.setParameter("id", id);
	
		
		try {
			transaction.begin();
			 query.executeUpdate();
			manager.persist(order);
			transaction.commit();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	

}
