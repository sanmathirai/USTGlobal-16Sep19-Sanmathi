
public class Employee2 {
	
	String name;
	int eid;
	long adharno;
	
	Employee2(String name, int eid, long adhar)
	{
		this.name = name;
		this.eid=eid;
		this.adharno=adhar;
	}
	
	Employee2(String name, int eid)
	{
		this.name = name;
		this.eid=eid;
		
	}
	
	Employee2( int eid, String name)
	{
		this.name = name;
		this.eid=eid;
		
	}
	void display() {
		System.out.println("Hi "+ name + " welcome to Ust" );
		System.out.println("Name is :"+ name);
		System.out.println("eid is :"+ eid);
		System.out.println("adharno :"+ adharno + "\n");
	}
	

}
