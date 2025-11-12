package superkeyword;

public class Class2Check extends Class1 {
	void check(int a,int b)
	{
	  int result = super.add(a, b);

      System.out.println("Addition Result: " + result);

      if (result % 10 == 0)
      {
          System.out.println("The result is divisible by 10.");
      }
      else
      {
          System.out.println("The result is NOT divisible by 10.");
      }
  }
  public static void main(String[] args)
  {
      Class2Check obj = new Class2Check();

     
      int num1 = 25;
      int num2 = 35;

      obj.check(num1, num2);
  }
}


