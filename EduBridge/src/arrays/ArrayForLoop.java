package arrays;

public class ArrayForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,6,8};
		System.out.println("length of array:" +arr.length);
		for (int i=0; i<arr.length;i++)
		{
			System.out.println("arr["+i+"]" +arr[i]);
		}
		for (int i=0; i<2; i++)
		{
			for (int j=0; j<3; j++)
				System.out.println("arr["+j+"]" +arr[j]);
		}
	}
}
