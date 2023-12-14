package gettersAndSetters;

class demoGS
{
	private int age;
	private String name;

	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}
public class GSDemo {

	public static void main(String[] args) {

		demoGS obj = new demoGS();

		obj.setAge(30);
		obj.getAge();
		System.out.println("valaue of age is " + obj.getAge());

		obj.setName("santhosh");
		obj.getName();
	}

}