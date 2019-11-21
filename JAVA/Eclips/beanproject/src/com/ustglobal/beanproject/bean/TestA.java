package com.ustglobal.beanproject.bean;

public class TestA {
	
	public static void main(String[] args) {
		
		Student std =  new Student();
		
		std.setId(20);
		std.setName("Sanmathi");
		std.setName(10);
		
		Database d = new Database();
		d.receive(std);
		
		Employee e = new Employee();
		
		e.setDept("Developement");
		e.setDesig("Developr");
		e.setId(10);
		e.setName("Sanmathi");
		e.setSalary(20000);
		d.save(e);
		
		
	}

}
