package assignments;

import java.util.Scanner;

public class A11_ArrayStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the String: ");
		String string1= s.next();
		s.close();
		String reverse= "";

		for(int i=string1.length()-1; i>=0; i--)
		{
			reverse= reverse +string1.charAt(i);

		}
		System.out.println("Initial String: " +string1); 
		System.out.println("String Length: " +string1.length());
		System.out.println("Reversed String: " +reverse); 
	}

}


