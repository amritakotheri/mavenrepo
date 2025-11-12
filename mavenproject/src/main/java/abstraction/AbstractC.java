package abstraction;

public class AbstractC extends AbstractP {

	public static void main(String[] args) {
		
		//AbstractC obj=new AbstractC();
		AbstractP obj=new AbstractC();
		obj.print(45);
		obj.display();
		
		// TODO Auto-generated method stub

	}
	public void print(int age)
	{
		System.out.println("age is "+age);
	}

}
