
public class TestE {
	public static void main(String[] args) {
		
		Btm b=new Btm();
		b.swipe();
		
		int count=b.getCount();
		System.out.println(count);
		
		int totalCount=b.getTotalCount();
		System.out.println(totalCount);
		
		System.out.println("***********");
		Btm b1=new Btm();
		b1.swipe();
		
		int count1=b1.getCount();
		System.out.println(count1);
		
		int totalCount1=b1.getTotalCount();
		System.out.println(totalCount1);
	}
}
