package inheritance;

public class SingleC extends SingleP 
{
	public void math()
	{
		System.out.println("child is a mathematician");
	}
	public static void main(String args[])
	{
		SingleC obj=new SingleC();
		obj.paint();
		obj.sing();
		obj.math();
	}
}
