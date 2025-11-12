package exceptionHandling;

public class Example3 {

	public static void main(String[] args) {
		print(15);
		
		// TODO Auto-generated method stub

	}
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
