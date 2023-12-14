package assignments;

public class A14_StudentData {

		//  name, marks, rollNo, avg
		public  void studentDetails() {
			System.out.println("Student Details:");
		}
		public <A, B> void studentDetails(A a) {

			System.out.println("Student Roll No.: " + a);
			System.out.println("Student Name.: " + a);

		}
		public <C, D> void studentDetails(C c, D d) {
			System.out.println("Student Marks: " + c);
			System.out.println("Average Markes: " + d);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			A14_StudentData s = new A14_StudentData();

			s.studentDetails();
			s.<Integer, String>studentDetails(160042, "Nehal");
			s.<Integer, Integer>studentDetails(100, 50);
		}

	}
