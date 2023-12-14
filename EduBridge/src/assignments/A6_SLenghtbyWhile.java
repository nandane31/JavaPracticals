package assignments;
import java.util.Scanner;

public class A6_SLenghtbyWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		String string;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the string: ");
		string= s.nextLine();
		s.close();
		while (i < string.length()) {

			System.out.println(i+1 + ". " + string.charAt(i));
			i++;
		}
	}
}
