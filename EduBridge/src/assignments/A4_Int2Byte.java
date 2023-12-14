package assignments;

import java.util.Scanner;

class change
{
	int x;


	Scanner s= new Scanner (System.in);
	{
		System.out.println("Enter the value of interger: ");
		x= s.nextInt();

	}
	public void change() {
		byte y;
		y = (byte) x;
		System.out.println("Enter the value of interger x changed into byte: " +y);
	}
	
}
public class A4_Int2Byte {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		change obj= new change();
		obj.change();


	}
}
