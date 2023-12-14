package innerOuterClass;


class outerClass
{
	class innerClass
	{
		public void display()
		{
			System.out.println("this is innerclass display");
		}
	}
	public void show()
	{
		System.out.println("this is outer class show");
	}
}

public class InnerOuterDemo {

	public static void main(String[] args) {

		// Declare oobj as an instance of outerClass with an anonymous inner class
		outerClass oobj = new outerClass();

		// Call show() method on oobj
		oobj.show();

		outerClass.innerClass iobj = oobj.new innerClass();
		iobj.display();
	}
}