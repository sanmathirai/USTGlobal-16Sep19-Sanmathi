
public class TestB {
static int b;
int a;
{
	a=10;
	b=20;
	System.out.println("Non static block 1");
}
public static void main(String[] args) {
	System.out.println("Main Started");
	TestB t= new TestB();
	TestB t1= new TestB();
	System.out.println("main Ended");
}
{
	System.out.println("Non static block 2");
}
}
