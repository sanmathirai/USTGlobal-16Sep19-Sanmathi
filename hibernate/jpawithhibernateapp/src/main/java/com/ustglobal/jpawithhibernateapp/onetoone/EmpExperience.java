package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_exp")
public class EmpExperience {
	@Id
	@Column
	private int expid;
	@Column 
	private String cname;
	@Column
	private int year;
	@ManyToOne
	@JoinColumn(name="id")
	private EmployeeInfo emp;
}