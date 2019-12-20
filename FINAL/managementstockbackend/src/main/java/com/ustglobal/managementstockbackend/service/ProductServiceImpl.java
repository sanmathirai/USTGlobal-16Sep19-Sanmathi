package com.ustglobal.managementstockbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.managementstockbackend.dao.ProductDAO;
import com.ustglobal.managementstockbackend.dto.OrderInfo;
import com.ustglobal.managementstockbackend.dto.ProductsInfo;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO dao;
	@Override
	public boolean addProduct(ProductsInfo product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public boolean updateProduct(ProductsInfo product) {
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProductById(int id) {
		// TODO Auto-generated method stub
		return dao.deleteProductById(id);
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
		// TODO Auto-generated method stub
		return dao.getProductByName(name);
	}

	@Override
	public List<ProductsInfo> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductsInfo> getAllProduct() {
		// TODO Auto-generated method stub
		return dao.getAllProduct();
	}

	@Override
	public boolean orderProduct(OrderInfo bean, int quantity,int id) {
		// TODO Auto-generated method stub
		return dao.orderProduct(bean,quantity,id);
	}

}
