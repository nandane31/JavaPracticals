package assignments;
class sumation
{
	int x, y;
	sumation (int i, int j)
	{
		x= i;
		y= j;
	}
	public void result()
	{
		int sum= x + y;
		System.out.println("Sum of two number is:" +sum);
	}

}
public class A5_SumbyObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumation obj= new sumation (134, 6);
		obj.result();
	}

}
