package assignments;

public class A14_CutomerDetails {
	// accNo, CustomerName, CustSal
	A14_CutomerDetails()
	{
		System.out.println("Cutomer Details-");
	}
	public <A> void CutomerDetails(A a)
	{
		System.out.println("Account Number: " +a);
	}
	public <B, C> void CutomerDetails (B b, C c)
	{
		System.out.println("Customer's Name: " + b);
		System.out.println("Customer's Salary: " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14_CutomerDetails s= new A14_CutomerDetails();
		s.<Integer>CutomerDetails(2380980);
		s.<String, Integer>CutomerDetails("Nehal", 55000);
		
	}

}
