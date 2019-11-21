
public class TestA {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		
		p.cost = 100;
		p.color = "Red";
		p.brand = "Reynolds";
		
		System.out.println("Pen Cost is : "+p.cost);
		System.out.println("Pen Color is : "+p.color);
		System.out.println("Pen Brand is : "+p.brand);
		
		p.write();
		
		System.out.println("****************");
		Van v=new Van();
		v.cost=2000;
		v.color="Blue";
		System.out.println("Van Cost is : "+v.cost);
		System.out.println("Van Color is : "+v.color);
		v.move();
		
		Van v1=new Van();
		v1.cost=40000;
		v1.color="Black";
		System.out.println("Van v1 Cost is : "+v1.cost);
		System.out.println("Van v1 Color is : "+v1.color);
		v1.move();
		
	}

}
