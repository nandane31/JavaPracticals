package assignments;

public class A7_BankCustDetails extends A7_Customer{
	public static void main(String[] args) {
		
		banks[] bank= {};
		for (banks obj2: bank)
		{
			System.out.println("Bank Name: " +obj2.getBname() +
					", Bank  No: " +obj2.getBno()+
					", Bank Location: " +obj2.getBloc());

		} 
		customerss[] customer = {};
		for (customerss cust: customer )
			// for (int cust=0; cust <customer.length; cust++)
		{
			System.out.println("CustID: " + cust.getCusID()+
					"Account No: " +cust.getAcno()+
					"Amount:" +cust.getAcno()+
					"Customer Name:" +cust.getCname());
		} 

	}

}
