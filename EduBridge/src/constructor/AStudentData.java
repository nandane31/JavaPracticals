package constructor;

class college
{
	private long sID, adminID;
	private String course, sName ;
	
	
	// Default constructor
	//	college ()
	//	{
	//		sID = 1201;
	//		adminID = 02;
	//		course = "Entc";
	//		sName = "Aman";
	//	}
	// Default constructor
		college()
		{
			
		}

	college(long s, String name)
	{
		sID = s;
		sName=name;
	}

	college(long i, String lname, String scourse)
	{
		sID = i;
		sName = lname;
		course = scourse;
	}

	college(long i, long a)
	{
		sID = i;
		adminID = a;
	}

    college(long l, String string1 ,long k, String string2 ) {
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


public class AStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		college s1 = new college(1201, "Aman", "Entc");
		s1.showStudentDetails();

		college s2 = new college(1302, "Karan", 3, "IT");
		s2.showStudentDetails();

		college s3 = new college(1203, "Shweta", 2, "Entc");
		s3.showStudentDetails();

		college s4 = new college(1404, "Kriti", 4, "Civil");

		college s5 = new college(1505, "Raj" );
		s5.showStudentDetails();

	}

}
