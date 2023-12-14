package assignments;

import java.util.Scanner;

class convert
{
	double x;

	Scanner s= new Scanner (System.in);
	{
		System.out.println("Enter the value of double: ");
		x= s.nextInt();

	}
	public void convert() {
		float y;
		y = (float) x;
		System.out.println("Enter the value of double x changed into float: " +y);
	}
}
public class A4_Double2Float {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		convert obj= new convert();
		obj.convert();


	}
}
