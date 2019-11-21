package com.ustglobal.objectclass.obj_methods;

public class TestD {
	public static void main(String[] args) {
		
		Car c = new Car(200,"BMW","red");
		System.out.println(c.hashCode());
		System.out.println(c);
		
		Car c1 = new Car(400,"Alto","gray");
		System.out.println(c1.hashCode());
		System.out.println(c1);
		
		Car c2 = new Car(300,"Maruti","red");
		System.out.println(c2.hashCode());
		System.out.println(c2);
		
		Car c3 = new Car(210,"Audi","White");
		System.out.println(c3.hashCode());
		System.out.println(c3);
		
	}
}
