package com.ustglobal.springmvcassessment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "retorder")
public class OrderBean {
	@Id
	@Column
	@GeneratedValue
	private int oid;
	@Column
	private int quantity;
	@Column
	private int amount;

	
	//passing foreign key
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id" , nullable = false)//passing foreign key
	
	@JoinColumn(name = "pid" , nullable = false)//passing foreign key
	private RetailerBean retailerBean;
	private ProductBean productBean;

}
