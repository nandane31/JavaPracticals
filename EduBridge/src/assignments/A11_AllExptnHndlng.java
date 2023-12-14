package assignments;
class  A11_AllExptnHndlng{

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		byte x = 127 ;
		int y=0;
		
		try {

			// code that generate exception
			
			y= 2147483647/0;
			System.out.println("Rest of code in try block");
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

	}


}
