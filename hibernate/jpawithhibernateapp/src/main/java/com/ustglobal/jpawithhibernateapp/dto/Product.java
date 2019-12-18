package com.ustglobal.jpawithhibernateapp.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Generated;


@Entity										//To define its an entity class
@Table(name = "product")					//To define Table name
public class Product {

	@Id										//To define pid is primary key 
	@Column	
	@GeneratedValue(strategy = GenerationType.AUTO)
	  //To map entity class variable to table column value
	private int pid ;
	@Column									
	private String pname;
	@Column
	private int quantity;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
