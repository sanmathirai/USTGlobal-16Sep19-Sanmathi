				
public class BMW implements AutoMobile,AutoMobileWithAbs {
	 public int gear() {
		System.out.println("gear() of Bmw");
		return 10;
	}
	public void gps() {
		System.out.println("gps() BMw");
		
	}
	@Override
	public void abs() {
		System.out.println("abs() of Bmw");
		
	}

}
