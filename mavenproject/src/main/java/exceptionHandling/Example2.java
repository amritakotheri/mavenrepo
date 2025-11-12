package exceptionHandling;

public class Example2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try
		{
		int a=20;
		
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("exception handling");
		}*/
		finally
		{
			System.out.println("must execution");
		}
		

	}

}
