package assignments;

class collegee
{
	private long sID, adminID;
	private String course, sName ;


	// Default constructor
	collegee ()
	{
		sID = 1201;
		adminID = 02;
		course = "Instru";
		sName = "Aman";
	}

	//	// Default constructor
	//	college()
	//	{
	//
	//	}

	collegee(long s, String name)
	{
		sID = s;
		sName=name;
	}

	collegee(long i, String lname, String scourse)
	{
		sID = i;
		sName = lname;
		course = scourse;
	}

	collegee(long i, long a)
	{
		sID = i;
		adminID = a;
	}

	collegee(long l, String string1 ,long k, String string2 ) {
		this.sID = l;
		this.sName = string1;
		this.adminID = k;
		this.course = string2;
	}

	public void showStudentDetails()
	{
		System.out.println("Student's ID: " + sID);
		System.out.println("Student's Name: " + sName);
		System.out.println("Student's Admin ID: " + adminID);
		System.out.println("Student's opted for course: " + course);
		System.out.println();
	}
}

public class A3_ConstructorStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		collegee s1 = new collegee(1201, "Aman", "Entc");
		s1.showStudentDetails();

		collegee s2 = new collegee(1302, "Karan", 3, "IT");
		s2.showStudentDetails();

		collegee s3 = new collegee(1203, "Shweta", 2, "Entc");
		s3.showStudentDetails();

		collegee s4 = new collegee(1404, "Kriti", 4, "Civil");
		s4.showStudentDetails();

		collegee s5 = new collegee(1505, "Raj" );
		s5.showStudentDetails();
	}

}





