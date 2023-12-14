package strings;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sobj = new StringBuilder ("Hello");

		sobj.append("java");
		System.out.println("Length =" + sobj.length());

		System.out.println("Char at index 6:" + sobj.charAt(2));


	}

}
