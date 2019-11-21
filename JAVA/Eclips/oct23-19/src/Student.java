
public class Student {
	String name;
	int rollno;
	final String cname = "SJEC";//its mandatory to initialize final variables. we can initialize anywhere
	final int cid;
	Student(String name, int rollno, int cid)
	{
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	Student(){
		this.cid=200;
	}
	
	final void printDetails() 
	{
		System.out.println("Hi " + name + " Welocme to " + cname);
	}
	
	final void printDeatils(String name)
	{
		System.out.println("Hi " + name + " Welcome to "+ cname);
	}
}

