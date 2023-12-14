package fileio;
import java.io.*;
public class FirstFile {
	public static void main (String [] args) throws IOException{
		System.out.println("file input output");
		FileOutputStream s= new FileOutputStream ("C:\\Users\\nnandane\\Desktop\\ssss.txt");
		String message= ("Hello");
	byte b []= message.getBytes();
		s.write(b);
//		System.out.println("Nehal");
//		s.close();
	}
}
