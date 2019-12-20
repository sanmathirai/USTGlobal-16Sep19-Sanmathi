package com.ustglobal.managementstockbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Product_info")
public class ProductsInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String catagory;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
}
