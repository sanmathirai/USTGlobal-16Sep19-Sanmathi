
public class TestC {
public static void main(String[] args) {
	Superclass s = new Superclass();
	s.count();
	
	System.out.println("************");
	Subclass sub = new Subclass();
	sub.count();
}
}
