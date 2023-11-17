package staticMembers;

import staticMembers.staticexample;

class staticexample
{
	static int x;
	private int y;
	public void setval()
	{
		y=20;
	}
	public void showval()
	{
		System.out.println("x=" +x + "y=" + y);
	}

	public class StaticVariable {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			staticexample obj1 = new staticexample();
			staticexample obj2 = new staticexample();

			staticexample.x = 200;

			obj1.setval();

			obj1.showval();
			obj2.showval();

		}

	}
}
