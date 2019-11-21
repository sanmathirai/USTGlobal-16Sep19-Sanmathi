package com.ustglobal.objectclass.obj_methods;

public class Cow {

	String name;
	int id;
	double cost;

	public Cow(String name, int id, double cost) {
		super();
		this.name = name;
		this.id = id;
		this.cost = cost;
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
		{
			return true;
		}
		Cow c = (Cow) obj;
		if(this.id ==  c.id)
		{
			if(this.name.equals(c.name))
			{
				if(this.cost == c.cost)
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


}
