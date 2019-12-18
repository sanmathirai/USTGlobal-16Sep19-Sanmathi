package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;
@Data
@Entity
@Table(name="person")
public class Person {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Exclude//lombock creates stack overflow to avoid @Exclude is used 
	@OneToOne
	@JoinColumn(name = "vid" )//referencedColumnName
	 	
	private VoterCard voterCard;

	
	

}
