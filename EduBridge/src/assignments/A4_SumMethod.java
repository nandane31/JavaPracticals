package assignments;

import java.util.Scanner;

class show
{
	public static void show()
	{  
		double x, y, sum;
    Scanner s = new Scanner (System.in);
    System.out.println("Enter the value of x: ");
    x= s.nextDouble();
	System.out.println("Enter the value of y: ");
    y= s.nextDouble();
    
    sum= x+y;
	System.out.println("Enter the value of sum: " +sum);
	}
	public static void callmethods()
	{
		show();
	}
}

public class A4_SumMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   show obj= new show();
     obj.show();
     
      
	}


}
