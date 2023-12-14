package assignments;
class bank{
	int bno;
	String bname, bloc;
	bank (int bno, String bname, String bloc)
	{
		this.bno= bno;
		this.bname= bname;
		this.bloc=bloc;
	}
	public void showBankDetails()
	{
		System.out.println("Bank No.: " + bno);
		System.out.println("Bank Name: " + bname);
		System.out.println("Bank Location: " + bloc);
		System.out.println();
	}
}
class customer
{
	private long amt, accNo;
	private String custName ;

	customer(long i, String string1 ,long j ) {
		this.custName = string1;
		this.accNo = i;
		this.amt = j;
	}
	public void showCustomerDetails()
	{
		System.out.println("Customer's Name: " + custName);
		System.out.println("Customer's Account No.: " + accNo);
		System.out.println("Customer's Account Balance: " + amt);
		System.out.println();
	}
}

class InvalidTranIDException extends Exception {

	InvalidTranIDException (String string1)
{
	super (string1);
}
}

public class A12_UserDefExptn {
	static void Transaction (int tranID) throws InvalidTranIDException
	{
		if (tranID < 100 || tranID > 100)
		{
			throw new InvalidTranIDException ("Invalid Transaction ID");
		}
		else
		{
			System.out.println ("Transaction is possible");
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank s1= new bank (134, "SBI", "Amravati");
		s1.showBankDetails();
		customer s2 = new customer(158293, "Nehal", 789);
		s2.showCustomerDetails();


		try
		{
			Transaction(102);
			System.out.println("Transaction is Succefful");
		}
		catch (InvalidTranIDException ex)
		{
			System.out.println("Caught the Exception");
		}
	}

}
