package assignments;

import java.util.Scanner;

public class A6_StringLength {
	static String string;
	static Scanner s= new Scanner(System.in);
	
	public static void A6_StringLength1()
	{
		System.out.println("Enter the String: ");
		string= s.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6_StringLength1();
		System.out.println("Enter the String: "
				+ string.length());
	}

}



