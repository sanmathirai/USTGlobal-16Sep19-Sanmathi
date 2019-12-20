package com.ustglobal.managementstockbackend.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import lombok.Data;

@Data
@Entity
@Table(name = "Order_info")
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private int total_price;
	@Column
	private int total_price_gst;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "order_history" , joinColumns = @JoinColumn(name= "id" ), 
	inverseJoinColumns = @JoinColumn(name = "oid"))
	private List<ProductsInfo> productsInfo;
	
}
