package assignments;

import java.util.Scanner;

public class A6_Compare2String {
	static String string1, string2;
	static Scanner s= new Scanner(System.in);

	public static void A6_StringLength1()
	{
		System.out.println("Enter the String1: ");
		string1= s.next();
		System.out.println("Enter the String2: ");
		string2= s.next();	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A6_StringLength1();
		System.out.print("Entered strings are same: ");

		//	System.out.println((string1.compareTo(string2)));

		// System.out.println(string1==string2);

		System.out.println(string1.equals(string2));
	}
}
