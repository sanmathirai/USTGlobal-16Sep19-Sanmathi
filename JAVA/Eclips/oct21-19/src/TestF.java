
public class TestF {
	public static void main(String[] args) {
		Student.cname = "Jspider";
		Student s1 = new Student();
		s1.name="sanmathi";
		s1.usn=19;
		System.out.println("College is :"+Student.cname);
		System.out.println("Name is    :"+s1.name);
		System.out.println("usn        :"+ s1.usn);

	}
}
