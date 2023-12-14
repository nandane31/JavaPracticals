package assignments;

class banks
{
	int bno;
	String bname, bloc;
	public int getBno() {
		return bno;
	}

	public String getBname() {
		return bname;
	}

	public String getBloc() {
		return bloc;
	}

	banks (int bno, String bname, String bloc)
	{
		this.bno= bno;
		this.bname= bname;
		this.bloc=bloc;
	}

}
class customers 
{
	double cusID, acno, amt;
	String cname;

	public double getCusID() {
		return cusID;
	}

	public double getAcno() {
		return acno;
	}

	public double getAmt() {
		return amt;
	}

	public String getCname() {
		return cname;
	}

	customers (double cusID,double acno, double amt, String cname)
	{
		this.cusID= cusID;
		this.acno= acno;
		this.amt=amt;
		this.cname= cname;
	}
}


public class A8_BankDetails {

	public static void main(String[] args) {
		customers[] customer = new customers[7] ;  
		//create & initialize actual product objects using constructor  
		customer[0] = new customers(1234, 5577, 9999,"Nehal");  
		customer[1] = new customers(12345, 55778, 99998,"Neha");   
		customer[2] = new customers(1634, 5577, 9999,"Aman");   
		customer[3] = new customers(1234, 6577, 9999,"Geeta");   
		customer[4] = new customers(1234, 5577, 9999,"Meena");   
		customer[5] = new customers(1256, 5537, 59999,"Seema");
		customer[6] = new customers(1257, 5437, 69999,"Manda");
		
		banks[] bank = new banks[1] ;
		bank[0]= new banks(1, "SBI", "Amravati");
//		bank[1]= new banks(2, "CBI", "Achalpur");
//		bank[2]= new banks(3, "HDFC", "Achalpur");
//		bank[3]= new banks(4, "Axis", "Achalpur");
//		bank[4]= new banks(5, "HDFC", "Achalpur");

		for (banks obj2: bank)
		{
			System.out.println("Bank Name: " +obj2.getBname() +
					", Bank  No: " +obj2.getBno()+
					", Bank Location: " +obj2.getBloc());

		} 
		 System.out.println("");
		 
		 for (customers cust: customer )
		// for (int cust=0; cust <customer.length; cust++)
		{
			System.out.println("CustID: " + cust.getCusID() +
					 ", Account No: " +cust.getAcno() +
					 ", Customer Name: " +cust.getCname()+
					", Amount: " +cust.getAcno());
		}  
		
		 
		
	}

}
