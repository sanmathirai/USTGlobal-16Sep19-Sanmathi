
public class Subclass extends SuperClass {

	String s = " Subclass variable ";

	Subclass()
	{
		System.out.println("Subclass Constructor");
	}
	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("***********");
		super.superClassMethod();
	}
}
