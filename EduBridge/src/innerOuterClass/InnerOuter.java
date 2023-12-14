package innerOuterClass;

class Building
{
	private int firstFloor;

	public void showFirst(int f)
	{
		firstFloor=f;
		SecondFloor secf=new SecondFloor();
		secf.showSecond();
	}
	class SecondFloor
	{
		public void showSecond()
		{
			System.out.println("the value of firstFloor:" +firstFloor);
		}
	}
}


public class	InnerOuter {

	public static void main(String[] args) {

		Building bobj = new Building();
		bobj.showFirst(100);

	}

}
