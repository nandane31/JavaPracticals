package assignments;

import java.util.Scanner;


class A5_EvenOdd_returnObj {

	//create a user defined method with return
	static boolean find_EvenOdd(int x){
		return (x%2==0);
	}
	public static void main (String args[]){
		int x;
		Scanner s=new Scanner(System.in);

		System.out.print("Enter the number for check odd or even: ");
		x=s.nextInt();

		if(x%2==0) 
			System.out.println(x+ " is even"); 
		else 
			System.out.println(x+ " is odd");

		find_EvenOdd(x);
	}
}
