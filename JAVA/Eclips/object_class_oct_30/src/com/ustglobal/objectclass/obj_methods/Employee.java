package com.ustglobal.objectclass.obj_methods;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public boolean equals(Object obj) {
		if(this == obj)
		{
			return true;
		}
		Employee c = (Employee) obj;
		if(this.id == c.id)
		{
			if(this.name.equals(c.name))
			{
				if(this.salary == c.salary)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	
	
}
