
public class TestC {
	public static void main(String[] args) {

		Person.color="brown";

		Person.sleep();
		System.out.println("Color is : "+Person.color);
		
		System.out.println("********************");
		Person p = new Person();
		p.age=20;
		p.name="Sanmathi";

		System.out.println("Person age : "+p.age);
		System.out.println("Person name "+ p.name);
		p.eat();
		p.walk();

		//		p.color="red"; we can access static variable but not a good practice
		System.out.println("********************");
		Person p1 = new Person();
		p1.age=30;
		p1.name="Sanma";

		System.out.println("Person age : "+p1.age);
		System.out.println("Person name "+ p1.name);
		p1.eat();
		p1.walk();
		
	}
}
