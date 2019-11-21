
public class Employee1 {
	String name;
	int eid;
	public Employee1(String ename, int eid )
	{
		this.name = ename;
		this.eid=eid;
		this.display();
	}
	void display() {
		System.out.println("Employee name :"+name);
		System.out.println("Emplyee id : "+eid);
		this.sayhello();
	}
	void sayhello() {
		System.out.println("Welcome "+name+" to Ust\n");
	}

	public static void main(String[] args) {
		 
		Employee1 e1 = new Employee1("Sanmathi",10);
//		e1.display();
		Employee1 e2 = new Employee1("Dipika",20);
//		e2.display();
		Employee1 e3 = new Employee1("Alia",30);
//		e3.display();
	}		
}
