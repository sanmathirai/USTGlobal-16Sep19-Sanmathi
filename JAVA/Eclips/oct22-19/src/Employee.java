
public class Employee {
	String name;
	int eid;
	public Employee(String ename, int eeid )
	{
		name=ename;
		eid=eeid;
	}

	public static void main(String[] args) {
		 
		Employee e1 = new Employee("Sanmathi",10);
		System.out.println(e1.name);
		System.out.println(e1.eid);
		
		Employee e2 = new Employee("Meghna",20);
		System.out.println(e2.name);
		System.out.println(e2.eid);
		
		Employee e3 = new Employee("Sanma",30);
		System.out.println(e3.name);
		System.out.println(e3.eid);
	}
}
