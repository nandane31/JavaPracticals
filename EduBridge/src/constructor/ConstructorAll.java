package constructor;

class constructorExample
{
	private int x=100;
	static
	{
		//System.out.println(x);
		System.out.println("static block called");
	}
	constructorExample()
	{
		System.out.println(x);
		System.out.println("Constructor Called");
	}

	public void show()
	{
		System.out.println("this is method");
	}

}

public class ConstructorAll {

	public static void main(String[] args) {

		constructorExample obj=new constructorExample();
		//obj.show();

	}

}

