
public class TestD {
	public static void main(String[] args) {
		Father f =  new Father();
		f.property();
		f.marry();

		System.out.println("******************");
		
		son s = new son();
		s.marry();
		s.property();
	}
}
