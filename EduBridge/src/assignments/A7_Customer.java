package assignments;

class customerss
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

	customerss (double cusID,double acno, double amt, String cname)
	{
		this.cusID= cusID;
		this.acno= acno;
		this.amt=amt;
		this.cname= cname;
	}
}
public class A7_Customer extends A7_Bank  {
	{
		customerss[] customer = new customerss[10] ;  
		//create & initialize actual product objects using constructor  
		customer[0] = new customerss(1234, 5577, 9999,"Nehal");  
		customer[1] = new customerss(12345, 55778, 199998,"Neha");   
		customer[2] = new customerss(1634, 5577, 29999,"Teju");   
		customer[3] = new customerss(1234, 6577, 39999,"Geeta");   
		customer[4] = new customerss(1234, 5577, 49999,"Meena");  
		customer[5] = new customerss(1256, 5537, 59999,"Seema");
		customer[6] = new customerss(1257, 5437, 69999,"Manda");
		customer[7] = new customerss(1258, 5438, 69999,"Reena");
		customer[8] = new customerss(1259, 5439, 69999,"Raj");
		customer[9] = new customerss(1250, 54370, 699990,"Prakash");
	}
}


//	public static void main(String[] args)
//	{		// TODO Auto-generated method stub
//		customerss[] customer = new customerss[10] ;  
//		//create & initialize actual product objects using constructor  
//		customer[0] = new customerss(1234, 5577, 9999,"Nehal");  
//		customer[1] = new customerss(12345, 55778, 199998,"Neha");   
//		customer[2] = new customerss(1634, 5577, 29999,"Teju");   
//		customer[3] = new customerss(1234, 6577, 39999,"Geeta");   
//		customer[4] = new customerss(1234, 5577, 49999,"Meena");  
//		customer[5] = new customerss(1256, 5537, 59999,"Seema");
//		customer[6] = new customerss(1257, 5437, 69999,"Manda");
//		customer[7] = new customerss(1258, 5438, 69999,"Reena");
//		customer[8] = new customerss(1259, 5439, 69999,"Raj");
//		customer[9] = new customerss(1250, 54370, 699990,"Prakash");
//
//	}

//	}
