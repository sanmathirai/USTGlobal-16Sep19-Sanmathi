package com.ustglobal.managementstockbackend.service;

import java.util.List;

import com.ustglobal.managementstockbackend.dto.OrderInfo;
import com.ustglobal.managementstockbackend.dto.ProductsInfo;

public interface ProductService {
	public boolean addProduct(ProductsInfo product);
	public boolean updateProduct(ProductsInfo product);
	public boolean deleteProductById(int id);
	public boolean deleteProductByName(String name);
	public boolean deleteProductByCategory(String category);
	public ProductsInfo getProductById(int id);
	public ProductsInfo getProductByName(String name);
	public List<ProductsInfo> getProductByCategory(String category);
	public List<ProductsInfo> getAllProduct();
	public boolean orderProduct(OrderInfo bean, int quantity,int id);
}
