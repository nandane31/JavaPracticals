package assignments;

import java.util.Scanner;

public class A2_AreaOfCircle 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		double r, area;
		//		r= 7;
		//		area= (r*r)*22/7;
		//		System.out.println("Area of Circle is " +area);

		double r, A;
		Scanner s= new Scanner(System.in);
		{
			System.out.println("Radius of Circle is ");
			r= s.nextDouble();
			s.close();	
		}

		A= (r*r*22)/7;
		System.out.println("Area of Circle is " +A);

	}

}



