package gettersAndSetters;

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

public class ABankDetails {
	public static void main(String[] args) {
		customers[] customer = new customers[5] ;  
		//create & initialize actual product objects using constructor  
		customer[0] = new customers(1234, 5577, 9999,"Nehal");  
		customer[1] = new customers(12345, 55778, 99998,"Neha");   
		customer[2] = new customers(1634, 5577, 9999,"Teju");   
		customer[3] = new customers(1234, 6577, 9999,"Geeta");   
		customer[4] = new customers(1234, 5577, 9999,"Meena");   

		banks[] bank = new banks[5] ;
		bank[0]= new banks(1, "SBI", "Amravati");
		bank[1]= new banks(2, "CBI", "Achalpur");
		bank[2]= new banks(3, "HDFC", "Achalpur");
		bank[3]= new banks(4, "Axic", "Achalpur");
		bank[4]= new banks(5, "HDFC", "Achalpur");

		 for (customers cust: customer )
		// for (int cust=0; cust <customer.length; cust++)
		{
			System.out.println("CustID: " + cust.getCusID()+
					"Account No: " +cust.getAcno()+
					"Amount:" +cust.getAcno()+
					"Customer Name:" +cust.getCname());
		}  
		for (banks obj2: bank)
		{
			System.out.println("bname: " +obj2.getBname() +
					"Bank  No: " +obj2.getBno()+
					"Bank Lcation:" +obj2.getBloc());

		}  
	}

}
