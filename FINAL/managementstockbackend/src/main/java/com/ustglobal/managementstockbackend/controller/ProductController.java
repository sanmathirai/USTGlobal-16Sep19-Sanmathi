package com.ustglobal.managementstockbackend.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.managementstockbackend.dto.OrderInfo;
import com.ustglobal.managementstockbackend.dto.ProductsInfo;
import com.ustglobal.managementstockbackend.dto.StockResponse;
import com.ustglobal.managementstockbackend.service.ProductService;
@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*",allowCredentials = "true")
public class ProductController {
	@Autowired
	private ProductService service;

	/***********************Add Product**************/

	@PostMapping(path="/add-product" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse addSub(@RequestBody ProductsInfo product) {//sending entire responce not logical view
		StockResponse response = new StockResponse();

		if(service.addProduct(product)) {
			response.setStatusCode(201);//if successfully added then success status code
			response.setMessage("success");
			response.setDescription("Product added to db");
		}
		else {
			response.setStatusCode(401);//if successfully added then success status code
			response.setMessage("Failure");
			response.setDescription("Product Not added to db");
		}
		return response;
	}
	/**************** Get product by name *****************/
	@GetMapping(path= "/get-product-name/{name}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getProductByName(@PathVariable("name")String name) {
		StockResponse response = new StockResponse();
		ProductsInfo bean = service.getProductByName(name);
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data Found ");
			response.setProductBeans(Arrays.asList(bean));
		}
		else {
			response.setStatusCode(201);
			response.setMessage("Failiure");
			response.setDescription("Data Not Found ");
		}
		return response;
	}
	/************* Update product details **************/
	@PostMapping(path="/update-product" , consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse updateProduct(@RequestBody ProductsInfo bean) {//sending entire responce not logical view
		StockResponse response = new StockResponse();

		if(service.updateProduct(bean)) {
			response.setStatusCode(201);//if successfully added then success status code
			response.setMessage("success");
			response.setDescription("Product updated");
		}
		else {
			response.setStatusCode(401);//if successfully added then success status code
			response.setMessage("Failure");
			response.setDescription("Product Updation Failed");
		}
		return response;
	}
	/************* Order product **************/
	@GetMapping(path="/order-product/{price}/{quantity}/{id}" ,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse orderProduct(@PathVariable("price")int price,
									  @PathVariable("quantity")int quantity,
									  @PathVariable("id")int id) {
		
		StockResponse response = new StockResponse();
		
			int total_price=price*quantity;
			int total_price_gst=total_price+10;
			
			ProductsInfo productsInfo = new ProductsInfo();
			OrderInfo orderInfo = new OrderInfo();
			
			orderInfo.setTotal_price(total_price);
			orderInfo.setTotal_price_gst(total_price_gst);
			
		if(service.orderProduct(orderInfo,quantity,id)) {
			response.setStatusCode(201);//if successfully added then success status code
			response.setMessage("success");
			response.setDescription("Order updated");
		}
		else {
			response.setStatusCode(401);//if successfully added then success status code
			response.setMessage("Failure");
			response.setDescription("Order Updation Failed");
		}
		return response;
	}
	
	/***************** Get All product ************************/
	@GetMapping(path= "/view-all-product" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse viewAllProduct() {
		StockResponse response = new StockResponse();
		List<ProductsInfo> bean = service.getAllProduct();
		if(bean!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data Found ");
			response.setProductBeans(bean);
		}
		else {
			response.setStatusCode(201);
			response.setMessage("Failiure");
			response.setDescription("Data Not Found ");
		}
		return response;
	}
	@GetMapping(path= "/delete-product/{id}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public StockResponse getProductByName(@PathVariable("id")int id) {
		StockResponse response = new StockResponse();
		Boolean result = service.deleteProductById(id);
		if(result) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted");
		}
		else {
			response.setStatusCode(201);
			response.setMessage("Failiure");
			response.setDescription("Data Not Found deleted");
		}
		return response;
	}
}
