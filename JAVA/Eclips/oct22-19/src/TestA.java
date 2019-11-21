
public class TestA {
	public static int add(int a , int b)
	{
		System.out.println("add(int a , int b) mehtod");
		return a+b;
	}
	public static long add(long a , byte b)
	{
		System.out.println("add(int a , byte b) mehtod");
		return a+b;
	}
	public static void add(int a , byte b)
	{
		System.out.println("add(int a , byte b) mehtod");
		
	}
	public int multiply(int a , byte b)
	{
		System.out.println("add(int a , byte b) mehtod");
		return a*b;
		
	}
	public long multiply(int a , long b)
	{
		System.out.println("add(int a , byte b) mehtod");
		return a*b;
		
	}
	public static void main(String[] args) {
		add(10,20);
		main(10);
		add(10,1);
		add(10, 30);
		
		TestA t=new TestA();
		t.multiply(10, 1);
		t.multiply(12, 200l);
		
		
	
	}
	public static void main(int a) {
		System.out.println("main(int a)");
	}
}
