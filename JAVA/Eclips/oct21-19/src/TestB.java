
public class TestB {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.name="Ganga";
		c.color="black";
		System.out.println("Cow color :"+c.color);
		System.out.println("Cow name  :"+c.name);
		c.eat();
		c.sleep();
		System.out.println("**************************");
		Cow c1 = new Cow();
		c1.name="Tunaga";
		c1.color="white";
		System.out.println("Cow color :"+c1.color);
		System.out.println("Cow name  :"+c1.name);
		c1.eat();
		c1.sleep();
		
	}
}
