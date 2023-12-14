package constructor;
 
class home
{
	home()
	{
		turnOnFan();
		turnOnLight();
		turnOnAC();
		
	}
	public void turnOnFan()
	{
		System.out.println("turned on fan" );
		
	}
	public void turnOnLight()
	{
		System.out.println("turned on Light" );
		
	}
	public void turnOnAC()
	{
		System.out.println("turned on AC" );
		
	}
	public void call()
	{
		System.out.println("calling abject" );
	}
	
}
public class ConstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 home obj= new home();
		 obj.call();

	}

}
