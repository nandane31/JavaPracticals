package assignments;
import java.util.Scanner;

public class A2_SwapTwoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		int x,y;
		//		x=7;
		//		y=9;
		//		int z=x;
		//		x=y;
		//		y=z;
		//
		//		System.out.println("Swapped value of x " +x);
		//		System.out.println("Swapped value of y " +y);


		int A,B;
		Scanner s= new Scanner(System.in);
		{
			System.out.println("Enter value of A " );
			A= s.nextInt();
			System.out.println("Enter value of B " );
			B= s.nextInt();
			s.close();
		}
		int temp=A;
		A=B;
		B= temp;

		System.out.println("Swapped value of A " +A);
		System.out.println("Swapped value of B " +B);

	}

}
