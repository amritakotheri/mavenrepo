package exceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		try
		{
				print(15);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		}
		// TODO Auto-generated method stub

	
	public static void print(int age)throws ArithmeticException
	{
		if(age<=18)
		{
			throw new ArithmeticException("eligible for driving license");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}




