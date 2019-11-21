
public class TestB {
	static int a=25;
	static int x;
	public static void add() {
		//only final variable are supported for local variables
		int a;
		int b;
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		add();
		TestB t=new TestB();
		System.out.println("x value is "+t.x);
	}

}
