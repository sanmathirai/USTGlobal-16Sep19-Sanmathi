package com.ustglobal.springmvcassessment.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name = "product")
public class ProductBean {
	@Id
	@Column
	@GeneratedValue
	private int pid;
	@Column
	private String pname;
	@Column(unique = true)
	private int price; 
	
	@OneToMany(mappedBy = "productBean")
	private List<OrderBean> orderBean;
	
}
