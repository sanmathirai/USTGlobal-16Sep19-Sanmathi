
public class Student {

	String sname;
	int usn;
	String clgname;
	int phno;
	String branch;

	public Student(String sname, int usn, String clgname, int phno, String branch )
	{
		this.sname = sname;
		this.usn = usn;
		this.clgname = clgname;
		this.phno = phno;
		this.branch = branch;
		this.display();
	}
	void display() {
		System.out.println("Student name :"+sname);
		System.out.println("Student usn : "+usn);
		System.out.println("Student clg :"+clgname);
		System.out.println("Student branch :"+branch);
		this.sayhello();
	}
	void sayhello() {
		System.out.println("Welcome "+ sname +" to "+clgname+"\n");
	}

	public static void main(String[] args) {

		Student s1 = new Student("Sanmathi", 10, "SJEC", 156489, "Phd");

		Student s2 = new Student("Dipika", 20, "AJ", 156489, "MD");

		Student s3 = new Student("Alia", 30, "BMS", 156489, "BA");

		Student s4 = new Student("Jhon", 40, "SJEC", 156489, "BE");

		Student s5 = new Student("Mary", 50, "SJEC", 156489, "BSc");

		Student s6 = new Student("Katrina", 50, "SJEC", 156489, "BBM");

		Student s7 = new Student("Kareena", 60, "SJEC", 156489, "Btech");

		Student s8 = new Student("Preethi", 70, "SJEC", 156489, "BE");

		Student s9 = new Student("Urvashi", 80, "SJEC", 156489, "BCA");

		Student s10 = new Student("Aishvarya", 90, "SJEC", 156489, "Mphill");
	}		


}
