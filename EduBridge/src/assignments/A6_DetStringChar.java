package assignments;

public class A6_DetStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1 = "Nehal Nandane"; 
		System.out.println("The string before removing character: " + string1); 
		string1 = string1.replace("o", ""); 
		System.out.println("The string after removing character: " + string1); 


		StringBuilder string2 = new StringBuilder("Nehal World");
		System.out.println("The string before removing character: " + string2);
		string2 = string2.deleteCharAt(5);
		string2 = string2.deleteCharAt(3);
		System.out.println("The string after removing character: " + string2);

		String string3 = "Teju Nandane";
		int Position = 4;
		System.out.println("The string before removing character: " + string3);
		string3 = string3.substring(0,Position) + string3.substring(Position+1);
		System.out.println("The string after removing character: " + string3); 

	}

}
