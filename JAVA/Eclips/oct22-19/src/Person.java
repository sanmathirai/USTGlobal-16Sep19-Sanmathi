
public class Person {
	String name;
	int age;
	Person(String pname , int page)
	{
		name=pname;
		age=page;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {

		//	Person p=new Person();
		Person p=new Person("Sanmathi",10);
		p.display();

		Person p1=new Person("Sanmathi S Rai",30);
		p1.display();

		Person p2=new Person("Sanmathi Rai",20);
		p2.display();


	}
}
